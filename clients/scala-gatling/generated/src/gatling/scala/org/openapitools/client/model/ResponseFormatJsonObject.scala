
package org.openapitools.client.model


case class ResponseFormatJsonObject (
    /* The type of response format being defined: `json_object` */
    _type: String
)
object ResponseFormatJsonObject {
    def toStringBody(var_type: Object) =
        s"""
        | {
        | "type":$var_type
        | }
        """.stripMargin
}
