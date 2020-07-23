package JavaTest;

 class Q77 {

	static int i;
	int j;
	
	public static void main(String[] args) {
		
		Q77 x1 =new Q77();
		Q77 x2 =new Q77();
		
		x1.i=3;
		x1.j=4;
		x2.i=5;
		x2.j=6;
		x2.i=9;
		System.out.println(	x1.i+" "+ x1.j+ " "+	 x2.i+ " "+	  x2.j+ " "+x2.i);
	}                       //5--9         4             5--9       6       9

}
