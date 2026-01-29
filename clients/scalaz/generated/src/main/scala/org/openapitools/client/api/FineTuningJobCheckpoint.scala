package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJobCheckpoint._

case class FineTuningJobCheckpoint (
  /* The checkpoint identifier, which can be referenced in the API endpoints. */
  id: String,
/* The Unix timestamp (in seconds) for when the checkpoint was created. */
  createdAt: Integer,
/* The name of the fine-tuned checkpoint model that is created. */
  fineTunedModelCheckpoint: String,
/* The step number that the checkpoint was created at. */
  stepNumber: Integer,
metrics: FineTuningJobCheckpointMetrics,
/* The name of the fine-tuning job that this checkpoint was created from. */
  fineTuningJobId: String,
/* The object type, which is always \"fine_tuning.job.checkpoint\". */
  `object`: `Object`)

object FineTuningJobCheckpoint {
  import DateTimeCodecs._
  sealed trait `Object`
  case object FineTuningJobCheckpoint extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "FineTuningJobCheckpoint" => Some(FineTuningJobCheckpoint)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case FineTuningJobCheckpoint => "FineTuningJobCheckpoint"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val FineTuningJobCheckpointCodecJson: CodecJson[FineTuningJobCheckpoint] = CodecJson.derive[FineTuningJobCheckpoint]
  implicit val FineTuningJobCheckpointDecoder: EntityDecoder[FineTuningJobCheckpoint] = jsonOf[FineTuningJobCheckpoint]
  implicit val FineTuningJobCheckpointEncoder: EntityEncoder[FineTuningJobCheckpoint] = jsonEncoderOf[FineTuningJobCheckpoint]
}
