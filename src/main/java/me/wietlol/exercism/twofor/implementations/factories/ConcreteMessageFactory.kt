package me.wietlol.exercism.twofor.implementations.factories

import me.wietlol.exercism.twofor.implementations.data.ConcreteMessage
import me.wietlol.exercism.twofor.interfaces.data.Message
import me.wietlol.exercism.twofor.interfaces.factories.MessageFactory

class ConcreteMessageFactory : MessageFactory
{
	override fun create(text: String): Message =
		ConcreteMessage(text)
}
