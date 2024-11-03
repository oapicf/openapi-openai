
package org.openapitools.client.model


case class ChatCompletionRequestMessageContentPartImage (
    /* The type of the content part. */
    _type: String,
    _imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl
)
object ChatCompletionRequestMessageContentPartImage {
    def toStringBody(var_type: Object, var_imageUrl: Object) =
        s"""
        | {
        | "type":$var_type,"imageUrl":$var_imageUrl
        | }
        """.stripMargin
}
