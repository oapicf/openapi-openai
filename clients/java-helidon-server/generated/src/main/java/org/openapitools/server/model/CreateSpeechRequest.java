package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import org.openapitools.server.model.CreateSpeechRequestModel;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateSpeechRequest   {

    private CreateSpeechRequestModel model;
    private String input;

    /**
    * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
    */
    public enum VoiceEnum {
        ALLOY("alloy"),
        ECHO("echo"),
        FABLE("fable"),
        ONYX("onyx"),
        NOVA("nova"),
        SHIMMER("shimmer");

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
    * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
    */
    public enum ResponseFormatEnum {
        MP3("mp3"),
        OPUS("opus"),
        AAC("aac"),
        FLAC("flac"),
        WAV("wav"),
        PCM("pcm");

        private String value;

        ResponseFormatEnum(String value) {
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
        public static ResponseFormatEnum fromValue(String text) {
            for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ResponseFormatEnum responseFormat = ResponseFormatEnum.MP3;
    private BigDecimal speed = new BigDecimal("1");

    /**
     * Default constructor.
     */
    public CreateSpeechRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateSpeechRequest.
     *
     * @param model model
     * @param input The text to generate audio for. The maximum length is 4096 characters.
     * @param voice The voice to use when generating the audio. Supported voices are &#x60;alloy&#x60;, &#x60;echo&#x60;, &#x60;fable&#x60;, &#x60;onyx&#x60;, &#x60;nova&#x60;, and &#x60;shimmer&#x60;. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
     * @param responseFormat The format to audio in. Supported formats are &#x60;mp3&#x60;, &#x60;opus&#x60;, &#x60;aac&#x60;, &#x60;flac&#x60;, &#x60;wav&#x60;, and &#x60;pcm&#x60;.
     * @param speed The speed of the generated audio. Select a value from &#x60;0.25&#x60; to &#x60;4.0&#x60;. &#x60;1.0&#x60; is the default.
     */
    public CreateSpeechRequest(
        CreateSpeechRequestModel model, 
        String input, 
        VoiceEnum voice, 
        ResponseFormatEnum responseFormat, 
        BigDecimal speed
    ) {
        this.model = model;
        this.input = input;
        this.voice = voice;
        this.responseFormat = responseFormat;
        this.speed = speed;
    }



    /**
     * Get model
     * @return model
     */
    public CreateSpeechRequestModel getModel() {
        return model;
    }

    public void setModel(CreateSpeechRequestModel model) {
        this.model = model;
    }

    /**
     * The text to generate audio for. The maximum length is 4096 characters.
     * @return input
     */
    public String getInput() {
        return input;
    }

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * The voice to use when generating the audio. Supported voices are `alloy`, `echo`, `fable`, `onyx`, `nova`, and `shimmer`. Previews of the voices are available in the [Text to speech guide](/docs/guides/text-to-speech#voice-options).
     * @return voice
     */
    public VoiceEnum getVoice() {
        return voice;
    }

    public void setVoice(VoiceEnum voice) {
        this.voice = voice;
    }

    /**
     * The format to audio in. Supported formats are `mp3`, `opus`, `aac`, `flac`, `wav`, and `pcm`.
     * @return responseFormat
     */
    public ResponseFormatEnum getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(ResponseFormatEnum responseFormat) {
        this.responseFormat = responseFormat;
    }

    /**
     * The speed of the generated audio. Select a value from `0.25` to `4.0`. `1.0` is the default.
     * minimum: 0.25
     * maximum: 4
     * @return speed
     */
    public BigDecimal getSpeed() {
        return speed;
    }

    public void setSpeed(BigDecimal speed) {
        this.speed = speed;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSpeechRequest {\n");
        
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    voice: ").append(toIndentedString(voice)).append("\n");
        sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
        sb.append("    speed: ").append(toIndentedString(speed)).append("\n");
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

