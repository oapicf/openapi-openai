
package org.openapitools.client.model


case class MessageDeltaContentRefusalObject (
    /* The index of the refusal part in the message. */
    _index: Integer,
    /* Always `refusal`. */
    _type: String,
    _refusal: Option[String]
)
object MessageDeltaContentRefusalObject {
    def toStringBody(var_index: Object, var_type: Object, var_refusal: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"refusal":$var_refusal
        | }
        """.stripMargin
}
