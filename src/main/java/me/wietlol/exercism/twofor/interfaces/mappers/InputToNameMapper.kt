package me.wietlol.exercism.twofor.interfaces.mappers

import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.data.Name

interface InputToNameMapper
{
	fun map(input: Input): Name
}
