package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import VectorStoreFileObject._

case class VectorStoreFileObject (
  /* The identifier, which can be referenced in API endpoints. */
  id: String,
/* The object type, which is always `vector_store.file`. */
  `object`: `Object`,
/* The total vector store usage in bytes. Note that this may be different from the original file size. */
  usageBytes: Integer,
/* The Unix timestamp (in seconds) for when the vector store file was created. */
  createdAt: Integer,
/* The ID of the [vector store](/docs/api-reference/vector-stores/object) that the [File](/docs/api-reference/files) is attached to. */
  vectorStoreId: String,
/* The status of the vector store file, which can be either `in_progress`, `completed`, `cancelled`, or `failed`. The status `completed` indicates that the vector store file is ready for use. */
  status: Status,
lastError: VectorStoreFileObjectLastError,
chunkingStrategy: Option[VectorStoreFileObjectChunkingStrategy])

object VectorStoreFileObject {
  import DateTimeCodecs._
  sealed trait `Object`
  case object VectorStoreFile extends `Object`

  object `Object` {
    def to`Object`(s: String): Option[`Object`] = s match {
      case "VectorStoreFile" => Some(VectorStoreFile)
      case _ => None
    }

    def from`Object`(x: `Object`): String = x match {
      case VectorStoreFile => "VectorStoreFile"
    }
  }

  implicit val `Object`EnumEncoder: EncodeJson[`Object`] =
    EncodeJson[`Object`](is => StringEncodeJson(`Object`.from`Object`(is)))

  implicit val `Object`EnumDecoder: DecodeJson[`Object`] =
    DecodeJson.optionDecoder[`Object`](n => n.string.flatMap(jStr => `Object`.to`Object`(jStr)), "`Object` failed to de-serialize")
  sealed trait Status
  case object InProgress extends Status
  case object Completed extends Status
  case object Cancelled extends Status
  case object Failed extends Status

  object Status {
    def toStatus(s: String): Option[Status] = s match {
      case "InProgress" => Some(InProgress)
      case "Completed" => Some(Completed)
      case "Cancelled" => Some(Cancelled)
      case "Failed" => Some(Failed)
      case _ => None
    }

    def fromStatus(x: Status): String = x match {
      case InProgress => "InProgress"
      case Completed => "Completed"
      case Cancelled => "Cancelled"
      case Failed => "Failed"
    }
  }

  implicit val StatusEnumEncoder: EncodeJson[Status] =
    EncodeJson[Status](is => StringEncodeJson(Status.fromStatus(is)))

  implicit val StatusEnumDecoder: DecodeJson[Status] =
    DecodeJson.optionDecoder[Status](n => n.string.flatMap(jStr => Status.toStatus(jStr)), "Status failed to de-serialize")

  implicit val VectorStoreFileObjectCodecJson: CodecJson[VectorStoreFileObject] = CodecJson.derive[VectorStoreFileObject]
  implicit val VectorStoreFileObjectDecoder: EntityDecoder[VectorStoreFileObject] = jsonOf[VectorStoreFileObject]
  implicit val VectorStoreFileObjectEncoder: EntityEncoder[VectorStoreFileObject] = jsonEncoderOf[VectorStoreFileObject]
}
