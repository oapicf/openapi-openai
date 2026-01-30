package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BatchRequestInput._

case class BatchRequestInput (
  /* A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch. */
  customId: Option[String],
/* The HTTP method to be used for the request. Currently only `POST` is supported. */
  method: Option[Method],
/* The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. */
  url: Option[String])

object BatchRequestInput {
  import DateTimeCodecs._
  sealed trait Method
  case object POST extends Method

  object Method {
    def toMethod(s: String): Option[Method] = s match {
      case "POST" => Some(POST)
      case _ => None
    }

    def fromMethod(x: Method): String = x match {
      case POST => "POST"
    }
  }

  implicit val MethodEnumEncoder: EncodeJson[Method] =
    EncodeJson[Method](is => StringEncodeJson(Method.fromMethod(is)))

  implicit val MethodEnumDecoder: DecodeJson[Method] =
    DecodeJson.optionDecoder[Method](n => n.string.flatMap(jStr => Method.toMethod(jStr)), "Method failed to de-serialize")

  implicit val BatchRequestInputCodecJson: CodecJson[BatchRequestInput] = CodecJson.derive[BatchRequestInput]
  implicit val BatchRequestInputDecoder: EntityDecoder[BatchRequestInput] = jsonOf[BatchRequestInput]
  implicit val BatchRequestInputEncoder: EntityEncoder[BatchRequestInput] = jsonEncoderOf[BatchRequestInput]
}
