package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssistantsApiToolChoiceOption._

case class AssistantsApiToolChoiceOption (
  /* The type of the tool. If type is `function`, the function name must be set */
  `type`: `Type`,
function: Option[AssistantsNamedToolChoiceFunction])

object AssistantsApiToolChoiceOption {
  import DateTimeCodecs._
  sealed trait `Type`
  case object Function extends `Type`
  case object CodeInterpreter extends `Type`
  case object FileSearch extends `Type`

  object `Type` {
    def to`Type`(s: String): Option[`Type`] = s match {
      case "Function" => Some(Function)
      case "CodeInterpreter" => Some(CodeInterpreter)
      case "FileSearch" => Some(FileSearch)
      case _ => None
    }

    def from`Type`(x: `Type`): String = x match {
      case Function => "Function"
      case CodeInterpreter => "CodeInterpreter"
      case FileSearch => "FileSearch"
    }
  }

  implicit val `Type`EnumEncoder: EncodeJson[`Type`] =
    EncodeJson[`Type`](is => StringEncodeJson(`Type`.from`Type`(is)))

  implicit val `Type`EnumDecoder: DecodeJson[`Type`] =
    DecodeJson.optionDecoder[`Type`](n => n.string.flatMap(jStr => `Type`.to`Type`(jStr)), "`Type` failed to de-serialize")

  implicit val AssistantsApiToolChoiceOptionCodecJson: CodecJson[AssistantsApiToolChoiceOption] = CodecJson.derive[AssistantsApiToolChoiceOption]
  implicit val AssistantsApiToolChoiceOptionDecoder: EntityDecoder[AssistantsApiToolChoiceOption] = jsonOf[AssistantsApiToolChoiceOption]
  implicit val AssistantsApiToolChoiceOptionEncoder: EntityEncoder[AssistantsApiToolChoiceOption] = jsonEncoderOf[AssistantsApiToolChoiceOption]
}
