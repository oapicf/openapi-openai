package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a project rate limit config.
 */
public class ProjectRateLimit   {


    /**
    * The object type, which is always `project.rate_limit`
    */
    public enum ObjectEnum {
        PROJECT_RATE_LIMIT("project.rate_limit");

        private String value;

        ObjectEnum(String value) {
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
        public static ObjectEnum fromValue(String text) {
            for (ObjectEnum b : ObjectEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ObjectEnum _object;
    private String id;
    private String model;
    private Integer maxRequestsPer1Minute;
    private Integer maxTokensPer1Minute;
    private Integer maxImagesPer1Minute;
    private Integer maxAudioMegabytesPer1Minute;
    private Integer maxRequestsPer1Day;
    private Integer batch1DayMaxInputTokens;

    /**
     * Default constructor.
     */
    public ProjectRateLimit() {
    // JSON-B / Jackson
    }

    /**
     * Create ProjectRateLimit.
     *
     * @param _object The object type, which is always &#x60;project.rate_limit&#x60;
     * @param id The identifier, which can be referenced in API endpoints.
     * @param model The model this rate limit applies to.
     * @param maxRequestsPer1Minute The maximum requests per minute.
     * @param maxTokensPer1Minute The maximum tokens per minute.
     * @param maxImagesPer1Minute The maximum images per minute. Only present for relevant models.
     * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only present for relevant models.
     * @param maxRequestsPer1Day The maximum requests per day. Only present for relevant models.
     * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only present for relevant models.
     */
    public ProjectRateLimit(
        ObjectEnum _object, 
        String id, 
        String model, 
        Integer maxRequestsPer1Minute, 
        Integer maxTokensPer1Minute, 
        Integer maxImagesPer1Minute, 
        Integer maxAudioMegabytesPer1Minute, 
        Integer maxRequestsPer1Day, 
        Integer batch1DayMaxInputTokens
    ) {
        this._object = _object;
        this.id = id;
        this.model = model;
        this.maxRequestsPer1Minute = maxRequestsPer1Minute;
        this.maxTokensPer1Minute = maxTokensPer1Minute;
        this.maxImagesPer1Minute = maxImagesPer1Minute;
        this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
        this.maxRequestsPer1Day = maxRequestsPer1Day;
        this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
    }



    /**
     * The object type, which is always `project.rate_limit`
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The identifier, which can be referenced in API endpoints.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * The model this rate limit applies to.
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * The maximum requests per minute.
     * @return maxRequestsPer1Minute
     */
    public Integer getMaxRequestsPer1Minute() {
        return maxRequestsPer1Minute;
    }

    public void setMaxRequestsPer1Minute(Integer maxRequestsPer1Minute) {
        this.maxRequestsPer1Minute = maxRequestsPer1Minute;
    }

    /**
     * The maximum tokens per minute.
     * @return maxTokensPer1Minute
     */
    public Integer getMaxTokensPer1Minute() {
        return maxTokensPer1Minute;
    }

    public void setMaxTokensPer1Minute(Integer maxTokensPer1Minute) {
        this.maxTokensPer1Minute = maxTokensPer1Minute;
    }

    /**
     * The maximum images per minute. Only present for relevant models.
     * @return maxImagesPer1Minute
     */
    public Integer getMaxImagesPer1Minute() {
        return maxImagesPer1Minute;
    }

    public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
        this.maxImagesPer1Minute = maxImagesPer1Minute;
    }

    /**
     * The maximum audio megabytes per minute. Only present for relevant models.
     * @return maxAudioMegabytesPer1Minute
     */
    public Integer getMaxAudioMegabytesPer1Minute() {
        return maxAudioMegabytesPer1Minute;
    }

    public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
        this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    }

    /**
     * The maximum requests per day. Only present for relevant models.
     * @return maxRequestsPer1Day
     */
    public Integer getMaxRequestsPer1Day() {
        return maxRequestsPer1Day;
    }

    public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
        this.maxRequestsPer1Day = maxRequestsPer1Day;
    }

    /**
     * The maximum batch input tokens per day. Only present for relevant models.
     * @return batch1DayMaxInputTokens
     */
    public Integer getBatch1DayMaxInputTokens() {
        return batch1DayMaxInputTokens;
    }

    public void setBatch1DayMaxInputTokens(Integer batch1DayMaxInputTokens) {
        this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectRateLimit {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    maxRequestsPer1Minute: ").append(toIndentedString(maxRequestsPer1Minute)).append("\n");
        sb.append("    maxTokensPer1Minute: ").append(toIndentedString(maxTokensPer1Minute)).append("\n");
        sb.append("    maxImagesPer1Minute: ").append(toIndentedString(maxImagesPer1Minute)).append("\n");
        sb.append("    maxAudioMegabytesPer1Minute: ").append(toIndentedString(maxAudioMegabytesPer1Minute)).append("\n");
        sb.append("    maxRequestsPer1Day: ").append(toIndentedString(maxRequestsPer1Day)).append("\n");
        sb.append("    batch1DayMaxInputTokens: ").append(toIndentedString(batch1DayMaxInputTokens)).append("\n");
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

