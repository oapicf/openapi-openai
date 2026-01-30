
package org.openapitools.client.model


case class ResponseFormatText (
    /* The type of response format being defined: `text` */
    _type: String
)
object ResponseFormatText {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
