namespace Org.OpenAPITools.Models;


/// <summary>
/// Fine-tuning job event object
/// </summary>
public class FineTuningJobEvent 
{
    
    /// <summary>
    /// The object type, which is always \"fine_tuning.job.event\".
    /// </summary>
    /// <value>The object type, which is always \"fine_tuning.job.event\".</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum FineTuningJobEventEnum for fine_tuning.job.event
        /// </summary>
        FineTuningJobEventEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public int CreatedAt { get; set; }
    
    /// <summary>
    /// The log level of the event.
    /// </summary>
    /// <value>The log level of the event.</value>
    public enum LevelEnum
    {
        
        /// <summary>
        /// Enum InfoEnum for info
        /// </summary>
        InfoEnum = 1,
        
        /// <summary>
        /// Enum WarnEnum for warn
        /// </summary>
        WarnEnum = 2,
        
        /// <summary>
        /// Enum ErrorEnum for error
        /// </summary>
        ErrorEnum = 3
    }

    public LevelEnum Level { get; set; }
    public string Message { get; set; }
    
    /// <summary>
    /// The type of event.
    /// </summary>
    /// <value>The type of event.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum MessageEnum for message
        /// </summary>
        MessageEnum = 1,
        
        /// <summary>
        /// Enum MetricsEnum for metrics
        /// </summary>
        MetricsEnum = 2
    }

    public TypeEnum Type { get; set; }
    public Object Data { get; set; }
}


