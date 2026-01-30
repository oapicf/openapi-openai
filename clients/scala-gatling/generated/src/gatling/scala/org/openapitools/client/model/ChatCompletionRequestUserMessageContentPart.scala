
package org.openapitools.client.model


case class ChatCompletionRequestUserMessageContentPart (
    /* The type of the content part. */
    _type: String,
    /* The text content. */
    _text: String,
    _imageUrl: ChatCompletionRequestMessageContentPartImageImageUrl,
    _inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
)
object ChatCompletionRequestUserMessageContentPart {
    def toStringBody(var_type: Object, var_text: Object, var_imageUrl: Object, var_inputAudio: Object) =
        s"""
        | {
        | "type":$var_type,"text":$var_text,"imageUrl":$var_imageUrl,"inputAudio":$var_inputAudio
        | }
        """.stripMargin
}
