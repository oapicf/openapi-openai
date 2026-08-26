namespace Org.OpenAPITools.Models;


/// <summary>
/// The hyperparameters used for the fine-tuning job. This value is now deprecated in favor of &#x60;method&#x60;, and should be passed in under the &#x60;method&#x60; parameter. 
/// </summary>
public class CreateFineTuningJobRequestHyperparameters 
{
    public CreateFineTuningJobRequestHyperparametersBatchSize BatchSize { get; set; }
    public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier LearningRateMultiplier { get; set; }
    public CreateFineTuningJobRequestHyperparametersNEpochs NEpochs { get; set; }
}


