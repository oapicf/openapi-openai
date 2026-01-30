package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateThreadRequest._

case class CreateThreadRequest (
  /* A list of [messages](/docs/api-reference/messages) to start the thread with. */
  messages: Option[List[CreateMessageRequest]],
toolResources: Option[CreateThreadRequestToolResources],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any])

object CreateThreadRequest {
  import DateTimeCodecs._

  implicit val CreateThreadRequestCodecJson: CodecJson[CreateThreadRequest] = CodecJson.derive[CreateThreadRequest]
  implicit val CreateThreadRequestDecoder: EntityDecoder[CreateThreadRequest] = jsonOf[CreateThreadRequest]
  implicit val CreateThreadRequestEncoder: EntityEncoder[CreateThreadRequest] = jsonEncoderOf[CreateThreadRequest]
}
