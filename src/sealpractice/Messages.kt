package sealpractice

sealed class Messages {
    abstract val name: String
    abstract fun send()
}

data class ChatMessage(override val name: String) : Messages() {
    override fun send() {
        print(name)
        print(" 채팅 보내기\n")
    }
}

data class FileMessage(override val name: String) : Messages() {
    override fun send() {
        print(name)
        print("기 파일 보내기\n")
    }
}

object MessageList {
    private val list = mutableListOf<Messages>()
    fun add(message: Messages) = when(message) {
        is ChatMessage -> list.add(message)
        is FileMessage -> list.add(message)
    }

    fun send() {
        list.forEach { it.send() }
    }
}

fun main() {
    MessageList.add(ChatMessage("채팅메세지"))
    MessageList.add(FileMessage("파일메세지"))
    MessageList.send()
}