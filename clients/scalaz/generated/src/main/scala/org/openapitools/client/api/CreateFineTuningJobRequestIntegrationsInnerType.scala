package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuningJobRequestIntegrationsInnerType._

case class CreateFineTuningJobRequestIntegrationsInnerType (
  
object CreateFineTuningJobRequestIntegrationsInnerType {
  import DateTimeCodecs._

  implicit val CreateFineTuningJobRequestIntegrationsInnerTypeCodecJson: CodecJson[CreateFineTuningJobRequestIntegrationsInnerType] = CodecJson.derive[CreateFineTuningJobRequestIntegrationsInnerType]
  implicit val CreateFineTuningJobRequestIntegrationsInnerTypeDecoder: EntityDecoder[CreateFineTuningJobRequestIntegrationsInnerType] = jsonOf[CreateFineTuningJobRequestIntegrationsInnerType]
  implicit val CreateFineTuningJobRequestIntegrationsInnerTypeEncoder: EntityEncoder[CreateFineTuningJobRequestIntegrationsInnerType] = jsonEncoderOf[CreateFineTuningJobRequestIntegrationsInnerType]
}
