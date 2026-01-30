package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.RealtimeResponseCreateParamsMaxResponseOutputTokens
import org.openapitools.models.RealtimeResponseCreateParamsToolsInner
import org.openapitools.models.RealtimeSessionInputAudioTranscription
import org.openapitools.models.RealtimeSessionModel
import org.openapitools.models.RealtimeSessionTurnDetection
import scala.collection.immutable.Seq

/**
 * Realtime session object configuration.
 * @param id Unique identifier for the session object. 
 * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @param model 
 * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @param inputUnderscoreaudioUnderscoreformat The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param outputUnderscoreaudioUnderscoreformat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param inputUnderscoreaudioUnderscoretranscription 
 * @param turnUnderscoredetection 
 * @param tools Tools (functions) available to the model.
 * @param toolUnderscorechoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function. 
 * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @param maxUnderscoreresponseUnderscoreoutputUnderscoretokens 
 */
case class RealtimeSession(id: Option[String],
                modalities: Option[Seq[String]],
                model: Option[RealtimeSessionModel],
                instructions: Option[String],
                voice: Option[String],
                inputUnderscoreaudioUnderscoreformat: Option[String],
                outputUnderscoreaudioUnderscoreformat: Option[String],
                inputUnderscoreaudioUnderscoretranscription: Option[RealtimeSessionInputAudioTranscription],
                turnUnderscoredetection: Option[RealtimeSessionTurnDetection],
                tools: Option[Seq[RealtimeResponseCreateParamsToolsInner]],
                toolUnderscorechoice: Option[String],
                temperature: Option[BigDecimal],
                maxUnderscoreresponseUnderscoreoutputUnderscoretokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens]
                )

object RealtimeSession {
    /**
     * Creates the codec for converting RealtimeSession from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeSession] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeSession] = deriveEncoder
}
