package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for AssistantToolsRetrieval.
  * @param `type` The type of tool being defined: `retrieval`
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T10:48:27.489746113Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

