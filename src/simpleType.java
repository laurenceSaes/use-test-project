import javax.annotation.Generated;

class simpleTypeTypeAndName {
	public void testM() {
		int i1 = 1 + 1;
	}
	
	public void testM2() {
		float i2 = 1 + 1;
	}
}


class smallCodeChange {
	public void testM() {
		int a1 = 123;
		int b1 = 1234;
		int c1 = 12345;
		int d1 = 42 + 77;
		
		int a2 = 123;
		int b2 = 1234;
		int c2 = 12345;
		int d2 = 12 * 345;
	}
}

enum testEum { a, b, c, d};

class sameEnum {
	public void useEnum() {
		if(testEum.a == testEum.a) {
			return;
		}
		if(testEum.b == testEum.b) {
			return;
		}
	}
}

class globalWithSubClass {
	class sumClass1 {
		int a = 1 + 1;
	}
	class sumClass2 {
		int a = 1 + 1;
	}
}

class interfaceIntern {
	interface subI1 {
		void test();
		void test1();
		void test2();
		void test3();
		void test4();
	}
	interface subI2 {
		void test();
		void test1();
		void test2();
		void test3();
		void test4();
	}
}

class detectMethodD {
	public void someMethod1() {
		//int i = 0;
	}
	
	private void someMethod2() {
		int i = 0;
	}
}

class params {
	public void params(int x) {
		int a = 1;
	}
	
	public void params2(float x) {
		int a = 1;
	}
}

class anno {
	@Generated(value = { "test" })
	public void anno() {
		int a = 9;
	}
	
	@Generated(value = { "test" })
	public void anno2() {
		int a = 1;
	}
}

class charLit {
	public void onFire() {
		char test = '1';
	}
	
	public void theChar() {
		char test = '2';
	}
}

class callMyMethod {
	
	public void hereIAm() {
		this.callingYou();
	}
	
	public void callingYou() {
		this.hereIAm();
	}
}

class advancedClone {
	public void test1() {
		if(true) {
			String chees = "mous";
			while(true) {
				continue;
			}
			while(true) {
				break;
			}
		}
	}
	
	public void test2() {
		if(false) {
			String anna = "teacher";
			while(false) {
				continue;
			}
			while(false) {
				break;
			}
		}
	}
}

class ifChange {
	@SuppressWarnings("unused")
	public void change() {
		if(true && 1 == 6) {
			int test6 = 0;
			int test5 = 1 + test6 * test6;
		}
		
		if(true) {
			int test6 = 0;
			int test5 = 1 + test6 * test6;
		}
	}
}

class codeSwap {
	@SuppressWarnings("unused")
	public void swap() {
		if(true) {
			int test6 = 0;
			int test5 = 1 + 1 * 1;
		}
		
		if(true) {
			int test5 = 1 + 1 * 1;
			int test6 = 0;
		}
	}
}


