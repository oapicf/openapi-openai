package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateTranslationResponseJson   {

    private String text;

    /**
     * Default constructor.
     */
    public CreateTranslationResponseJson() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateTranslationResponseJson.
     *
     * @param text text
     */
    public CreateTranslationResponseJson(
        String text
    ) {
        this.text = text;
    }



    /**
     * Get text
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
        sb.append("class CreateTranslationResponseJson {\n");
        
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

