
package org.openapitools.client.model


case class ChatCompletionRequestMessageContentPartAudio (
    /* The type of the content part. Always `input_audio`. */
    _type: String,
    _inputAudio: ChatCompletionRequestMessageContentPartAudioInputAudio
)
object ChatCompletionRequestMessageContentPartAudio {
    def toStringBody(var_type: Object, var_inputAudio: Object) =
        s"""
        | {
        | "type":$var_type,"inputAudio":$var_inputAudio
        | }
        """.stripMargin
}
