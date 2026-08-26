package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.ChatCompletionResponseMessage;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;



public class CreateChatCompletionFunctionResponseChoicesInner   {


    /**
    * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
    */
    public enum FinishReasonEnum {
        STOP("stop"),
        LENGTH("length"),
        FUNCTION_CALL("function_call"),
        CONTENT_FILTER("content_filter");

        private String value;

        FinishReasonEnum(String value) {
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
        public static FinishReasonEnum fromValue(String text) {
            for (FinishReasonEnum b : FinishReasonEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + text + "'");
        }
    }


    private FinishReasonEnum finishReason;
    private Integer index;
    private ChatCompletionResponseMessage message;

    /**
     * Default constructor.
     */
    public CreateChatCompletionFunctionResponseChoicesInner() {
    // JSON-B / Jackson
    }

    /**
     * Create CreateChatCompletionFunctionResponseChoicesInner.
     *
     * @param finishReason The reason the model stopped generating tokens. This will be &#x60;stop&#x60; if the model hit a natural stop point or a provided stop sequence, &#x60;length&#x60; if the maximum number of tokens specified in the request was reached, &#x60;content_filter&#x60; if content was omitted due to a flag from our content filters, or &#x60;function_call&#x60; if the model called a function. 
     * @param index The index of the choice in the list of choices.
     * @param message message
     */
    public CreateChatCompletionFunctionResponseChoicesInner(
        FinishReasonEnum finishReason, 
        Integer index, 
        ChatCompletionResponseMessage message
    ) {
        this.finishReason = finishReason;
        this.index = index;
        this.message = message;
    }



    /**
     * The reason the model stopped generating tokens. This will be `stop` if the model hit a natural stop point or a provided stop sequence, `length` if the maximum number of tokens specified in the request was reached, `content_filter` if content was omitted due to a flag from our content filters, or `function_call` if the model called a function. 
     * @return finishReason
     */
    public FinishReasonEnum getFinishReason() {
        return finishReason;
    }

    public void setFinishReason(FinishReasonEnum finishReason) {
        this.finishReason = finishReason;
    }

    /**
     * The index of the choice in the list of choices.
     * @return index
     */
    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    /**
     * Get message
     * @return message
     */
    public ChatCompletionResponseMessage getMessage() {
        return message;
    }

    public void setMessage(ChatCompletionResponseMessage message) {
        this.message = message;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateChatCompletionFunctionResponseChoicesInner {\n");
        
        sb.append("    finishReason: ").append(toIndentedString(finishReason)).append("\n");
        sb.append("    index: ").append(toIndentedString(index)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
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

