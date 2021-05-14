import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {

    Student fer;
    Student studentWithManyGrades;

    @Before
    public void init(){
        fer = new Student(1, "Fernando M");
        fer.addGrade(90);
        studentWithManyGrades = new Student(2, "Trant B");
        studentWithManyGrades.addGrade(90);
        studentWithManyGrades.addGrade(80);
        studentWithManyGrades.addGrade(50);
    }

    @Test
    public void ifUserObjectCanBeCreated(){
        assertEquals("Fernando M", fer.getName());
        assertEquals(1, fer.getId());
    }

    @Test
    public void testIfAddGradeWorks(){
        assertSame(90, fer.getGrades().get(0));
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(90, fer.getGradeAverage(), 0);
        assertEquals(73.33333333333333, studentWithManyGrades.getGradeAverage(), 0);
    }

    // returns the student's id
    public long getId() {
        return this.id;
    }
    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades list
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double result = 0;
        for (int grade : this.getGrades()) {
            result += grade;
        }
        return result / this.getGrades().size();
    }

}
