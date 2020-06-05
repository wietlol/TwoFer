package me.wietlol.exercism.twofor.interfaces.factories

import me.wietlol.exercism.twofor.interfaces.data.Message

interface MessageFactory
{
	fun create(text: String): Message
}
