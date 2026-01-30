package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchRequestOutput._

case class BatchRequestOutput (
  id: Option[String],
/* A developer-provided per-request id that will be used to match outputs to inputs. */
  customId: Option[String],
response: Option[BatchRequestOutputResponse],
error: Option[BatchRequestOutputError])

object BatchRequestOutput {
  import DateTimeCodecs._

  implicit val BatchRequestOutputCodecJson: CodecJson[BatchRequestOutput] = CodecJson.derive[BatchRequestOutput]
  implicit val BatchRequestOutputDecoder: EntityDecoder[BatchRequestOutput] = jsonOf[BatchRequestOutput]
  implicit val BatchRequestOutputEncoder: EntityEncoder[BatchRequestOutput] = jsonEncoderOf[BatchRequestOutput]
}
