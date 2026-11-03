package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for DeleteFileResponse.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

