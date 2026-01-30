package model

import play.api.libs.json._

/**
  * Realtime session object configuration.
  * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
  * @param model The Realtime model used for this session. 
  * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
  * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
  * @param inputAudioFormat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  * @param outputAudioFormat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
  * @param tools Tools (functions) available to the model.
  * @param toolChoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
  * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeSessionCreateRequest(
  modalities: Option[RealtimeSessionCreateRequest.Modalities.Value],
  model: RealtimeSessionCreateRequest.Model.Value,
  instructions: Option[String],
  voice: Option[RealtimeSessionCreateRequest.Voice.Value],
  inputAudioFormat: Option[RealtimeSessionCreateRequest.InputAudioFormat.Value],
  outputAudioFormat: Option[RealtimeSessionCreateRequest.OutputAudioFormat.Value],
  inputAudioTranscription: Option[RealtimeSessionInputAudioTranscription],
  turnDetection: Option[RealtimeSessionCreateRequestTurnDetection],
  tools: Option[List[RealtimeResponseCreateParamsToolsInner]],
  toolChoice: Option[String],
  temperature: Option[BigDecimal],
  maxResponseOutputTokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens]
)

object RealtimeSessionCreateRequest {
  implicit lazy val realtimeSessionCreateRequestJsonFormat: Format[RealtimeSessionCreateRequest] = Json.format[RealtimeSessionCreateRequest]

  // noinspection TypeAnnotation
  object Modalities extends Enumeration {
    val Text = Value("text")
    val Audio = Value("audio")

    type Modalities = Value
    implicit lazy val ModalitiesJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Model extends Enumeration {
    val Gpt4oRealtimePreview = Value("gpt-4o-realtime-preview")
    val Gpt4oRealtimePreview20241001 = Value("gpt-4o-realtime-preview-2024-10-01")
    val Gpt4oRealtimePreview20241217 = Value("gpt-4o-realtime-preview-2024-12-17")
    val Gpt4oMiniRealtimePreview = Value("gpt-4o-mini-realtime-preview")
    val Gpt4oMiniRealtimePreview20241217 = Value("gpt-4o-mini-realtime-preview-2024-12-17")

    type Model = Value
    implicit lazy val ModelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

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
  object InputAudioFormat extends Enumeration {
    val Pcm16 = Value("pcm16")
    val G711Ulaw = Value("g711_ulaw")
    val G711Alaw = Value("g711_alaw")

    type InputAudioFormat = Value
    implicit lazy val InputAudioFormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object OutputAudioFormat extends Enumeration {
    val Pcm16 = Value("pcm16")
    val G711Ulaw = Value("g711_ulaw")
    val G711Alaw = Value("g711_alaw")

    type OutputAudioFormat = Value
    implicit lazy val OutputAudioFormatJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

