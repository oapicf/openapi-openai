package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListFilesResponse._

case class ListFilesResponse (
  `object`: String,
data: List[OpenAIFile])

object ListFilesResponse {
  import DateTimeCodecs._

  implicit val ListFilesResponseCodecJson: CodecJson[ListFilesResponse] = CodecJson.derive[ListFilesResponse]
  implicit val ListFilesResponseDecoder: EntityDecoder[ListFilesResponse] = jsonOf[ListFilesResponse]
  implicit val ListFilesResponseEncoder: EntityEncoder[ListFilesResponse] = jsonEncoderOf[ListFilesResponse]
}
