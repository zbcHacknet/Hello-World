
public class TestMyQueue {
public static void main(String[] args) {
	MyQueue mq = new MyQueue(5);
	
	mq.insert(520);
	mq.insert(521);
	mq.insert(1214);
	mq.insert(222);
	mq.insert(333);
	
	System.out.println("是否为空:"+mq.isEmpty());
	System.out.println("是否为满:"+mq.isFull());
	
	System.out.println("读取元素:"+mq.peek());
	
	//用while循环进行remove
	while(!mq.isEmpty()){
		System.out.println(mq.remove()+", ");
	}
	System.out.println("是否为空:"+mq.isEmpty());
	System.out.println("是否为空:"+mq.isFull());
	mq.insert(520);
	mq.insert(521);
	
	//用while循环进行remove
		while(!mq.isEmpty()){
			System.out.println(mq.remove()+", ");
		}
		System.out.println("是否为空:"+mq.isEmpty());
		System.out.println("是否为空:"+mq.isFull());
}
}
