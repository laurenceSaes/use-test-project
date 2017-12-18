import javax.annotation.Generated;

class dupTest {
	public void testM() {			//Comment
		int i1 = 1 + 1;				//Comment
		int i2 = 1 + 1 * 2;			//Comment
/*test*/int i3 = 1 + 1 / 4;/*test*/
}
	
	public void testM2() {			//Some test comment
/*test*/int i1 = 1 + 1;
 /*est*/int i2 = 1 + 1 * 2;/*test*/
		/*
		 * test
		 */
		int i3 = 1 + 1 / 4;
	}
	
	public void testM3() {
		int i2 = 1 /*test*/+ 1 * 2;
		//test
		/*
		  
		  
		*/
		int i3 = 1 + 1 / 4;
		/*
		int i1 = 1 + 1;
		int i2 = 1 + 1 * 2;
		*/		
	}
	
}
