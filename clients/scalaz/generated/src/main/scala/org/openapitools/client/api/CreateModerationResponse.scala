package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateModerationResponse._

case class CreateModerationResponse (
  /* The unique identifier for the moderation request. */
  id: String,
/* The model used to generate the moderation results. */
  model: String,
/* A list of moderation objects. */
  results: List[CreateModerationResponseResultsInner])

object CreateModerationResponse {
  import DateTimeCodecs._

  implicit val CreateModerationResponseCodecJson: CodecJson[CreateModerationResponse] = CodecJson.derive[CreateModerationResponse]
  implicit val CreateModerationResponseDecoder: EntityDecoder[CreateModerationResponse] = jsonOf[CreateModerationResponse]
  implicit val CreateModerationResponseEncoder: EntityEncoder[CreateModerationResponse] = jsonEncoderOf[CreateModerationResponse]
}
