
package org.openapitools.client.model


case class MessageContentTextObject (
    /* Always `text`. */
    _type: String,
    _text: MessageContentTextObjectText
)
object MessageContentTextObject {
    def toStringBody(var_type: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text
        | }
        """.stripMargin
}
