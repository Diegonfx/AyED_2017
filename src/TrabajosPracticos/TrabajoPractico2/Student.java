package TrabajosPracticos.TrabajoPractico2;

/**
 * Created by DiegoMancini on 5/3/17.
 */
public class Student {

    private int enrollment;
    private int commission;

    public Student(int enrollment, int commission) {
        this.enrollment = enrollment;
        this.commission = commission;
    }

    public int getEnrollment() {
        return enrollment;
    }

    public void setEnrollment(int enrollment) {
        this.enrollment = enrollment;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        this.commission = commission;
    }
}
