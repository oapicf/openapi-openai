namespace Org.OpenAPITools.Models;


/// <summary>
/// Details of the message creation by the run step.
/// </summary>
public class RunStepDeltaStepDetailsMessageCreationObject 
{
    
    /// <summary>
    /// Always `message_creation`.
    /// </summary>
    /// <value>Always `message_creation`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum MessageCreationEnum for message_creation
        /// </summary>
        MessageCreationEnum = 1
    }

    public TypeEnum Type { get; set; }
    public RunStepDeltaStepDetailsMessageCreationObjectMessageCreation MessageCreation { get; set; }
}


