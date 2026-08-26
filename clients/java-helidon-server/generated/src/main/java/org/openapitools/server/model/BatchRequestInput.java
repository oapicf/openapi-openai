package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The per-line object of the batch input file
 */
public class BatchRequestInput   {

    private String customId;

    /**
    * The HTTP method to be used for the request. Currently only `POST` is supported.
    */
    public enum MethodEnum {
        POST("POST");

        private String value;

        MethodEnum(String value) {
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
        public static MethodEnum fromValue(String text) {
            for (MethodEnum b : MethodEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private MethodEnum method;
    private String url;

    /**
     * Default constructor.
     */
    public BatchRequestInput() {
    // JSON-B / Jackson
    }

    /**
     * Create BatchRequestInput.
     *
     * @param customId A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
     * @param method The HTTP method to be used for the request. Currently only &#x60;POST&#x60; is supported.
     * @param url The OpenAI API relative URL to be used for the request. Currently &#x60;/v1/chat/completions&#x60;, &#x60;/v1/embeddings&#x60;, and &#x60;/v1/completions&#x60; are supported.
     */
    public BatchRequestInput(
        String customId, 
        MethodEnum method, 
        String url
    ) {
        this.customId = customId;
        this.method = method;
        this.url = url;
    }



    /**
     * A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
     * @return customId
     */
    public String getCustomId() {
        return customId;
    }

    public void setCustomId(String customId) {
        this.customId = customId;
    }

    /**
     * The HTTP method to be used for the request. Currently only `POST` is supported.
     * @return method
     */
    public MethodEnum getMethod() {
        return method;
    }

    public void setMethod(MethodEnum method) {
        this.method = method;
    }

    /**
     * The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchRequestInput {\n");
        
        sb.append("    customId: ").append(toIndentedString(customId)).append("\n");
        sb.append("    method: ").append(toIndentedString(method)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

