package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import org.openapitools.jackson.nullable.JsonNullable;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateBatchRequest   {

    private String inputFileId;

    /**
    * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
    */
    public enum EndpointEnum {
        _V1_CHAT_COMPLETIONS("/v1/chat/completions"),
        _V1_EMBEDDINGS("/v1/embeddings"),
        _V1_COMPLETIONS("/v1/completions");

        private String value;

        EndpointEnum(String value) {
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
        public static EndpointEnum fromValue(String text) {
            for (EndpointEnum b : EndpointEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private EndpointEnum endpoint;

    /**
    * The time frame within which the batch should be processed. Currently only `24h` is supported.
    */
    public enum CompletionWindowEnum {
        _24H("24h");

        private String value;

        CompletionWindowEnum(String value) {
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
        public static CompletionWindowEnum fromValue(String text) {
            for (CompletionWindowEnum b : CompletionWindowEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private CompletionWindowEnum completionWindow;
    private Map<String, String> metadata;

    /**
     * Default constructor.
     */
    public CreateBatchRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateBatchRequest.
     *
     * @param inputFileId The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose &#x60;batch&#x60;. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
     * @param endpoint The endpoint to be used for all requests in the batch. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported. Note that &#x60;/v1/embeddings&#x60; batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
     * @param completionWindow The time frame within which the batch should be processed. Currently only &#x60;24h&#x60; is supported.
     * @param metadata Optional custom metadata for the batch.
     */
    public CreateBatchRequest(
        String inputFileId, 
        EndpointEnum endpoint, 
        CompletionWindowEnum completionWindow, 
        Map<String, String> metadata
    ) {
        this.inputFileId = inputFileId;
        this.endpoint = endpoint;
        this.completionWindow = completionWindow;
        this.metadata = metadata;
    }



    /**
     * The ID of an uploaded file that contains requests for the new batch.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your input file must be formatted as a [JSONL file](/docs/api-reference/batch/request-input), and must be uploaded with the purpose `batch`. The file can contain up to 50,000 requests, and can be up to 200 MB in size. 
     * @return inputFileId
     */
    public String getInputFileId() {
        return inputFileId;
    }

    public void setInputFileId(String inputFileId) {
        this.inputFileId = inputFileId;
    }

    /**
     * The endpoint to be used for all requests in the batch. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported. Note that `/v1/embeddings` batches are also restricted to a maximum of 50,000 embedding inputs across all requests in the batch.
     * @return endpoint
     */
    public EndpointEnum getEndpoint() {
        return endpoint;
    }

    public void setEndpoint(EndpointEnum endpoint) {
        this.endpoint = endpoint;
    }

    /**
     * The time frame within which the batch should be processed. Currently only `24h` is supported.
     * @return completionWindow
     */
    public CompletionWindowEnum getCompletionWindow() {
        return completionWindow;
    }

    public void setCompletionWindow(CompletionWindowEnum completionWindow) {
        this.completionWindow = completionWindow;
    }

    /**
     * Optional custom metadata for the batch.
     * @return metadata
     */
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateBatchRequest {\n");
        
        sb.append("    inputFileId: ").append(toIndentedString(inputFileId)).append("\n");
        sb.append("    endpoint: ").append(toIndentedString(endpoint)).append("\n");
        sb.append("    completionWindow: ").append(toIndentedString(completionWindow)).append("\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

