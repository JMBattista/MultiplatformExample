import io.mockk.mockk

class DummyConsumerTestKotlin {
    private val foo = DummyProducer()

    fun `can reference mockk`() {
        val mock = mockk<Int>()
    }
}