namespace Org.OpenAPITools.Models;


/// <summary>
/// Controls for how a thread will be truncated prior to the run. Use this to control the intial context window of the run.
/// </summary>
public class TruncationObject 
{
    
    /// <summary>
    /// The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.
    /// </summary>
    /// <value>The truncation strategy to use for the thread. The default is `auto`. If set to `last_messages`, the thread will be truncated to the n most recent messages in the thread. When set to `auto`, messages in the middle of the thread will be dropped to fit the context length of the model, `max_prompt_tokens`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum AutoEnum for auto
        /// </summary>
        AutoEnum = 1,
        
        /// <summary>
        /// Enum LastMessagesEnum for last_messages
        /// </summary>
        LastMessagesEnum = 2
    }

    public TypeEnum Type { get; set; }
    public int LastMessages { get; set; }
}


