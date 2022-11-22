import org.junit.Assert;
import org.junit.Test;
import ru.netology.service.CashbackHackService;

public class CashBackHackerTestJUnit4 {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void ifZero() {
        int expected = 1000;
        int actual = service.remain(0);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifMinBoundary() {
        int expected = 999;
        int actual = service.remain(1);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifMaxBoundary() {
        int expected = 1;
        int actual = service.remain(999);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void ifThousand() {
        int expected = 0;
        int actual = service.remain(1000);

        Assert.assertEquals(expected, actual);
    }
}