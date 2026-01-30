package model

import play.api.libs.json._

/**
  * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
  * @param id A unique identifier for the chat completion. Each chunk has the same ID.
  * @param choices A list of chat completion choices. Can contain more than one elements if `n` is greater than 1. Can also be empty for the last chunk if you set `stream_options: {\"include_usage\": true}`. 
  * @param created The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
  * @param model The model to generate the completion.
  * @param serviceTier The service tier used for processing the request. This field is only included if the `service_tier` parameter is specified in the request.
  * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  * @param `object` The object type, which is always `chat.completion.chunk`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionStreamResponse(
  id: String,
  choices: List[CreateChatCompletionStreamResponseChoicesInner],
  created: Int,
  model: String,
  serviceTier: Option[CreateChatCompletionStreamResponse.ServiceTier.Value],
  systemFingerprint: Option[String],
  `object`: CreateChatCompletionStreamResponse.Object.Value,
  usage: Option[CreateChatCompletionStreamResponseUsage]
)

object CreateChatCompletionStreamResponse {
  implicit lazy val createChatCompletionStreamResponseJsonFormat: Format[CreateChatCompletionStreamResponse] = Json.format[CreateChatCompletionStreamResponse]

  // noinspection TypeAnnotation
  object ServiceTier extends Enumeration {
    val Scale = Value("scale")
    val Default = Value("default")

    type ServiceTier = Value
    implicit lazy val ServiceTierJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ChatCompletionChunk = Value("chat.completion.chunk")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

