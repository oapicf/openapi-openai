package org.openapitools.server.model


/**
 * = File search tool call result =
 *
 * A result instance of the file search.
 *
 * @param fileId The ID of the file that result was found in. for example: ''null''
 * @param fileName The name of the file that result was found in. for example: ''null''
 * @param score The score of the result. All values must be a floating point number between 0 and 1. for example: ''null''
 * @param content The content of the result that was found. The content is only included if requested via the include query parameter. for example: ''null''
*/
final case class RunStepDetailsToolCallsFileSearchResultObject (
  fileId: String,
  fileName: String,
  score: Double,
  content: Option[Seq[RunStepDetailsToolCallsFileSearchResultObjectContentInner]] = None
)

