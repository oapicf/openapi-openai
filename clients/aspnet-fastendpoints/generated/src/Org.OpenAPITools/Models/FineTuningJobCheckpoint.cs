namespace Org.OpenAPITools.Models;


/// <summary>
/// The &#x60;fine_tuning.job.checkpoint&#x60; object represents a model checkpoint for a fine-tuning job that is ready to use. 
/// </summary>
public class FineTuningJobCheckpoint 
{
    public string Id { get; set; }
    public int CreatedAt { get; set; }
    public string FineTunedModelCheckpoint { get; set; }
    public int StepNumber { get; set; }
    public FineTuningJobCheckpointMetrics Metrics { get; set; }
    public string FineTuningJobId { get; set; }
    
    /// <summary>
    /// The object type, which is always \"fine_tuning.job.checkpoint\".
    /// </summary>
    /// <value>The object type, which is always \"fine_tuning.job.checkpoint\".</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum FineTuningJobCheckpointEnum for fine_tuning.job.checkpoint
        /// </summary>
        FineTuningJobCheckpointEnum = 1
    }

    public ObjectEnum Object { get; set; }
}


