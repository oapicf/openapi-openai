package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MessageDeltaContentImageFileObjectImageFile._

case class MessageDeltaContentImageFileObjectImageFile (
  /* The [File](/docs/api-reference/files) ID of the image in the message content. */
  fileId: Option[String])

object MessageDeltaContentImageFileObjectImageFile {
  import DateTimeCodecs._

  implicit val MessageDeltaContentImageFileObjectImageFileCodecJson: CodecJson[MessageDeltaContentImageFileObjectImageFile] = CodecJson.derive[MessageDeltaContentImageFileObjectImageFile]
  implicit val MessageDeltaContentImageFileObjectImageFileDecoder: EntityDecoder[MessageDeltaContentImageFileObjectImageFile] = jsonOf[MessageDeltaContentImageFileObjectImageFile]
  implicit val MessageDeltaContentImageFileObjectImageFileEncoder: EntityEncoder[MessageDeltaContentImageFileObjectImageFile] = jsonEncoderOf[MessageDeltaContentImageFileObjectImageFile]
}
