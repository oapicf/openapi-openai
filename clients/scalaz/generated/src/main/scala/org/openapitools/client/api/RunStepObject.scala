package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepObject._

case class RunStepObject (
  /* The identifier of the run step, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `thread.run.step`. */
  `object`: `Object`,
/* The Unix timestamp (in seconds) for when the run step was created. */
  createdAt: Integer,
/* The ID of the [assistant](/docs/api-reference/assistants) associated with the run step. */
  assistantId: String,
/* The ID of the [thread](/docs/api-reference/threads) that was run. */
  threadId: String,
/* The ID of the [run](/docs/api-reference/runs) that this run step is a part of. */
  runId: String,
/* The type of run step, which can be either `message_creation` or `tool_calls`. */
  `type`: `Type`,
/* The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`. */
  status: Status,
stepDetails: RunStepObjectStepDetails,
lastError: RunStepObjectLastError,
/* The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired. */
  expiredAt: Integer,
/* The Unix timestamp (in seconds) for when the run step was cancelled. */
  cancelledAt: Integer,
/* The Unix timestamp (in seconds) for when the run step failed. */
  failedAt: Integer,
/* The Unix timestamp (in seconds) for when the run step completed. */
  completedAt: Integer,
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Any,
usage: RunStepCompletionUsage)

object RunStepObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadRunStep extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadRunStep" => Some(ThreadRunStep)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadRunStep => "ThreadRunStep"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait `Type`
  case object MessageCreation extends `Type`
  case object ToolCalls extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "MessageCreation" => Some(MessageCreation)
      case "ToolCalls" => Some(ToolCalls)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case MessageCreation => "MessageCreation"
      case ToolCalls => "ToolCalls"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")
  sealed trait Status
  case object InProgress extends Status
  case object Cancelled extends Status
  case object Failed extends Status
  case object Completed extends Status
  case object Expired extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "InProgress" => Some(InProgress)
      case "Cancelled" => Some(Cancelled)
      case "Failed" => Some(Failed)
      case "Completed" => Some(Completed)
      case "Expired" => Some(Expired)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case InProgress => "InProgress"
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

  implicit val RunStepObjectCodecJson: CodecJson[RunStepObject] = CodecJson.derive[RunStepObject]
  implicit val RunStepObjectDecoder: EntityDecoder[RunStepObject] = jsonOf[RunStepObject]
  implicit val RunStepObjectEncoder: EntityEncoder[RunStepObject] = jsonEncoderOf[RunStepObject]
}
