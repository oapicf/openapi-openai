namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionMessageToolCallChunk 
{
    public int Index { get; set; }
    public string Id { get; set; }
    
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
    public ChatCompletionMessageToolCallChunkFunction Function { get; set; }
}


