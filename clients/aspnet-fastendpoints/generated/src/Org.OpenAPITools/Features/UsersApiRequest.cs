
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class DeleteUserRequest
{
    /// <summary>
    /// The ID of the user.
    /// </summary>
    [FastEndpoints.BindFrom("user_id")]
    public string UserId { get; set; }
}
public class ListUsersRequest
{
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
}
public class ModifyUserRequest
{
    /// <summary>
    /// The ID of the user.
    /// </summary>
    [FastEndpoints.BindFrom("user_id")]
    public string UserId { get; set; }
    /// <summary>
    /// The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.
    /// </summary>
    [FastEndpoints.FromBody]
    public UserRoleUpdateRequest userRoleUpdateRequest { get; set; }
}
public class RetrieveUserRequest
{
    /// <summary>
    /// The ID of the user.
    /// </summary>
    [FastEndpoints.BindFrom("user_id")]
    public string UserId { get; set; }
}


