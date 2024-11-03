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
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.CreateTranslationResponseJson;
import org.openapitools.model.CreateTranslationResponseVerboseJson;
import org.openapitools.model.TranscriptionSegment;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * CreateTranslation200Response
 */
@JsonPropertyOrder({
  CreateTranslation200Response.JSON_PROPERTY_TEXT,
  CreateTranslation200Response.JSON_PROPERTY_LANGUAGE,
  CreateTranslation200Response.JSON_PROPERTY_DURATION,
  CreateTranslation200Response.JSON_PROPERTY_SEGMENTS
})
@JsonTypeName("createTranslation_200_response")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-11-03T11:06:54.019288922Z[Etc/UTC]", comments = "Generator version: 7.9.0")
@Introspected
public class CreateTranslation200Response {
    public static final String JSON_PROPERTY_TEXT = "text";
    private String text;

    public static final String JSON_PROPERTY_LANGUAGE = "language";
    private String language;

    public static final String JSON_PROPERTY_DURATION = "duration";
    private String duration;

    public static final String JSON_PROPERTY_SEGMENTS = "segments";
    private List<@Valid TranscriptionSegment> segments = null;

    public CreateTranslation200Response(String text, String language, String duration) {
        this.text = text;
        this.language = language;
        this.duration = duration;
    }

    public CreateTranslation200Response text(String text) {
        this.text = text;
        return this;
    }

    /**
     * The translated text.
     * @return text
     */
    @NotNull
    @Schema(name = "text", description = "The translated text.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getText() {
        return text;
    }

    @JsonProperty(JSON_PROPERTY_TEXT)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setText(String text) {
        this.text = text;
    }

    public CreateTranslation200Response language(String language) {
        this.language = language;
        return this;
    }

    /**
     * The language of the output translation (always &#x60;english&#x60;).
     * @return language
     */
    @NotNull
    @Schema(name = "language", description = "The language of the output translation (always `english`).", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getLanguage() {
        return language;
    }

    @JsonProperty(JSON_PROPERTY_LANGUAGE)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setLanguage(String language) {
        this.language = language;
    }

    public CreateTranslation200Response duration(String duration) {
        this.duration = duration;
        return this;
    }

    /**
     * The duration of the input audio.
     * @return duration
     */
    @NotNull
    @Schema(name = "duration", description = "The duration of the input audio.", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getDuration() {
        return duration;
    }

    @JsonProperty(JSON_PROPERTY_DURATION)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setDuration(String duration) {
        this.duration = duration;
    }

    public CreateTranslation200Response segments(List<@Valid TranscriptionSegment> segments) {
        this.segments = segments;
        return this;
    }

    public CreateTranslation200Response addSegmentsItem(TranscriptionSegment segmentsItem) {
        if (this.segments == null) {
            this.segments = new ArrayList<>();
        }
        this.segments.add(segmentsItem);
        return this;
    }

    /**
     * Segments of the translated text and their corresponding details.
     * @return segments
     */
    @Nullable
    @Schema(name = "segments", description = "Segments of the translated text and their corresponding details.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_SEGMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid TranscriptionSegment> getSegments() {
        return segments;
    }

    @JsonProperty(JSON_PROPERTY_SEGMENTS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setSegments(List<@Valid TranscriptionSegment> segments) {
        this.segments = segments;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateTranslation200Response createTranslation200Response = (CreateTranslation200Response) o;
        return Objects.equals(this.text, createTranslation200Response.text) &&
            Objects.equals(this.language, createTranslation200Response.language) &&
            Objects.equals(this.duration, createTranslation200Response.duration) &&
            Objects.equals(this.segments, createTranslation200Response.segments);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, language, duration, segments);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTranslation200Response {\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    segments: ").append(toIndentedString(segments)).append("\n");
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

