package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListVectorStoreFilesResponse._

case class ListVectorStoreFilesResponse (
  `object`: String,
data: List[VectorStoreFileObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListVectorStoreFilesResponse {
  import DateTimeCodecs._

  implicit val ListVectorStoreFilesResponseCodecJson: CodecJson[ListVectorStoreFilesResponse] = CodecJson.derive[ListVectorStoreFilesResponse]
  implicit val ListVectorStoreFilesResponseDecoder: EntityDecoder[ListVectorStoreFilesResponse] = jsonOf[ListVectorStoreFilesResponse]
  implicit val ListVectorStoreFilesResponseEncoder: EntityEncoder[ListVectorStoreFilesResponse] = jsonEncoderOf[ListVectorStoreFilesResponse]
}
