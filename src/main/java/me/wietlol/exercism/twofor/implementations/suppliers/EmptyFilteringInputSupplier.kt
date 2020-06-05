package me.wietlol.exercism.twofor.implementations.suppliers

import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.InputFilter
import me.wietlol.exercism.twofor.interfaces.suppliers.InputSupplier

class EmptyFilteringInputSupplier(
	val delegatedInputSupplier: InputSupplier,
	val inputFilter: InputFilter
) : InputSupplier
{
	override fun getInput(): Input
	{
		val input = getDelegatedInput()
		val filteredInput = filterInput(input)
		return filteredInput
	}
	
	private fun getDelegatedInput(): Input =
		delegatedInputSupplier.getInput()
	
	private fun filterInput(input: Input): Input =
		inputFilter.filter(input)
}
