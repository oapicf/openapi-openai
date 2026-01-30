package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RealtimeServerEventErrorError._

case class RealtimeServerEventErrorError (
  /* The type of error (e.g., \"invalid_request_error\", \"server_error\").  */
  `type`: String,
/* Error code, if any. */
  code: Option[String],
/* A human-readable error message. */
  message: String,
/* Parameter related to the error, if any. */
  param: Option[String],
/* The event_id of the client event that caused the error, if applicable.  */
  eventId: Option[String])

object RealtimeServerEventErrorError {
  import DateTimeCodecs._

  implicit val RealtimeServerEventErrorErrorCodecJson: CodecJson[RealtimeServerEventErrorError] = CodecJson.derive[RealtimeServerEventErrorError]
  implicit val RealtimeServerEventErrorErrorDecoder: EntityDecoder[RealtimeServerEventErrorError] = jsonOf[RealtimeServerEventErrorError]
  implicit val RealtimeServerEventErrorErrorEncoder: EntityEncoder[RealtimeServerEventErrorError] = jsonEncoderOf[RealtimeServerEventErrorError]
}
