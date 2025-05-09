package model

import play.api.libs.json._

/**
  * Details on the action required to continue the run. Will be `null` if no action is required.
  * @param `type` For now, this is always `submit_tool_outputs`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunObjectRequiredAction(
  `type`: RunObjectRequiredAction.Type.Value,
  submitToolOutputs: RunObjectRequiredActionSubmitToolOutputs
)

object RunObjectRequiredAction {
  implicit lazy val runObjectRequiredActionJsonFormat: Format[RunObjectRequiredAction] = Json.format[RunObjectRequiredAction]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val SubmitToolOutputs = Value("submit_tool_outputs")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

