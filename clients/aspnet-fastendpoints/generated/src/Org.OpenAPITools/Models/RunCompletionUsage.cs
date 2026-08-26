namespace Org.OpenAPITools.Models;


/// <summary>
/// Usage statistics related to the run. This value will be &#x60;null&#x60; if the run is not in a terminal state (i.e. &#x60;in_progress&#x60;, &#x60;queued&#x60;, etc.).
/// </summary>
public class RunCompletionUsage 
{
    public int CompletionTokens { get; set; }
    public int PromptTokens { get; set; }
    public int TotalTokens { get; set; }
}


