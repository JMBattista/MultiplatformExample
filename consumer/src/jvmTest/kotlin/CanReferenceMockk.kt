import io.mockk.mockk

class CanReferenceMockk {
    fun `can reference mockk`() {
        val mock = mockk<Int>()
    }
}