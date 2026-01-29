package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import Embedding._

case class Embedding (
  /* The index of the embedding in the list of embeddings. */
  index: Integer,
/* The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings).  */
  embedding: List[BigDecimal],
/* The object type, which is always \"embedding\". */
  `object`: `Object`)

object Embedding {
  import DateTimeCodecs._
  sealed trait `Object`
  case object Embedding extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "Embedding" => Some(Embedding)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case Embedding => "Embedding"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")

  implicit val EmbeddingCodecJson: CodecJson[Embedding] = CodecJson.derive[Embedding]
  implicit val EmbeddingDecoder: EntityDecoder[Embedding] = jsonOf[Embedding]
  implicit val EmbeddingEncoder: EntityEncoder[Embedding] = jsonEncoderOf[Embedding]
}
