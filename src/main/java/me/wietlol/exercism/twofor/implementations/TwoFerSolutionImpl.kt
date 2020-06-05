package me.wietlol.exercism.twofor.implementations

import me.wietlol.exercism.twofor.interfaces.formatters.MessageFormatter
import me.wietlol.exercism.twofor.interfaces.suppliers.NameSupplier
import me.wietlol.exercism.twofor.interfaces.TwoFerSolution

class TwoFerSolutionImpl(
	val nameSupplier: NameSupplier,
	val messageFormatter: MessageFormatter
) : TwoFerSolution
{
	override fun twoFer(): String
	{
		val name = nameSupplier.getName()
		
		val message = messageFormatter.formatMessage(name)
		
		return message.text
	}
}
