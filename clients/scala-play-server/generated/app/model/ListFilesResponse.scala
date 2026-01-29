package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFilesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class ListFilesResponse(
  data: List[OpenAIFile],
  `object`: ListFilesResponse.Object.Value
)

object ListFilesResponse {
  implicit lazy val listFilesResponseJsonFormat: Format[ListFilesResponse] = Json.format[ListFilesResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val List = Value("list")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

