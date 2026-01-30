package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectUpdateRequest._

case class ProjectUpdateRequest (
  /* The updated name of the project, this name appears in reports. */
  name: String)

object ProjectUpdateRequest {
  import DateTimeCodecs._

  implicit val ProjectUpdateRequestCodecJson: CodecJson[ProjectUpdateRequest] = CodecJson.derive[ProjectUpdateRequest]
  implicit val ProjectUpdateRequestDecoder: EntityDecoder[ProjectUpdateRequest] = jsonOf[ProjectUpdateRequest]
  implicit val ProjectUpdateRequestEncoder: EntityEncoder[ProjectUpdateRequest] = jsonEncoderOf[ProjectUpdateRequest]
}
