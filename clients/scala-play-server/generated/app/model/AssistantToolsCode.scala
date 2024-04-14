package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsCode.
  * @param `type` The type of tool being defined: `code_interpreter`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

