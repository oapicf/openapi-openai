namespace Org.OpenAPITools.Models;


/// <summary>
/// Usage statistics for the completion request.
/// </summary>
public class CompletionUsage 
{
    public int CompletionTokens { get; set; }
    public int PromptTokens { get; set; }
    public int TotalTokens { get; set; }
    public CompletionUsageCompletionTokensDetails CompletionTokensDetails { get; set; }
    public CompletionUsagePromptTokensDetails PromptTokensDetails { get; set; }
}


