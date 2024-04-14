package org.openapitools.server.model


/**
 * = Run steps =
 *
 * Represents a step in execution of a run. 
 *
 * @param id The identifier of the run step, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `thread.run.step`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the run step was created. for example: ''null''
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. for example: ''null''
 * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run. for example: ''null''
 * @param runId The ID of the [run](/docs/api-reference/runs) that this run step is a part of. for example: ''null''
 * @param `type` The type of run step, which can be either `message_creation` or `tool_calls`. for example: ''null''
 * @param status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. for example: ''null''
 * @param stepDetails  for example: ''null''
 * @param lastError  for example: ''null''
 * @param expiredAt The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. for example: ''null''
 * @param cancelledAt The Unix timestamp (in seconds) for when the run step was cancelled. for example: ''null''
 * @param failedAt The Unix timestamp (in seconds) for when the run step failed. for example: ''null''
 * @param completedAt The Unix timestamp (in seconds) for when the run step completed. for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  for example: ''null''
 * @param usage  for example: ''null''
*/
final case class RunStepObject (
  id: String,
  `object`: String,
  createdAt: Int,
  assistantId: String,
  threadId: String,
  runId: String,
  `type`: String,
  status: String,
  stepDetails: RunStepObjectStepDetails,
  lastError: RunStepObjectLastError,
  expiredAt: Int,
  cancelledAt: Int,
  failedAt: Int,
  completedAt: Int,
  metadata: Any,
  usage: RunStepCompletionUsage
)

