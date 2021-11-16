
public class GeneralStaff extends Employee {
    GeneralStaff(){
        super();
        this.duty = "";
    }
    GeneralStaff(String duty){
        super();
        this.duty = duty;
    }
    GeneralStaff(String deptName, String duty){
        super(deptName);
        this.duty = duty;
    }
    GeneralStaff(String name, int birthYear, String deptName, String duty) {
        super(name, birthYear, deptName);
        this.duty = duty;
    }

    public String getDuty() {
        return this.duty;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + " GeneralStaff: Duty: %10s", duty);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof GeneralStaff)) return false;
        if (!super.equals(o)) return false;
        GeneralStaff that = (GeneralStaff) o;
        return duty.equals(that.duty);
    }

    private String duty;
}
