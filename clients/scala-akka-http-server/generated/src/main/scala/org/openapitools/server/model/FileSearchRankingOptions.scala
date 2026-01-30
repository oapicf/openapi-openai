package org.openapitools.server.model


/**
 * = File search tool call ranking options =
 *
 * The ranking options for the file search. If not specified, the file search tool will use the `auto` ranker and a score_threshold of 0.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
 *
 * @param ranker The ranker to use for the file search. If not specified will use the `auto` ranker. for example: ''null''
 * @param scoreThreshold The score threshold for the file search. All values must be a floating point number between 0 and 1. for example: ''null''
*/
final case class FileSearchRankingOptions (
  ranker: Option[String] = None,
  scoreThreshold: Double
)

