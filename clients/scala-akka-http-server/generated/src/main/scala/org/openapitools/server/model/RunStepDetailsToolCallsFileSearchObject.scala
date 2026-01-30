package org.openapitools.server.model


/**
 * = File search tool call =
 *
 * @param id The ID of the tool call object. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `file_search` for this type of tool call. for example: ''null''
 * @param fileSearch  for example: ''null''
*/
final case class RunStepDetailsToolCallsFileSearchObject (
  id: String,
  `type`: String,
  fileSearch: RunStepDetailsToolCallsFileSearchObjectFileSearch
)

