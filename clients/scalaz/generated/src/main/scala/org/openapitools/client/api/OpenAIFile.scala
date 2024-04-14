package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import OpenAIFile._

case class OpenAIFile (
  /* The file identifier, which can be referenced in the API endpoints. */
  id: String,
/* The size of the file, in bytes. */
  bytes: Integer,
/* The Unix timestamp (in seconds) for when the file was created. */
  createdAt: Integer,
/* The name of the file. */
  filename: String,
/* The object type, which is always `file`. */
  `object`: `Object`,
/* The intended purpose of the file. Supported values are `fine-tune`, `fine-tune-results`, `assistants`, and `assistants_output`. */
  purpose: Purpose,
/* Deprecated. The current status of the file, which can be either `uploaded`, `processed`, or `error`. */
  status: Status,
/* Deprecated. For details on why a fine-tuning training file failed validation, see the `error` field on `fine_tuning.job`. */
  statusDetails: Option[String])

object OpenAIFile {
  import DateTimeCodecs._
  sealed trait `Object`
  case object File extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "File" => Some(File)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case File => "File"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Purpose
  case object FineTune extends Purpose
  case object FineTuneResults extends Purpose
  case object Assistants extends Purpose
  case object AssistantsOutput extends Purpose

  object Purpose {
    def toPurpose(s: String): Option[Purpose] = s match {
      case "FineTune" => Some(FineTune)
      case "FineTuneResults" => Some(FineTuneResults)
      case "Assistants" => Some(Assistants)
      case "AssistantsOutput" => Some(AssistantsOutput)
      case _ => None
    }

    def fromPurpose(x: Purpose): String = x match {
      case FineTune => "FineTune"
      case FineTuneResults => "FineTuneResults"
      case Assistants => "Assistants"
      case AssistantsOutput => "AssistantsOutput"
    }
  }

  implicit val PurposeEnumEncoder: EncodeJson[Purpose] =
    EncodeJson[Purpose](is => StringEncodeJson(Purpose.fromPurpose(is)))

  implicit val PurposeEnumDecoder: DecodeJson[Purpose] =
    DecodeJson.optionDecoder[Purpose](n => n.string.flatMap(jStr => Purpose.toPurpose(jStr)), "Purpose failed to de-serialize")
  sealed trait Status
  case object Uploaded extends Status
  case object Processed extends Status
  case object Error extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "Uploaded" => Some(Uploaded)
      case "Processed" => Some(Processed)
      case "Error" => Some(Error)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case Uploaded => "Uploaded"
      case Processed => "Processed"
      case Error => "Error"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val OpenAIFileCodecJson: CodecJson[OpenAIFile] = CodecJson.derive[OpenAIFile]
  implicit val OpenAIFileDecoder: EntityDecoder[OpenAIFile] = jsonOf[OpenAIFile]
  implicit val OpenAIFileEncoder: EntityEncoder[OpenAIFile] = jsonEncoderOf[OpenAIFile]
}
