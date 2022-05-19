
 class Add {
	 int add(int a,int b) {
		return a+b;
	}
	 int add(int a,int b,int c) {
		return a+b+c;
	}

}
public class  overLoad{
	public static void main(String Args[]) {
	Add obj = new Add();
		System.out.println(obj.add(122, 10));
		System.out.println(obj.add(10,10,10));
	}
}