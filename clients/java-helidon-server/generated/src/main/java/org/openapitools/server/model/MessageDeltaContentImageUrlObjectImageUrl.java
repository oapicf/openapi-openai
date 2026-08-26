package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MessageDeltaContentImageUrlObjectImageUrl   {

    private String url;

    /**
    * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
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
    public MessageDeltaContentImageUrlObjectImageUrl() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentImageUrlObjectImageUrl.
     *
     * @param url The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
     * @param detail Specifies the detail level of the image. &#x60;low&#x60; uses fewer tokens, you can opt in to high resolution using &#x60;high&#x60;.
     */
    public MessageDeltaContentImageUrlObjectImageUrl(
        String url, 
        DetailEnum detail
    ) {
        this.url = url;
        this.detail = detail;
    }



    /**
     * The URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`.
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
        sb.append("class MessageDeltaContentImageUrlObjectImageUrl {\n");
        
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

