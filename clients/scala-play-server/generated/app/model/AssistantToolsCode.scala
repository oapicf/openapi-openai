package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsCode.
  * @param `type` The type of tool being defined: `code_interpreter`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantToolsCode(
  `type`: AssistantToolsCode.Type.Value
)

object AssistantToolsCode {
  implicit lazy val assistantToolsCodeJsonFormat: Format[AssistantToolsCode] = Json.format[AssistantToolsCode]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

