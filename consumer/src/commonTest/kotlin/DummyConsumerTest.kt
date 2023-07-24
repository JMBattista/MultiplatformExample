import io.mockk.mockk

class DummyConsumerTest {
    private val foo = DummyProducer()

    fun `can reference mockk`() {
        val mock = mockk<Int>()
    }
}