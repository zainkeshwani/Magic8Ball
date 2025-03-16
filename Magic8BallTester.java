import javax.swing.JOptionPane;

public class Magic8BallTester {

    public static void main(String[] args) {
    	
    	// Display an input dialog for the user to enter a question
        String question = JOptionPane.showInputDialog(null, "Welcome to the Magic 8 Ball. Ask your question...if you dare", "Magic 8 Ball", JOptionPane.PLAIN_MESSAGE);
        
        //Create a Magic8Ball object
        Magic8Ball magic8Ball = new Magic8Ball(question);

        // Check if the user canceled or provided an empty question
        if(question != null && !question.isEmpty()) {
            // Display the answer in a dialog box
            if (question.equals("admin")) {
                JOptionPane.showMessageDialog(null, "Welcome, admin Zain. Care for a question?", "Magic 8 Ball Says:", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, magic8Ball.getAnswer(), "Magic 8 Ball Says:", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            // Handle case when the user cancels or provides an empty question
            JOptionPane.showMessageDialog(null, "No question provided. Exiting...", "Magic 8 Ball Says:", JOptionPane.WARNING_MESSAGE);
        }
    }
}
