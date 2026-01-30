package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for CreateMessageRequest_attachments_inner_tools_inner.
  * @param `type` The type of tool being defined: `code_interpreter`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class CreateMessageRequestAttachmentsInnerToolsInner(
  `type`: CreateMessageRequestAttachmentsInnerToolsInner.Type.Value
)

object CreateMessageRequestAttachmentsInnerToolsInner {
  implicit lazy val createMessageRequestAttachmentsInnerToolsInnerJsonFormat: Format[CreateMessageRequestAttachmentsInnerToolsInner] = Json.format[CreateMessageRequestAttachmentsInnerToolsInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val CodeInterpreter = Value("code_interpreter")
    val FileSearch = Value("file_search")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

