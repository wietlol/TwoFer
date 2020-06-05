package me.wietlol.exercism.twofor.implementations.suppliers

import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.suppliers.InputSupplier
import me.wietlol.exercism.twofor.interfaces.mappers.InputToNameMapper
import me.wietlol.exercism.twofor.interfaces.data.Name
import me.wietlol.exercism.twofor.interfaces.suppliers.NameSupplier

class InputNameSupplier(
	val inputSupplier: InputSupplier,
	val inputToNameMapper: InputToNameMapper
) : NameSupplier
{
	override fun getName(): Name
	{
		val input = getInput()
		val name = mapInputToName(input)
		return name
	}
	
	private fun getInput(): Input =
		inputSupplier.getInput()
	
	private fun mapInputToName(input: Input): Name =
		inputToNameMapper.map(input)
}
