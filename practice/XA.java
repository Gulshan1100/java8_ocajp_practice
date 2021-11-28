import java.lang.*;
import java.util.*;
interface Exportable{
	void export();
}

class Tool implements Exportable{
	protected void export(){
		System.out.println("TOOL");
	}
}

class ReportTool extends Tool implements Exportable{
	public void export(){
		System.out.println("ReportTool");
	}
	public static void main(String[] args){
		Tool atool = new ReportTool();
		Tool btool = new Tool();
		callExport(atool);
		callExport(btool);
	}
	public static void callExport(Exportable ex){
		ex.export();
	}
}