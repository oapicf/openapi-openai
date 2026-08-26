namespace Org.OpenAPITools.Models;


/// <summary>
/// An optional field that will only be present when you set &#x60;stream_options: {\&quot;include_usage\&quot;: true}&#x60; in your request. When present, it contains a null value except for the last chunk which contains the token usage statistics for the entire request. 
/// </summary>
public class CreateChatCompletionStreamResponseUsage 
{
    public int CompletionTokens { get; set; }
    public int PromptTokens { get; set; }
    public int TotalTokens { get; set; }
}


