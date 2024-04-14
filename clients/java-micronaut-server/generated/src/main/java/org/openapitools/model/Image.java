/*
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Represents the url or the content of an image generated by the OpenAI API.
 */
@Schema(name = "Image", description = "Represents the url or the content of an image generated by the OpenAI API.")
@JsonPropertyOrder({
  Image.JSON_PROPERTY_B64_JSON,
  Image.JSON_PROPERTY_URL,
  Image.JSON_PROPERTY_REVISED_PROMPT
})
@JsonTypeName("Image")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-04-14T13:38:24.957235058Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class Image {
    public static final String JSON_PROPERTY_B64_JSON = "b64_json";
    private String b64Json;

    public static final String JSON_PROPERTY_URL = "url";
    private String url;

    public static final String JSON_PROPERTY_REVISED_PROMPT = "revised_prompt";
    private String revisedPrompt;

    public Image() {
    }

    public Image b64Json(String b64Json) {
        this.b64Json = b64Json;
        return this;
    }

    /**
     * The base64-encoded JSON of the generated image, if &#x60;response_format&#x60; is &#x60;b64_json&#x60;.
     * @return b64Json
     **/
    @Nullable
    @Schema(name = "b64_json", description = "The base64-encoded JSON of the generated image, if `response_format` is `b64_json`.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_B64_JSON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getB64Json() {
        return b64Json;
    }

    @JsonProperty(JSON_PROPERTY_B64_JSON)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setB64Json(String b64Json) {
        this.b64Json = b64Json;
    }

    public Image url(String url) {
        this.url = url;
        return this;
    }

    /**
     * The URL of the generated image, if &#x60;response_format&#x60; is &#x60;url&#x60; (default).
     * @return url
     **/
    @Nullable
    @Schema(name = "url", description = "The URL of the generated image, if `response_format` is `url` (default).", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getUrl() {
        return url;
    }

    @JsonProperty(JSON_PROPERTY_URL)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setUrl(String url) {
        this.url = url;
    }

    public Image revisedPrompt(String revisedPrompt) {
        this.revisedPrompt = revisedPrompt;
        return this;
    }

    /**
     * The prompt that was used to generate the image, if there was any revision to the prompt.
     * @return revisedPrompt
     **/
    @Nullable
    @Schema(name = "revised_prompt", description = "The prompt that was used to generate the image, if there was any revision to the prompt.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_REVISED_PROMPT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public String getRevisedPrompt() {
        return revisedPrompt;
    }

    @JsonProperty(JSON_PROPERTY_REVISED_PROMPT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setRevisedPrompt(String revisedPrompt) {
        this.revisedPrompt = revisedPrompt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Image image = (Image) o;
        return Objects.equals(this.b64Json, image.b64Json) &&
            Objects.equals(this.url, image.url) &&
            Objects.equals(this.revisedPrompt, image.revisedPrompt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(b64Json, url, revisedPrompt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Image {\n");
        sb.append("    b64Json: ").append(toIndentedString(b64Json)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    revisedPrompt: ").append(toIndentedString(revisedPrompt)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

