package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Represents a transcription response returned by model, based on the provided input.
 */
public class CreateTranscriptionResponseJson   {

    private String text;

    /**
     * Default constructor.
     */
    public CreateTranscriptionResponseJson() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateTranscriptionResponseJson.
     *
     * @param text The transcribed text.
     */
    public CreateTranscriptionResponseJson(
        String text
    ) {
        this.text = text;
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
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTranscriptionResponseJson {\n");
        
        sb.append("    text: ").append(toIndentedString(text)).append("\n");
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

