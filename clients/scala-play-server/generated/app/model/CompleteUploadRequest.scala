package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CompleteUploadRequest.
  * @param partIds The ordered list of Part IDs. 
  * @param md5 The optional md5 checksum for the file contents to verify if the bytes uploaded matches what you expect. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CompleteUploadRequest(
  partIds: List[String],
  md5: Option[String]
)

object CompleteUploadRequest {
  implicit lazy val completeUploadRequestJsonFormat: Format[CompleteUploadRequest] = Json.format[CompleteUploadRequest]
}

