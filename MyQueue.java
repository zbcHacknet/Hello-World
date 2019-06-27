
public class MyQueue {
// �ײ��������
	private int[] arr;
	
	//��Ч���ݵĴ�С
	private int elements;
	
	//��ͷ
	private int front;
	
	//��β
	private int rear;
	
	//Ĭ�Ϲ��췽��
	public MyQueue(){
		arr=new int[10];
		elements=0;
		
	}
	//���������췽��,����Ϊ����Ĵ�С
	public MyQueue(int maxsize){
		arr=new int[maxsize];
		elements=0;
		front=0;
		rear=-1;
	}
	//�������,�Ӷ�β����
	public void insert (int e){
		if(rear== arr.length-1){
			rear = -1;
		}
		arr[++rear]=e;
		elements++;
	}
	//ɾ������,�Ӷ�ͷɾ��
	public int remove(){
		if(front == arr.length){
			front=0;
			
		}
		elements--;
		return arr[front++];
	}
	
	//�鿴����,��ͷ�鿴
	public int peek(){
		return arr[front];
	}
	
	//�ж��Ƿ�Ϊ��
	public boolean isEmpty(){
		return elements ==0;
	}
	
	//�ж��Ƿ�����
	public boolean isFull(){
		return elements ==arr.length;
	}
}
