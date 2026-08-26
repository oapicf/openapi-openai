namespace Org.OpenAPITools.Models;


/// <summary>
/// 
/// </summary>
public class ProjectUserDeleteResponse 
{
    
    /// <summary>
    /// Gets or Sets Object
    /// </summary>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectUserDeletedEnum for organization.project.user.deleted
        /// </summary>
        OrganizationProjectUserDeletedEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public bool Deleted { get; set; }
}


