namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class CreateFineTuningJobRequestIntegrationsInner 
{
    
    /// <summary>
    /// The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. 
    /// </summary>
    /// <value>The type of integration to enable. Currently, only \"wandb\" (Weights and Biases) is supported. </value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum WandbEnum for wandb
        /// </summary>
        WandbEnum = 1
    }

    public TypeEnum Type { get; set; }
    public CreateFineTuningJobRequestIntegrationsInnerWandb Wandb { get; set; }
}


