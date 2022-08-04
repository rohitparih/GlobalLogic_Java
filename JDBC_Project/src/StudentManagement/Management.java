package StudentManagement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Management {
	public static void main(String[] args) throws IOException {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		while (true) {
			System.out.println("Print 1 to Add : ");
			System.out.println("Print 2 to Delete : ");
			System.out.println("Print 3 to Display : ");
			System.out.println("Print 4 to Exit : ");
			int a = Integer.parseInt(input.readLine());
			
			if(a==1) {
				//add Details
				System.out.println("Enter Name :");
				String name = input.readLine();
				
				System.out.println("Enter Phone : ");
				String phone = input.readLine();
				
				System.out.println("Enter city : ");
				String city = input.readLine();
				
				//Create student object to store data
				StudentDetails st = new StudentDetails(name, phone, city);
				
				//Call DataInsertionToDatabase
				boolean answer = DataInsertionToDatabase.insertion(st);
				
				if (answer) {
					System.out.println("Succesfully Added....");
				} else {
					System.out.println("Data is not Added....");
				}
				
				System.out.println(st);
			}
			else if (a==2) {
				//delete
				System.out.println("Enter ID : ");
				int b = Integer.parseInt(input.readLine());
				boolean flag = DataInsertionToDatabase.deletion(b);
				
				if (flag) {
					System.out.println("Sucessfully Deleted....");
				} else {
					System.out.println("Problem Occured....");
				}
				
			}
			else if (a==3) {
				//display
				DataInsertionToDatabase.display();
			}
			else if (a==4) {
				//exit
				break;
			}
			else {
				
			}
		}
	}

}
