package org.openapitools.server.model


/**
 * = File search tool call ranking options =
 *
 * The ranking options for the file search.
 *
 * @param ranker The ranker used for the file search. for example: ''null''
 * @param scoreThreshold The score threshold for the file search. All values must be a floating point number between 0 and 1. for example: ''null''
*/
final case class RunStepDetailsToolCallsFileSearchRankingOptionsObject (
  ranker: String,
  scoreThreshold: Double
)

