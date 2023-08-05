import java.util.Arrays;
/*
Accessing to args array, this function are called from terminal!
Two argument values "Robot" and "Human"
 */
public class NewsfeedWithArgs {

    String[] topics;

    public NewsfeedWithArgs(String[] initialTopics) {
        topics = initialTopics;
    }

    public static void main(String[] args) {
        // ask teacher for this declaration
        NewsfeedWithArgs feed;
        if (args[0].equals("Human")) {

            //topics for a Human feed:
            String[] humanTopics = {"Politics", "Science", "Sports", "Love"};
            feed = new NewsfeedWithArgs(humanTopics);

        } else if(args[0].equals("Robot")) {

            //topics for a Robot feed:
            String[] robotTopics = {"Oil", "Parts", "Algorithms", "Love"};
            feed = new NewsfeedWithArgs(robotTopics);

        } else {
            String[] genericTopics = {"Opinion", "Tech", "Science", "Health"};
            feed = new NewsfeedWithArgs(genericTopics);
        }

        System.out.println("The topics in this feed are:");
        System.out.println(Arrays.toString(feed.topics));
    }
}

