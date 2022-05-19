
 class  Overloading{
	
		public void method(int x, int y) {  // Same method name but different parameters
			System.out.println(x+y);
		}
		public void method(int x, float y) {
			System.out.println(x+y);
		}
		public void method(float x, int y) {
			System.out.println(x+y);
		}
		public void method(double x, double y) {
			System.out.println(x+y);
		}
		public void method(int x, double y) {
			System.out.println(x+y);
		}
		public void method(String x, String y) {
			System.out.println(x+y);
		}
}
 class Addition {
	public static void main(String[] args) {
		Overloading obj = new Overloading();
		obj.method(2,9);
		obj.method(2,9.2);
		obj.method(2.5,9.2);
		obj.method(2.5,9);
		obj.method("Manasa ","madhu");
	}
}