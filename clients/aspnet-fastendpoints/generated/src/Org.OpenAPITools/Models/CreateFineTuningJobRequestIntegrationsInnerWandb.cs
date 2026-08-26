namespace Org.OpenAPITools.Models;


/// <summary>
/// The settings for your integration with Weights and Biases. This payload specifies the project that metrics will be sent to. Optionally, you can set an explicit display name for your run, add tags to your run, and set a default entity (team, username, etc) to be associated with your run. 
/// </summary>
public class CreateFineTuningJobRequestIntegrationsInnerWandb 
{
    public string Project { get; set; }
    public string Name { get; set; }
    public string Entity { get; set; }
    public List<string> Tags { get; set; }
}


