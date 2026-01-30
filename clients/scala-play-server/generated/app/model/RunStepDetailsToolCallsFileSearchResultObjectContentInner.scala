package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for RunStepDetailsToolCallsFileSearchResultObject_content_inner.
  * @param `type` The type of the content.
  * @param text The text content of the file.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
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

