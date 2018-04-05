package rules

import console.ConsolePresenter

class FooRule(private val presenter: ConsolePresenter): Rule {

    override fun execute(input: String) {
        var counter = 0
        for(character in input) {
            if(character == '0')
                counter++
        }
        if(counter != 0 && counter % 2 == 0)
            presenter.write("Foo")
    }
}
