package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMessageRequest_attachments_inner.
  * @param fileId The ID of the file to attach to the message.
  * @param tools The tools to add this file to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-26T05:22:02.282422614Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CreateMessageRequestAttachmentsInner(
  fileId: Option[String],
  tools: Option[List[CreateMessageRequestAttachmentsInnerToolsInner]]
)

object CreateMessageRequestAttachmentsInner {
  implicit lazy val createMessageRequestAttachmentsInnerJsonFormat: Format[CreateMessageRequestAttachmentsInner] = Json.format[CreateMessageRequestAttachmentsInner]
}

