package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import ProjectServiceAccountCreateRequest._

case class ProjectServiceAccountCreateRequest (
  /* The name of the service account being created. */
  name: String)

object ProjectServiceAccountCreateRequest {
  import DateTimeCodecs._

  implicit val ProjectServiceAccountCreateRequestCodecJson: CodecJson[ProjectServiceAccountCreateRequest] = CodecJson.derive[ProjectServiceAccountCreateRequest]
  implicit val ProjectServiceAccountCreateRequestDecoder: EntityDecoder[ProjectServiceAccountCreateRequest] = jsonOf[ProjectServiceAccountCreateRequest]
  implicit val ProjectServiceAccountCreateRequestEncoder: EntityEncoder[ProjectServiceAccountCreateRequest] = jsonEncoderOf[ProjectServiceAccountCreateRequest]
}
