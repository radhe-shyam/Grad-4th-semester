//Assignment#1
//Designed to check the character is alphabet, digit or special character
//Designed by Radhe shyam jangid
//date 20/7/2010
class a1q6
        {
        public static void main (String arg[])
                {
                char a='*';
                if((a>'0') && (a<='9'))
                System.out.println("The character "+a+" is digit");
                else if (((a>='a') && (a<='z')) || ((a>='A') && (a<='Z')))
                System.out.println("The charcter "+a+" is alphabet");
                else
                System.out.println("The character "+a+" is special symbol");
                }
        }

/*
Output: -

The character * is special symbol
*/