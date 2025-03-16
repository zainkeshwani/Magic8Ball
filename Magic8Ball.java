public class Magic8Ball {

    private static final String[] answers = {"Yes", "No", "It is certain", "It is decidedly so", "Without a doubt", "Yes definitely", "You may rely on it", "As I see it, yes", "Most likely", "Outlook good", "Signs point to yes", "Reply hazy, try again", "Ask again later", "Better not tell you now", "Cannot predict now", "Concentrate and ask again", "Don't count on it", "My reply is no", "My sources say no", "Outlook not so good", "Very doubtful"};

    private String question;

    public Magic8Ball(String question) {
        this.question = question;
    }

    public String getAnswer() {
        // Generate a random integer in the range 0-array length, then return the answer at that index in answers
        return answers[(int)(Math.random()*(answers.length))];
    }
}
