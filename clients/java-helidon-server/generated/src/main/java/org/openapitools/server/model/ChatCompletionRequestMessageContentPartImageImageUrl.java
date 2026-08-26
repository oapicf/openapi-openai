package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import java.net.URI;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class ChatCompletionRequestMessageContentPartImageImageUrl   {

    private URI url;

    /**
    * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
    */
    public enum DetailEnum {
        AUTO("auto"),
        LOW("low"),
        HIGH("high");

        private String value;

        DetailEnum(String value) {
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
        public static DetailEnum fromValue(String text) {
            for (DetailEnum b : DetailEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private DetailEnum detail = DetailEnum.AUTO;

    /**
     * Default constructor.
     */
    public ChatCompletionRequestMessageContentPartImageImageUrl() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatCompletionRequestMessageContentPartImageImageUrl.
     *
     * @param url Either a URL of the image or the base64 encoded image data.
     * @param detail Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
     */
    public ChatCompletionRequestMessageContentPartImageImageUrl(
        URI url, 
        DetailEnum detail
    ) {
        this.url = url;
        this.detail = detail;
    }



    /**
     * Either a URL of the image or the base64 encoded image data.
     * @return url
     */
    public URI getUrl() {
        return url;
    }

    public void setUrl(URI url) {
        this.url = url;
    }

    /**
     * Specifies the detail level of the image. Learn more in the [Vision guide](/docs/guides/vision#low-or-high-fidelity-image-understanding).
     * @return detail
     */
    public DetailEnum getDetail() {
        return detail;
    }

    public void setDetail(DetailEnum detail) {
        this.detail = detail;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatCompletionRequestMessageContentPartImageImageUrl {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

