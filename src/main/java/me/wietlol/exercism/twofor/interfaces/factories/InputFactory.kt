package me.wietlol.exercism.twofor.interfaces.factories

import me.wietlol.exercism.twofor.interfaces.data.Input

interface InputFactory
{
	fun create(text: String): Input
}
