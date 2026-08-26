namespace Org.OpenAPITools.Models;


/// <summary>
/// Developer-provided instructions that the model should follow, regardless of messages sent by the user. With o1 models and newer, &#x60;developer&#x60; messages replace the previous &#x60;system&#x60; messages. 
/// </summary>
public class ChatCompletionRequestDeveloperMessage 
{
    public ChatCompletionRequestDeveloperMessageContent Content { get; set; }
    
    /// <summary>
    /// The role of the messages author, in this case `developer`.
    /// </summary>
    /// <value>The role of the messages author, in this case `developer`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum DeveloperEnum for developer
        /// </summary>
        DeveloperEnum = 1
    }

    public RoleEnum Role { get; set; }
    public string Name { get; set; }
}


