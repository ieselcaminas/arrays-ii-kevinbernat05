import org.junit.jupiter.api.Test;

class SumaIgualTest {

    @Test
    void sumaIgual() {
        assertEquals("[2 + 4] [3 + 3] [5 + 1]",
                SumaIgual.sumaIgual(new int[]{2, 3, 3, 5, 4, 1}, 6).trim());
    }
}