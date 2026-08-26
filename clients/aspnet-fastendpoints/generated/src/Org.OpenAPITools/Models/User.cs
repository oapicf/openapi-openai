namespace Org.OpenAPITools.Models;


/// <summary>
/// Represents an individual &#x60;user&#x60; within an organization.
/// </summary>
public class User 
{
    
    /// <summary>
    /// The object type, which is always `organization.user`
    /// </summary>
    /// <value>The object type, which is always `organization.user`</value>
    public enum ObjectEnum
    {
        
        /// <summary>
        /// Enum OrganizationUserEnum for organization.user
        /// </summary>
        OrganizationUserEnum = 1
    }

    public ObjectEnum Object { get; set; }
    public string Id { get; set; }
    public string Name { get; set; }
    public string Email { get; set; }
    
    /// <summary>
    /// `owner` or `reader`
    /// </summary>
    /// <value>`owner` or `reader`</value>
    public enum RoleEnum
    {
        
        /// <summary>
        /// Enum OwnerEnum for owner
        /// </summary>
        OwnerEnum = 1,
        
        /// <summary>
        /// Enum ReaderEnum for reader
        /// </summary>
        ReaderEnum = 2
    }

    public RoleEnum Role { get; set; }
    public int AddedAt { get; set; }
}


