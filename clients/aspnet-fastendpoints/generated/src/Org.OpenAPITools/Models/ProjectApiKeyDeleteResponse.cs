namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectApiKeyDeleteResponse 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectApiKeyDeletedEnum for organization.project.api_key.deleted
        /// </summary>
        OrganizationProjectApiKeyDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public bool Deleted { get; set; }
}


