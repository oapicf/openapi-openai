package org.openapitools.server.model


/**
 * = Retrieval tool call =
 *
 * @param id The ID of the tool call object. for example: ''null''
 * @param `type` The type of tool call. This is always going to be `retrieval` for this type of tool call. for example: ''null''
 * @param retrieval For now, this is always going to be an empty object. for example: ''null''
*/
final case class RunStepDetailsToolCallsRetrievalObject (
  id: String,
  `type`: String,
  retrieval: Any
)

