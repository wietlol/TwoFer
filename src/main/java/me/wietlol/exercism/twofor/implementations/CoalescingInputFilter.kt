package me.wietlol.exercism.twofor.implementations

import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.InputFilter
import me.wietlol.exercism.twofor.interfaces.InputPredicate
import me.wietlol.exercism.twofor.interfaces.suppliers.InputSupplier

class CoalescingInputFilter(
	val predicate: InputPredicate,
	val fallbackInput: InputSupplier
) : InputFilter
{
	override fun filter(input: Input): Input =
		if (isInputValid(input))
			input
		else
			produceFallbackInput()
	
	private fun isInputValid(input: Input): Boolean =
		predicate.test(input)
	
	private fun produceFallbackInput(): Input =
		fallbackInput.getInput()
}
