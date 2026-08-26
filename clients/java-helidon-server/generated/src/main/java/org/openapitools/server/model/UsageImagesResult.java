package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The aggregated images usage details of the specific time bucket.
 */
public class UsageImagesResult   {


    /**
    * Gets or Sets _object
    */
    public enum ObjectEnum {
        ORGANIZATION_USAGE_IMAGES_RESULT("organization.usage.images.result");

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
    private Integer images;
    private Integer numModelRequests;
    private String source;
    private String size;
    private String projectId;
    private String userId;
    private String apiKeyId;
    private String model;

    /**
     * Default constructor.
     */
    public UsageImagesResult() {
    // JSON-B / Jackson
    }

    /**
     * Create UsageImagesResult.
     *
     * @param _object _object
     * @param images The number of images processed.
     * @param numModelRequests The count of requests made to the model.
     * @param source When &#x60;group_by&#x3D;source&#x60;, this field provides the source of the grouped usage result, possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60;.
     * @param size When &#x60;group_by&#x3D;size&#x60;, this field provides the image size of the grouped usage result.
     * @param projectId When &#x60;group_by&#x3D;project_id&#x60;, this field provides the project ID of the grouped usage result.
     * @param userId When &#x60;group_by&#x3D;user_id&#x60;, this field provides the user ID of the grouped usage result.
     * @param apiKeyId When &#x60;group_by&#x3D;api_key_id&#x60;, this field provides the API key ID of the grouped usage result.
     * @param model When &#x60;group_by&#x3D;model&#x60;, this field provides the model name of the grouped usage result.
     */
    public UsageImagesResult(
        ObjectEnum _object, 
        Integer images, 
        Integer numModelRequests, 
        String source, 
        String size, 
        String projectId, 
        String userId, 
        String apiKeyId, 
        String model
    ) {
        this._object = _object;
        this.images = images;
        this.numModelRequests = numModelRequests;
        this.source = source;
        this.size = size;
        this.projectId = projectId;
        this.userId = userId;
        this.apiKeyId = apiKeyId;
        this.model = model;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UsageImagesResult {\n");
        
        sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
        sb.append("    numModelRequests: ").append(toIndentedString(numModelRequests)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
        sb.append("    apiKeyId: ").append(toIndentedString(apiKeyId)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
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

