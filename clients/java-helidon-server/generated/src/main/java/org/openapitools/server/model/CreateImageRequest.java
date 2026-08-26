package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.CreateImageRequestModel;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateImageRequest   {

    private String prompt;
    private CreateImageRequestModel model;
    private Integer n = 1;

    /**
    * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
    */
    public enum QualityEnum {
        STANDARD("standard"),
        HD("hd");

        private String value;

        QualityEnum(String value) {
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
        public static QualityEnum fromValue(String text) {
            for (QualityEnum b : QualityEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private QualityEnum quality = QualityEnum.STANDARD;

    /**
    * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
    */
    public enum ResponseFormatEnum {
        URL("url"),
        B64_JSON("b64_json");

        private String value;

        ResponseFormatEnum(String value) {
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
        public static ResponseFormatEnum fromValue(String text) {
            for (ResponseFormatEnum b : ResponseFormatEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private ResponseFormatEnum responseFormat = ResponseFormatEnum.URL;

    /**
    * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
    */
    public enum SizeEnum {
        _256X256("256x256"),
        _512X512("512x512"),
        _1024X1024("1024x1024"),
        _1792X1024("1792x1024"),
        _1024X1792("1024x1792");

        private String value;

        SizeEnum(String value) {
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
        public static SizeEnum fromValue(String text) {
            for (SizeEnum b : SizeEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private SizeEnum size = SizeEnum._1024X1024;

    /**
    * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
    */
    public enum StyleEnum {
        VIVID("vivid"),
        NATURAL("natural");

        private String value;

        StyleEnum(String value) {
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
        public static StyleEnum fromValue(String text) {
            for (StyleEnum b : StyleEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private StyleEnum style = StyleEnum.VIVID;
    private String user;

    /**
     * Default constructor.
     */
    public CreateImageRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateImageRequest.
     *
     * @param prompt A text description of the desired image(s). The maximum length is 1000 characters for &#x60;dall-e-2&#x60; and 4000 characters for &#x60;dall-e-3&#x60;.
     * @param model model
     * @param n The number of images to generate. Must be between 1 and 10. For &#x60;dall-e-3&#x60;, only &#x60;n&#x3D;1&#x60; is supported.
     * @param quality The quality of the image that will be generated. &#x60;hd&#x60; creates images with finer details and greater consistency across the image. This param is only supported for &#x60;dall-e-3&#x60;.
     * @param responseFormat The format in which the generated images are returned. Must be one of &#x60;url&#x60; or &#x60;b64_json&#x60;. URLs are only valid for 60 minutes after the image has been generated.
     * @param size The size of the generated images. Must be one of &#x60;256x256&#x60;, &#x60;512x512&#x60;, or &#x60;1024x1024&#x60; for &#x60;dall-e-2&#x60;. Must be one of &#x60;1024x1024&#x60;, &#x60;1792x1024&#x60;, or &#x60;1024x1792&#x60; for &#x60;dall-e-3&#x60; models.
     * @param style The style of the generated images. Must be one of &#x60;vivid&#x60; or &#x60;natural&#x60;. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for &#x60;dall-e-3&#x60;.
     * @param user A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices#end-user-ids). 
     */
    public CreateImageRequest(
        String prompt, 
        CreateImageRequestModel model, 
        Integer n, 
        QualityEnum quality, 
        ResponseFormatEnum responseFormat, 
        SizeEnum size, 
        StyleEnum style, 
        String user
    ) {
        this.prompt = prompt;
        this.model = model;
        this.n = n;
        this.quality = quality;
        this.responseFormat = responseFormat;
        this.size = size;
        this.style = style;
        this.user = user;
    }



    /**
     * A text description of the desired image(s). The maximum length is 1000 characters for `dall-e-2` and 4000 characters for `dall-e-3`.
     * @return prompt
     */
    public String getPrompt() {
        return prompt;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    /**
     * Get model
     * @return model
     */
    public CreateImageRequestModel getModel() {
        return model;
    }

    public void setModel(CreateImageRequestModel model) {
        this.model = model;
    }

    /**
     * The number of images to generate. Must be between 1 and 10. For `dall-e-3`, only `n=1` is supported.
     * minimum: 1
     * maximum: 10
     * @return n
     */
    public Integer getN() {
        return n;
    }

    public void setN(Integer n) {
        this.n = n;
    }

    /**
     * The quality of the image that will be generated. `hd` creates images with finer details and greater consistency across the image. This param is only supported for `dall-e-3`.
     * @return quality
     */
    public QualityEnum getQuality() {
        return quality;
    }

    public void setQuality(QualityEnum quality) {
        this.quality = quality;
    }

    /**
     * The format in which the generated images are returned. Must be one of `url` or `b64_json`. URLs are only valid for 60 minutes after the image has been generated.
     * @return responseFormat
     */
    public ResponseFormatEnum getResponseFormat() {
        return responseFormat;
    }

    public void setResponseFormat(ResponseFormatEnum responseFormat) {
        this.responseFormat = responseFormat;
    }

    /**
     * The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024` for `dall-e-2`. Must be one of `1024x1024`, `1792x1024`, or `1024x1792` for `dall-e-3` models.
     * @return size
     */
    public SizeEnum getSize() {
        return size;
    }

    public void setSize(SizeEnum size) {
        this.size = size;
    }

    /**
     * The style of the generated images. Must be one of `vivid` or `natural`. Vivid causes the model to lean towards generating hyper-real and dramatic images. Natural causes the model to produce more natural, less hyper-real looking images. This param is only supported for `dall-e-3`.
     * @return style
     */
    public StyleEnum getStyle() {
        return style;
    }

    public void setStyle(StyleEnum style) {
        this.style = style;
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
        sb.append("class CreateImageRequest {\n");
        
        sb.append("    prompt: ").append(toIndentedString(prompt)).append("\n");
        sb.append("    model: ").append(toIndentedString(model)).append("\n");
        sb.append("    n: ").append(toIndentedString(n)).append("\n");
        sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
        sb.append("    responseFormat: ").append(toIndentedString(responseFormat)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
        sb.append("    style: ").append(toIndentedString(style)).append("\n");
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

