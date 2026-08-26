namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateFineTuningJobRequest 
{
    public CreateFineTuningJobRequestModel Model { get; set; }
    public string TrainingFile { get; set; }
    public CreateFineTuningJobRequestHyperparameters Hyperparameters { get; set; }
    public string Suffix { get; set; }
    public string ValidationFile { get; set; }
    public List<CreateFineTuningJobRequestIntegrationsInner> Integrations { get; set; }
    public int Seed { get; set; }
    public FineTuneMethod Method { get; set; }
}


