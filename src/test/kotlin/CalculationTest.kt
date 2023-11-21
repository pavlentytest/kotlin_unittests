import org.junit.Assert
import org.junit.Assume
import org.junit.Before
import org.junit.Test


class CalculationTest {

    lateinit var calculation: Calculation

    @Before
    fun before() {
        calculation = Calculation()
    }

    /*
    Метод assertEquals() проверяет на равенство значений expected и actual
с возможной погрешностью delta. При выполнении заданных условий сообщает
об успешном завершении, в противном случае — об аварийном завершении теста.
 При аварийном завершении генерируется ошибка java.lang.AssertionError.
Все методы класса Assert в качестве возвращаемого значения имеют тип void.
     */
    @Test
    fun test_5() {
        Assert.assertEquals(1, 2)
    }
    /*
    Методы org.junit.Assume этого класса в случае
невыполнения предполагаемого условия при работе теста сообщают только
о том, что предположение не исполнилось (ignored), не генерируя при этом никаких
ошибок
     */
    @Test
    fun test_6() {
        Assume.assumeNotNull(4)
    }

    @Test(expected = NullPointerException::class)
    fun test_7() {
        Assert.assertTrue(calculation.getStr("null"))
    }
}