package model

import play.api.libs.json._

/**
  * Represents an execution run on a [thread](/docs/api-reference/threads).
  * @param id The identifier, which can be referenced in API endpoints.
  * @param `object` The object type, which is always `thread.run`.
  * @param createdAt The Unix timestamp (in seconds) for when the run was created.
  * @param threadId The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
  * @param assistantId The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
  * @param status The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
  * @param expiresAt The Unix timestamp (in seconds) for when the run will expire.
  * @param startedAt The Unix timestamp (in seconds) for when the run was started.
  * @param cancelledAt The Unix timestamp (in seconds) for when the run was cancelled.
  * @param failedAt The Unix timestamp (in seconds) for when the run failed.
  * @param completedAt The Unix timestamp (in seconds) for when the run was completed.
  * @param model The model that the [assistant](/docs/api-reference/assistants) used for this run.
  * @param instructions The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
  * @param tools The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
  * @param fileIds The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
  * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
  * @param temperature The sampling temperature used for this run. If not set, defaults to 1.
  * @param maxPromptTokens The maximum number of prompt tokens specified to have been used over the course of the run. 
  * @param maxCompletionTokens The maximum number of completion tokens specified to have been used over the course of the run. 
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-03T11:15:39.331426426Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class RunObject(
  id: String,
  `object`: RunObject.Object.Value,
  createdAt: Int,
  threadId: String,
  assistantId: String,
  status: RunObject.Status.Value,
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
  tools: List[AssistantObjectToolsInner],
  fileIds: List[String],
  metadata: JsObject,
  usage: RunCompletionUsage,
  temperature: Option[BigDecimal],
  maxPromptTokens: Int,
  maxCompletionTokens: Int,
  truncationStrategy: TruncationObject,
  toolChoice: AssistantsApiToolChoiceOption,
  responseFormat: AssistantsApiResponseFormatOption
)

object RunObject {
  implicit lazy val runObjectJsonFormat: Format[RunObject] = Json.format[RunObject]

  // noinspection TypeAnnotation
  object Object extends Enumeration {
    val ThreadRun = Value("thread.run")

    type Object = Value
    implicit lazy val ObjectJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object Status extends Enumeration {
    val Queued = Value("queued")
    val InProgress = Value("in_progress")
    val RequiresAction = Value("requires_action")
    val Cancelling = Value("cancelling")
    val Cancelled = Value("cancelled")
    val Failed = Value("failed")
    val Completed = Value("completed")
    val Expired = Value("expired")

    type Status = Value
    implicit lazy val StatusJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

