package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMessageRequest_attachments_inner.
  * @param fileId The ID of the file to attach to the message.
  * @param tools The tools to add this file to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateMessageRequestAttachmentsInner(
  fileId: Option[String],
  tools: Option[List[CreateMessageRequestAttachmentsInnerToolsInner]]
)

object CreateMessageRequestAttachmentsInner {
  implicit lazy val createMessageRequestAttachmentsInnerJsonFormat: Format[CreateMessageRequestAttachmentsInner] = Json.format[CreateMessageRequestAttachmentsInner]
}

