import java.util.*;

public class Dormitory 
{
	public String name;
	int count;
	Inventory storage;
	public List<Blacklist> blacklist = new ArrayList<>();
	public List<Student> history = new ArrayList<>();
	public List<Student> curr = new ArrayList<>();
	
	public Dormitory(String name)
	{
		this.name = name;
		storage = new Inventory(1, 1, 1, name);
	}
	
	//return name of the dorm
	public String toString()
	{
		return name;
	}
	
	
	//output dorm's inventory status
	public void getInventory()
	{
		System.out.println(storage);
	}
	
	
	//transffer student to other dorm
	public void transffer(Student stu, String location)
	{
		stu.setLocation(location);
		curr.remove(stu);
		count++;
	}
	
	
	//simply return count of the transffered student
	public int transfferCount()
	{
		return count;
	}
	
	
	//add student to the black list
	public void addBlackList(Student stu, String reason)
	{
		Blacklist newBL = new Blacklist(stu, reason);
		blacklist.add(newBL);
	}
	
	
	//output blacklist of the dorm
	public void blackList() 
	{
		for(int i=0; i<blacklist.size(); i++)
		{
			System.out.println(blacklist.get(i));
		}
	}

	
	//update the inventory of the dorm
	public void updateInventory(int update, int change)
	{
		if(update == 1)
		{
			storage.setChair(change);
		}
		else if (update == 2)
		{
			storage.setBed(change);
		}
		else
		{
			storage.setTable(change);
		}
	}
	
	
	//update history of the dorm
	public void dormHistory(Student stu)
	{
		history.add(stu);
		curr.add(stu);
	}
	
	
	//remove student from the list if student left
	public void leaveDorm(Student stu)
	{
		curr.remove(stu);
	}
	
	
	//output dorm history
	public void dormRecord()
	{
		System.out.println("past+current record");
		for(int i=0; i<history.size(); i++)
		{
			System.out.println(history.get(i).getName());
		}
		
		System.out.println("Current Student detail");
		for(int i=0; i<curr.size(); i++)
		{
			System.out.println(curr.get(i));
		}
	}
}
