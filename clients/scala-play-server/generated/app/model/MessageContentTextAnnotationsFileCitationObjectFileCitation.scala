package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextAnnotationsFileCitationObject_file_citation.
  * @param fileId The ID of the specific File the citation is from.
  * @param quote The specific quote in the file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class MessageContentTextAnnotationsFileCitationObjectFileCitation(
  fileId: String,
  quote: String
)

object MessageContentTextAnnotationsFileCitationObjectFileCitation {
  implicit lazy val messageContentTextAnnotationsFileCitationObjectFileCitationJsonFormat: Format[MessageContentTextAnnotationsFileCitationObjectFileCitation] = Json.format[MessageContentTextAnnotationsFileCitationObjectFileCitation]
}

