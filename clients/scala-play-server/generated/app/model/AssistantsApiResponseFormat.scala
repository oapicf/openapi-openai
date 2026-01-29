package model

import play.api.libs.json._

/**
  * An object describing the expected output of the model. If `json_object` only `function` type `tools` are allowed to be passed to the Run. If `text` the model can return text or any value needed. 
  * @param `type` Must be one of `text` or `json_object`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class AssistantsApiResponseFormat(
  `type`: Option[AssistantsApiResponseFormat.Type.Value]
)

object AssistantsApiResponseFormat {
  implicit lazy val assistantsApiResponseFormatJsonFormat: Format[AssistantsApiResponseFormat] = Json.format[AssistantsApiResponseFormat]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")
    val JsonObject = Value("json_object")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

