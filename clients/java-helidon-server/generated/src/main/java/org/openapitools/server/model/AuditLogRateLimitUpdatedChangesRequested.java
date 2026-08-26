package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The payload used to update the rate limits.
 */
public class AuditLogRateLimitUpdatedChangesRequested   {

    private Integer maxRequestsPer1Minute;
    private Integer maxTokensPer1Minute;
    private Integer maxImagesPer1Minute;
    private Integer maxAudioMegabytesPer1Minute;
    private Integer maxRequestsPer1Day;
    private Integer batch1DayMaxInputTokens;

    /**
     * Default constructor.
     */
    public AuditLogRateLimitUpdatedChangesRequested() {
    // JSON-B / Jackson
    }

    /**
     * Create AuditLogRateLimitUpdatedChangesRequested.
     *
     * @param maxRequestsPer1Minute The maximum requests per minute.
     * @param maxTokensPer1Minute The maximum tokens per minute.
     * @param maxImagesPer1Minute The maximum images per minute. Only relevant for certain models.
     * @param maxAudioMegabytesPer1Minute The maximum audio megabytes per minute. Only relevant for certain models.
     * @param maxRequestsPer1Day The maximum requests per day. Only relevant for certain models.
     * @param batch1DayMaxInputTokens The maximum batch input tokens per day. Only relevant for certain models.
     */
    public AuditLogRateLimitUpdatedChangesRequested(
        Integer maxRequestsPer1Minute, 
        Integer maxTokensPer1Minute, 
        Integer maxImagesPer1Minute, 
        Integer maxAudioMegabytesPer1Minute, 
        Integer maxRequestsPer1Day, 
        Integer batch1DayMaxInputTokens
    ) {
        this.maxRequestsPer1Minute = maxRequestsPer1Minute;
        this.maxTokensPer1Minute = maxTokensPer1Minute;
        this.maxImagesPer1Minute = maxImagesPer1Minute;
        this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
        this.maxRequestsPer1Day = maxRequestsPer1Day;
        this.batch1DayMaxInputTokens = batch1DayMaxInputTokens;
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
     * The maximum images per minute. Only relevant for certain models.
     * @return maxImagesPer1Minute
     */
    public Integer getMaxImagesPer1Minute() {
        return maxImagesPer1Minute;
    }

    public void setMaxImagesPer1Minute(Integer maxImagesPer1Minute) {
        this.maxImagesPer1Minute = maxImagesPer1Minute;
    }

    /**
     * The maximum audio megabytes per minute. Only relevant for certain models.
     * @return maxAudioMegabytesPer1Minute
     */
    public Integer getMaxAudioMegabytesPer1Minute() {
        return maxAudioMegabytesPer1Minute;
    }

    public void setMaxAudioMegabytesPer1Minute(Integer maxAudioMegabytesPer1Minute) {
        this.maxAudioMegabytesPer1Minute = maxAudioMegabytesPer1Minute;
    }

    /**
     * The maximum requests per day. Only relevant for certain models.
     * @return maxRequestsPer1Day
     */
    public Integer getMaxRequestsPer1Day() {
        return maxRequestsPer1Day;
    }

    public void setMaxRequestsPer1Day(Integer maxRequestsPer1Day) {
        this.maxRequestsPer1Day = maxRequestsPer1Day;
    }

    /**
     * The maximum batch input tokens per day. Only relevant for certain models.
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
        sb.append("class AuditLogRateLimitUpdatedChangesRequested {\n");
        
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

