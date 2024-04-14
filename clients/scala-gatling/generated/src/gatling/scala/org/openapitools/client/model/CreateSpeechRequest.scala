
package org.openapitools.client.model


case class CreateSpeechRequest (
    _model: CreateSpeechRequestModel,
    /* The text to generate audio for. The maximum length is 4096 characters. */
    _input: String,
    /* The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). */
    _voice: String,
    /* The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`. */
    _responseFormat: Option[String],
    /* The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. */
    _speed: Option[Number]
)
object CreateSpeechRequest {
    def toStringBody(var_model: Object, var_input: Object, var_voice: Object, var_responseFormat: Object, var_speed: Object) =
        s"""
        | {
        | "model":$var_model,"input":$var_input,"voice":$var_voice,"responseFormat":$var_responseFormat,"speed":$var_speed
        | }
        """.stripMargin
}
