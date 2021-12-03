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
	
	public int createKey(int id)
	{
		key = id;
		
		return key;
	}
	
	public int createTag(int id)
	{
		tag = id + 10;
		
		return tag;
	}
	
	public void keyHistory()
	{
		keyRecord.add("key:"+key+"/tag:"+tag);
	}
	
	public void keyRecordPrint()
	{
		for(int i=0; i<keyRecord.size(); i++)
		{
			System.out.println(keyRecord.get(i));
		}
	}
	
	public void setLocation(String location)
	{
		this.location = location;
		roomHistory(location);
	}
	
	public void roomHistory(String location)
	{
		history.add(location);
	}
	
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
