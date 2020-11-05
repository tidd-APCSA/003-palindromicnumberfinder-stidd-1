import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromicNumberFinderTest {

    @Test
    public void searchForPalindromicNum(){
        PalindromicNumberFinder test = new PalindromicNumberFinder(72927);
        PalindromicNumberFinder test1 = new PalindromicNumberFinder(73037);
        assertEquals(test.searchForPalindromicNum(test.getNum()), 110);
        assertEquals(test1.searchForPalindromicNum(test1.getNum()), 100);
    }


    @Test
    public void reverseNum(){
        PalindromicNumberFinder test = new PalindromicNumberFinder(72927);
        assertEquals(test.reverseNum(72927), "72927");
    }

    @Test
    public void testPalindromicNum(){
        PalindromicNumberFinder test = new PalindromicNumberFinder(72927);
        assertEquals(test.testPalindromicNum(72927), true);
    }



}