import io.mockk.mockk

class CanReferenceProducerCommonMain {
    private val foo = ProducerCommonMain()

    fun `can reference mockk`() {
        val mock = mockk<Int>()
    }
}