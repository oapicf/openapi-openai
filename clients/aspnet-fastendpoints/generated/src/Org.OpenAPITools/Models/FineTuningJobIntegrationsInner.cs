namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class FineTuningJobIntegrationsInner 
{
    
    /// <summary>
    /// The type of the integration being enabled for the fine-tuning job
    /// </summary>
    /// <value>The type of the integration being enabled for the fine-tuning job</value>
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


