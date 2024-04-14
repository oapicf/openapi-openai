package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ListAssistantFilesResponse._

case class ListAssistantFilesResponse (
  `object`: String,
data: List[AssistantFileObject],
firstId: String,
lastId: String,
hasMore: Boolean)

object ListAssistantFilesResponse {
  import DateTimeCodecs._

  implicit val ListAssistantFilesResponseCodecJson: CodecJson[ListAssistantFilesResponse] = CodecJson.derive[ListAssistantFilesResponse]
  implicit val ListAssistantFilesResponseDecoder: EntityDecoder[ListAssistantFilesResponse] = jsonOf[ListAssistantFilesResponse]
  implicit val ListAssistantFilesResponseEncoder: EntityEncoder[ListAssistantFilesResponse] = jsonEncoderOf[ListAssistantFilesResponse]
}
