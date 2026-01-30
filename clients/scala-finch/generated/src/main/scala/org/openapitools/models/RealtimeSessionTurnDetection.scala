package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 * @param _type Type of turn detection, only `server_vad` is currently supported. 
 * @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
 * @param prefixUnderscorepaddingUnderscorems Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
 * @param silenceUnderscoredurationUnderscorems Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
 */
case class RealtimeSessionTurnDetection(_type: Option[String],
                threshold: Option[BigDecimal],
                prefixUnderscorepaddingUnderscorems: Option[Int],
                silenceUnderscoredurationUnderscorems: Option[Int]
                )

object RealtimeSessionTurnDetection {
    /**
     * Creates the codec for converting RealtimeSessionTurnDetection from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeSessionTurnDetection] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeSessionTurnDetection] = deriveEncoder
}
