namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents a run step delta i.e. any changed fields on a run step during streaming. 
/// </summary>
public class RunStepDeltaObject 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `thread.run.step.delta`.
    /// </summary>
    /// <value>The object type, which is always `thread.run.step.delta`.</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum ThreadRunStepDeltaEnum for thread.run.step.delta
        /// </summary>
        ThreadRunStepDeltaEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public RunStepDeltaObjectDelta Delta { get; set; }
}


