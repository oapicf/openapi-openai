package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 * @param voice The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
 * @param format Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
 */
case class CreateChatCompletionRequestAudio(voice: String,
                format: String
                )

object CreateChatCompletionRequestAudio {
    /**
     * Creates the codec for converting CreateChatCompletionRequestAudio from and to JSON.
     */
    implicit val decoder: Decoder[CreateChatCompletionRequestAudio] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateChatCompletionRequestAudio] = deriveEncoder
}
