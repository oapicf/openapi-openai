namespace Org.OpenAPITools.Models;


/// <summary>
/// The per-line training example of a fine-tuning input file for chat models using the dpo method.
/// </summary>
public class FineTunePreferenceRequestInput 
{
    public FineTunePreferenceRequestInputInput Input { get; set; }
    public List<FineTunePreferenceRequestInputPreferredCompletionInner> PreferredCompletion { get; set; }
    public List<FineTunePreferenceRequestInputPreferredCompletionInner> NonPreferredCompletion { get; set; }
}


