namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an individual API key in a project.
/// </summary>
public class ProjectApiKey 
{
    
    /// <summary>
    /// The object type, which is always `organization.project.api_key`
    /// </summary>
    /// <value>The object type, which is always `organization.project.api_key`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectApiKeyEnum for organization.project.api_key
        /// </summary>
        OrganizationProjectApiKeyEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string RedactedValue { get; set; }
    public string Name { get; set; }
    public int CreatedAt { get; set; }
    public string Id { get; set; }
    public ProjectApiKeyOwner Owner { get; set; }
}


