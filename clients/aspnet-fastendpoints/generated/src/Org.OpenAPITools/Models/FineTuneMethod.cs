namespace Org.OpenAPITools.Models;


/// <summary>
/// The method used for fine-tuning.
/// </summary>
public class FineTuneMethod 
{
    
    /// <summary>
    /// The type of method. Is either `supervised` or `dpo`.
    /// </summary>
    /// <value>The type of method. Is either `supervised` or `dpo`.</value>
    public enum TypeEnum
    {
        
        /// <summary>
        /// Enum SupervisedEnum for supervised
        /// </summary>
        SupervisedEnum = 1,
        
        /// <summary>
        /// Enum DpoEnum for dpo
        /// </summary>
        DpoEnum = 2
    }

    public TypeEnum Type { get; set; }
    public FineTuneSupervisedMethod Supervised { get; set; }
    public FineTuneDPOMethod Dpo { get; set; }
}


