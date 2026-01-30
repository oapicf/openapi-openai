package org.openapitools.server.model


/**
 * The details of the run step.
 *
 * @param `type` Always `message_creation`. for example: ''null''
 * @param messageCreation  for example: ''null''
 * @param toolCalls An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`.  for example: ''null''
*/
final case class RunStepDeltaObjectDeltaStepDetails (
  `type`: String,
  messageCreation: Option[RunStepDeltaStepDetailsMessageCreationObjectMessageCreation] = None,
  toolCalls: Option[Seq[RunStepDeltaStepDetailsToolCallsObjectToolCallsInner]] = None
)

