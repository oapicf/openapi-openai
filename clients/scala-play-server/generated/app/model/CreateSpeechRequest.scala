package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateSpeechRequest.
  * @param input The text to generate audio for. The maximum length is 4096 characters.
  * @param voice The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options).
  * @param responseFormat The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
  * @param speed The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateSpeechRequest(
  model: CreateSpeechRequestModel,
  input: String,
  voice: CreateSpeechRequest.Voice.Value,
  responseFormat: Option[CreateSpeechRequest.ResponseFormat.Value],
  speed: Option[BigDecimal]
)

object CreateSpeechRequest {
  implicit lazy val createSpeechRequestJsonFormat: Format[CreateSpeechRequest] = Json.format[CreateSpeechRequest]

  // noinspection TypeAnnotation
  object Voice extends Enumeration {
    val Alloy = Value("alloy")
    val Echo = Value("echo")
    val Fable = Value("fable")
    val Onyx = Value("onyx")
    val Nova = Value("nova")
    val Shimmer = Value("shimmer")

    type Voice = Value
    implicit lazy val VoiceJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object ResponseFormat extends Enumeration {
    val Mp3 = Value("mp3")
    val Opus = Value("opus")
    val Aac = Value("aac")
    val Flac = Value("flac")
    val Wav = Value("wav")
    val Pcm = Value("pcm")

    type ResponseFormat = Value
    implicit lazy val ResponseFormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

