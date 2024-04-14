package model

import play.api.libs.json._

/**
  * Represents a step in execution of a run. 
  * @param id The identifier of the run step, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `thread.run.step`.
  * @param createdAt The Unix timestamp (in seconds) for when the run step was created.
  * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
  * @param threadId The ID of the [thread](/docs/api-reference/threads) that was run.
  * @param runId The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
  * @param `type` The type of run step, which can be either `message_creation` or `tool_calls`.
  * @param status The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
  * @param expiredAt The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
  * @param cancelledAt The Unix timestamp (in seconds) for when the run step was cancelled.
  * @param failedAt The Unix timestamp (in seconds) for when the run step failed.
  * @param completedAt The Unix timestamp (in seconds) for when the run step completed.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-04-14T13:53:34.453725706Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class RunStepObject(
  id: String,
  `object`: RunStepObject.Object.Value,
  createdAt: Int,
  assistantId: String,
  threadId: String,
  runId: String,
  `type`: RunStepObject.Type.Value,
  status: RunStepObject.Status.Value,
  stepDetails: RunStepObjectStepDetails,
  lastError: RunStepObjectLastError,
  expiredAt: Int,
  cancelledAt: Int,
  failedAt: Int,
  completedAt: Int,
  metadata: JsObject,
  usage: RunStepCompletionUsage
)

object RunStepObject {
  implicit lazy val runStepObjectJsonFormat: Format[RunStepObject] = Json.format[RunStepObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadRunStep = Value("thread.run.step")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Type extends Enumeration {
    val MessageCreation = Value("message_creation")
    val ToolCalls = Value("tool_calls")

    type Type = Value
    implicit lazy val TypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val InProgress = Value("in_progress")
    val Cancelled = Value("cancelled")
    val Failed = Value("failed")
    val Completed = Value("completed")
    val Expired = Value("expired")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

