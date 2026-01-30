package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateUploadRequest.
  * @param filename The name of the file to upload. 
  * @param purpose The intended purpose of the uploaded file.  See the [documentation on File purposes](/docs/api-reference/files/create#files-create-purpose). 
  * @param bytes The number of bytes in the file you are uploading. 
  * @param mimeType The MIME type of the file.  This must fall within the supported MIME types for your file purpose. See the supported MIME types for assistants and vision. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateUploadRequest(
  filename: String,
  purpose: CreateUploadRequest.Purpose.Value,
  bytes: Int,
  mimeType: String
)

object CreateUploadRequest {
  implicit lazy val createUploadRequestJsonFormat: Format[CreateUploadRequest] = Json.format[CreateUploadRequest]

  // noinspection TypeAnnotation
  object Purpose extends Enumeration {
    val Assistants = Value("assistants")
    val Batch = Value("batch")
    val FineTune = Value("fine-tune")
    val Vision = Value("vision")

    type Purpose = Value
    implicit lazy val PurposeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

