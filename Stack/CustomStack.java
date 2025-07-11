package Stack;

public class CustomStack {
	
        int ptr=-1;
        private final int default_size=10;
        protected int[]arr;
        public CustomStack(int n)
        {
        	arr=new int[n];
        }
        public CustomStack()
        {
        	arr=new int[default_size];
        }
        public boolean push(int n)
        {
        	if(isFull())
        	{
        	   doubleTheArray();
        	}
        	ptr++;
        	arr[ptr]=n;
        	return true;
        }
        private void doubleTheArray() {
        	int[]temp=new int[arr.length*2];
     	   for(int i=0;i<arr.length;i++)
     	   {
     		   temp[i]=arr[i];
     	   }
     	   arr=temp;
			
		}
		public int pop() throws Exception
        {
        	if(isEmpty())
        	{
        		throw new StackEmptyException("Stack is empty there is no element to delete");
        	}
        	
        	return arr[ptr--];
        }
		private boolean isEmpty() {
		
			return ptr==-1;
		}
		private boolean isFull() {
			
			return ptr==arr.length-1;
		}
}
