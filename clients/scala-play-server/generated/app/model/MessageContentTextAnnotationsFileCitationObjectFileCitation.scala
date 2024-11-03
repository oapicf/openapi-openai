package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextAnnotationsFileCitationObject_file_citation.
  * @param fileId The ID of the specific File the citation is from.
  * @param quote The specific quote in the file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class MessageContentTextAnnotationsFileCitationObjectFileCitation(
  fileId: String,
  quote: String
)

object MessageContentTextAnnotationsFileCitationObjectFileCitation {
  implicit lazy val messageContentTextAnnotationsFileCitationObjectFileCitationJsonFormat: Format[MessageContentTextAnnotationsFileCitationObjectFileCitation] = Json.format[MessageContentTextAnnotationsFileCitationObjectFileCitation]
}

