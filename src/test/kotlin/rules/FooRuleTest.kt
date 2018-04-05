package rules

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.never
import com.nhaarman.mockito_kotlin.verify
import console.ConsolePresenter
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Given an instance of FooRule")
internal class FooRuleTest {

    private val presenter: ConsolePresenter = mock { }

    private val rule: Rule = FooRule(presenter)

    @Nested
    @DisplayName("When executing rule")
    inner class WhenExecute {

        @Test
        fun `Then expect Foo for 00`() {
            rule.execute("00")
            verify(presenter).write("Foo")
        }


        @Test
        fun `Then expect nothing for 01`() {
            rule.execute("01")
            verify(presenter, never()).write(any())
        }


        @Test
        fun `Then expect nothing for empty`() {
            rule.execute("")
            verify(presenter, never()).write(any())
        }

    }

}