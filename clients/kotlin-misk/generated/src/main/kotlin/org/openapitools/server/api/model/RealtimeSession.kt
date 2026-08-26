package org.openapitools.server.api.model

import org.openapitools.server.api.model.RealtimeResponseCreateParamsMaxResponseOutputTokens
import org.openapitools.server.api.model.RealtimeResponseCreateParamsToolsInner
import org.openapitools.server.api.model.RealtimeSessionInputAudioTranscription
import org.openapitools.server.api.model.RealtimeSessionModel
import org.openapitools.server.api.model.RealtimeSessionTurnDetection
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class RealtimeSession(
    /** Unique identifier for the session object.  */
    val id: kotlin.String? = null,
    /** The set of modalities the model can respond with. To disable audio, set this to [\&quot;text\&quot;].  */
    val modalities: kotlin.collections.List<kotlin.String>? = null,
    val model: RealtimeSessionModel? = null,
    /** The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \&quot;be extremely succinct\&quot;, \&quot;act friendly\&quot;, \&quot;here are examples of good  responses\&quot;) and on audio behavior (e.g. \&quot;talk quickly\&quot;, \&quot;inject emotion  into your voice\&quot;, \&quot;laugh frequently\&quot;). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the &#x60;session.created&#x60; event at the  start of the session.  */
    val instructions: kotlin.String? = null,
    /** The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are &#x60;alloy&#x60;, &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;echo&#x60; &#x60;sage&#x60;,  &#x60;shimmer&#x60; and &#x60;verse&#x60;.  */
    val voice: kotlin.String? = null,
    /** The format of input audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  */
    val inputAudioFormat: kotlin.String? = null,
    /** The format of output audio. Options are &#x60;pcm16&#x60;, &#x60;g711_ulaw&#x60;, or &#x60;g711_alaw&#x60;.  */
    val outputAudioFormat: kotlin.String? = null,
    val inputAudioTranscription: RealtimeSessionInputAudioTranscription? = null,
    val turnDetection: RealtimeSessionTurnDetection? = null,
    /** Tools (functions) available to the model. */
    val tools: kotlin.collections.List<RealtimeResponseCreateParamsToolsInner>? = null,
    /** How the model chooses tools. Options are &#x60;auto&#x60;, &#x60;none&#x60;, &#x60;required&#x60;, or  specify a function.  */
    val toolChoice: kotlin.String? = null,
    /** Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
    val temperature: java.math.BigDecimal? = null,
    val maxResponseOutputTokens: RealtimeResponseCreateParamsMaxResponseOutputTokens? = null
)
