namespace Org.OpenAPITools.Models;


/// <summary>
/// Log probability information for the choice.
/// </summary>
public class CreateChatCompletionResponseChoicesInnerLogprobs 
{
    public List<ChatCompletionTokenLogprob> Content { get; set; }
    public List<ChatCompletionTokenLogprob> Refusal { get; set; }
}


