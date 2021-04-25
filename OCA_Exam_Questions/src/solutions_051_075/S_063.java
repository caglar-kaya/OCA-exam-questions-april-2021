package solutions_051_075;

interface Exportable2 {
	void export(); // public as default
}

class Tool2 implements Exportable2 {

	public void export() { // line n1
		System.out.println("Tool::export");
	}
}

class ReportTool2 extends Tool2 {
	// I added public
	public void export() { // line n2 
	// Cannot reduce the visibility of the inherited method
		System.out.println("RTool::export");
	}
	
	public static void callExport(Exportable2 ex) {
		ex.export();
	}
}

public class S_063 {

	public static void main(String[] args) {
		Tool2 aTool = new ReportTool2();
		Tool2 bTool = new Tool2();
		ReportTool2.callExport(aTool);
		ReportTool2.callExport(bTool);
	}

}
