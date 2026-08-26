namespace Org.OpenAPITools.Models;


/// <summary>
/// Usage statistics related to the run step. This value will be &#x60;null&#x60; while the run step&#39;s status is &#x60;in_progress&#x60;.
/// </summary>
public class RunStepCompletionUsage 
{
    public int CompletionTokens { get; set; }
    public int PromptTokens { get; set; }
    public int TotalTokens { get; set; }
}


