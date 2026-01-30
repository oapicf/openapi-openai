package model

import play.api.libs.json._

/**
  * Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
  * @param voice The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
  * @param format Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionRequestAudio(
  voice: CreateChatCompletionRequestAudio.Voice.Value,
  format: CreateChatCompletionRequestAudio.Format.Value
)

object CreateChatCompletionRequestAudio {
  implicit lazy val createChatCompletionRequestAudioJsonFormat: Format[CreateChatCompletionRequestAudio] = Json.format[CreateChatCompletionRequestAudio]

  // noinspection TypeAnnotation
  object Voice extends Enumeration {
    val Alloy = Value("alloy")
    val Ash = Value("ash")
    val Ballad = Value("ballad")
    val Coral = Value("coral")
    val Echo = Value("echo")
    val Sage = Value("sage")
    val Shimmer = Value("shimmer")
    val Verse = Value("verse")

    type Voice = Value
    implicit lazy val VoiceJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Format extends Enumeration {
    val Wav = Value("wav")
    val Mp3 = Value("mp3")
    val Flac = Value("flac")
    val Opus = Value("opus")
    val Pcm16 = Value("pcm16")

    type Format = Value
    implicit lazy val FormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

