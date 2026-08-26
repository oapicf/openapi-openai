package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Parameters for audio output. Required when audio output is requested with `modalities: [\"audio\"]`. [Learn more](/docs/guides/audio). 
 */
public class CreateChatCompletionRequestAudio   {


    /**
    * The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
    */
    public enum VoiceEnum {
        ALLOY("alloy"),
        ASH("ash"),
        BALLAD("ballad"),
        CORAL("coral"),
        ECHO("echo"),
        SAGE("sage"),
        SHIMMER("shimmer"),
        VERSE("verse");

        private String value;

        VoiceEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static VoiceEnum fromValue(String text) {
            for (VoiceEnum b : VoiceEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private VoiceEnum voice;

    /**
    * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
    */
    public enum FormatEnum {
        WAV("wav"),
        MP3("mp3"),
        FLAC("flac"),
        OPUS("opus"),
        PCM16("pcm16");

        private String value;

        FormatEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }


        @JsonCreator
        public static FormatEnum fromValue(String text) {
            for (FormatEnum b : FormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private FormatEnum format;

    /**
     * Default constructor.
     */
    public CreateChatCompletionRequestAudio() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatCompletionRequestAudio.
     *
     * @param voice The voice the model uses to respond. Supported voices are &#x60;ash&#x60;, &#x60;ballad&#x60;, &#x60;coral&#x60;, &#x60;sage&#x60;, and &#x60;verse&#x60; (also supported but not recommended are &#x60;alloy&#x60;, &#x60;echo&#x60;, and &#x60;shimmer&#x60;; these voices are less expressive). 
     * @param format Specifies the output audio format. Must be one of &#x60;wav&#x60;, &#x60;mp3&#x60;, &#x60;flac&#x60;, &#x60;opus&#x60;, or &#x60;pcm16&#x60;. 
     */
    public CreateChatCompletionRequestAudio(
        VoiceEnum voice, 
        FormatEnum format
    ) {
        this.voice = voice;
        this.format = format;
    }



    /**
     * The voice the model uses to respond. Supported voices are `ash`, `ballad`, `coral`, `sage`, and `verse` (also supported but not recommended are `alloy`, `echo`, and `shimmer`; these voices are less expressive). 
     * @return voice
     */
    public VoiceEnum getVoice() {
        return voice;
    }

    public void setVoice(VoiceEnum voice) {
        this.voice = voice;
    }

    /**
     * Specifies the output audio format. Must be one of `wav`, `mp3`, `flac`, `opus`, or `pcm16`. 
     * @return format
     */
    public FormatEnum getFormat() {
        return format;
    }

    public void setFormat(FormatEnum format) {
        this.format = format;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatCompletionRequestAudio {\n");
        
        sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
        sb.append("    format: ").append(toIndentedString(format)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

