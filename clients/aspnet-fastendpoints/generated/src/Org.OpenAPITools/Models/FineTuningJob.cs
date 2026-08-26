namespace Org.OpenAPITools.Models;


/// <summary>
/// The &#x60;fine_tuning.job&#x60; object represents a fine-tuning job that has been created through the API. 
/// </summary>
public class FineTuningJob 
{
    public string Id { get; set; }
    public int CreatedAt { get; set; }
    public FineTuningJobError Error { get; set; }
    public string FineTunedModel { get; set; }
    public int FinishedAt { get; set; }
    public FineTuningJobHyperparameters Hyperparameters { get; set; }
    public string Model { get; set; }
    
    /// <summary>
    /// The object type, which is always \"fine_tuning.job\".
    /// </summary>
    /// <value>The object type, which is always \"fine_tuning.job\".</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum FineTuningJobEnum for fine_tuning.job
        /// </summary>
        FineTuningJobEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string OrganizationId { get; set; }
    public List<string> ResultFiles { get; set; }
    
    /// <summary>
    /// The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
    /// </summary>
    /// <value>The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum ValidatingFilesEnum for validating_files
        /// </summary>
        ValidatingFilesEnum = 1,
        
        /// <summary>
        /// Enum QueuedEnum for queued
        /// </summary>
        QueuedEnum = 2,
        
        /// <summary>
        /// Enum RunningEnum for running
        /// </summary>
        RunningEnum = 3,
        
        /// <summary>
        /// Enum SucceededEnum for succeeded
        /// </summary>
        SucceededEnum = 4,
        
        /// <summary>
        /// Enum FailedEnum for failed
        /// </summary>
        FailedEnum = 5,
        
        /// <summary>
        /// Enum CancelledEnum for cancelled
        /// </summary>
        CancelledEnum = 6
    }

    public StatusEnum Status { get; set; }
    public int TrainedTokens { get; set; }
    public string TrainingFile { get; set; }
    public string ValidationFile { get; set; }
    public List<FineTuningJobIntegrationsInner> Integrations { get; set; }
    public int Seed { get; set; }
    public int EstimatedFinish { get; set; }
    public FineTuneMethod Method { get; set; }
}


