namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ChatCompletionRequestFunctionMessage 
{
    
    /// <summary>
    /// The role of the messages author, in this case `function`.
    /// </summary>
    /// <value>The role of the messages author, in this case `function`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum FunctionEnum for function
        /// </summary>
        FunctionEnum = 1
    }

    public RoleEnum Role { get; set; }
    public string Content { get; set; }
    public string Name { get; set; }
}


