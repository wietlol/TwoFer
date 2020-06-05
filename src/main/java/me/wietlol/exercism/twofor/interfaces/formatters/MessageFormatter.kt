package me.wietlol.exercism.twofor.interfaces.formatters

import me.wietlol.exercism.twofor.interfaces.data.Message
import me.wietlol.exercism.twofor.interfaces.data.Name

interface MessageFormatter
{
	fun formatMessage(name: Name): Message
}
