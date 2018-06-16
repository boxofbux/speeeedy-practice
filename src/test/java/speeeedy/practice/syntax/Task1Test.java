package speeeedy.practice.syntax;

import org.hamcrest.CoreMatchers;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class Task1Test {
    private Task1 task1 = new Task1();

    @Test
    public void shouldCountWords() {
        assertThat(task1.countWords("This string has five words"), is(5));
    }

    @Test
    public void shouldGetDayNumber() {
        assertThat(task1.dayNumber(Day.MONDAY), is(0));
        assertThat(task1.dayNumber(Day.WEDNESDAY), is(2));
        assertThat(task1.dayNumber(Day.SATURDAY), is(5));
    }

    @Test
    public void shouldSortArray() {
        float[] source = {1.0f, 2f, -1.3f, 1.2f, 0};
        float[] expected = {-1.3f, 0, 1.0f, 1.2f, 2f};
        assertThat(task1.sort(source), is(expected));
    }
}