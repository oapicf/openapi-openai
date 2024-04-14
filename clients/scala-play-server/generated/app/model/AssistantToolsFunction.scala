package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsFunction.
  * @param `type` The type of tool being defined: `function`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class AssistantToolsFunction(
  `type`: AssistantToolsFunction.Type.Value,
  function: FunctionObject
)

object AssistantToolsFunction {
  implicit lazy val assistantToolsFunctionJsonFormat: Format[AssistantToolsFunction] = Json.format[AssistantToolsFunction]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

