package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ChatCompletionTokenLogprob;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Log probability information for the choice.
 */
public class CreateChatCompletionResponseChoicesInnerLogprobs   {

    private List<@Valid ChatCompletionTokenLogprob> content;
    private List<@Valid ChatCompletionTokenLogprob> refusal;

    /**
     * Default constructor.
     */
    public CreateChatCompletionResponseChoicesInnerLogprobs() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatCompletionResponseChoicesInnerLogprobs.
     *
     * @param content A list of message content tokens with log probability information.
     * @param refusal A list of message refusal tokens with log probability information.
     */
    public CreateChatCompletionResponseChoicesInnerLogprobs(
        List<@Valid ChatCompletionTokenLogprob> content, 
        List<@Valid ChatCompletionTokenLogprob> refusal
    ) {
        this.content = content;
        this.refusal = refusal;
    }



    /**
     * A list of message content tokens with log probability information.
     * @return content
     */
    public List<@Valid ChatCompletionTokenLogprob> getContent() {
        return content;
    }

    public void setContent(List<@Valid ChatCompletionTokenLogprob> content) {
        this.content = content;
    }

    /**
     * A list of message refusal tokens with log probability information.
     * @return refusal
     */
    public List<@Valid ChatCompletionTokenLogprob> getRefusal() {
        return refusal;
    }

    public void setRefusal(List<@Valid ChatCompletionTokenLogprob> refusal) {
        this.refusal = refusal;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatCompletionResponseChoicesInnerLogprobs {\n");
        
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    refusal: ").append(toIndentedString(refusal)).append("\n");
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

