package testie;

public class HelloWorldie {

	private String sentence = "I said ";

	public String getSentence(){
		return  sentence;
	}
	
	public static void main(String[] args){

		HelloWorldie helloWorldie = new HelloWorldie();
		System.out.println(helloWorldie.getSentence()+ "Hello Liliya!" );
	}



}
