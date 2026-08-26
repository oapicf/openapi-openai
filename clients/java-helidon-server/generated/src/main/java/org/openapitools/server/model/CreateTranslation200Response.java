package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.CreateTranslationResponseJson;
import org.openapitools.server.model.CreateTranslationResponseVerboseJson;
import org.openapitools.server.model.TranscriptionSegment;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateTranslation200Response   {

    private String text;
    private String language;
    private String duration;
    private List<@Valid TranscriptionSegment> segments = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateTranslation200Response() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateTranslation200Response.
     *
     * @param text The translated text.
     * @param language The language of the output translation (always &#x60;english&#x60;).
     * @param duration The duration of the input audio.
     * @param segments Segments of the translated text and their corresponding details.
     */
    public CreateTranslation200Response(
        String text, 
        String language, 
        String duration, 
        List<@Valid TranscriptionSegment> segments
    ) {
        this.text = text;
        this.language = language;
        this.duration = duration;
        this.segments = segments;
    }



    /**
     * The translated text.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * The language of the output translation (always `english`).
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    /**
     * The duration of the input audio.
     * @return duration
     */
    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    /**
     * Segments of the translated text and their corresponding details.
     * @return segments
     */
    public List<@Valid TranscriptionSegment> getSegments() {
        return segments;
    }

    public void setSegments(List<@Valid TranscriptionSegment> segments) {
        this.segments = segments;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        return o == null ? "null" : o.toString().replace("\n", "\n    ");
    }
}

