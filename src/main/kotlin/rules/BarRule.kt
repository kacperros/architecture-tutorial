package rules

import console.ConsolePresenter

class BarRule(private val presenter: ConsolePresenter): Rule {

    override fun execute(input: String) {
        var counter = 0
        for(character in input) {
            if(character == '1')
                counter++
        }
        if(counter != 0 && counter % 2 == 0)
            presenter.write("Bar")
    }

}