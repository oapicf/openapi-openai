
package org.openapitools.client.model


case class MessageDeltaContentTextObject (
    /* The index of the content part in the message. */
    _index: Integer,
    /* Always `text`. */
    _type: String,
    _text: Option[MessageDeltaContentTextObjectText]
)
object MessageDeltaContentTextObject {
    def toStringBody(var_index: Object, var_type: Object, var_text: Object) =
        s"""
        | {
        | "index":$var_index,"type":$var_type,"text":$var_text
        | }
        """.stripMargin
}
