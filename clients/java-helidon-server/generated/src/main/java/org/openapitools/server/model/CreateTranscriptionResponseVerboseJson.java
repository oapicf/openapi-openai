package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.TranscriptionSegment;
import org.openapitools.server.model.TranscriptionWord;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a verbose json transcription response returned by model, based on the provided input.
 */
public class CreateTranscriptionResponseVerboseJson   {

    private String language;
    private String duration;
    private String text;
    private List<@Valid TranscriptionWord> words = new ArrayList<>();
    private List<@Valid TranscriptionSegment> segments = new ArrayList<>();

    /**
     * Default constructor.
     */
    public CreateTranscriptionResponseVerboseJson() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateTranscriptionResponseVerboseJson.
     *
     * @param language The language of the input audio.
     * @param duration The duration of the input audio.
     * @param text The transcribed text.
     * @param words Extracted words and their corresponding timestamps.
     * @param segments Segments of the transcribed text and their corresponding details.
     */
    public CreateTranscriptionResponseVerboseJson(
        String language, 
        String duration, 
        String text, 
        List<@Valid TranscriptionWord> words, 
        List<@Valid TranscriptionSegment> segments
    ) {
        this.language = language;
        this.duration = duration;
        this.text = text;
        this.words = words;
        this.segments = segments;
    }



    /**
     * The language of the input audio.
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
     * The transcribed text.
     * @return text
     */
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    /**
     * Extracted words and their corresponding timestamps.
     * @return words
     */
    public List<@Valid TranscriptionWord> getWords() {
        return words;
    }

    public void setWords(List<@Valid TranscriptionWord> words) {
        this.words = words;
    }

    /**
     * Segments of the transcribed text and their corresponding details.
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
        sb.append("class CreateTranscriptionResponseVerboseJson {\n");
        
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
        sb.append("    words: ").append(toIndentedString(words)).append("\n");
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

