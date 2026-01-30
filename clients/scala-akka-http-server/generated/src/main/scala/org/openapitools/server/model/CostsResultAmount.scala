package org.openapitools.server.model


/**
 * The monetary value in its associated currency.
 *
 * @param value The numeric value of the cost. for example: ''null''
 * @param currency Lowercase ISO-4217 currency e.g. \"usd\" for example: ''null''
*/
final case class CostsResultAmount (
  value: Option[Double] = None,
  currency: Option[String] = None
)

