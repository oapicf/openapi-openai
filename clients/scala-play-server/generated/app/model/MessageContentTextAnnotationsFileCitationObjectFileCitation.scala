package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageContentTextAnnotationsFileCitationObject_file_citation.
  * @param fileId The ID of the specific File the citation is from.
  * @param quote The specific quote in the file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class MessageContentTextAnnotationsFileCitationObjectFileCitation(
  fileId: String,
  quote: String
)

object MessageContentTextAnnotationsFileCitationObjectFileCitation {
  implicit lazy val messageContentTextAnnotationsFileCitationObjectFileCitationJsonFormat: Format[MessageContentTextAnnotationsFileCitationObjectFileCitation] = Json.format[MessageContentTextAnnotationsFileCitationObjectFileCitation]
}

