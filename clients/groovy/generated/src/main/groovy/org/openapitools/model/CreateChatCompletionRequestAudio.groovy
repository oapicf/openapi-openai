package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@Canonical
class CreateChatCompletionRequestAudio {

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

    /* The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive).  */
    VoiceEnum voice

    enum FormatEnum {
    
        WAV("wav"),
        
        MP3("mp3"),
        
        FLAC("flac"),
        
        OPUS("opus"),
        
        PCM16("pcm16")
    
        private final String value
    
        FormatEnum(String value) {
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

    /* Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`.  */
    FormatEnum format
}
