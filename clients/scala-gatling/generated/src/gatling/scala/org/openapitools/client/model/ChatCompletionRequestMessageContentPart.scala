
package org.openapitools.client.model


case class ChatCompletionRequestMessageContentPart (
    /* The type of the content part. */
    _type: String,
    /* The text content. */
    _text: String,
    _imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
)
object ChatCompletionRequestMessageContentPart {
    def toStringBody(var_type: Object, var_text: Object, var_imageUrl: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text,"imageUrl":$var_imageUrl
        | }
        """.stripMargin
}
