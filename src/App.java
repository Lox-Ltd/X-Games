import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
    
    boolean goodRun = true;

    //Welcome message
    JOptionPane.showMessageDialog(null, "WELCOME TO X GAMES!!!!");
    
    //Question 0: Specific password
    String password = JOptionPane.showInputDialog( "Please enter your password");
    if(password.equals("your password")){
        JOptionPane.showMessageDialog(null, " WOW you are so smart WOOOHOOOO!!");
    }
    else {
        JOptionPane.showMessageDialog(null, "Whoops thats not your password try again");
        //call questionnaire method again
    }

    //Question 1:Image of triangle answer with text box. The question is find X. The answer for x will be the X button that closes the program.
    JOptionPane.showMessageDialog(null, "QUestion 1 starts here");


}//end of main method
}//end of App class


//question 2
//question 3 