package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * The monetary value in its associated currency.
 * @param value The numeric value of the cost.
 * @param currency Lowercase ISO-4217 currency e.g. \"usd\"
 */
case class CostsResultAmount(value: Option[BigDecimal],
                currency: Option[String]
                )

object CostsResultAmount {
    /**
     * Creates the codec for converting CostsResultAmount from and to JSON.
     */
    implicit val decoder: Decoder[CostsResultAmount] = deriveDecoder
    implicit val encoder: ObjectEncoder[CostsResultAmount] = deriveEncoder
}
