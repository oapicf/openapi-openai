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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class CreateChatCompletionFunctionResponse(
  id: String,
  choices: List[CreateChatCompletionFunctionResponseChoicesInner],
  created: Int,
  model: String,
  systemFingerprint: Option[String],
  `object`: CreateChatCompletionFunctionResponse.Object.Value,
  usage: Option[CompletionUsage]
)

object CreateChatCompletionFunctionResponse {
  implicit lazy val createChatCompletionFunctionResponseJsonFormat: Format[CreateChatCompletionFunctionResponse] = Json.format[CreateChatCompletionFunctionResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ChatCompletion = Value("chat.completion")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

