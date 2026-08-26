namespace Org.OpenAPITools.Models;


/// <summary>
/// Details on why the run is incomplete. Will be &#x60;null&#x60; if the run is not incomplete.
/// </summary>
public class RunObjectIncompleteDetails 
{
    
    /// <summary>
    /// The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.
    /// </summary>
    /// <value>The reason why the run is incomplete. This will point to which specific token limit was reached over the course of the run.</value>
    public enum ReasonEnum
    {
        
        /// <summary>
        /// Enum MaxCompletionTokensEnum for max_completion_tokens
        /// </summary>
        MaxCompletionTokensEnum = 1,
        
        /// <summary>
        /// Enum MaxPromptTokensEnum for max_prompt_tokens
        /// </summary>
        MaxPromptTokensEnum = 2
    }

    public ReasonEnum Reason { get; set; }
}


