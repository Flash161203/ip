import java.time.LocalDateTime;

public class Deadline extends Task {

    private final LocalDateTime by;

    Deadline(String description, LocalDateTime by) {
        super(description);
        this.by = by;
    }

    @Override
    public String toString() {

        return "[D]" + super.toString()
                + " (by: " + Task.getDateTimeString(this.by) + ")";
    }
}
