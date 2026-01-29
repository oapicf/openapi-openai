package model

import play.api.libs.json._

/**
  * Represents a chat completion response returned by model, based on the provided input.
  * @param id A unique identifier for the chat completion.
  * @param choices A list of chat completion choices. Can be more than one if `n` is greater than 1.
  * @param created The Unix timestamp (in seconds) of when the chat completion was created.
  * @param model The model used for the chat completion.
  * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  * @param `object` The object type, which is always `chat.completion`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateChatCompletionResponse(
  id: String,
  choices: List[CreateChatCompletionResponseChoicesInner],
  created: Int,
  model: String,
  systemFingerprint: Option[String],
  `object`: CreateChatCompletionResponse.Object.Value,
  usage: Option[CompletionUsage]
)

object CreateChatCompletionResponse {
  implicit lazy val createChatCompletionResponseJsonFormat: Format[CreateChatCompletionResponse] = Json.format[CreateChatCompletionResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ChatCompletion = Value("chat.completion")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

