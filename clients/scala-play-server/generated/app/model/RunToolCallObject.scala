package model

import play.api.libs.json._

/**
  * Tool call objects
  * @param id The ID of the tool call. This ID must be referenced when you submit the tool outputs in using the [Submit tool outputs to run](/docs/api-reference/runs/submitToolOutputs) endpoint.
  * @param `type` The type of tool call the output is required for. For now, this is always `function`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunToolCallObject(
  id: String,
  `type`: RunToolCallObject.Type.Value,
  function: RunToolCallObjectFunction
)

object RunToolCallObject {
  implicit lazy val runToolCallObjectJsonFormat: Format[RunToolCallObject] = Json.format[RunToolCallObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

