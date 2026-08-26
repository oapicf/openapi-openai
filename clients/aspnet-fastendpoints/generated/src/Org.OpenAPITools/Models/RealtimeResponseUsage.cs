namespace Org.OpenAPITools.Models;


/// <summary>
/// Usage statistics for the Response, this will correspond to billing. A  Realtime API session will maintain a conversation context and append new  Items to the Conversation, thus output from previous turns (text and  audio tokens) will become the input for later turns. 
/// </summary>
public class RealtimeResponseUsage 
{
    public int TotalTokens { get; set; }
    public int InputTokens { get; set; }
    public int OutputTokens { get; set; }
    public RealtimeResponseUsageInputTokenDetails InputTokenDetails { get; set; }
    public RealtimeResponseUsageOutputTokenDetails OutputTokenDetails { get; set; }
}


