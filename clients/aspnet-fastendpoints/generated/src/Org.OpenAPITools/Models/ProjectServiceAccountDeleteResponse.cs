namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectServiceAccountDeleteResponse 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectServiceAccountDeletedEnum for organization.project.service_account.deleted
        /// </summary>
        OrganizationProjectServiceAccountDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public bool Deleted { get; set; }
}


