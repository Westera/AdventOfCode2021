package day02

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day02Test {

    @Test
    fun part1() {
        val input = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
        val actual = Day02().part1(input)
        assertEquals(150, actual)
    }

    @Test
    fun part2() {
        val input = listOf("forward 5", "down 5", "forward 8", "up 3", "down 8", "forward 2")
        val actual = Day02().part2(input)
        assertEquals(900, actual)
    }
}
