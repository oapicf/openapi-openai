package model

import play.api.libs.json._

/**
  * The per-line training example of a fine-tuning input file for completions models
  * @param prompt The input prompt for this training example.
  * @param completion The desired completion for this training example.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTuneCompletionRequestInput(
  prompt: Option[String],
  completion: Option[String]
)

object FineTuneCompletionRequestInput {
  implicit lazy val fineTuneCompletionRequestInputJsonFormat: Format[FineTuneCompletionRequestInput] = Json.format[FineTuneCompletionRequestInput]
}

