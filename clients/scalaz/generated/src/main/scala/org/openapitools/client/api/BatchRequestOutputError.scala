package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchRequestOutputError._

case class BatchRequestOutputError (
  /* A machine-readable error code. */
  code: Option[String],
/* A human-readable error message. */
  message: Option[String])

object BatchRequestOutputError {
  import DateTimeCodecs._

  implicit val BatchRequestOutputErrorCodecJson: CodecJson[BatchRequestOutputError] = CodecJson.derive[BatchRequestOutputError]
  implicit val BatchRequestOutputErrorDecoder: EntityDecoder[BatchRequestOutputError] = jsonOf[BatchRequestOutputError]
  implicit val BatchRequestOutputErrorEncoder: EntityEncoder[BatchRequestOutputError] = jsonEncoderOf[BatchRequestOutputError]
}
