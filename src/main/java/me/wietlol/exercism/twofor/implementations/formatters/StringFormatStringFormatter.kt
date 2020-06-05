package me.wietlol.exercism.twofor.implementations.formatters

import me.wietlol.exercism.twofor.interfaces.formatters.StringFormatter

class StringFormatStringFormatter(
	val pattern: String
) : StringFormatter
{
	override fun formatString(data: List<String>): String =
		produceFormattedString(data)
	
	private fun produceFormattedString(data: List<String>): String =
		String.format(pattern, *data.toTypedArray())
}
