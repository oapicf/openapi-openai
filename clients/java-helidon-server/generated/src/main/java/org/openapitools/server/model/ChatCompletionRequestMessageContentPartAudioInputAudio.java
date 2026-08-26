package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionRequestMessageContentPartAudioInputAudio   {

    private String data;

    /**
    * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
    */
    public enum FormatEnum {
        WAV("wav"),
        MP3("mp3");

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
    public ChatCompletionRequestMessageContentPartAudioInputAudio() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestMessageContentPartAudioInputAudio.
     *
     * @param data Base64 encoded audio data.
     * @param format The format of the encoded audio data. Currently supports \&quot;wav\&quot; and \&quot;mp3\&quot;. 
     */
    public ChatCompletionRequestMessageContentPartAudioInputAudio(
        String data, 
        FormatEnum format
    ) {
        this.data = data;
        this.format = format;
    }



    /**
     * Base64 encoded audio data.
     * @return data
     */
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    /**
     * The format of the encoded audio data. Currently supports \"wav\" and \"mp3\". 
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
        sb.append("class ChatCompletionRequestMessageContentPartAudioInputAudio {\n");
        
        sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

