namespace Org.OpenAPITools.Models;


/// <summary>
/// Controls which (if any) tool is called by the model. &#x60;none&#x60; means the model will not call any tools and instead generates a message. &#x60;auto&#x60; is the default value and means the model can pick between generating a message or calling one or more tools. &#x60;required&#x60; means the model must call one or more tools before responding to the user. Specifying a particular tool like &#x60;{\&quot;type\&quot;: \&quot;file_search\&quot;}&#x60; or &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that tool. 
/// </summary>
public class AssistantsApiToolChoiceOption 
{
    
    /// <summary>
    /// The type of the tool. If type is `function`, the function name must be set
    /// </summary>
    /// <value>The type of the tool. If type is `function`, the function name must be set</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1,
        
        /// <summary>
        /// Enum CodeInterpreterEnum for code_interpreter
        /// </summary>
        CodeInterpreterEnum = 2,
        
        /// <summary>
        /// Enum FileSearchEnum for file_search
        /// </summary>
        FileSearchEnum = 3
    }

    public TypeEnum Type { get; set; }
    public AssistantsNamedToolChoiceFunction Function { get; set; }
}


