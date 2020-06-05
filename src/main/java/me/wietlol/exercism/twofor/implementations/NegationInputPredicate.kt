package me.wietlol.exercism.twofor.implementations

import me.wietlol.exercism.twofor.interfaces.InputPredicate
import me.wietlol.exercism.twofor.interfaces.data.Input

class NegationInputPredicate(
	val delegatedInputPredicate: InputPredicate
) : InputPredicate
{
	override fun test(input: Input): Boolean
	{
		val delegatedResult = produceDelegatedResult(input)
		val negatedResult = negateResult(delegatedResult)
		return negatedResult
	}
	
	private fun produceDelegatedResult(input: Input): Boolean =
		delegatedInputPredicate.test(input)
	
	private fun negateResult(flag: Boolean): Boolean =
		!flag
}
