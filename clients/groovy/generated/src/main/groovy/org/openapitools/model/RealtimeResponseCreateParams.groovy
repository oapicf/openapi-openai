package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.RealtimeConversationItem;
import org.openapitools.model.RealtimeResponseCreateParamsConversation;
import org.openapitools.model.RealtimeResponseCreateParamsMaxResponseOutputTokens;
import org.openapitools.model.RealtimeResponseCreateParamsToolsInner;

@Canonical
class RealtimeResponseCreateParams {

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

    enum OutputAudioFormatEnum {
    
        PCM16("pcm16"),
        
        G711_ULAW("g711_ulaw"),
        
        G711_ALAW("g711_alaw")
    
        private final String value
    
        OutputAudioFormatEnum(String value) {
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

    /* The format of output audio. Options are `pcm16`, `g711_ulaw`, or `g711_alaw`.  */
    OutputAudioFormatEnum outputAudioFormat
    /* Tools (functions) available to the model. */
    List<RealtimeResponseCreateParamsToolsInner> tools = new ArrayList<>()
    /* How the model chooses tools. Options are `auto`, `none`, `required`, or  specify a function, like `{\"type\": \"function\", \"function\": {\"name\": \"my_function\"}}`.  */
    String toolChoice
    /* Sampling temperature for the model, limited to [0.6, 1.2]. Defaults to 0.8.  */
    BigDecimal temperature
    
    RealtimeResponseCreateParamsMaxResponseOutputTokens maxResponseOutputTokens
    
    RealtimeResponseCreateParamsConversation conversation
    /* Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long.  */
    Object metadata
    /* Input items to include in the prompt for the model. Creates a new context for this response, without including the default conversation. Can include references to items from the default conversation.  */
    List<RealtimeConversationItem> input = new ArrayList<>()
}
