namespace Org.OpenAPITools.Models;


/// <summary>
/// The hyperparameters used for the fine-tuning job. This value will only be returned when running &#x60;supervised&#x60; jobs.
/// </summary>
public class FineTuningJobHyperparameters 
{
    public CreateFineTuningJobRequestHyperparametersBatchSize BatchSize { get; set; }
    public CreateFineTuningJobRequestHyperparametersLearningRateMultiplier LearningRateMultiplier { get; set; }
    public CreateFineTuningJobRequestHyperparametersNEpochs NEpochs { get; set; }
}


