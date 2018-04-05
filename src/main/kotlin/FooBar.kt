import input.FileParser
import rules.RuleDispatcher
import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FooBar(private val dispatcher: RuleDispatcher,
             private val fileParser: FileParser) {

    fun foobar(path: String) {
        fileParser.start(path)
        while (fileParser.hasNext())
            dispatcher.dispatch(fileParser.getNextLine())
        fileParser.close()
    }

}