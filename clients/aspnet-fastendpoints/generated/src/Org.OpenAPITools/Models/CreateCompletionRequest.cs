namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateCompletionRequest 
{
    public CreateCompletionRequestModel Model { get; set; }
    public CreateCompletionRequestPrompt Prompt { get; set; }
    public int BestOf { get; set; } = 1;
    public bool Echo { get; set; } = false;
    public decimal FrequencyPenalty { get; set; } = 0M;
    public Dictionary<string, int> LogitBias { get; set; }
    public int Logprobs { get; set; }
    public int MaxTokens { get; set; } = 16;
    public int N { get; set; } = 1;
    public decimal PresencePenalty { get; set; } = 0M;
    public long Seed { get; set; }
    public CreateCompletionRequestStop Stop { get; set; }
    public bool Stream { get; set; } = false;
    public ChatCompletionStreamOptions StreamOptions { get; set; }
    public string Suffix { get; set; }
    public decimal Temperature { get; set; } = 1M;
    public decimal TopP { get; set; } = 1M;
    public string User { get; set; }
}


