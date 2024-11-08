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

/**
 * Error
 */
@JsonPropertyOrder({
  Error.JSON_PROPERTY_CODE,
  Error.JSON_PROPERTY_MESSAGE,
  Error.JSON_PROPERTY_PARAM,
  Error.JSON_PROPERTY_TYPE
})
@JsonTypeName("Error")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-11-03T11:06:40.431829781Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class Error {
    public static final String JSON_PROPERTY_CODE = "code";
    private String code;

    public static final String JSON_PROPERTY_MESSAGE = "message";
    private String message;

    public static final String JSON_PROPERTY_PARAM = "param";
    private String param;

    public static final String JSON_PROPERTY_TYPE = "type";
    private String type;

    public Error(String code, String message, String param, String type) {
        this.code = code;
        this.message = message;
        this.param = param;
        this.type = type;
    }

    public Error code(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getCode() {
        return code;
    }

    @JsonProperty(JSON_PROPERTY_CODE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setCode(String code) {
        this.code = code;
    }

    public Error message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Get message
     * @return message
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getMessage() {
        return message;
    }

    @JsonProperty(JSON_PROPERTY_MESSAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setMessage(String message) {
        this.message = message;
    }

    public Error param(String param) {
        this.param = param;
        return this;
    }

    /**
     * Get param
     * @return param
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PARAM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getParam() {
        return param;
    }

    @JsonProperty(JSON_PROPERTY_PARAM)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setParam(String param) {
        this.param = param;
    }

    public Error type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Get type
     * @return type
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getType() {
        return type;
    }

    @JsonProperty(JSON_PROPERTY_TYPE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Error error = (Error) o;
        return Objects.equals(this.code, error.code) &&
            Objects.equals(this.message, error.message) &&
            Objects.equals(this.param, error.param) &&
            Objects.equals(this.type, error.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(code, message, param, type);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Error {\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    param: ").append(toIndentedString(param)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

