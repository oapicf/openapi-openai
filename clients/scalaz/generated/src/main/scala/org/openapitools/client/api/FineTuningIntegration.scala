package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import FineTuningIntegration._

case class FineTuningIntegration (
  /* The type of the integration being enabled for the fine-tuning job */
  `type`: `Type`,
wandb: CreateFineTuningJobRequestIntegrationsInnerWandb)

object FineTuningIntegration {
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

  implicit val FineTuningIntegrationCodecJson: CodecJson[FineTuningIntegration] = CodecJson.derive[FineTuningIntegration]
  implicit val FineTuningIntegrationDecoder: EntityDecoder[FineTuningIntegration] = jsonOf[FineTuningIntegration]
  implicit val FineTuningIntegrationEncoder: EntityEncoder[FineTuningIntegration] = jsonEncoderOf[FineTuningIntegration]
}
