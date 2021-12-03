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
	
	public void setChair(int num)
	{
		chair = chair + num;
		
		if(chair<0)
		{
			chair = 0;
		}
	}
	
	public void setBed(int num)
	{
		bed = bed + num;
		
		if(bed<0)
		{
			bed = 0;
		}
	}
	
	public void setTable(int num)
	{
		table = table + num;
		
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
