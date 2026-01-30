package model

import play.api.libs.json._

/**
  * Represents a completion response from the API. Note: both the streamed and non-streamed response objects share the same shape (unlike the chat endpoint). 
  * @param id A unique identifier for the completion.
  * @param choices The list of completion choices the model generated for the input prompt.
  * @param created The Unix timestamp (in seconds) of when the completion was created.
  * @param model The model used for completion.
  * @param systemFingerprint This fingerprint represents the backend configuration that the model runs with.  Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
  * @param `object` The object type, which is always \"text_completion\"
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateCompletionResponse(
  id: String,
  choices: List[CreateCompletionResponseChoicesInner],
  created: Int,
  model: String,
  systemFingerprint: Option[String],
  `object`: CreateCompletionResponse.Object.Value,
  usage: Option[CompletionUsage]
)

object CreateCompletionResponse {
  implicit lazy val createCompletionResponseJsonFormat: Format[CreateCompletionResponse] = Json.format[CreateCompletionResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val TextCompletion = Value("text_completion")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

