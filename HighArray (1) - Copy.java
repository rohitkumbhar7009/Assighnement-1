import java.util.Scanner;
class HighArrays{
	int a[] = new int[100];
	int j;
	int position = 0;
	boolean found =false;
	int i;
	int n = 10;
	
	Scanner sc = new Scanner(System.in);
	public HighArray(){
		System.out.println("Enter numbers.....");
		for(int k = 0;k<n;k++){
			a[k] = sc.nextInt();
			
		}
	
	int n = 10;
	
	while(true){
	System.out.println("Enter your choice.......");
	System.out.println("1. Insert  2. Display  3. Search  4.Delete  5. Exit");
	int choice = sc.nextInt();
	
	switch(choice){
		
		case 1: insert();
		        break;
				
		case 2: display();
                break;

        case 3: search();
                break;

        case 4: delete();				
		         break;
		
		
	}
	}
}
	public void display(){
		
		for(i = 0;i<n;i++){
			System.out.println(a[i]+" ");
		}
	}
		
	 public void delete(){
		 System.out.println("Enter the value you want to delete");	
		 int value = sc.nextInt();
		 for (i=0;i<n; i++)
		 { if (a[i] == value)
			 {
				 found = true;
				 position =i;
				 break;
			 }
		 }
		 
		 if (found)
		 { for (i=position;i<n-1;i++)
			 { a[i]=a[i+1]; 
			 }
		 
		 }
	 
	 else
	 {
		 System.out.println(" element is not found");
	 }
	     System.out.println("Array after deletion");
	 
	 for (i=0;i<n-1;i++)
	 { System.out.println(a[i]);
	 }
	 }
	 
		 
		
			
			
		

	    public void insert(){
		System.out.println("Enter the value you want to insert");
		int value = sc.nextInt();
		a[n] = value;
		n++;
		System.out.println("Value added.....");
	}
	
	    public boolean search(){
		System.out.println("Enter the value you want to search..");
		int key = sc.nextInt();
		for(int j=0;j<n;j++){
			if(a[j]==key)
				break;
		}
		if(j==n){
			System.out.println("Not Found");
			return false;
		}
		else{
			System.out.println("Found");
			return true;
		}
	}
	
	
		
		
}