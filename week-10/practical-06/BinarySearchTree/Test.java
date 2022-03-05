public class Test{
	public static void main(String[] args){

		MyBST mybst = new MyBST();


		mybst.insert(5);
		mybst.insert(6);
		mybst.print(mybst.getRoot());

		System.out.println(mybst.search(6));
		System.out.println(mybst.search(2));

	}
}