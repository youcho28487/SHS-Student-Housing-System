import java.util.*;

public class StudentHousingSystem 
{
	public static void main (String[] args)
	{
		List<Student> list = new ArrayList<>();
		List<String> trial = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		boolean l = true;
		
		//test cases
		Dormitory dorm = new Dormitory("location");
		Dormitory dorm2 = new Dormitory("loc");
		
		Student Charles = new Student("Charles Darwin", 1, "location");
		list.add(Charles);
		Student Mary = new Student("Mary Lucas", 2, "loc");
		list.add(Mary);
		Student Carl = new Student("Carl Buns", 3, "loc");
		dorm2.dormHistory(Carl);
		dorm.transffer(Carl, "location");
		dorm2.leaveDorm(Carl);
		list.add(Carl);
		
		dorm.dormHistory(Charles);
		dorm.dormHistory(Mary);
		dorm.dormHistory(Carl);
		
		Student Corner = new Student("Corner Brook", 5, "location");
		Student Kerry = new Student("Kerry Shepard", 6, "location");
		
		dorm.addBlackList(Corner, "robbery");
		dorm.addBlackList(Kerry, "Vaping");
		
		System.out.println("Welcome to SHS, Student Housing System");
		while(l)
		{
			//ask user to select the option
		System.out.println("Select your option");
		System.out.println("1. See all students");
		System.out.println("2. Number of student transferred");
		System.out.println("3. Black listed/ineligible student");
		System.out.println("4. Update inventory file");
		System.out.println("5. Room history of certain student");
		System.out.println("6. Transaction history");
		System.out.println("7: full history of certain room");
		System.out.println("8: key issuance history");
		System.out.println("Any other number to stop");
		System.out.print("--->");
		int input = s.nextInt();
		
		//output list of student
		if(input == 1)
		{
			for(int i=0; i<list.size(); i++)
			{
				System.out.println(list.get(i));
			}
			
			trial.add("Checked list of student");
		}
		//output number of student transffered
		else if (input == 2)
		{
			int trans = dorm.transfferCount();
			
			System.out.println(trans+" student transferred");
			
			trial.add("check number of student transferred");
		}
		//output black list
		else if(input == 3)
		{
			dorm.blackList();
			
			trial.add("checked black list of the dorm");
		}
		//chagne inventory
		else if (input == 4)
		{
			System.out.println("Choose the room");
			System.out.println("1:location, 2:loc");
			int ans = s.nextInt();
			
			if(ans==1)
			{
			dorm.getInventory();
			
			System.out.println("What do you want to update?");
			System.out.println("1:chair, 2:bed, 3:table");
			int update = s.nextInt();
			
			System.out.println("How much? if you want to put more, put positive. Else enter negative");
			int change = s.nextInt();
			
			dorm.updateInventory(update, change);
			
			System.out.println("Update complete");
			dorm.getInventory();
			}
			else
			{
				dorm2.getInventory();
				
				System.out.println("What do you want to update?");
				System.out.println("1:chair, 2:bed, 3:table");
				int update = s.nextInt();
				
				System.out.println("How much? if you want to put more, put positive. Else enter negative");
				int change = s.nextInt();
				
				dorm2.updateInventory(update, change);
				
				System.out.println("Update complete");
				dorm2.getInventory();
			}
			trial.add("updated inventory");
		}
		//check student history
		else if(input == 5)
		{
			System.out.println("Select student");
			
			for(int i=0; i<list.size(); i++)
			{
				System.out.println(i + ": " + list.get(i));
			}
			
			int id = s.nextInt();
			list.get(id).outputHistory();
			
			trial.add("checked student's full history of the room");
		}
		//output all transaction history
		else if (input == 6)
		{
			System.out.println("All history of transaction");
			
			for(int i=0; i<trial.size(); i++)
			{
				System.out.println(trial.get(i));
			}
		}
		//output history of the room
		else if(input == 7)
		{
			System.out.println("Choose the room");
			System.out.println("1:location, 2:loc");
			int ans = s.nextInt();
			
			if(ans==1) {
				dorm.dormRecord();
			}
			else
			{
				dorm2.dormRecord();
			}
			
			trial.add("Checked dorm record");
		}
		//output key history
		else if(input == 8)
		{
			System.out.println("Select student");
			
			for(int i=0; i<list.size(); i++)
			{
				System.out.println(i + ": " + list.get(i));
			}
			
			int id = s.nextInt();
			list.get(id).keyHistory();
			list.get(id).keyRecordPrint();
			
			trial.add("checked history of key");
		}
		//any other number will finish the program
		else
		{
			System.out.println("Thank you for using");
			l = false;
		}
		
		System.out.println("\n");
	}

	}
}
