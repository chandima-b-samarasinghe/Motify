package gui.java.sausecode.com;

public class ListDataStructureToDo {
	private String[] data=new String[4];
	public ListDataStructureToDo(String ti,String ms,String dt, String bt){
		this.data[0]=ti;
		this.data[1]=ms;
		this.data[2]=dt;
		this.data[3]=bt;
	}
	public String[] getData(){
		return data;
	}
}