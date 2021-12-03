import java.util.ArrayList;
import java.util.List;

public class Student 
{
	public String name;
	public int idNum;
	public String location;
	public int key;
	public int tag ;
	public List<String> history = new ArrayList<>();
	public List<String> keyRecord = new ArrayList<>();
	
	public Student(String name, int idNum, String location)
	{
		this.name = name;
		this.idNum = idNum;
		this.location =  location;
		
		history.add(location);
		key = createKey(idNum);
		tag = createTag(idNum);
	}
	
	//create key
	public int createKey(int id)
	{
		key = id;
		keyHistory();
		
		return key;
	}
	
	//create tag, tag = id+10
	public int createTag(int id)
	{
		tag = id + 10;
		keyHistory();
		
		return tag;
	}
	
	//record key history
	public void keyHistory()
	{
		keyRecord.add("key:"+key+"/tag:"+tag);
	}
	
	
	//print the key record
	public void keyRecordPrint()
	{
		for(int i=0; i<keyRecord.size(); i++)
		{
			System.out.println(keyRecord.get(i));
		}
	}
	
	
	//change dorm
	public void setLocation(String location)
	{
		this.location = location;
		roomHistory(location);
	}
	
	//add room history
	public void roomHistory(String location)
	{
		history.add(location);
	}
	
	
	//output room occupation history
	public void outputHistory()
	{
		System.out.println("History of room occupation");
		for(int i=0; i<history.size(); i++)
		{
			System.out.println(history.get(i));
		}
	}
	
	public String toString()
	{
		return name + "/" + idNum + "/" + location;
	}

	public String getName()
	{
		return name;
	}
}
