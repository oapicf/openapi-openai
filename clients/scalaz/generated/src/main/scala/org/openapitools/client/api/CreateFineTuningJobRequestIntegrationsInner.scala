package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuningJobRequestIntegrationsInner._

case class CreateFineTuningJobRequestIntegrationsInner (
  `type`: CreateFineTuningJobRequestIntegrationsInnerType,
wandb: CreateFineTuningJobRequestIntegrationsInnerWandb)

object CreateFineTuningJobRequestIntegrationsInner {
  import DateTimeCodecs._

  implicit val CreateFineTuningJobRequestIntegrationsInnerCodecJson: CodecJson[CreateFineTuningJobRequestIntegrationsInner] = CodecJson.derive[CreateFineTuningJobRequestIntegrationsInner]
  implicit val CreateFineTuningJobRequestIntegrationsInnerDecoder: EntityDecoder[CreateFineTuningJobRequestIntegrationsInner] = jsonOf[CreateFineTuningJobRequestIntegrationsInner]
  implicit val CreateFineTuningJobRequestIntegrationsInnerEncoder: EntityEncoder[CreateFineTuningJobRequestIntegrationsInner] = jsonEncoderOf[CreateFineTuningJobRequestIntegrationsInner]
}
