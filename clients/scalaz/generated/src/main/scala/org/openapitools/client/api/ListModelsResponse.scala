package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListModelsResponse._

case class ListModelsResponse (
  `object`: String,
data: List[Model])

object ListModelsResponse {
  import DateTimeCodecs._

  implicit val ListModelsResponseCodecJson: CodecJson[ListModelsResponse] = CodecJson.derive[ListModelsResponse]
  implicit val ListModelsResponseDecoder: EntityDecoder[ListModelsResponse] = jsonOf[ListModelsResponse]
  implicit val ListModelsResponseEncoder: EntityEncoder[ListModelsResponse] = jsonEncoderOf[ListModelsResponse]
}
