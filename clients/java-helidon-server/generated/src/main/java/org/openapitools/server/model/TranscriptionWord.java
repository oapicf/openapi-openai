package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class TranscriptionWord   {

    private String word;
    private Float start;
    private Float end;

    /**
     * Default constructor.
     */
    public TranscriptionWord() {
    // JSON-B / Jackson
    }

    /**
     * Create TranscriptionWord.
     *
     * @param word The text content of the word.
     * @param start Start time of the word in seconds.
     * @param end End time of the word in seconds.
     */
    public TranscriptionWord(
        String word, 
        Float start, 
        Float end
    ) {
        this.word = word;
        this.start = start;
        this.end = end;
    }



    /**
     * The text content of the word.
     * @return word
     */
    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    /**
     * Start time of the word in seconds.
     * @return start
     */
    public Float getStart() {
        return start;
    }

    public void setStart(Float start) {
        this.start = start;
    }

    /**
     * End time of the word in seconds.
     * @return end
     */
    public Float getEnd() {
        return end;
    }

    public void setEnd(Float end) {
        this.end = end;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TranscriptionWord {\n");
        
        sb.append("    word: ").append(toIndentedString(word)).append("\n");
        sb.append("    start: ").append(toIndentedString(start)).append("\n");
        sb.append("    end: ").append(toIndentedString(end)).append("\n");
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

