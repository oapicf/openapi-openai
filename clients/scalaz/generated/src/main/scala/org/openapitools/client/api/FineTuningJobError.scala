package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningJobError._

case class FineTuningJobError (
  /* A machine-readable error code. */
  code: String,
/* A human-readable error message. */
  message: String,
/* The parameter that was invalid, usually `training_file` or `validation_file`. This field will be null if the failure was not parameter-specific. */
  param: String)

object FineTuningJobError {
  import DateTimeCodecs._

  implicit val FineTuningJobErrorCodecJson: CodecJson[FineTuningJobError] = CodecJson.derive[FineTuningJobError]
  implicit val FineTuningJobErrorDecoder: EntityDecoder[FineTuningJobError] = jsonOf[FineTuningJobError]
  implicit val FineTuningJobErrorEncoder: EntityEncoder[FineTuningJobError] = jsonEncoderOf[FineTuningJobError]
}
