package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectUserListResponse._

case class ProjectUserListResponse (
  `object`: String,
data: List[ProjectUser],
firstId: String,
lastId: String,
hasMore: Boolean)

object ProjectUserListResponse {
  import DateTimeCodecs._

  implicit val ProjectUserListResponseCodecJson: CodecJson[ProjectUserListResponse] = CodecJson.derive[ProjectUserListResponse]
  implicit val ProjectUserListResponseDecoder: EntityDecoder[ProjectUserListResponse] = jsonOf[ProjectUserListResponse]
  implicit val ProjectUserListResponseEncoder: EntityEncoder[ProjectUserListResponse] = jsonEncoderOf[ProjectUserListResponse]
}
