package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextAnnotationsFileCitationObject_file_citation.
  * @param fileId The ID of the specific File the citation is from.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageContentTextAnnotationsFileCitationObjectFileCitation(
  fileId: String
)

object MessageContentTextAnnotationsFileCitationObjectFileCitation {
  implicit lazy val messageContentTextAnnotationsFileCitationObjectFileCitationJsonFormat: Format[MessageContentTextAnnotationsFileCitationObjectFileCitation] = Json.format[MessageContentTextAnnotationsFileCitationObjectFileCitation]
}

