package model

import play.api.libs.json._

/**
  * Details on why the run is incomplete. Will be `null` if the run is not incomplete.
  * @param reason The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunObjectIncompleteDetails(
  reason: Option[RunObjectIncompleteDetails.Reason.Value]
)

object RunObjectIncompleteDetails {
  implicit lazy val runObjectIncompleteDetailsJsonFormat: Format[RunObjectIncompleteDetails] = Json.format[RunObjectIncompleteDetails]

  // noinspection TypeAnnotation
  object Reason extends Enumeration {
    val MaxCompletionTokens = Value("max_completion_tokens")
    val MaxPromptTokens = Value("max_prompt_tokens")

    type Reason = Value
    implicit lazy val ReasonJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

