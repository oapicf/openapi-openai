package org.openapitools.server.model


/**
 * = File search tool call =
 *
 * @param index The index of the tool call in the tool calls array. for example: ''null''
 * @param id The ID of the tool call object. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `file_search` for this type of tool call. for example: ''null''
 * @param fileSearch For now, this is always going to be an empty object. for example: ''null''
*/
final case class RunStepDeltaStepDetailsToolCallsFileSearchObject (
  index: Int,
  id: Option[String] = None,
  `type`: String,
  fileSearch: Any
)

