import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Given an instance of ")
internal class FooBarTest {

    private lateinit var fooBar: FooBar

    @BeforeEach
    fun setUp() {
        fooBar = FooBar()
    }

    @Nested
    @DisplayName("When foo baring")
    inner class WhenFooBar {

        private val path = "src/test/resources/test_file1.txt"

        @Test
        fun `Then run program`() {
            fooBar.foobar(path)
        }

    }

}