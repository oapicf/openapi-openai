package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListMessageFilesResponse._

case class ListMessageFilesResponse (
  `object`: String,
data: List[MessageFileObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListMessageFilesResponse {
  import DateTimeCodecs._

  implicit val ListMessageFilesResponseCodecJson: CodecJson[ListMessageFilesResponse] = CodecJson.derive[ListMessageFilesResponse]
  implicit val ListMessageFilesResponseDecoder: EntityDecoder[ListMessageFilesResponse] = jsonOf[ListMessageFilesResponse]
  implicit val ListMessageFilesResponseEncoder: EntityEncoder[ListMessageFilesResponse] = jsonEncoderOf[ListMessageFilesResponse]
}
