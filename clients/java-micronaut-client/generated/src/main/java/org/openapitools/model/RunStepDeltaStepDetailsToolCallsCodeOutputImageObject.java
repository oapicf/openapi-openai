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
import org.openapitools.model.RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * RunStepDeltaStepDetailsToolCallsCodeOutputImageObject
 */
@JsonPropertyOrder({
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.JSON_PROPERTY_INDEX,
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.JSON_PROPERTY_TYPE,
  RunStepDeltaStepDetailsToolCallsCodeOutputImageObject.JSON_PROPERTY_IMAGE
})
@JsonTypeName("RunStepDeltaStepDetailsToolCallsCodeOutputImageObject")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-04-14T13:37:52.123317469Z[Etc/UTC]", comments = "Generator version: 7.4.0")
@Introspected
public class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {
    public static final String JSON_PROPERTY_INDEX = "index";
    private Integer index;

    /**
     * Always &#x60;image&#x60;.
     */
    public enum TypeEnum {
        IMAGE("image");

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            for (TypeEnum b : TypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }
    }
    public static final String JSON_PROPERTY_TYPE = "type";
    private TypeEnum type;

    public static final String JSON_PROPERTY_IMAGE = "image";
    private RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image;

    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject(Integer index, TypeEnum type) {
        this.index = index;
        this.type = type;
    }

    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject index(Integer index) {
        this.index = index;
        return this;
    }

    /**
     * The index of the output in the outputs array.
     * @return index
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public Integer getIndex() {
        return index;
    }

    @JsonProperty(JSON_PROPERTY_INDEX)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setIndex(Integer index) {
        this.index = index;
    }

    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject type(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * Always &#x60;image&#x60;.
     * @return type
     **/
    @NotNull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public TypeEnum getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(TypeEnum type) {
        this.type = type;
    }

    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObject image(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
        this.image = image;
        return this;
    }

    /**
     * Get image
     * @return image
     **/
    @Valid
    @Nullable
    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage getImage() {
        return image;
    }

    @JsonProperty(JSON_PROPERTY_IMAGE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setImage(RunStepDeltaStepDetailsToolCallsCodeOutputImageObjectImage image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunStepDeltaStepDetailsToolCallsCodeOutputImageObject runStepDeltaStepDetailsToolCallsCodeOutputImageObject = (RunStepDeltaStepDetailsToolCallsCodeOutputImageObject) o;
        return Objects.equals(this.index, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.index) &&
            Objects.equals(this.type, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.type) &&
            Objects.equals(this.image, runStepDeltaStepDetailsToolCallsCodeOutputImageObject.image);
    }

    @Override
    public int hashCode() {
        return Objects.hash(index, type, image);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunStepDeltaStepDetailsToolCallsCodeOutputImageObject {\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    image: ").append(toIndentedString(image)).append("\n");
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

