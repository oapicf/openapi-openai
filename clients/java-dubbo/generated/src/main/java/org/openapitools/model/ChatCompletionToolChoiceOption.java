package org.openapitools.model;

import org.openapitools.model.AssistantsNamedToolChoiceFunction;
import org.openapitools.model.ChatCompletionNamedToolChoice;
import java.util.Objects;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonProperty;
import javax.annotation.Generated;
import java.time.*;
import java.math.*;
@Generated(value = "org.openapitools.codegen.languages.JavaDubboServerCodegen", comments = "Generator version: 7.24.0")

/**
 * Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tool and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools. Specifying a particular tool via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool.  &#x60;none&#x60; is the default when no tools are present. &#x60;auto&#x60; is the default if tools are present. 
 */
public class ChatCompletionToolChoiceOption implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   */
  @JsonProperty("type")
  private String type;

  @JsonProperty("function")
  private AssistantsNamedToolChoiceFunction function;

  /**
   * The type of the tool. Currently, only &#x60;function&#x60; is supported.
   * @return type
   */
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  /**
   * 
   * @return function
   */
  public AssistantsNamedToolChoiceFunction getFunction() {
    return function;
  }

  public void setFunction(AssistantsNamedToolChoiceFunction function) {
    this.function = function;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ChatCompletionToolChoiceOption chatCompletionToolChoiceOption = (ChatCompletionToolChoiceOption) o;
    return Objects.equals(this.type, chatCompletionToolChoiceOption.type) &&
        Objects.equals(this.function, chatCompletionToolChoiceOption.function);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, function);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ChatCompletionToolChoiceOption {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    function: ").append(toIndentedString(function)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    return o == null ? "null" : o.toString().replace("\n", "\n    ");
  }
}
