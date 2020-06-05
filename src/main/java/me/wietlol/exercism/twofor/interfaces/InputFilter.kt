package me.wietlol.exercism.twofor.interfaces

import me.wietlol.exercism.twofor.interfaces.data.Input

interface InputFilter
{
	fun filter(input: Input): Input
}
