package day02

import java.awt.Point
import java.io.File

fun main() {
    val day = Day02()
    val lineList = mutableListOf<String>()
    File("src/day02/Input").useLines { lines -> lines.forEach { lineList.add(it) } }
    day.part1(lineList)
    day.part2(lineList)
}

class Day02 {

    fun part1(lineList: List<String>): Int {
        val location = lineList.map { it.split(" ") }.fold(Point()) { acc, (dir, amount) ->
            when (dir) {
                "forward" -> acc.translate(amount.toInt(), 0)
                "up" -> acc.translate(0, amount.toInt() * -1)
                "down" -> acc.translate(0, amount.toInt())
            }
            acc
        }
        val result = location.x * location.y
        println("Answer: $result")
        return result
    }

    fun part2(lineList: List<String>): Int {
        var aim = 0
        val location = lineList.map { it.split(" ") }.fold(Point()) { acc, (dir, amount) ->
            when (dir) {
                "forward" -> acc.translate(amount.toInt(), amount.toInt() * aim)
                "up" -> aim -= amount.toInt()
                "down" -> aim += amount.toInt()
            }
            acc
        }
        val result = location.x * location.y
        println("Answer: $result")
        return result
    }
}
