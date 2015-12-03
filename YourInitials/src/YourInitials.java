
public class YourInitials
{
	public static void main(String[] args)
	{

		//Create letters class object
		Letters objletters = new Letters();

		//objletters.InitLetters(); // this is no longer needed as done using constructor

		//NOTE: the parameter is a char variable so you must pass using single quotes
		//objletters.PrintLetter('A');
		//objletters.PrintLetter('B');
		//objletters.PrintLetter('Z');

		objletters.PrintText("PETER HARRIS IS AN AWESOME JAVA DEVELOPER");

		//output first argument (they are separated by each space)
		//objletters.PrintText(args[0].toString());

//		output all the arguments in the array
//		StringBuilder builder = new StringBuilder();
//		for(String s : args) {
//    			builder.append(s);
//		}

		//objletters.PrintText(builder.toString());		

	}
}
