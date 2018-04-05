package rules

import com.nhaarman.mockito_kotlin.any
import com.nhaarman.mockito_kotlin.mock
import com.nhaarman.mockito_kotlin.never
import com.nhaarman.mockito_kotlin.verify
import console.ConsolePresenter
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

@DisplayName("Given an instance of BarRule")
internal class BarRuleTest {
    private val presenter: ConsolePresenter = mock { }

    private val rule: Rule = BarRule(presenter)

    @Nested
    @DisplayName("When executing rule")
    inner class WhenExecute {

        @Test
        fun `Then expect Bar for 11`() {
            rule.execute("11")
            verify(presenter).write("Bar")
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