
public class TestMyQueue {
public static void main(String[] args) {
	MyQueue mq = new MyQueue(5);
	
	mq.insert(520);
	mq.insert(521);
	mq.insert(1214);
	mq.insert(222);
	mq.insert(333);
	
	System.out.println("�Ƿ�Ϊ��:"+mq.isEmpty());
	System.out.println("�Ƿ�Ϊ��:"+mq.isFull());
	
	System.out.println("��ȡԪ��:"+mq.peek());
	
	//��whileѭ������remove
	while(!mq.isEmpty()){
		System.out.println(mq.remove()+", ");
	}
	System.out.println("�Ƿ�Ϊ��:"+mq.isEmpty());
	System.out.println("�Ƿ�Ϊ��:"+mq.isFull());
	mq.insert(520);
	mq.insert(521);
	
	//��whileѭ������remove
		while(!mq.isEmpty()){
			System.out.println(mq.remove()+", ");
		}
		System.out.println("�Ƿ�Ϊ��:"+mq.isEmpty());
		System.out.println("�Ƿ�Ϊ��:"+mq.isFull());
}
}
