package latam.qa.testing.service;

import org.junit.Test;
import static org.junit.Assert.*;

public class NumberTest {

    @Test
    public void creatingString_twoSimpleNumbers_ReturnStringWithCommaBetween(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertEquals(String.format("%d,%d", 1, 2), result);

    }

    @Test
    public void creatingString_twoSimpleNumbers_mustFail(){
        Number n = new Number();
        String result = n.stringCalc(1, 2);
        assertNotSame(String.format("%d,%d", 1, 5), result);

    }
    @Test
    public void verificar_divisorEsCero_Falla(){
        try{
            Number n = new Number();
            int result = n.divideDosEnteros(1,0);
        }
        catch(Exception e){
            assertThat(e)
                .isInstanceOf(IllegalArgumentException.class);
        }
        
      
    }
}