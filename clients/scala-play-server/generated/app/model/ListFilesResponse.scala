package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for ListFilesResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

