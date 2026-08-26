package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.math.BigDecimal;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Configuration for turn detection. Can be set to `null` to turn off. Server  VAD means that the model will detect the start and end of speech based on  audio volume and respond at the end of user speech. 
 */
public class RealtimeSessionCreateRequestTurnDetection   {

    private String type;
    private BigDecimal threshold;
    private Integer prefixPaddingMs;
    private Integer silenceDurationMs;
    private Boolean createResponse = true;

    /**
     * Default constructor.
     */
    public RealtimeSessionCreateRequestTurnDetection() {
    // JSON-B / Jackson
    }

    /**
     * Create RealtimeSessionCreateRequestTurnDetection.
     *
     * @param type Type of turn detection, only &#x60;server_vad&#x60; is currently supported. 
     * @param threshold Activation threshold for VAD (0.0 to 1.0), this defaults to 0.5. A  higher threshold will require louder audio to activate the model, and  thus might perform better in noisy environments. 
     * @param prefixPaddingMs Amount of audio to include before the VAD detected speech (in  milliseconds). Defaults to 300ms. 
     * @param silenceDurationMs Duration of silence to detect speech stop (in milliseconds). Defaults  to 500ms. With shorter values the model will respond more quickly,  but may jump in on short pauses from the user. 
     * @param createResponse Whether or not to automatically generate a response when VAD is enabled. &#x60;true&#x60; by default. 
     */
    public RealtimeSessionCreateRequestTurnDetection(
        String type, 
        BigDecimal threshold, 
        Integer prefixPaddingMs, 
        Integer silenceDurationMs, 
        Boolean createResponse
    ) {
        this.type = type;
        this.threshold = threshold;
        this.prefixPaddingMs = prefixPaddingMs;
        this.silenceDurationMs = silenceDurationMs;
        this.createResponse = createResponse;
    }



    /**
     * Type of turn detection, only `server_vad` is currently supported. 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
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
     * Whether or not to automatically generate a response when VAD is enabled. `true` by default. 
     * @return createResponse
     */
    public Boolean getCreateResponse() {
        return createResponse;
    }

    public void setCreateResponse(Boolean createResponse) {
        this.createResponse = createResponse;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealtimeSessionCreateRequestTurnDetection {\n");
        
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    threshold: ").append(toIndentedString(threshold)).append("\n");
        sb.append("    prefixPaddingMs: ").append(toIndentedString(prefixPaddingMs)).append("\n");
        sb.append("    silenceDurationMs: ").append(toIndentedString(silenceDurationMs)).append("\n");
        sb.append("    createResponse: ").append(toIndentedString(createResponse)).append("\n");
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

