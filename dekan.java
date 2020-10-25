import java.util.Scanner;
public class dekan{
	public static void main(String[]args){
		Scanner b =new Scanner(System.in);
		System.out.println("pleas enter number of your name's ");
		int size=b.nextInt();
		char name []= new char[size];
		System.out.println("enter the letter");
		for(int f=0;f<name.length;f++){
			name[f]=b.next().charAt(0);
		}
		System.out.print("your name is: ");
		for(int f=0; f<name.length;f++){
			System.out.print(name[f]);
		}
		System.out.println("");
	}
}