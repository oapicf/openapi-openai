package model

import play.api.libs.json._

/**
  * Specifies a tool the model should use. Use to force the model to call a specific tool.
  * @param `type` The type of the tool. If type is `function`, the function name must be set
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantsNamedToolChoice(
  `type`: AssistantsNamedToolChoice.Type.Value,
  function: Option[AssistantsNamedToolChoiceFunction]
)

object AssistantsNamedToolChoice {
  implicit lazy val assistantsNamedToolChoiceJsonFormat: Format[AssistantsNamedToolChoice] = Json.format[AssistantsNamedToolChoice]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")
    val CodeInterpreter = Value("code_interpreter")
    val FileSearch = Value("file_search")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

