/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */

package org.openapitools.server.model

case class RunStepObject(
  /* The identifier of the run step, which can be referenced in API endpoints. */
  id: String,

  /* The object type, which is always `thread.run.step`. */
  `object`: String,

  /* The Unix timestamp (in seconds) for when the run step was created. */
  createdAt: Int,

  /* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
  assistantId: String,

  /* The ID of the [thread](/docs/api-reference/threads) that was run. */
  threadId: String,

  /* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
  runId: String,

  /* The type of run step, which can be either `message_creation` or `tool_calls`. */
  `type`: String,

  /* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
  status: String,

  stepDetails: RunStepObjectStepDetails,

  lastError: RunStepObjectLastError,

  /* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
  expiredAt: Int,

  /* The Unix timestamp (in seconds) for when the run step was cancelled. */
  cancelledAt: Int,

  /* The Unix timestamp (in seconds) for when the run step failed. */
  failedAt: Int,

  /* The Unix timestamp (in seconds) for when the run step completed. */
  completedAt: Int,

  /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  metadata: Any,

  usage: RunStepCompletionUsage

 )