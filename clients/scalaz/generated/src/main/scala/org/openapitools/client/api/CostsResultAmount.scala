package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CostsResultAmount._

case class CostsResultAmount (
  /* The numeric value of the cost. */
  value: Option[BigDecimal],
/* Lowercase ISO-4217 currency e.g. \"usd\" */
  currency: Option[String])

object CostsResultAmount {
  import DateTimeCodecs._

  implicit val CostsResultAmountCodecJson: CodecJson[CostsResultAmount] = CodecJson.derive[CostsResultAmount]
  implicit val CostsResultAmountDecoder: EntityDecoder[CostsResultAmount] = jsonOf[CostsResultAmount]
  implicit val CostsResultAmountEncoder: EntityEncoder[CostsResultAmount] = jsonEncoderOf[CostsResultAmount]
}
