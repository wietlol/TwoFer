package me.wietlol.exercism.twofor.implementations.suppliers

import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.suppliers.InputSupplier

class PreFedInputSupplier(
	val feed: Input
) : InputSupplier
{
	override fun getInput(): Input =
		getFedInput()
	
	private fun getFedInput(): Input =
		feed
}
