package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.MessageDeltaContentTextObjectTextAnnotationsInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class MessageDeltaContentTextObjectText   {

    private String value;
    private List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations = new ArrayList<>();

    /**
     * Default constructor.
     */
    public MessageDeltaContentTextObjectText() {
    // JSON-B / Jackson
    }

    /**
     * Create MessageDeltaContentTextObjectText.
     *
     * @param value The data that makes up the text.
     * @param annotations annotations
     */
    public MessageDeltaContentTextObjectText(
        String value, 
        List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations
    ) {
        this.value = value;
        this.annotations = annotations;
    }



    /**
     * The data that makes up the text.
     * @return value
     */
    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    /**
     * Get annotations
     * @return annotations
     */
    public List<MessageDeltaContentTextObjectTextAnnotationsInner> getAnnotations() {
        return annotations;
    }

    public void setAnnotations(List<MessageDeltaContentTextObjectTextAnnotationsInner> annotations) {
        this.annotations = annotations;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MessageDeltaContentTextObjectText {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
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

