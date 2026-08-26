package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CostsResult;
import org.openapitools.server.model.CostsResultAmount;
import org.openapitools.server.model.UsageAudioSpeechesResult;
import org.openapitools.server.model.UsageAudioTranscriptionsResult;
import org.openapitools.server.model.UsageCodeInterpreterSessionsResult;
import org.openapitools.server.model.UsageCompletionsResult;
import org.openapitools.server.model.UsageEmbeddingsResult;
import org.openapitools.server.model.UsageImagesResult;
import org.openapitools.server.model.UsageModerationsResult;
import org.openapitools.server.model.UsageVectorStoresResult;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class UsageTimeBucketResultInner   {


    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        ORGANIZATION_COSTS_RESULT("organization.costs.result");

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
    private Integer images;
    private String source;
    private String size;
    private Integer characters;
    private Integer seconds;
    private Integer usageBytes;
    private Integer sessions;
    private CostsResultAmount amount;
    private String lineItem;

    /**
     * Default constructor.
     */
    public UsageTimeBucketResultInner() {
    // JSON-B / Jackson
    }

    /**
     * Create UsageTimeBucketResultInner.
     *
     * @param _object _object
     * @param inputTokens The aggregated number of input tokens used.
     * @param inputCachedTokens The aggregated number of text input tokens that has been cached from previous requests. For customers subscribe to scale tier, this includes scale tier tokens.
     * @param outputTokens The aggregated number of text output tokens used. For customers subscribe to scale tier, this includes scale tier tokens.
     * @param inputAudioTokens The aggregated number of audio input tokens used, including cached tokens.
     * @param outputAudioTokens The aggregated number of audio output tokens used.
     * @param numModelRequests The count of requests made to the model.
     * @param projectId When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped costs result.
     * @param userId When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
     * @param apiKeyId When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
     * @param model When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
     * @param batch When &#x60;group_by&#x3D;batch&#x60;, this field tells whether the grouped usage result is batch or not.
     * @param images The number of images processed.
     * @param source When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
     * @param size When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
     * @param characters The number of characters processed.
     * @param seconds The number of seconds processed.
     * @param usageBytes The vector stores usage in bytes.
     * @param sessions The number of code interpreter sessions.
     * @param amount amount
     * @param lineItem When &#x60;group_by&#x3D;line_item&#x60;, this field provides the line item of the grouped costs result.
     */
    public UsageTimeBucketResultInner(
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
        Boolean batch, 
        Integer images, 
        String source, 
        String size, 
        Integer characters, 
        Integer seconds, 
        Integer usageBytes, 
        Integer sessions, 
        CostsResultAmount amount, 
        String lineItem
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
        this.images = images;
        this.source = source;
        this.size = size;
        this.characters = characters;
        this.seconds = seconds;
        this.usageBytes = usageBytes;
        this.sessions = sessions;
        this.amount = amount;
        this.lineItem = lineItem;
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
     * The aggregated number of input tokens used.
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
     * When `group_by=project_id`, this field provides the project ID of the grouped costs result.
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
     * The number of images processed.
     * @return images
     */
    public Integer getImages() {
        return images;
    }

    public void setImages(Integer images) {
        this.images = images;
    }

    /**
     * When `group_by=source`, this field provides the source of the grouped usage result, possible values are `image.generation`, `image.edit`, `image.variation`.
     * @return source
     */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * When `group_by=size`, this field provides the image size of the grouped usage result.
     * @return size
     */
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    /**
     * The number of characters processed.
     * @return characters
     */
    public Integer getCharacters() {
        return characters;
    }

    public void setCharacters(Integer characters) {
        this.characters = characters;
    }

    /**
     * The number of seconds processed.
     * @return seconds
     */
    public Integer getSeconds() {
        return seconds;
    }

    public void setSeconds(Integer seconds) {
        this.seconds = seconds;
    }

    /**
     * The vector stores usage in bytes.
     * @return usageBytes
     */
    public Integer getUsageBytes() {
        return usageBytes;
    }

    public void setUsageBytes(Integer usageBytes) {
        this.usageBytes = usageBytes;
    }

    /**
     * The number of code interpreter sessions.
     * @return sessions
     */
    public Integer getSessions() {
        return sessions;
    }

    public void setSessions(Integer sessions) {
        this.sessions = sessions;
    }

    /**
     * Get amount
     * @return amount
     */
    public CostsResultAmount getAmount() {
        return amount;
    }

    public void setAmount(CostsResultAmount amount) {
        this.amount = amount;
    }

    /**
     * When `group_by=line_item`, this field provides the line item of the grouped costs result.
     * @return lineItem
     */
    public String getLineItem() {
        return lineItem;
    }

    public void setLineItem(String lineItem) {
        this.lineItem = lineItem;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageTimeBucketResultInner {\n");
        
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
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
        sb.append("    seconds: ").append(toIndentedString(seconds)).append("\n");
        sb.append("    usageBytes: ").append(toIndentedString(usageBytes)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
        sb.append("    lineItem: ").append(toIndentedString(lineItem)).append("\n");
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

