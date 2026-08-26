package org.openapitools.server.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.model.ChatCompletionFunctions;
import org.openapitools.server.model.ChatCompletionTool;
import org.openapitools.server.model.FineTuneChatRequestInputMessagesInner;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * The per-line training example of a fine-tuning input file for chat models using the supervised method.
 */
public class FineTuneChatRequestInput   {

    private List<FineTuneChatRequestInputMessagesInner> messages = new ArrayList<>();
    private List<@Valid ChatCompletionTool> tools = new ArrayList<>();
    private Boolean parallelToolCalls = true;
    private List<@Valid ChatCompletionFunctions> functions = new ArrayList<>();

    /**
     * Default constructor.
     */
    public FineTuneChatRequestInput() {
    // JSON-B / Jackson
    }

    /**
     * Create FineTuneChatRequestInput.
     *
     * @param messages messages
     * @param tools A list of tools the model may generate JSON inputs for.
     * @param parallelToolCalls Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @param functions A list of functions the model may generate JSON inputs for.
     */
    public FineTuneChatRequestInput(
        List<FineTuneChatRequestInputMessagesInner> messages, 
        List<@Valid ChatCompletionTool> tools, 
        Boolean parallelToolCalls, 
        List<@Valid ChatCompletionFunctions> functions
    ) {
        this.messages = messages;
        this.tools = tools;
        this.parallelToolCalls = parallelToolCalls;
        this.functions = functions;
    }



    /**
     * Get messages
     * @return messages
     */
    public List<FineTuneChatRequestInputMessagesInner> getMessages() {
        return messages;
    }

    public void setMessages(List<FineTuneChatRequestInputMessagesInner> messages) {
        this.messages = messages;
    }

    /**
     * A list of tools the model may generate JSON inputs for.
     * @return tools
     */
    public List<@Valid ChatCompletionTool> getTools() {
        return tools;
    }

    public void setTools(List<@Valid ChatCompletionTool> tools) {
        this.tools = tools;
    }

    /**
     * Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
     * @return parallelToolCalls
     */
    public Boolean getParallelToolCalls() {
        return parallelToolCalls;
    }

    public void setParallelToolCalls(Boolean parallelToolCalls) {
        this.parallelToolCalls = parallelToolCalls;
    }

    /**
     * A list of functions the model may generate JSON inputs for.
     * @return functions
     */
    public List<@Valid ChatCompletionFunctions> getFunctions() {
        return functions;
    }

    public void setFunctions(List<@Valid ChatCompletionFunctions> functions) {
        this.functions = functions;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FineTuneChatRequestInput {\n");
        
        sb.append("    messages: ").append(toIndentedString(messages)).append("\n");
        sb.append("    tools: ").append(toIndentedString(tools)).append("\n");
        sb.append("    parallelToolCalls: ").append(toIndentedString(parallelToolCalls)).append("\n");
        sb.append("    functions: ").append(toIndentedString(functions)).append("\n");
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

