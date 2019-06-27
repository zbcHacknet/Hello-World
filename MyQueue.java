
public class MyQueue {
// 底层采用数组
	private int[] arr;
	
	//有效数据的大小
	private int elements;
	
	//对头
	private int front;
	
	//队尾
	private int rear;
	
	//默认构造方法
	public MyQueue(){
		arr=new int[10];
		elements=0;
		
	}
	//带参数构造方法,参数为数组的大小
	public MyQueue(int maxsize){
		arr=new int[maxsize];
		elements=0;
		front=0;
		rear=-1;
	}
	//添加数据,从队尾插入
	public void insert (int e){
		if(rear== arr.length-1){
			rear = -1;
		}
		arr[++rear]=e;
		elements++;
	}
	//删除数据,从对头删除
	public int remove(){
		if(front == arr.length){
			front=0;
			
		}
		elements--;
		return arr[front++];
	}
	
	//查看数据,从头查看
	public int peek(){
		return arr[front];
	}
	
	//判断是否为空
	public boolean isEmpty(){
		return elements ==0;
	}
	
	//判断是否满了
	public boolean isFull(){
		return elements ==arr.length;
	}
}
