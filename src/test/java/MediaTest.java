
import Media.CalculoMedia;
import org.junit.Assert;
import org.junit.Test;

public class MediaTest {


    @Test
    public void ValidarNota(){
        CalculoMedia calculoMedia = new CalculoMedia(5,6);
        Assert.assertEquals("Reprovado", calculoMedia.getSituacao());
    }
}
