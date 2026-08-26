package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.CreateEmbeddingRequestInput;
import org.openapitools.server.model.CreateEmbeddingRequestModel;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateEmbeddingRequest   {

    private CreateEmbeddingRequestInput input;
    private CreateEmbeddingRequestModel model;

    /**
    * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
    */
    public enum EncodingFormatEnum {
        FLOAT("float"),
        BASE64("base64");

        private String value;

        EncodingFormatEnum(String value) {
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
        public static EncodingFormatEnum fromValue(String text) {
            for (EncodingFormatEnum b : EncodingFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private EncodingFormatEnum encodingFormat = EncodingFormatEnum.FLOAT;
    private Integer dimensions;
    private String user;

    /**
     * Default constructor.
     */
    public CreateEmbeddingRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateEmbeddingRequest.
     *
     * @param input input
     * @param model model
     * @param encodingFormat The format to return the embeddings in. Can be either &#x60;float&#x60; or [&#x60;base64&#x60;](https://pypi.org/project/pybase64/).
     * @param dimensions The number of dimensions the resulting output embeddings should have. Only supported in &#x60;text-embedding-3&#x60; and later models. 
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     */
    public CreateEmbeddingRequest(
        CreateEmbeddingRequestInput input, 
        CreateEmbeddingRequestModel model, 
        EncodingFormatEnum encodingFormat, 
        Integer dimensions, 
        String user
    ) {
        this.input = input;
        this.model = model;
        this.encodingFormat = encodingFormat;
        this.dimensions = dimensions;
        this.user = user;
    }



    /**
     * Get input
     * @return input
     */
    public CreateEmbeddingRequestInput getInput() {
        return input;
    }

    public void setInput(CreateEmbeddingRequestInput input) {
        this.input = input;
    }

    /**
     * Get model
     * @return model
     */
    public CreateEmbeddingRequestModel getModel() {
        return model;
    }

    public void setModel(CreateEmbeddingRequestModel model) {
        this.model = model;
    }

    /**
     * The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
     * @return encodingFormat
     */
    public EncodingFormatEnum getEncodingFormat() {
        return encodingFormat;
    }

    public void setEncodingFormat(EncodingFormatEnum encodingFormat) {
        this.encodingFormat = encodingFormat;
    }

    /**
     * The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
     * minimum: 1
     * @return dimensions
     */
    public Integer getDimensions() {
        return dimensions;
    }

    public void setDimensions(Integer dimensions) {
        this.dimensions = dimensions;
    }

    /**
     * A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateEmbeddingRequest {\n");
        
        sb.append("    input: ").append(toIndentedString(input)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    encodingFormat: ").append(toIndentedString(encodingFormat)).append("\n");
        sb.append("    dimensions: ").append(toIndentedString(dimensions)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

