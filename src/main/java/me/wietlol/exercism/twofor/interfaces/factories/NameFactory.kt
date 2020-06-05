package me.wietlol.exercism.twofor.interfaces.factories

import me.wietlol.exercism.twofor.interfaces.data.Name

interface NameFactory
{
	fun create(text: String): Name
}
