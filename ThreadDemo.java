class MyThreadOne extends Thread 
{ 
	public void run()
	{ 
		for(int i=1;i<=5;i++){
			System.out.println("A");
			try{
				this.sleep(200);
			   }
				catch(Exception e){}
			}
		}
	}

class MyThreadTwo extends Thread
{
	public void run()
	{
		for(int i=1; i<=5; i++){
			System.out.print("B");
			try{
				this.sleep(200);
			}
			catch(Exception e){}
			}
		}
	}



class ThreadDemo
{

	public static void main(String[] args) 
	{ 
		Thread t1 = new MyThreadOne(); 
		Thread t2 = new MyThreadTwo(); 
		t1.start(); 
		t2.start();
	}
}