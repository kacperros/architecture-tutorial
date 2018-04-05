package input

interface FileParser {
    fun start(path: String)
    fun getNextLine(): String
    fun hasNext(): Boolean
    fun close()
}