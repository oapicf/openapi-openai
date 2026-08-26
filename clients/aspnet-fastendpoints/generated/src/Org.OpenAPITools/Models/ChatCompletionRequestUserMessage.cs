namespace Org.OpenAPITools.Models;


/// <summary>
/// Messages sent by an end user, containing prompts or additional context information. 
/// </summary>
public class ChatCompletionRequestUserMessage 
{
    public ChatCompletionRequestUserMessageContent Content { get; set; }
    
    /// <summary>
    /// The role of the messages author, in this case `user`.
    /// </summary>
    /// <value>The role of the messages author, in this case `user`.</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum UserEnum for user
        /// </summary>
        UserEnum = 1
    }

    public RoleEnum Role { get; set; }
    public string Name { get; set; }
}


