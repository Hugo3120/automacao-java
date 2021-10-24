
import Media.CalculoMedia;
import org.junit.Assert;
import org.junit.Test;

public class MediaTest {


    @Test
    public void ValidarNota(){
        CalculoMedia calculoMedia = new CalculoMedia(5,6);
        Assert.assertEquals("Reprovado", calculoMedia.getSituacao());
    }

    @Test
    public void testeComErro() throws Exception{
        throw new Exception("Erro");



    }
    @Test
    public void validaAprovado(){
        CalculoMedia calculoMedia = new CalculoMedia();
        calculoMedia.setNota1(7);
        calculoMedia.setNota2(6);
        Assert.assertEquals("Aprovado", calculoMedia.getSituacao());
    }
}
