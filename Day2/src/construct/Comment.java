package construct;

public class Comment {
	Comment()
	{
		this("C#","MS");
		System.out.println("No Comments");
	}
	Comment(String msg)
	{
		this();
		System.out.println("Comment :"+msg);
	}
	Comment(String msg,String author)
	{
		System.out.println("Comment From "+author+" : "+msg);
	}
	public static void main(String[] args) {
		//Comment c1=new Comment();
		Comment c2=new Comment("Java is Good");
		//Comment c3=new Comment("Say so"," Ram");
	}

}
