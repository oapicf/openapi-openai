
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class ArchiveProjectRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
}
public class CreateProjectRequest
{
    /// <summary>
    /// The project create request payload.
    /// </summary>
    [FastEndpoints.FromBody]
    public ProjectCreateRequest projectCreateRequest { get; set; }
}
public class CreateProjectServiceAccountRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The project service account create request payload.
    /// </summary>
    [FastEndpoints.FromBody]
    public ProjectServiceAccountCreateRequest projectServiceAccountCreateRequest { get; set; }
}
public class CreateProjectUserRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The project user create request payload.
    /// </summary>
    [FastEndpoints.FromBody]
    public ProjectUserCreateRequest projectUserCreateRequest { get; set; }
}
public class DeleteProjectApiKeyRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the API key.
    /// </summary>
    [FastEndpoints.BindFrom("key_id")]
    public string KeyId { get; set; }
}
public class DeleteProjectServiceAccountRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the service account.
    /// </summary>
    [FastEndpoints.BindFrom("service_account_id")]
    public string ServiceAccountId { get; set; }
}
public class DeleteProjectUserRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the user.
    /// </summary>
    [FastEndpoints.BindFrom("user_id")]
    public string UserId { get; set; }
}
public class ListProjectApiKeysRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
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
public class ListProjectRateLimitsRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. The default is 100. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
}
public class ListProjectServiceAccountsRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
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
public class ListProjectUsersRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
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
public class ListProjectsRequest
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
    /// <summary>
    /// If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include_archived")]
    public bool? IncludeArchived { get; set; }
}
public class ModifyProjectRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The project update request payload.
    /// </summary>
    [FastEndpoints.FromBody]
    public ProjectUpdateRequest projectUpdateRequest { get; set; }
}
public class ModifyProjectUserRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the user.
    /// </summary>
    [FastEndpoints.BindFrom("user_id")]
    public string UserId { get; set; }
    /// <summary>
    /// The project user update request payload.
    /// </summary>
    [FastEndpoints.FromBody]
    public ProjectUserUpdateRequest projectUserUpdateRequest { get; set; }
}
public class RetrieveProjectRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
}
public class RetrieveProjectApiKeyRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the API key.
    /// </summary>
    [FastEndpoints.BindFrom("key_id")]
    public string KeyId { get; set; }
}
public class RetrieveProjectServiceAccountRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the service account.
    /// </summary>
    [FastEndpoints.BindFrom("service_account_id")]
    public string ServiceAccountId { get; set; }
}
public class RetrieveProjectUserRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the user.
    /// </summary>
    [FastEndpoints.BindFrom("user_id")]
    public string UserId { get; set; }
}
public class UpdateProjectRateLimitsRequest
{
    /// <summary>
    /// The ID of the project.
    /// </summary>
    [FastEndpoints.BindFrom("project_id")]
    public string ProjectId { get; set; }
    /// <summary>
    /// The ID of the rate limit.
    /// </summary>
    [FastEndpoints.BindFrom("rate_limit_id")]
    public string RateLimitId { get; set; }
    /// <summary>
    /// The project rate limit update request payload.
    /// </summary>
    [FastEndpoints.FromBody]
    public ProjectRateLimitUpdateRequest projectRateLimitUpdateRequest { get; set; }
}


