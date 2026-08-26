namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an individual project.
/// </summary>
public class Project 
{
    public string Id { get; set; }
    
    /// <summary>
    /// The object type, which is always `organization.project`
    /// </summary>
    /// <value>The object type, which is always `organization.project`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationProjectEnum for organization.project
        /// </summary>
        OrganizationProjectEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Name { get; set; }
    public int CreatedAt { get; set; }
    public int ArchivedAt { get; set; }
    
    /// <summary>
    /// `active` or `archived`
    /// </summary>
    /// <value>`active` or `archived`</value>
    public enum StatusEnum
    {
        
        /// <summary>
        /// Enum ActiveEnum for active
        /// </summary>
        ActiveEnum = 1,
        
        /// <summary>
        /// Enum ArchivedEnum for archived
        /// </summary>
        ArchivedEnum = 2
    }

    public StatusEnum Status { get; set; }
}


