package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import StaticChunkingStrategyStatic._

case class StaticChunkingStrategyStatic (
  /* The maximum number of tokens in each chunk. The default value is `800`. The minimum value is `100` and the maximum value is `4096`. */
  maxChunkSizeTokens: Integer,
/* The number of tokens that overlap between chunks. The default value is `400`.  Note that the overlap must not exceed half of `max_chunk_size_tokens`.  */
  chunkOverlapTokens: Integer)

object StaticChunkingStrategyStatic {
  import DateTimeCodecs._

  implicit val StaticChunkingStrategyStaticCodecJson: CodecJson[StaticChunkingStrategyStatic] = CodecJson.derive[StaticChunkingStrategyStatic]
  implicit val StaticChunkingStrategyStaticDecoder: EntityDecoder[StaticChunkingStrategyStatic] = jsonOf[StaticChunkingStrategyStatic]
  implicit val StaticChunkingStrategyStaticEncoder: EntityEncoder[StaticChunkingStrategyStatic] = jsonEncoderOf[StaticChunkingStrategyStatic]
}
