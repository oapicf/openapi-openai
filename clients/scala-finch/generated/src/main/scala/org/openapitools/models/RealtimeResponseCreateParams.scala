package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.RealtimeConversationItem
import org.openapitools.models.RealtimeResponseCreateParamsConversation
import org.openapitools.models.RealtimeResponseCreateParamsMaxResponseOutputTokens
import org.openapitools.models.RealtimeResponseCreateParamsToolsInner
import scala.collection.immutable.Seq

/**
 * Create a new Realtime response with these parameters
 * @param modalities The set of modalities the model can respond with. To disable audio, set this to [\"text\"]. 
 * @param instructions The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session. 
 * @param voice The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`. 
 * @param outputUnderscoreaudioUnderscoreformat The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`. 
 * @param tools Tools (functions) available to the model.
 * @param toolUnderscorechoice How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`. 
 * @param temperature Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8. 
 * @param maxUnderscoreresponseUnderscoreoutputUnderscoretokens 
 * @param conversation 
 * @param metadata Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
 * @param input Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation. 
 */
case class RealtimeResponseCreateParams(modalities: Option[Seq[String]],
                instructions: Option[String],
                voice: Option[String],
                outputUnderscoreaudioUnderscoreformat: Option[String],
                tools: Option[Seq[RealtimeResponseCreateParamsToolsInner]],
                toolUnderscorechoice: Option[String],
                temperature: Option[BigDecimal],
                maxUnderscoreresponseUnderscoreoutputUnderscoretokens: Option[RealtimeResponseCreateParamsMaxResponseOutputTokens],
                conversation: Option[RealtimeResponseCreateParamsConversation],
                metadata: Option[Object],
                input: Option[Seq[RealtimeConversationItem]]
                )

object RealtimeResponseCreateParams {
    /**
     * Creates the codec for converting RealtimeResponseCreateParams from and to JSON.
     */
    implicit val decoder: Decoder[RealtimeResponseCreateParams] = deriveDecoder
    implicit val encoder: ObjectEncoder[RealtimeResponseCreateParams] = deriveEncoder
}
