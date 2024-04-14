package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunObject._

case class RunObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `thread.run`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the run was created. */
  createdAt: Integer,
/* The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run. */
  threadId: String,
/* The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run. */
  assistantId: String,
/* The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`. */
  status: Status,
requiredAction: RunObjectRequiredAction,
lastError: RunObjectLastError,
/* The Unix timestamp (in seconds) for when the run will expire. */
  expiresAt: Integer,
/* The Unix timestamp (in seconds) for when the run was started. */
  startedAt: Integer,
/* The Unix timestamp (in seconds) for when the run was cancelled. */
  cancelledAt: Integer,
/* The Unix timestamp (in seconds) for when the run failed. */
  failedAt: Integer,
/* The Unix timestamp (in seconds) for when the run was completed. */
  completedAt: Integer,
incompleteDetails: RunObjectIncompleteDetails,
/* The model that the [assistant](/docs/api-reference/assistants) used for this run. */
  model: String,
/* The instructions that the [assistant](/docs/api-reference/assistants) used for this run. */
  instructions: String,
/* The list of tools that the [assistant](/docs/api-reference/assistants) used for this run. */
  tools: List[AssistantObjectToolsInner],
/* The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run. */
  fileIds: List[String],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long.  */
  metadata: Any,
usage: RunCompletionUsage,
/* The sampling temperature used for this run. If not set, defaults to 1. */
  temperature: Option[BigDecimal],
/* The maximum number of prompt tokens specified to have been used over the course of the run.  */
  maxPromptTokens: Integer,
/* The maximum number of completion tokens specified to have been used over the course of the run.  */
  maxCompletionTokens: Integer,
truncationStrategy: TruncationObject,
toolChoice: AssistantsApiToolChoiceOption,
responseFormat: AssistantsApiResponseFormatOption)

object RunObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadRun extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadRun" => Some(ThreadRun)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadRun => "ThreadRun"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object Queued extends Status
  case object InProgress extends Status
  case object RequiresAction extends Status
  case object Cancelling extends Status
  case object Cancelled extends Status
  case object Failed extends Status
  case object Completed extends Status
  case object Expired extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Queued" => Some(Queued)
      case "InProgress" => Some(InProgress)
      case "RequiresAction" => Some(RequiresAction)
      case "Cancelling" => Some(Cancelling)
      case "Cancelled" => Some(Cancelled)
      case "Failed" => Some(Failed)
      case "Completed" => Some(Completed)
      case "Expired" => Some(Expired)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Queued => "Queued"
      case InProgress => "InProgress"
      case RequiresAction => "RequiresAction"
      case Cancelling => "Cancelling"
      case Cancelled => "Cancelled"
      case Failed => "Failed"
      case Completed => "Completed"
      case Expired => "Expired"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val RunObjectCodecJson: CodecJson[RunObject] = CodecJson.derive[RunObject]
  implicit val RunObjectDecoder: EntityDecoder[RunObject] = jsonOf[RunObject]
  implicit val RunObjectEncoder: EntityEncoder[RunObject] = jsonEncoderOf[RunObject]
}
