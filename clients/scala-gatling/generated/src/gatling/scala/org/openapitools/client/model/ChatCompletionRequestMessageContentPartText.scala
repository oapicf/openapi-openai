
package org.openapitools.client.model


case class ChatCompletionRequestMessageContentPartText (
    /* The type of the content part. */
    _type: String,
    /* The text content. */
    _text: String
)
object ChatCompletionRequestMessageContentPartText {
    def toStringBody(var_type: Object, var_text: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text
        | }
        """.stripMargin
}
