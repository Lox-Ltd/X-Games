import javax.swing.JOptionPane;

public class quiz {
    public static Boolean startQuiz(){
        JOptionPane.showMessageDialog(null, "WELCOME TO X GAMES!!!!");
    
        //Question 0: Specific password
        String password = JOptionPane.showInputDialog( "Please enter your password");

        //Continue through the quiz if the answer is correct
        if (password.equals("your password")){
            JOptionPane.showMessageDialog(null, " WOW you are so smart WOOOHOOOO!!");
        }
        //If it isn't correct, return a true value so that the quiz starts again from the beginning
        else {
            JOptionPane.showMessageDialog(null, "Whoops thats not your password");
            return true;
        }

        //Question 1:Image of triangle answer with text box. The question is find X. The answer for x will be the X button that closes the program.
        int question1 = Integer.parseInt (JOptionPane.showInputDialog(null, " Find X for the equation: -144x + 864 +6x^2 = 0"));

        if(question1 == -1){
            JOptionPane.showMessageDialog(null, " yeah");
        }
        else{
            JOptionPane.showMessageDialog(null, "try again");
            return true;
        }

        //If they manage to complete the whole quiz, return false so they don't have to start again
        return false;
    }
}

/*  TO DO / Ideas:
 *  Q2
 *  Q3
 *  Did you have fun question: correct choice is yes
 *  Congratulations: correct choice is X out of the game
 */