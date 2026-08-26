namespace Org.OpenAPITools.Models;


/// <summary>
/// The hyperparameters used for the fine-tuning job.
/// </summary>
public class FineTuneSupervisedMethodHyperparameters 
{
    public FineTuneDPOMethodHyperparametersBatchSize BatchSize { get; set; }
    public FineTuneDPOMethodHyperparametersLearningRateMultiplier LearningRateMultiplier { get; set; }
    public FineTuneDPOMethodHyperparametersNEpochs NEpochs { get; set; }
}


