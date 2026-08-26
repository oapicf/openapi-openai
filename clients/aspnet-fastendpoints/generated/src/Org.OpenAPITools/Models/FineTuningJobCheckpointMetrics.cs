namespace Org.OpenAPITools.Models;


/// <summary>
/// Metrics at the step number during the fine-tuning job.
/// </summary>
public class FineTuningJobCheckpointMetrics 
{
    public decimal Step { get; set; }
    public decimal TrainLoss { get; set; }
    public decimal TrainMeanTokenAccuracy { get; set; }
    public decimal ValidLoss { get; set; }
    public decimal ValidMeanTokenAccuracy { get; set; }
    public decimal FullValidLoss { get; set; }
    public decimal FullValidMeanTokenAccuracy { get; set; }
}


