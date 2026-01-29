package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateChatCompletionRequestStop._

case class CreateChatCompletionRequestStop (
  
object CreateChatCompletionRequestStop {
  import DateTimeCodecs._

  implicit val CreateChatCompletionRequestStopCodecJson: CodecJson[CreateChatCompletionRequestStop] = CodecJson.derive[CreateChatCompletionRequestStop]
  implicit val CreateChatCompletionRequestStopDecoder: EntityDecoder[CreateChatCompletionRequestStop] = jsonOf[CreateChatCompletionRequestStop]
  implicit val CreateChatCompletionRequestStopEncoder: EntityEncoder[CreateChatCompletionRequestStop] = jsonEncoderOf[CreateChatCompletionRequestStop]
}
