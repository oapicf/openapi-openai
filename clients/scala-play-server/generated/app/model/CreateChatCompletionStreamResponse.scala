package model

import play.api.libs.json._

/**
  * Represents a streamed chunk of a chat completion response returned by model, based on the provided input.
  * @param id A unique identifier for the chat completion. Each chunk has the same ID.
  * @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
  * @param created The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
  * @param model The model to generate the completion.
  * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  * @param `object` The object type, which is always `chat.completion.chunk`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionStreamResponse(
  id: String,
  choices: List[CreateChatCompletionStreamResponseChoicesInner],
  created: Int,
  model: String,
  systemFingerprint: Option[String],
  `object`: CreateChatCompletionStreamResponse.Object.Value
)

object CreateChatCompletionStreamResponse {
  implicit lazy val createChatCompletionStreamResponseJsonFormat: Format[CreateChatCompletionStreamResponse] = Json.format[CreateChatCompletionStreamResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ChatCompletionChunk = Value("chat.completion.chunk")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

