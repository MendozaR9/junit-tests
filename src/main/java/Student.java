import java.util.ArrayList;

public class Student {
    private long id;
    private String name;
    private ArrayList<Integer> grades = new ArrayList<>();

    public Student(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return  this.id;
    }

    public String getName() {
        return name;
    }

    public void addGrades(int grade){
        grades.add(grade);
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public  double getGradeAverage(){
        double average = 0;
        for (Integer grade : this.grades) {
            average += grade;
        }
        return (average/ (double) this.grades.size());
    }
}
