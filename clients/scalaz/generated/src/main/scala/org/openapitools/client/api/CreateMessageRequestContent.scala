package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateMessageRequestContent._

case class CreateMessageRequestContent (
  
object CreateMessageRequestContent {
  import DateTimeCodecs._

  implicit val CreateMessageRequestContentCodecJson: CodecJson[CreateMessageRequestContent] = CodecJson.derive[CreateMessageRequestContent]
  implicit val CreateMessageRequestContentDecoder: EntityDecoder[CreateMessageRequestContent] = jsonOf[CreateMessageRequestContent]
  implicit val CreateMessageRequestContentEncoder: EntityEncoder[CreateMessageRequestContent] = jsonEncoderOf[CreateMessageRequestContent]
}
