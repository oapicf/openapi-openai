namespace Org.OpenAPITools.Models;


/// <summary>
/// The per-line training example of a fine-tuning input file for completions models
/// </summary>
public class FineTuneCompletionRequestInput 
{
    public string Prompt { get; set; }
    public string Completion { get; set; }
}


