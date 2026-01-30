package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RealtimeResponseCreateParams_tools_inner.
  * @param `type` The type of the tool, i.e. `function`.
  * @param name The name of the function.
  * @param description The description of the function, including guidance on when and how  to call it, and guidance about what to tell the user when calling  (if anything). 
  * @param parameters Parameters of the function in JSON Schema.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RealtimeResponseCreateParamsToolsInner(
  `type`: Option[RealtimeResponseCreateParamsToolsInner.Type.Value],
  name: Option[String],
  description: Option[String],
  parameters: Option[JsObject]
)

object RealtimeResponseCreateParamsToolsInner {
  implicit lazy val realtimeResponseCreateParamsToolsInnerJsonFormat: Format[RealtimeResponseCreateParamsToolsInner] = Json.format[RealtimeResponseCreateParamsToolsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Function = Value("function")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

