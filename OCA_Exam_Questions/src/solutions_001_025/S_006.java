package solutions_001_025;

import java.io.IOException;

class X {
	public void printFileContent() throws IOException {
		/* code goes here */
		throw new IOException();
	}
}

public class S_006 {

	public static void main(String[] args) throws Exception {
		X xobj = new X();
		xobj.printFileContent();
		
	}

}
