package model

import play.api.libs.json._

/**
  * The per-line training example of a fine-tuning input file for chat models using the dpo method.
  * @param preferredCompletion The preferred completion message for the output.
  * @param nonPreferredCompletion The non-preferred completion message for the output.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FineTunePreferenceRequestInput(
  input: Option[FineTunePreferenceRequestInputInput],
  preferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]],
  nonPreferredCompletion: Option[List[FineTunePreferenceRequestInputPreferredCompletionInner]]
)

object FineTunePreferenceRequestInput {
  implicit lazy val fineTunePreferenceRequestInputJsonFormat: Format[FineTunePreferenceRequestInput] = Json.format[FineTunePreferenceRequestInput]
}

