package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListVectorStoresResponse._

case class ListVectorStoresResponse (
  `object`: String,
data: List[VectorStoreObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListVectorStoresResponse {
  import DateTimeCodecs._

  implicit val ListVectorStoresResponseCodecJson: CodecJson[ListVectorStoresResponse] = CodecJson.derive[ListVectorStoresResponse]
  implicit val ListVectorStoresResponseDecoder: EntityDecoder[ListVectorStoresResponse] = jsonOf[ListVectorStoresResponse]
  implicit val ListVectorStoresResponseEncoder: EntityEncoder[ListVectorStoresResponse] = jsonEncoderOf[ListVectorStoresResponse]
}
