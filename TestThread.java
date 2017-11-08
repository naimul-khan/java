// multithreading via implementation

class RunnableThread implements Runnable 
{
	private Thread t; 
	private String threadName;
	
	// constructor
	RunnableThread(String name)
	{
	threadName = name;
	System.out.println("Creating: " + threadName);
	}

	// method -- the meat of what the thread will do
	public void run()
	{
	System.out.println("Running: " + threadName);
		try
		{
		for(int i =0; i < 10; i++)
			{
			System.out.println(i + 1);
			Thread.sleep(50); 
			}
		} catch (InterruptedException e) 
			{
			System.out.println(threadName + " interrupted.");	
			} 
	System.out.println(threadName + " exiting.");
	}

	// start the thread
	public void start()
	{
		System.out.println("Starting: " + threadName);
		if (t == null)
		{
		t = new Thread(this, threadName);
		t.start();
		}
	}
}

public class TestThread
{
	public static void main(String[] args)
	{

	/*
	RunnableThread R1 = new RunnableThread("Thread-1");
	R1.start(); 
	
	RunnableThread R2 = new RunnableThread("Thread-2");
	R2.start();
	}
	*/

	// run multiple threads at once
	int[] numbers = {1,2,3,4,5,6}; 
	for(int number:numbers)
	{
		RunnableThread r = 
		new RunnableThread("Thread-" + Integer.toString(number));
		r.start();
	}
	}
}

/* Basically, you implement a version of Runnable, create a Thread Object
	Create a constructor
	Create "run()" method, which has function inside
	Create "start()" method, which will intitialize the Thread t object
	And will start the thread.
*/


