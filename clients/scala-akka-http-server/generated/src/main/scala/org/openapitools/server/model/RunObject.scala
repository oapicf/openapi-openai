package org.openapitools.server.model


/**
 * = A run on a thread =
 *
 * Represents an execution run on a [thread](/docs/api-reference/threads).
 *
 * @param id The identifier, which can be referenced in API endpoints. for example: ''null''
 * @param `object` The object type, which is always `thread.run`. for example: ''null''
 * @param createdAt The Unix timestamp (in seconds) for when the run was created. for example: ''null''
 * @param threadId The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. for example: ''null''
 * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. for example: ''null''
 * @param status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`. for example: ''null''
 * @param requiredAction  for example: ''null''
 * @param lastError  for example: ''null''
 * @param expiresAt The Unix timestamp (in seconds) for when the run will expire. for example: ''null''
 * @param startedAt The Unix timestamp (in seconds) for when the run was started. for example: ''null''
 * @param cancelledAt The Unix timestamp (in seconds) for when the run was cancelled. for example: ''null''
 * @param failedAt The Unix timestamp (in seconds) for when the run failed. for example: ''null''
 * @param completedAt The Unix timestamp (in seconds) for when the run was completed. for example: ''null''
 * @param incompleteDetails  for example: ''null''
 * @param model The model that the [assistant](/docs/api-reference/assistants) used for this run. for example: ''null''
 * @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run. for example: ''null''
 * @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. for example: ''null''
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  for example: ''null''
 * @param usage  for example: ''null''
 * @param temperature The sampling temperature used for this run. If not set, defaults to 1. for example: ''null''
 * @param topP The nucleus sampling value used for this run. If not set, defaults to 1. for example: ''null''
 * @param maxPromptTokens The maximum number of prompt tokens specified to have been used over the course of the run.  for example: ''null''
 * @param maxCompletionTokens The maximum number of completion tokens specified to have been used over the course of the run.  for example: ''null''
 * @param truncationStrategy  for example: ''null''
 * @param toolChoice  for example: ''null''
 * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use. for example: ''null''
 * @param responseFormat  for example: ''null''
*/
final case class RunObject (
  id: String,
  `object`: String,
  createdAt: Int,
  threadId: String,
  assistantId: String,
  status: String,
  requiredAction: RunObjectRequiredAction,
  lastError: RunObjectLastError,
  expiresAt: Int,
  startedAt: Int,
  cancelledAt: Int,
  failedAt: Int,
  completedAt: Int,
  incompleteDetails: RunObjectIncompleteDetails,
  model: String,
  instructions: String,
  tools: Seq[AssistantObjectToolsInner],
  metadata: Any,
  usage: RunCompletionUsage,
  temperature: Option[Double] = None,
  topP: Option[Double] = None,
  maxPromptTokens: Int,
  maxCompletionTokens: Int,
  truncationStrategy: TruncationObject,
  toolChoice: AssistantsApiToolChoiceOption,
  parallelToolCalls: Boolean,
  responseFormat: AssistantsApiResponseFormatOption
)

