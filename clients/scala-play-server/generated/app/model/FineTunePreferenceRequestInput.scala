package model

import play.api.libs.json._

/**
  * The per-line training example of a fine-tuning input file for chat models using the dpo method.
  * @param preferredCompletion The preferred completion message for the output.
  * @param nonPreferredCompletion The non-preferred completion message for the output.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class FineTunePreferenceRequestInput(
  input: Option[FineTunePreferenceRequestInputInput],
  preferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]],
  nonPreferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]]
)

object FineTunePreferenceRequestInput {
  implicit lazy val fineTunePreferenceRequestInputJsonFormat: Format[FineTunePreferenceRequestInput] = Json.format[FineTunePreferenceRequestInput]
}

