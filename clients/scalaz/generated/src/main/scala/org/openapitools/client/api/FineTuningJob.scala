package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJob._

case class FineTuningJob (
  /* The object identifier, which can be referenced in the API endpoints. */
  id: String,
/* The Unix timestamp (in seconds) for when the fine-tuning job was created. */
  createdAt: Integer,
error: FineTuningJobError,
/* The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running. */
  fineTunedModel: String,
/* The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running. */
  finishedAt: Integer,
hyperparameters: FineTuningJobHyperparameters,
/* The base model that is being fine-tuned. */
  model: String,
/* The object type, which is always \"fine_tuning.job\". */
  `object`: `Object`,
/* The organization that owns the fine-tuning job. */
  organizationId: String,
/* The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents). */
  resultFiles: List[String],
/* The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`. */
  status: Status,
/* The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running. */
  trainedTokens: Integer,
/* The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents). */
  trainingFile: String,
/* The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents). */
  validationFile: String,
/* A list of integrations to enable for this fine-tuning job. */
  integrations: Option[List[FineTuningJobIntegrationsInner]],
/* The seed used for the fine-tuning job. */
  seed: Integer)

object FineTuningJob {
  import DateTimeCodecs._
  sealed trait `Object`
  case object FineTuningJob extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "FineTuningJob" => Some(FineTuningJob)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case FineTuningJob => "FineTuningJob"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object ValidatingFiles extends Status
  case object Queued extends Status
  case object Running extends Status
  case object Succeeded extends Status
  case object Failed extends Status
  case object Cancelled extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "ValidatingFiles" => Some(ValidatingFiles)
      case "Queued" => Some(Queued)
      case "Running" => Some(Running)
      case "Succeeded" => Some(Succeeded)
      case "Failed" => Some(Failed)
      case "Cancelled" => Some(Cancelled)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case ValidatingFiles => "ValidatingFiles"
      case Queued => "Queued"
      case Running => "Running"
      case Succeeded => "Succeeded"
      case Failed => "Failed"
      case Cancelled => "Cancelled"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val FineTuningJobCodecJson: CodecJson[FineTuningJob] = CodecJson.derive[FineTuningJob]
  implicit val FineTuningJobDecoder: EntityDecoder[FineTuningJob] = jsonOf[FineTuningJob]
  implicit val FineTuningJobEncoder: EntityEncoder[FineTuningJob] = jsonEncoderOf[FineTuningJob]
}
