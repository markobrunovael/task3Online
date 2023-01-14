fun main() {
    val countSeconds = 36002
    val option = 10
    val hours = countSeconds / 3600
    val min = countSeconds / 60

    var rightWord = countSeconds % option
    val rightOption = when (rightWord) {
        1 -> "минуту"
        2 -> "минуты"
        else -> "минут"
    }

    var rightWord2 = hours % option
    val rightOption2 = when (rightWord2) {
        1 -> "час"
        2 -> "часа"
        3 -> "часа"
        4 -> "часа"
        else -> "часов"
    }

    val agoToText = when (countSeconds) {
        in 0..60 -> "был(а) только что"
        in 61..60 * 60 -> "был(а) в сети $min $rightOption назад"
        in 60 * 60 + 1..24 * 60 * 60 -> "был(а) в сети $hours $rightOption2 назад"
        in 24 * 60 * 60..48 * 60 * 60 -> "был(а) в сети вчера"
        in 48 * 60 * 60..72 * 60 * 60 -> "был(а) в сети позавчера"
        else -> "был(а) в сети  давно"
    }
    print(agoToText)


}
