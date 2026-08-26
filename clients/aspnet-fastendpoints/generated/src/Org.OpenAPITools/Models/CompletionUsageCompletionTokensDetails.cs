namespace Org.OpenAPITools.Models;


/// <summary>
/// Breakdown of tokens used in a completion.
/// </summary>
public class CompletionUsageCompletionTokensDetails 
{
    public int AcceptedPredictionTokens { get; set; }
    public int AudioTokens { get; set; }
    public int ReasoningTokens { get; set; }
    public int RejectedPredictionTokens { get; set; }
}


