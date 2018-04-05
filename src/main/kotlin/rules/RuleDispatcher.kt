package rules

interface RuleDispatcher {
    fun dispatch(input: String)
}

class RuleDispatcherImpl(private val rules: List<Rule>): RuleDispatcher {

    override fun dispatch(input: String) {
        rules.forEach {
            it.execute(input)
        }
    }

}