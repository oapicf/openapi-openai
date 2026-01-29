package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateFineTuningJobRequestIntegrationsInner._

case class CreateFineTuningJobRequestIntegrationsInner (
  `type`: `Type`,
wandb: CreateFineTuningJobRequestIntegrationsInnerWandb)

object CreateFineTuningJobRequestIntegrationsInner {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Wandb extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Wandb" => Some(Wandb)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Wandb => "Wandb"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val CreateFineTuningJobRequestIntegrationsInnerCodecJson: CodecJson[CreateFineTuningJobRequestIntegrationsInner] = CodecJson.derive[CreateFineTuningJobRequestIntegrationsInner]
  implicit val CreateFineTuningJobRequestIntegrationsInnerDecoder: EntityDecoder[CreateFineTuningJobRequestIntegrationsInner] = jsonOf[CreateFineTuningJobRequestIntegrationsInner]
  implicit val CreateFineTuningJobRequestIntegrationsInnerEncoder: EntityEncoder[CreateFineTuningJobRequestIntegrationsInner] = jsonEncoderOf[CreateFineTuningJobRequestIntegrationsInner]
}
