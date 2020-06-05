package me.wietlol.exercism.twofor.implementations.factories

import me.wietlol.exercism.twofor.implementations.data.ConcreteInput
import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.factories.InputFactory

class ConcreteInputFactory : InputFactory
{
	override fun create(text: String): Input =
		ConcreteInput(text)
}
