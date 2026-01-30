package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectCreateRequest._

case class ProjectCreateRequest (
  /* The friendly name of the project, this name appears in reports. */
  name: String)

object ProjectCreateRequest {
  import DateTimeCodecs._

  implicit val ProjectCreateRequestCodecJson: CodecJson[ProjectCreateRequest] = CodecJson.derive[ProjectCreateRequest]
  implicit val ProjectCreateRequestDecoder: EntityDecoder[ProjectCreateRequest] = jsonOf[ProjectCreateRequest]
  implicit val ProjectCreateRequestEncoder: EntityEncoder[ProjectCreateRequest] = jsonEncoderOf[ProjectCreateRequest]
}
