package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The aggregated completions usage details of the specific time bucket.
 */
public class UsageCompletionsResult   {


    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        ORGANIZATION_USAGE_COMPLETIONS_RESULT("organization.usage.completions.result");

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
    private Integer inputTokens;
    private Integer inputCachedTokens;
    private Integer outputTokens;
    private Integer inputAudioTokens;
    private Integer outputAudioTokens;
    private Integer numModelRequests;
    private String projectId;
    private String userId;
    private String apiKeyId;
    private String model;
    private Boolean batch;

    /**
     * Default constructor.
     */
    public UsageCompletionsResult() {
    // JSON-B / Jackson
    }

    /**
     * Create UsageCompletionsResult.
     *
     * @param _object _object
     * @param inputTokens The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
     * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
     * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
     * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens.
     * @param outputAudioTokens The aggregated number of audio output tokens used.
     * @param numModelRequests The count of requests made to the model.
     * @param projectId When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     * @param userId When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
     * @param apiKeyId When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
     * @param model When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
     * @param batch When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not.
     */
    public UsageCompletionsResult(
        ObjectEnum _object, 
        Integer inputTokens, 
        Integer inputCachedTokens, 
        Integer outputTokens, 
        Integer inputAudioTokens, 
        Integer outputAudioTokens, 
        Integer numModelRequests, 
        String projectId, 
        String userId, 
        String apiKeyId, 
        String model, 
        Boolean batch
    ) {
        this._object = _object;
        this.inputTokens = inputTokens;
        this.inputCachedTokens = inputCachedTokens;
        this.outputTokens = outputTokens;
        this.inputAudioTokens = inputAudioTokens;
        this.outputAudioTokens = outputAudioTokens;
        this.numModelRequests = numModelRequests;
        this.projectId = projectId;
        this.userId = userId;
        this.apiKeyId = apiKeyId;
        this.model = model;
        this.batch = batch;
    }



    /**
     * Get _object
     * @return _object
     */
    public ObjectEnum getObject() {
        return _object;
    }

    public void setObject(ObjectEnum _object) {
        this._object = _object;
    }

    /**
     * The aggregated number of text input tokens used, including cached tokens. For customers subscribe to scale tier, this includes scale tier tokens.
     * @return inputTokens
     */
    public Integer getInputTokens() {
        return inputTokens;
    }

    public void setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
    }

    /**
     * The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
     * @return inputCachedTokens
     */
    public Integer getInputCachedTokens() {
        return inputCachedTokens;
    }

    public void setInputCachedTokens(Integer inputCachedTokens) {
        this.inputCachedTokens = inputCachedTokens;
    }

    /**
     * The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
     * @return outputTokens
     */
    public Integer getOutputTokens() {
        return outputTokens;
    }

    public void setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
    }

    /**
     * The aggregated number of audio input tokens used, including cached tokens.
     * @return inputAudioTokens
     */
    public Integer getInputAudioTokens() {
        return inputAudioTokens;
    }

    public void setInputAudioTokens(Integer inputAudioTokens) {
        this.inputAudioTokens = inputAudioTokens;
    }

    /**
     * The aggregated number of audio output tokens used.
     * @return outputAudioTokens
     */
    public Integer getOutputAudioTokens() {
        return outputAudioTokens;
    }

    public void setOutputAudioTokens(Integer outputAudioTokens) {
        this.outputAudioTokens = outputAudioTokens;
    }

    /**
     * The count of requests made to the model.
     * @return numModelRequests
     */
    public Integer getNumModelRequests() {
        return numModelRequests;
    }

    public void setNumModelRequests(Integer numModelRequests) {
        this.numModelRequests = numModelRequests;
    }

    /**
     * When `group_by=project_id`, this field provides the project ID of the grouped usage result.
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    /**
     * When `group_by=user_id`, this field provides the user ID of the grouped usage result.
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    /**
     * When `group_by=api_key_id`, this field provides the API key ID of the grouped usage result.
     * @return apiKeyId
     */
    public String getApiKeyId() {
        return apiKeyId;
    }

    public void setApiKeyId(String apiKeyId) {
        this.apiKeyId = apiKeyId;
    }

    /**
     * When `group_by=model`, this field provides the model name of the grouped usage result.
     * @return model
     */
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    /**
     * When `group_by=batch`, this field tells whether the grouped usage result is batch or not.
     * @return batch
     */
    public Boolean getBatch() {
        return batch;
    }

    public void setBatch(Boolean batch) {
        this.batch = batch;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageCompletionsResult {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    inputTokens: ").append(toIndentedString(inputTokens)).append("\n");
        sb.append("    inputCachedTokens: ").append(toIndentedString(inputCachedTokens)).append("\n");
        sb.append("    outputTokens: ").append(toIndentedString(outputTokens)).append("\n");
        sb.append("    inputAudioTokens: ").append(toIndentedString(inputAudioTokens)).append("\n");
        sb.append("    outputAudioTokens: ").append(toIndentedString(outputAudioTokens)).append("\n");
        sb.append("    numModelRequests: ").append(toIndentedString(numModelRequests)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    batch: ").append(toIndentedString(batch)).append("\n");
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

