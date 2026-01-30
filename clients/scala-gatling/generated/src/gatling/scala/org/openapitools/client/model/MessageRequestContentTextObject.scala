
package org.openapitools.client.model


case class MessageRequestContentTextObject (
    /* Always `text`. */
    _type: String,
    /* Text content to be sent to the model */
    _text: String
)
object MessageRequestContentTextObject {
    def toStringBody(var_type: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text
        | }
        """.stripMargin
}
