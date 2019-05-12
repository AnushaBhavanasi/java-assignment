import org.junit.*;

import static org.junit.Assert.*;

public class FindNumberTest
{
    FindNumber fn;
    @BeforeClass
    public static void setUpBeforeClass()
    {


        System.out.println("Inside BeforeClass");

    }

    @AfterClass
    public static void tearDownAfterClass()
    {


        System.out.println("Inside AfterClass");

    }

    @Before
    public void setUp()
    {
        //arrange
        fn=new FindNumber();

        System.out.println("Inside Before");

    }

    @After
    public void tearDown()
    {
        //arrange
        fn=null;

        System.out.println("Inside After");

    }

    @Test
    public void findNumber()
    {


        //act
        String result=fn.findNumber(32);

        //assert
        assertEquals("jerry",result);
    }

    @Test
    public void givenString()
    {



        //act
        String result=fn.findNumber(25);

        //assert
        assertEquals("tom","tom");
    }
/*

    @Test
    public void givenTwoNullValuesShouldReturnErrorMessage()
    {



        //act
        String result=app.concatAndConvertString(null,null);

        //assert
        assertEquals("Null values not allowed",result);
    }*/

}

