package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteFileResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class DeleteFileResponse(
  id: String,
  `object`: DeleteFileResponse.Object.Value,
  deleted: Boolean
)

object DeleteFileResponse {
  implicit lazy val deleteFileResponseJsonFormat: Format[DeleteFileResponse] = Json.format[DeleteFileResponse]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val File = Value("file")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

