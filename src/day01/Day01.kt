package day01

import java.io.File

fun main() {
    val day = Day01()
    val lineList = mutableListOf<Int>()
    File("src/day01/Input").useLines { lines -> lines.forEach { lineList.add(it.toInt()) } }
    day.part1(lineList)
    day.part2(lineList)
}

class Day01 {

    fun part1(lineList: List<Int>): Int {
        val windowed = lineList.windowed(2, 1)
        val result = windowed.map { it[0] - it[1] }.filter { it < 0 }.size
        println("Answer: $result")
        return result
    }

    fun part2(lineList: List<Int>): Int {
        val windowed = lineList.windowed(4, 1)
        val result = windowed.map { it[0] - it[3] }.filter { it < 0 }.size
        println("Answer: $result")
        return result
    }
}
