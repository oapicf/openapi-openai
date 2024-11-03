package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import RunStepDeltaObject._

case class RunStepDeltaObject (
  /* The identifier of the run step, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `thread.run.step.delta`. */
  `object`: `Object`,
delta: RunStepDeltaObjectDelta)

object RunStepDeltaObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object ThreadRunStepDelta extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "ThreadRunStepDelta" => Some(ThreadRunStepDelta)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case ThreadRunStepDelta => "ThreadRunStepDelta"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val RunStepDeltaObjectCodecJson: CodecJson[RunStepDeltaObject] = CodecJson.derive[RunStepDeltaObject]
  implicit val RunStepDeltaObjectDecoder: EntityDecoder[RunStepDeltaObject] = jsonOf[RunStepDeltaObject]
  implicit val RunStepDeltaObjectEncoder: EntityEncoder[RunStepDeltaObject] = jsonEncoderOf[RunStepDeltaObject]
}
