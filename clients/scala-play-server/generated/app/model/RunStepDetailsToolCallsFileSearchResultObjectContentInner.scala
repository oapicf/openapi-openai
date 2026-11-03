package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsFileSearchResultObject_content_inner.
  * @param `type` The type of the content.
  * @param text The text content of the file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class RunStepDetailsToolCallsFileSearchResultObjectContentInner(
  `type`: Option[RunStepDetailsToolCallsFileSearchResultObjectContentInner.Type.Value],
  text: Option[String]
)

object RunStepDetailsToolCallsFileSearchResultObjectContentInner {
  implicit lazy val runStepDetailsToolCallsFileSearchResultObjectContentInnerJsonFormat: Format[RunStepDetailsToolCallsFileSearchResultObjectContentInner] = Json.format[RunStepDetailsToolCallsFileSearchResultObjectContentInner]

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val Text = Value("text")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

