package org.openapitools.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.math.BigDecimal;
import org.openapitools.model.CreateSpeechRequestModel;

@Canonical
class CreateSpeechRequest {
    
    CreateSpeechRequestModel model
    /* The text to generate audio for. The maximum length is 4096 characters. */
    String input

    enum VoiceEnum {
    
        ALLOY("alloy"),
        
        ECHO("echo"),
        
        FABLE("fable"),
        
        ONYX("onyx"),
        
        NOVA("nova"),
        
        SHIMMER("shimmer")
    
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

    /* The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech/voice-options). */
    VoiceEnum voice

    enum ResponseFormatEnum {
    
        MP3("mp3"),
        
        OPUS("opus"),
        
        AAC("aac"),
        
        FLAC("flac"),
        
        WAV("wav"),
        
        PCM("pcm")
    
        private final String value
    
        ResponseFormatEnum(String value) {
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

    /* The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`. */
    ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3
    /* The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default. */
    BigDecimal speed = new BigDecimal("1.0")
}
