namespace Org.OpenAPITools.Models;


/// <summary>
/// For fine-tuning jobs that have &#x60;failed&#x60;, this will contain more information on the cause of the failure.
/// </summary>
public class FineTuningJobError 
{
    public string Code { get; set; }
    public string Message { get; set; }
    public string Param { get; set; }
}


