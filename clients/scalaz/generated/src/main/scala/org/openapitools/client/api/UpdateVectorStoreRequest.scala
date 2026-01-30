package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateVectorStoreRequest._

case class UpdateVectorStoreRequest (
  /* The name of the vector store. */
  name: Option[String],
expiresAfter: Option[VectorStoreExpirationAfter],
/* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
  metadata: Option[Any])

object UpdateVectorStoreRequest {
  import DateTimeCodecs._

  implicit val UpdateVectorStoreRequestCodecJson: CodecJson[UpdateVectorStoreRequest] = CodecJson.derive[UpdateVectorStoreRequest]
  implicit val UpdateVectorStoreRequestDecoder: EntityDecoder[UpdateVectorStoreRequest] = jsonOf[UpdateVectorStoreRequest]
  implicit val UpdateVectorStoreRequestEncoder: EntityEncoder[UpdateVectorStoreRequest] = jsonEncoderOf[UpdateVectorStoreRequest]
}
