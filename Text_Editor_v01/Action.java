public class Action {

    String event;
    String text;

    public Action(String event, String text) {
        this.event = event;
        this.text = text;
    }

    public String toString() {
        return ("The user " + event.toLowerCase() + "ed text: '" + text + "' \n");
    }

}
