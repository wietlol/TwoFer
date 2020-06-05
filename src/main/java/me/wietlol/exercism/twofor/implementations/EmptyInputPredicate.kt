package me.wietlol.exercism.twofor.implementations

import me.wietlol.exercism.twofor.interfaces.InputPredicate
import me.wietlol.exercism.twofor.interfaces.data.Input

class EmptyInputPredicate : InputPredicate
{
	override fun test(input: Input): Boolean =
		isInputEmpty(input)
	
	private fun isInputEmpty(input: Input): Boolean =
		input.text.isEmpty()
}
