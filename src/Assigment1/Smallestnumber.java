package Assigment1;

public class Smallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10,b=29,c=20,temp,small;
		temp=a<b?a:b;
		small=c<temp?c:temp;
		System.out.println(small);
		if(a==b && b==c) {
			System.out.println("numbers are equal");
		}
		else {
			System.out.println("numbers are not equal");
		}
		

	}

}
