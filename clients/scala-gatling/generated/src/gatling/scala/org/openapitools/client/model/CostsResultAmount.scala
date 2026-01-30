
package org.openapitools.client.model


case class CostsResultAmount (
    /* The numeric value of the cost. */
    _value: Option[Number],
    /* Lowercase ISO-4217 currency e.g. \"usd\" */
    _currency: Option[String]
)
object CostsResultAmount {
    def toStringBody(var_value: Object, var_currency: Object) =
        s"""
        | {
        | "value":$var_value,"currency":$var_currency
        | }
        """.stripMargin
}
