import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Abir Hammache on 19/10/2017.
 */
public class VectorHelperTest {
    @Test
    public void tri_Vect() throws Exception {
        int [] tab1 = {5,2,8,7};
        int [] tab2 = {2,5,7,8};
        int [] result = VectorHelper.Tri_Vect(tab1,4);
        assertArrayEquals(tab2,result);
    }

    @Test (expected = TailleException.class)
    public void somme() throws TailleException {
        int [] tab1 = {5,2,8,7};
        int [] tab2 = {2,5,7};
        int [] tab3 = {7,7,15,15};
        int [] result = VectorHelper.Somme(tab1,4,tab2,3);
        assertArrayEquals(tab3,result);
    }

    @Test
    public void inverse_Tab() throws Exception {
        int [] tab1 = {5,2,8,7};
        int [] tab2 = {7,8,2,5};
        int [] result = VectorHelper.Inverse_Tab(tab1,4);
        assertArrayEquals(tab2,result);
    }

    @Test
    public void min_Max() throws Exception {
        int [] tab1 = {5,2,8,7};
        int [] tab2 = {2,8};
        int [] result = VectorHelper.Min_Max(tab1,4);
        assertArrayEquals(tab2,result);
    }

    @Test
    public void multiply_2() throws Exception {
        int [] tab1 = {5,2,8,7};
        int [] tab2 = {10,4,16,14};
        int [] result = VectorHelper.Multiply_2(tab1,4);
        assertArrayEquals(tab2,result);
    }

}
