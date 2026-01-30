package model

import play.api.libs.json._

/**
  * The Upload object can accept byte chunks in the form of Parts. 
  * @param id The Upload unique identifier, which can be referenced in API endpoints.
  * @param createdAt The Unix timestamp (in seconds) for when the Upload was created.
  * @param filename The name of the file to be uploaded.
  * @param bytes The intended number of bytes to be uploaded.
  * @param purpose The intended purpose of the file. [Please refer here](/docs/api-reference/files/object#files/object-purpose) for acceptable values.
  * @param status The status of the Upload.
  * @param expiresAt The Unix timestamp (in seconds) for when the Upload was created.
  * @param `object` The object type, which is always \"upload\".
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class Upload(
  id: String,
  createdAt: Int,
  filename: String,
  bytes: Int,
  purpose: String,
  status: Upload.Status.Value,
  expiresAt: Int,
  `object`: Option[Upload.Object.Value],
  file: Option[OpenAIFile]
)

object Upload {
  implicit lazy val uploadJsonFormat: Format[Upload] = Json.format[Upload]

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Pending = Value("pending")
    val Completed = Value("completed")
    val Cancelled = Value("cancelled")
    val Expired = Value("expired")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val Upload = Value("upload")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

