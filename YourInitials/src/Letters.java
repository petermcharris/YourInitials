public class Letters
{
//Array Dimension holds 26 letters and the space char
String[][] aryletters = new String[27][7];

	//Naming the init routine as follows (the same as the class) allows init to be done
	//when you make a new instance of the Letters class object 
	public Letters()
	{
		//Set up array of Letter Layouts on new instance of class

		aryletters[0][0] = "  A  ";
		aryletters[0][1] = " A A ";
		aryletters[0][2] = "A   A";
		aryletters[0][3] = "AAAAA";
		aryletters[0][4] = "A   A";
		aryletters[0][5] = "A   A";
		aryletters[0][6] = "A   A";

		aryletters[1][0] = "BBBB ";
		aryletters[1][1] = "B   B";
		aryletters[1][2] = "B   B";
		aryletters[1][3] = "BBBB ";
		aryletters[1][4] = "B   B";
		aryletters[1][5] = "B   B";
		aryletters[1][6] = "BBBB ";

		aryletters[2][0] = " CCC ";
		aryletters[2][1] = "C   C";
		aryletters[2][2] = "C    ";
		aryletters[2][3] = "C    ";
		aryletters[2][4] = "C    ";
		aryletters[2][5] = "C   C";
		aryletters[2][6] = " CCC ";

		aryletters[3][0] = "DDDD ";
		aryletters[3][1] = "D   D";
		aryletters[3][2] = "D   D";
		aryletters[3][3] = "D   D";
		aryletters[3][4] = "D   D";
		aryletters[3][5] = "D   D";
		aryletters[3][6] = "DDDD ";

		aryletters[4][0] = "EEEEE";
		aryletters[4][1] = "E    ";
		aryletters[4][2] = "E    ";
		aryletters[4][3] = "EEE  ";
		aryletters[4][4] = "E    ";
		aryletters[4][5] = "E    ";
		aryletters[4][6] = "EEEEE";

		aryletters[5][0] = "FFFFF";
		aryletters[5][1] = "F    ";
		aryletters[5][2] = "F    ";
		aryletters[5][3] = "FFF  ";
		aryletters[5][4] = "F    ";
		aryletters[5][5] = "F    ";
		aryletters[5][6] = "F    ";

		aryletters[6][0] = " GGG ";
		aryletters[6][1] = "G   G";
		aryletters[6][2] = "G    ";
		aryletters[6][3] = "GGGGG";
		aryletters[6][4] = "G   G";
		aryletters[6][5] = "G   G";
		aryletters[6][6] = " GGG ";

		aryletters[7][0] = "H   H";
		aryletters[7][1] = "H   H";
		aryletters[7][2] = "H   H";
		aryletters[7][3] = "HHHHH";
		aryletters[7][4] = "H   H";
		aryletters[7][5] = "H   H";
		aryletters[7][6] = "H   H";

		aryletters[8][0] = "IIIII";
		aryletters[8][1] = "  I  ";
		aryletters[8][2] = "  I  ";
		aryletters[8][3] = "  I  ";
		aryletters[8][4] = "  I  ";
		aryletters[8][5] = "  I  ";
		aryletters[8][6] = "IIIII";

		aryletters[9][0] = "JJJJJ";
		aryletters[9][1] = "  J  ";
		aryletters[9][2] = "  J  ";
		aryletters[9][3] = "  J  ";
		aryletters[9][4] = "J J  ";
		aryletters[9][5] = "J J  ";
		aryletters[9][6] = " JJ  ";

		aryletters[10][0] = "K   K";
		aryletters[10][1] = "K  K ";
		aryletters[10][2] = "K K  ";
		aryletters[10][3] = "KK   ";
		aryletters[10][4] = "K K  ";
		aryletters[10][5] = "K  K ";
		aryletters[10][6] = "K   K";

		aryletters[11][0] = "L    ";
		aryletters[11][1] = "L    ";
		aryletters[11][2] = "L    ";
		aryletters[11][3] = "L    ";
		aryletters[11][4] = "L    ";
		aryletters[11][5] = "L    ";
		aryletters[11][6] = "LLLLL";

		aryletters[12][0] = "M   M";
		aryletters[12][1] = "MM MM";
		aryletters[12][2] = "MM MM";
		aryletters[12][3] = "M M M";
		aryletters[12][4] = "M   M";
		aryletters[12][5] = "M   M";
		aryletters[12][6] = "M   M";

		aryletters[13][0] = "M   M";
		aryletters[13][1] = "MM  M";
		aryletters[13][2] = "MM  M";
		aryletters[13][3] = "M M M";
		aryletters[13][4] = "M   M";
		aryletters[13][5] = "M   M";
		aryletters[13][6] = "M   M";

		aryletters[14][0] = " OOO ";
		aryletters[14][1] = "0   0";
		aryletters[14][2] = "O   O";
		aryletters[14][3] = "O   O";
		aryletters[14][4] = "O   O";
		aryletters[14][5] = "O   O";
		aryletters[14][6] = " OOO ";

		aryletters[15][0] = "PPPP ";
		aryletters[15][1] = "P   P";
		aryletters[15][2] = "P   P";
		aryletters[15][3] = "PPPP ";
		aryletters[15][4] = "P    ";
		aryletters[15][5] = "P    ";
		aryletters[15][6] = "P    ";

		aryletters[16][0] = " QQQ ";
		aryletters[16][1] = "Q   Q";
		aryletters[16][2] = "Q   Q";
		aryletters[16][3] = "Q   Q";
		aryletters[16][4] = "Q   Q";
		aryletters[16][5] = "Q  Q ";
		aryletters[16][6] = " QQ Q";

		aryletters[17][0] = "RRRR ";
		aryletters[17][1] = "R   R";
		aryletters[17][2] = "R   R";
		aryletters[17][3] = "RRRR ";
		aryletters[17][4] = "R R  ";
		aryletters[17][5] = "R  R ";
		aryletters[17][6] = "R   R";

		aryletters[18][0] = " SSS ";
		aryletters[18][1] = "S   S";
		aryletters[18][2] = "S    ";
		aryletters[18][3] = " SSS ";
		aryletters[18][4] = "    S";
		aryletters[18][5] = "S   S";
		aryletters[18][6] = " SSS ";

		aryletters[19][0] = "TTTTT";
		aryletters[19][1] = "  T  ";
		aryletters[19][2] = "  T  ";
		aryletters[19][3] = "  T  ";
		aryletters[19][4] = "  T  ";
		aryletters[19][5] = "  T  ";
		aryletters[19][6] = "  T  ";

		aryletters[20][0] = "U   U";
		aryletters[20][1] = "U   U";
		aryletters[20][2] = "U   U";
		aryletters[20][3] = "U   U";
		aryletters[20][4] = "U   U";
		aryletters[20][5] = "U   U";
		aryletters[20][6] = " UUU ";

		aryletters[21][0] = "V   V";
		aryletters[21][1] = "V   V";
		aryletters[21][2] = "V   V";
		aryletters[21][3] = "V   V";
		aryletters[21][4] = "V   V";
		aryletters[21][5] = " V V ";
		aryletters[21][6] = "  V  ";

		aryletters[22][0] = "W   W";
		aryletters[22][1] = "W   W";
		aryletters[22][2] = "W   W";
		aryletters[22][3] = "W W W";
		aryletters[22][4] = "WW WW";
		aryletters[22][5] = "WW WW";
		aryletters[22][6] = "W   W";

		aryletters[23][0] = "X   X";
		aryletters[23][1] = "X   X";
		aryletters[23][2] = " X X ";
		aryletters[23][3] = "  X  ";
		aryletters[23][4] = " X X ";
		aryletters[23][5] = "X   X";
		aryletters[23][6] = "X   X";

		aryletters[24][0] = "Y   Y";
		aryletters[24][1] = " Y Y ";
		aryletters[24][2] = "  Y  ";
		aryletters[24][3] = "  Y  ";
		aryletters[24][4] = "  Y  ";
		aryletters[24][5] = "  Y  ";
		aryletters[24][6] = "  Y  ";

		aryletters[25][0] = "ZZZZZ";
		aryletters[25][1] = "    Z";
		aryletters[25][2] = "   Z ";
		aryletters[25][3] = "  Z  ";
		aryletters[25][4] = " Z   ";
		aryletters[25][5] = "Z    ";
		aryletters[25][6] = "ZZZZZ";

		// Space char (ascii 32)
		aryletters[26][0] = "     ";
		aryletters[26][1] = "     ";
		aryletters[26][2] = "     ";
		aryletters[26][3] = "     ";
		aryletters[26][4] = "     ";
		aryletters[26][5] = "     ";
		aryletters[26][6] = "     ";

	}

	public void PrintLetter(char Letter)
	{

		//Print the letter to the console (line by line)

		int letterline;		

		for (letterline = 0;letterline < 7; letterline++)
		{
			System.out.println(BuildLetter(Letter,letterline));
		}
		
	}


	public void PrintText(String Text)
	{

		//Print Entire Text to the console (line by line)

		String LetterLineText = "";
		char NextLetter;

		//start 0 to 6 loop to build each line of the letters in the Text parameter
		int letterline;		
		for (letterline = 0;letterline < 7; letterline++)
		{
			//Loop through the Text parameter 1 letter at a time
			int PosInText;		
			for (PosInText = 0;PosInText < Text.length(); PosInText++)
			{
				//Map the next letter to a char
				NextLetter = Text.charAt(PosInText);

				//Add next letter to a string line using buildline
				LetterLineText = LetterLineText + BuildLetter(NextLetter,letterline) + " ";

			}

			//print next line of the text to screen
			System.out.println(LetterLineText);

			//Clear the line before building the next one
			LetterLineText = "";
		}
		
		
	}

	public String BuildLetter(char Letter,int Line)
	{

		//Convert the letter to lowercase
		Letter = Character.toLowerCase(Letter);

		//Convert letter to its ascii then calculate its array element position
		int Letterascii = (int) Letter;
		
		//Check that the character passed was a letter of the alphabet or the space character (ascii 97 - 122 for lowercase letters)
		if (Letterascii != 32)
		{
			if (Letterascii < 97 || Letterascii > 122)
			{
				System.out.format("Method:BuildLetter: You should only pass in characters from the alphabet or a space, you passed '%s'  (ascii val:%s)",Letter,Letterascii);
				System.out.println("");
				return "";
			}
		}

		
		//Convert the ascii val to the array element of the letter by deducting the ascii value of 'a'
		int aryletterpos = Letterascii - 97;		

		//when the character is a space use element 26 of the Letter Build Array
		if(Letterascii == 32){aryletterpos = 26;}


		//Check the line does not exceed the max 7 rows
		if (Line < 0 || Line > 6)
		{
			System.out.format("Method:BuildLetter: The Line Parameter should be from 0 to 6, you passed %s",Line);
			System.out.println("");
			return "";
		}

		return aryletters[aryletterpos][Line];
		
	}

}