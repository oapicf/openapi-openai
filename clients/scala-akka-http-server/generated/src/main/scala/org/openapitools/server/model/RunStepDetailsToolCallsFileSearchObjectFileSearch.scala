package org.openapitools.server.model


/**
 * For now, this is always going to be an empty object.
 *
 * @param rankingOptions  for example: ''null''
 * @param results The results of the file search. for example: ''null''
*/
final case class RunStepDetailsToolCallsFileSearchObjectFileSearch (
  rankingOptions: Option[RunStepDetailsToolCallsFileSearchRankingOptionsObject] = None,
  results: Option[Seq[RunStepDetailsToolCallsFileSearchResultObject]] = None
)

