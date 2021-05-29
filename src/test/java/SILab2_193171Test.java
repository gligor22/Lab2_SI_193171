import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2_193171Test {

    @Test
    void mainTestEveryBranch() {

    }

    @Test
    void functionEveryBranch() {
        Time time = new Time(22,20,15);
        List<Time> lista = new ArrayList<>();
        lista.add(time);
        assertNotNull(SILab2_193171.function(lista));
        Time time1 = new Time(-1,20,15);
        List<Time> lista1 = new ArrayList<>();
        lista1.add(time1);
        assertThrows(RuntimeException.class, () -> SILab2_193171.function(lista1));
    }

    @Test
    void functionMultipleCondition()
    {
        Time time1 = new Time(-1,20,15);
        List<Time> lista1 = new ArrayList<>();
        lista1.add(time1);
        assertThrows(RuntimeException.class, () -> SILab2_193171.function(lista1));

        Time time = new Time(22,20,15);
        List<Time> lista = new ArrayList<>();
        lista.add(time);
        assertNotNull(SILab2_193171.function(lista));

        Time time2 = new Time(24,0,0);
        List<Time> lista2 = new ArrayList<>();
        lista2.add(time2);
        assertNotNull(SILab2_193171.function(lista2));

        Time time3 = new Time(22,61,20);
        List<Time> lista3 = new ArrayList<>();
        lista3.add(time3);
        assertThrows(RuntimeException.class, () -> SILab2_193171.function(lista3));

        Time time4 = new Time(25,61,20);
        List<Time> lista4 = new ArrayList<>();
        lista4.add(time4);
        assertThrows(RuntimeException.class, () -> SILab2_193171.function(lista4));

        Time time5 = new Time(22,22,70);
        List<Time> lista5 = new ArrayList<>();
        lista5.add(time5);
        assertThrows(RuntimeException.class, () -> SILab2_193171.function(lista5));

    }
}