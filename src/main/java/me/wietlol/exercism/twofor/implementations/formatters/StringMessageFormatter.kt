package me.wietlol.exercism.twofor.implementations.formatters

import me.wietlol.exercism.twofor.interfaces.data.Message
import me.wietlol.exercism.twofor.interfaces.data.Name
import me.wietlol.exercism.twofor.interfaces.factories.MessageFactory
import me.wietlol.exercism.twofor.interfaces.formatters.MessageFormatter
import me.wietlol.exercism.twofor.interfaces.formatters.StringFormatter

class StringMessageFormatter(
	val stringFormatter: StringFormatter,
	val messageFactory: MessageFactory
) : MessageFormatter
{
	override fun formatMessage(name: Name): Message
	{
		val fullText = produceMessageText(name)
		return produceMessage(fullText)
	}
	
	private fun produceMessageText(name: Name): String =
		stringFormatter.formatString(listOf(name.text))
	
	private fun produceMessage(text: String): Message =
		messageFactory.create(text)
}
