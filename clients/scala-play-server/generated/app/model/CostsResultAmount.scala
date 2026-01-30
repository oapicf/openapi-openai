package model

import play.api.libs.json._

/**
  * The monetary value in its associated currency.
  * @param value The numeric value of the cost.
  * @param currency Lowercase ISO-4217 currency e.g. \"usd\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CostsResultAmount(
  value: Option[BigDecimal],
  currency: Option[String]
)

object CostsResultAmount {
  implicit lazy val costsResultAmountJsonFormat: Format[CostsResultAmount] = Json.format[CostsResultAmount]
}

