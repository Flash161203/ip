public class Event extends Task {

    private final String from;
    private final String to;

    Event(String description, String from, String to) {
        super(description);
        this.from = from;
        this.to = to;
    }

    @Override
    public String getFileRepresentation() {
        String mark = (super.isDone) ? "X" : " ";

        return "E" + "~" + mark + "~" + this.description
                + "~" + this.from + "~" + this.to;
    }

    @Override
    public String toString() {
        return "[E]"
                + super.toString()
                + " (from: " + this.from + " ; to: " + this.to + ")";
    }
}
