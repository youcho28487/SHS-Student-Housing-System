public class Inventory 
{
	int chair;
	int bed;
	int table;
	String dorm;
	
	public Inventory(int chair, int bed, int table, String dorm)
	{
		this.chair = chair;
		this.bed = bed;
		this.table = table;
		this.dorm = dorm;
	}
	
	//update number of chair
	public void setChair(int num)
	{
		chair = chair + num;
		
		//if number become negative, set 0
		if(chair<0)
		{
			chair = 0;
		}
	}
	
	//update number of bed
	public void setBed(int num)
	{
		bed = bed + num;
		
		//if number become negative, set 0
		if(bed<0)
		{
			bed = 0;
		}
	}
	
	//update number of Table
	public void setTable(int num)
	{
		table = table + num;
		
		//if number become negative, set 0
		if(table<0)
		{
			table = 0;
		}
	}
	
	public String toString()
	{
		return "There are "+chair+" chair, "+ bed+" bed, "+table+" table"
				+ " in "+dorm;
	}
}
