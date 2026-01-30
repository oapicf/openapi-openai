
package org.openapitools.client.model


case class ChatCompletionRequestMessageContentPartAudioInputAudio (
    /* Base64 encoded audio data. */
    _data: String,
    /* The format of the encoded audio data. Currently supports \"wav\" and \"mp3\".  */
    _format: String
)
object ChatCompletionRequestMessageContentPartAudioInputAudio {
    def toStringBody(var_data: Object, var_format: Object) =
        s"""
        | {
        | "data":$var_data,"format":$var_format
        | }
        """.stripMargin
}
