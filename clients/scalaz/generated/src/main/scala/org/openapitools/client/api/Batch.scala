package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Batch._

case class Batch (
  id: String,
/* The object type, which is always `batch`. */
  `object`: `Object`,
/* The OpenAI API endpoint used by the batch. */
  endpoint: String,
errors: Option[BatchErrors],
/* The ID of the input file for the batch. */
  inputFileId: String,
/* The time frame within which the batch should be processed. */
  completionWindow: String,
/* The current status of the batch. */
  status: Status,
/* The ID of the file containing the outputs of successfully executed requests. */
  outputFileId: Option[String],
/* The ID of the file containing the outputs of requests with errors. */
  errorFileId: Option[String],
/* The Unix timestamp (in seconds) for when the batch was created. */
  createdAt: Integer,
/* The Unix timestamp (in seconds) for when the batch started processing. */
  inProgressAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the batch will expire. */
  expiresAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the batch started finalizing. */
  finalizingAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the batch was completed. */
  completedAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the batch failed. */
  failedAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the batch expired. */
  expiredAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the batch started cancelling. */
  cancellingAt: Option[Integer],
/* The Unix timestamp (in seconds) for when the batch was cancelled. */
  cancelledAt: Option[Integer],
requestCounts: Option[BatchRequestCounts],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any])

object Batch {
  import DateTimeCodecs._
  sealed trait `Object`
  case object Batch extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Batch" => Some(Batch)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Batch => "Batch"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object Validating extends Status
  case object Failed extends Status
  case object InProgress extends Status
  case object Finalizing extends Status
  case object Completed extends Status
  case object Expired extends Status
  case object Cancelling extends Status
  case object Cancelled extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Validating" => Some(Validating)
      case "Failed" => Some(Failed)
      case "InProgress" => Some(InProgress)
      case "Finalizing" => Some(Finalizing)
      case "Completed" => Some(Completed)
      case "Expired" => Some(Expired)
      case "Cancelling" => Some(Cancelling)
      case "Cancelled" => Some(Cancelled)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Validating => "Validating"
      case Failed => "Failed"
      case InProgress => "InProgress"
      case Finalizing => "Finalizing"
      case Completed => "Completed"
      case Expired => "Expired"
      case Cancelling => "Cancelling"
      case Cancelled => "Cancelled"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val BatchCodecJson: CodecJson[Batch] = CodecJson.derive[Batch]
  implicit val BatchDecoder: EntityDecoder[Batch] = jsonOf[Batch]
  implicit val BatchEncoder: EntityEncoder[Batch] = jsonEncoderOf[Batch]
}
