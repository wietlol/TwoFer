package me.wietlol.exercism.twofor.interfaces

import me.wietlol.exercism.twofor.interfaces.data.Input

interface InputPredicate
{
	fun test(input: Input): Boolean
}
