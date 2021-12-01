package day01

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day01Test {

    @Test
    fun part1() {
        val input = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val actual = Day01().part1(input)
        assertEquals(7, actual)
    }

    @Test
    fun part2() {
        val input = listOf(199, 200, 208, 210, 200, 207, 240, 269, 260, 263)
        val actual = Day01().part2(input)
        assertEquals(5, actual)
    }
}
