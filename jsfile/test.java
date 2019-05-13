public class test{
	public static void main(String[] args){
		System.out.println("c测试");
		int x = 3;
		double y = (int)3.12;
		double z = x+y;
		System.out.println(z);

		Scanner test_input = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = test_input.nextLine();
        String first_name = test_input.next();

        System.out.println("How old are you?");
        int age = test_input.nextInt();
        System.out.println("Hello "+name+" maybe "+first_name+",Next year you'll be "+(age+1));
	}
}