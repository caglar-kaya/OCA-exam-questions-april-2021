package solutions_051_075;

interface Exportable {
	void export(); // public as default
}

class Tool implements Exportable {
	// protected 
	// ^
	public void export() { // line n1 only fails
		System.out.println("Tool::export");
	}
}

class ReportTool extends Tool implements Exportable {
	
	public void export() { // line n2
		System.out.println("RTool::export");
	}
	
	public static void callExport(Exportable ex) {
		ex.export();
	}
}

public class S_051 {

	public static void main(String[] args) {
		Tool aTool = new ReportTool();
		Tool bTool = new Tool();
		ReportTool.callExport(aTool);
		ReportTool.callExport(bTool);
	}

}
