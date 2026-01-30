package model

import play.api.libs.json._

/**
  * A result instance of the file search.
  * @param fileId The ID of the file that result was found in.
  * @param fileName The name of the file that result was found in.
  * @param score The score of the result. All values must be a floating point number between 0 and 1.
  * @param content The content of the result that was found. The content is only included if requested via the include query parameter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-29T14:17:05.516820397Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class RunStepDetailsToolCallsFileSearchResultObject(
  fileId: String,
  fileName: String,
  score: BigDecimal,
  content: Option[List[RunStepDetailsToolCallsFileSearchResultObjectContentInner]]
)

object RunStepDetailsToolCallsFileSearchResultObject {
  implicit lazy val runStepDetailsToolCallsFileSearchResultObjectJsonFormat: Format[RunStepDetailsToolCallsFileSearchResultObject] = Json.format[RunStepDetailsToolCallsFileSearchResultObject]
}

