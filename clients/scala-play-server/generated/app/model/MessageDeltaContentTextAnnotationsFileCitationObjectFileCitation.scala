package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for MessageDeltaContentTextAnnotationsFileCitationObject_file_citation.
  * @param fileId The ID of the specific File the citation is from.
  * @param quote The specific quote in the file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation(
  fileId: Option[String],
  quote: Option[String]
)

object MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation {
  implicit lazy val messageDeltaContentTextAnnotationsFileCitationObjectFileCitationJsonFormat: Format[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation] = Json.format[MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation]
}

