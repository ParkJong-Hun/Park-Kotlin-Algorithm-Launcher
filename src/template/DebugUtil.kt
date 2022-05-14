package template

//結果ロギングに使う
object Result {
    operator fun invoke(answer: String) {
        println("\u001B[40m \u001B[33m 結果: \u001B[37m$answer")
    }
}

//情報確認用
object Info {
    operator fun invoke(message: String) {
        println("\u001B[40m\u001B[34m 情報: \u001B[37m$message")
    }
}