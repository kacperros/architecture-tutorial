import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class FooBar {

    fun foobar(path: String) {
        val file = File(path)
        val input = BufferedReader(FileReader(file))
        var linesCounter = 0
        for (line in input.readLines()) {
            var zerosCounter = 0
            var onesCounter = 0
            for (character in line) {
                if (character == '0')
                    zerosCounter++
                if (character == '1')
                    onesCounter++
            }
            print("In line number " + linesCounter + " ")
            if ((zerosCounter % 2 == 0) && (zerosCounter != 0))
                print("Foo")
            if ((onesCounter % 2 == 0) && (onesCounter != 0))
                print("Bar")
            println()
            linesCounter++
        }
        input.close()
    }

}