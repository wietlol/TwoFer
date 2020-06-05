package me.wietlol.exercism.twofor.implementations.factories

import me.wietlol.exercism.twofor.implementations.data.ConcreteName
import me.wietlol.exercism.twofor.interfaces.data.Name
import me.wietlol.exercism.twofor.interfaces.factories.NameFactory

class ConcreteNameFactory : NameFactory
{
	override fun create(text: String): Name
	{
		return ConcreteName(text)
	}
}
