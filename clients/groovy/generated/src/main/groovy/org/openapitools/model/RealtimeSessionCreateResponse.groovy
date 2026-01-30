package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;
import org.openapitools.model.RealtimeSessionCreateResponseClientSecret;
import org.openapitools.model.RealtimeSessionCreateResponseTurnDetection;
import org.openapitools.model.RealtimeSessionInputAudioTranscription;

@Canonical
class RealtimeSessionCreateResponse {
    
    RealtimeSessionCreateResponseClientSecret clientSecret

    enum ModalitiesEnum {
    
        TEXT("text"),
        
        AUDIO("audio")
    
        private final String value
    
        ModalitiesEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The set of modalities the model can respond with. To disable audio, set this to [\"text\"].  */
    List<ModalitiesEnum> modalities = new ArrayList<>()
    /* The default system instructions (i.e. system message) prepended to model  calls. This field allows the client to guide the model on desired  responses. The model can be instructed on response content and format,  (e.g. \"be extremely succinct\", \"act friendly\", \"here are examples of good  responses\") and on audio behavior (e.g. \"talk quickly\", \"inject emotion  into your voice\", \"laugh frequently\"). The instructions are not guaranteed  to be followed by the model, but they provide guidance to the model on the  desired behavior.  Note that the server sets default instructions which will be used if this  field is not set and are visible in the `session.created` event at the  start of the session.  */
    String instructions

    enum VoiceEnum {
    
        ALLOY("alloy"),
        
        ASH("ash"),
        
        BALLAD("ballad"),
        
        CORAL("coral"),
        
        ECHO("echo"),
        
        SAGE("sage"),
        
        SHIMMER("shimmer"),
        
        VERSE("verse")
    
        private final String value
    
        VoiceEnum(String value) {
            this.value = value
        }
    
        String getValue() {
            value
        }
    
        @Override
        String toString() {
            String.valueOf(value)
        }
    }

    /* The voice the model uses to respond. Voice cannot be changed during the  session once the model has responded with audio at least once. Current  voice options are `alloy`, `ash`, `ballad`, `coral`, `echo` `sage`,  `shimmer` and `verse`.  */
    VoiceEnum voice
    /* The format of input audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
    String inputAudioFormat
    /* The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
    String outputAudioFormat
    
    RealtimeSessionInputAudioTranscription inputAudioTranscription
    
    RealtimeSessionCreateResponseTurnDetection turnDetection
    /* Tools (functions) available to the model. */
    List<RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>()
    /* How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function.  */
    String toolChoice
    /* Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
    BigDecimal temperature
    
    RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens
}
