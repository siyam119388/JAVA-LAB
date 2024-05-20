package Lab16_Problem2;

public class Quiz {
    private String ID;
    private int marks;

    public Quiz(String ID, int marks) {
        this.ID = ID;
        this.marks = marks;
    }

    public String getID() {
        return ID;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
        return "Quiz[ID=" + ID + ", Marks=" + marks + "]";
    }
}
