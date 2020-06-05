package me.wietlol.exercism.twofor.implementations.mappers

import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.mappers.InputToNameMapper
import me.wietlol.exercism.twofor.interfaces.data.Name
import me.wietlol.exercism.twofor.interfaces.factories.NameFactory

class FactoryInputToNameMapper(
	val nameFactory: NameFactory
) : InputToNameMapper
{
	override fun map(input: Input): Name =
		nameFactory.create(input.text)
}
