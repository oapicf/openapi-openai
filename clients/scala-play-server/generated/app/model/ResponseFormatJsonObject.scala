package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ResponseFormatJsonObject.
  * @param `type` The type of response format being defined: `json_object`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ResponseFormatJsonObject(
  `type`: ResponseFormatJsonObject.Type.Value
)

object ResponseFormatJsonObject {
  implicit lazy val responseFormatJsonObjectJsonFormat: Format[ResponseFormatJsonObject] = Json.format[ResponseFormatJsonObject]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val JsonObject = Value("json_object")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

