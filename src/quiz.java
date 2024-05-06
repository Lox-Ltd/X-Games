import javax.swing.JOptionPane;

public class quiz {
    public static Boolean startQuiz(){
        JOptionPane.showMessageDialog(null, "WELCOME TO X GAMES!!!!");

        //asking for name
        String name = JOptionPane.showInputDialog(null, "what is your name");
    
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
        String question1 = JOptionPane.showInputDialog(null, " Find X for the equation: -144x + 864 +6x^2 = 0");

        if((question1 != null) && (question1.length() >= 0)){
            JOptionPane.showMessageDialog(null, "Wrong, try again");
            return true;
        }

        // Question 2: Word Vomit with answer
        int question2 = JOptionPane.showConfirmDialog(null, "\"The weather a today was quite plesnt, with clar skies and a getle breeze.\n Everyone was out in the park, chidren playing feth and dogs running freely. \n It seemed like the perfect day  to relax and enjoy the outdoors without any worries." + //
                        "\"\n" + //
                        "\n" + //
                        "" , "Question 2", JOptionPane.YES_NO_CANCEL_OPTION);
        if(question2 == 2){
            JOptionPane.showMessageDialog(null,"damn you are actually somewhat smart");
        }
        else{
            JOptionPane.showMessageDialog(null, "Is your brain mushy try again");
            return true;
        }
        String question3 = JOptionPane.showInputDialog(null, "Like a bad haircut from your childhood, this is given to you without your consent. What am I?");
        if(question3.equals(name)){
            JOptionPane.showMessageDialog(null, " YEAHHHH YOU COMPLETED THE QUIZZZ");
        }
        else{
            JOptionPane.showMessageDialog(null, "Is your brain mushy try again");
            return true;
        }
        int question4 = JOptionPane.showConfirmDialog(null, "did you have fun", "question4", JOptionPane.YES_NO_OPTION);

        if(question4 == 0){
            JOptionPane.showMessageDialog(null, "Congratulations you have one the x games");

        }
        else{
            JOptionPane.showMessageDialog(null, "Whoops there buddy you messed up try again!!");
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