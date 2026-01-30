package model

import play.api.libs.json._

/**
  * The upload Part represents a chunk of bytes we can add to an Upload object. 
  * @param id The upload Part unique identifier, which can be referenced in API endpoints.
  * @param createdAt The Unix timestamp (in seconds) for when the Part was created.
  * @param uploadId The ID of the Upload object that this Part was added to.
  * @param `object` The object type, which is always `upload.part`.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class UploadPart(
  id: String,
  createdAt: Int,
  uploadId: String,
  `object`: UploadPart.Object.Value
)

object UploadPart {
  implicit lazy val uploadPartJsonFormat: Format[UploadPart] = Json.format[UploadPart]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val UploadPart = Value("upload.part")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

