class QueueStructure{
    static int arr[];
    static int size;
    static int rear;
    QueueStructure(int n){
        arr = new int[n];
        size = n;
        rear =-1;
    }
    //Checking weather queue is empty or not
     static boolean isEmpty(){
        return rear==-1;
    }
     void add(int num){
        rear = rear+1;
        arr[rear] = num;
    }
     int remove(){
        if(isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }
        int temp = arr[0];
        for(int i=0;i<rear;i++){
            arr[i] = arr[i+1];
        }
        rear--;
        return temp;
    }
     int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
    }
    public static void main(String []args){
        
        QueueStructure q = new QueueStructure(6);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size);
        System.out.println(q.peek());
        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        q.remove();




    }

}