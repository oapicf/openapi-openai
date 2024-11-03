package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListAssistantsResponse._

case class ListAssistantsResponse (
  `object`: String,
data: List[AssistantObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListAssistantsResponse {
  import DateTimeCodecs._

  implicit val ListAssistantsResponseCodecJson: CodecJson[ListAssistantsResponse] = CodecJson.derive[ListAssistantsResponse]
  implicit val ListAssistantsResponseDecoder: EntityDecoder[ListAssistantsResponse] = jsonOf[ListAssistantsResponse]
  implicit val ListAssistantsResponseEncoder: EntityEncoder[ListAssistantsResponse] = jsonEncoderOf[ListAssistantsResponse]
}
