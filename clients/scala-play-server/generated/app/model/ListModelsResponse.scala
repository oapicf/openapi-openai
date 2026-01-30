package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListModelsResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListModelsResponse(
  `object`: ListModelsResponse.Object.Value,
  data: List[Model]
)

object ListModelsResponse {
  implicit lazy val listModelsResponseJsonFormat: Format[ListModelsResponse] = Json.format[ListModelsResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

