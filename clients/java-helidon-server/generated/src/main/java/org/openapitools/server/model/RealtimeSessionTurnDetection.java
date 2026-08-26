package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 */
public class RealtimeSessionTurnDetection   {


    /**
    * Type of turn detection, only `server_vad` is currently supported. 
    */
    public enum TypeEnum {
        SERVER_VAD("server_vad");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String text) {
            for (TypeEnum b : TypeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private TypeEnum type;
    private BigDecimal threshold;
    private Integer prefixPaddingMs;
    private Integer silenceDurationMs;

    /**
     * Default constructor.
     */
    public RealtimeSessionTurnDetection() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeSessionTurnDetection.
     *
     * @param type Type of turn detection, only &#x60;server_vad&#x60; is currently supported. 
     * @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
     * @param prefixPaddingMs Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
     * @param silenceDurationMs Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
     */
    public RealtimeSessionTurnDetection(
        TypeEnum type, 
        BigDecimal threshold, 
        Integer prefixPaddingMs, 
        Integer silenceDurationMs
    ) {
        this.type = type;
        this.threshold = threshold;
        this.prefixPaddingMs = prefixPaddingMs;
        this.silenceDurationMs = silenceDurationMs;
    }



    /**
     * Type of turn detection, only `server_vad` is currently supported. 
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    /**
     * Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
     * @return threshold
     */
    public BigDecimal getThreshold() {
        return threshold;
    }

    public void setThreshold(BigDecimal threshold) {
        this.threshold = threshold;
    }

    /**
     * Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
     * @return prefixPaddingMs
     */
    public Integer getPrefixPaddingMs() {
        return prefixPaddingMs;
    }

    public void setPrefixPaddingMs(Integer prefixPaddingMs) {
        this.prefixPaddingMs = prefixPaddingMs;
    }

    /**
     * Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
     * @return silenceDurationMs
     */
    public Integer getSilenceDurationMs() {
        return silenceDurationMs;
    }

    public void setSilenceDurationMs(Integer silenceDurationMs) {
        this.silenceDurationMs = silenceDurationMs;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeSessionTurnDetection {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    prefixPaddingMs: ").append(toIndentedString(prefixPaddingMs)).append("\n");
        sb.append("    silenceDurationMs: ").append(toIndentedString(silenceDurationMs)).append("\n");
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

