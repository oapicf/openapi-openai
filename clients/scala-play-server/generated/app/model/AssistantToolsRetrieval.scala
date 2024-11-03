package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsRetrieval.
  * @param `type` The type of tool being defined: `retrieval`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class AssistantToolsRetrieval(
  `type`: AssistantToolsRetrieval.Type.Value
)

object AssistantToolsRetrieval {
  implicit lazy val assistantToolsRetrievalJsonFormat: Format[AssistantToolsRetrieval] = Json.format[AssistantToolsRetrieval]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Retrieval = Value("retrieval")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

