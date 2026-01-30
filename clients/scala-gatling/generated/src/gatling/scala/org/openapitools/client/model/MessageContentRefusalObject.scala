
package org.openapitools.client.model


case class MessageContentRefusalObject (
    /* Always `refusal`. */
    _type: String,
    _refusal: String
)
object MessageContentRefusalObject {
    def toStringBody(var_type: Object, var_refusal: Object) =
        s"""
        | {
        | "type":$var_type,"refusal":$var_refusal
        | }
        """.stripMargin
}
