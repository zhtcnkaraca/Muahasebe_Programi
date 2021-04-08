import org.junit.Test;
import org.junit.*;

public class MuhasebeProgramiTest {

	@Test
	public void test() {
		Object asilSonuc = MuhasebeProgrami.ucretHesapla(10,50);
		String sonuc = String.valueOf(asilSonuc);
		Assert.assertEquals("10 * 50 = 500",sonuc);
	}
}
