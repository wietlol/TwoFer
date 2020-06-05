package me.wietlol.exercism.twofor

import me.wietlol.exercism.twofor.implementations.CoalescingInputFilter
import me.wietlol.exercism.twofor.implementations.EmptyInputPredicate
import me.wietlol.exercism.twofor.implementations.NegationInputPredicate
import me.wietlol.exercism.twofor.implementations.factories.ConcreteInputFactory
import me.wietlol.exercism.twofor.implementations.suppliers.EmptyFilteringInputSupplier
import me.wietlol.exercism.twofor.implementations.mappers.FactoryInputToNameMapper
import me.wietlol.exercism.twofor.implementations.suppliers.InputNameSupplier
import me.wietlol.exercism.twofor.implementations.suppliers.PreFedInputSupplier
import me.wietlol.exercism.twofor.implementations.TwoFerSolutionImpl
import me.wietlol.exercism.twofor.implementations.factories.ConcreteMessageFactory
import me.wietlol.exercism.twofor.implementations.factories.ConcreteNameFactory
import me.wietlol.exercism.twofor.implementations.formatters.StringFormatStringFormatter
import me.wietlol.exercism.twofor.implementations.formatters.StringMessageFormatter
import me.wietlol.exercism.twofor.interfaces.TwoFerSolution
import me.wietlol.exercism.twofor.interfaces.data.Input
import me.wietlol.exercism.twofor.interfaces.factories.InputFactory

object Main
{
	// version 2 ... works as intended
	fun twoFer(input: String): String
	{
		val inputFactory: InputFactory = ConcreteInputFactory()
		val fallbackName: Input = inputFactory.create("you")
		val messagePattern = "One for %s, one for me."
		
		val solution: TwoFerSolution = TwoFerSolutionImpl(
			InputNameSupplier(
				EmptyFilteringInputSupplier(
					PreFedInputSupplier(
						inputFactory.create(input)
					),
					CoalescingInputFilter(
						NegationInputPredicate(
							EmptyInputPredicate()
						),
						PreFedInputSupplier(fallbackName)
					)
				),
				FactoryInputToNameMapper(
					ConcreteNameFactory()
				)
			),
			StringMessageFormatter(
				StringFormatStringFormatter(messagePattern),
				ConcreteMessageFactory()
			)
		)
		
		val result = solution.twoFer()
		
		return result
	}
	
	// version 1 ... didn't pass the enterprise test
//	fun twoFer(input: String): String =
//		"One for ${if (input.isEmpty()) "you" else input}, one for me."
	
	@JvmStatic
	fun main(args: Array<String>)
	{
		twoFer("Bob").also { println(it) }
		twoFer("").also { println(it) }
		twoFer("Alice").also { println(it) }
	}
}
