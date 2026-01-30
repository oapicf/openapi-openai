package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchRequestOutputResponse._

case class BatchRequestOutputResponse (
  /* The HTTP status code of the response */
  statusCode: Option[Integer],
/* An unique identifier for the OpenAI API request. Please include this request ID when contacting support. */
  requestId: Option[String],
/* The JSON body of the response */
  body: Option[Any])

object BatchRequestOutputResponse {
  import DateTimeCodecs._

  implicit val BatchRequestOutputResponseCodecJson: CodecJson[BatchRequestOutputResponse] = CodecJson.derive[BatchRequestOutputResponse]
  implicit val BatchRequestOutputResponseDecoder: EntityDecoder[BatchRequestOutputResponse] = jsonOf[BatchRequestOutputResponse]
  implicit val BatchRequestOutputResponseEncoder: EntityEncoder[BatchRequestOutputResponse] = jsonEncoderOf[BatchRequestOutputResponse]
}
