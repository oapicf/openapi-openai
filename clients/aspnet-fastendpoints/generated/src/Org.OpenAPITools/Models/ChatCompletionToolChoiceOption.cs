namespace Org.OpenAPITools.Models;


/// <summary>
/// Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tool and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools. Specifying a particular tool via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool.  &#x60;none&#x60; is the default when no tools are present. &#x60;auto&#x60; is the default if tools are present. 
/// </summary>
public class ChatCompletionToolChoiceOption 
{
    
    /// <summary>
    /// The type of the tool. Currently, only `function` is supported.
    /// </summary>
    /// <value>The type of the tool. Currently, only `function` is supported.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1
    }

    public TypeEnum Type { get; set; }
    public AssistantsNamedToolChoiceFunction Function { get; set; }
}


