namespace Org.OpenAPITools.Models;


/// <summary>
/// Specifies a tool the model should use. Use to force the model to call a specific function.
/// </summary>
public class ChatCompletionNamedToolChoice 
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


