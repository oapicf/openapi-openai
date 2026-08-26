using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Archives a project in the organization. Archived projects cannot be used or updated.
/// </summary>

public class ArchiveProjectEndpoint : FastEndpoints.Endpoint<ArchiveProjectRequest, Project>
{
    public override void Configure()
    {
        Post("/v1/organization/projects/{project_id}/archive");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Archives a project in the organization. Archived projects cannot be used or updated.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.Responses[200] = "Project archived successfully.";
        });
    }

    public override async Task HandleAsync(ArchiveProjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
/// </summary>

public class CreateProjectEndpoint : FastEndpoints.Endpoint<CreateProjectRequest, Project>
{
    public override void Configure()
    {
        Post("/v1/organization/projects");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Create a new project in the organization. Projects can be created and archived, but cannot be deleted.";
            s.RequestParam(r => r.projectCreateRequest, "The project create request payload.");
            s.Responses[200] = "Project created successfully.";
        });
    }

    public override async Task HandleAsync(CreateProjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Creates a new service account in the project. This also returns an unredacted API key for the service account.
/// </summary>

public class CreateProjectServiceAccountEndpoint : FastEndpoints.Endpoint<CreateProjectServiceAccountRequest, ProjectServiceAccountCreateResponse>
{
    public override void Configure()
    {
        Post("/v1/organization/projects/{project_id}/service_accounts");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Creates a new service account in the project. This also returns an unredacted API key for the service account.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.projectServiceAccountCreateRequest, "The project service account create request payload.");
            s.Responses[200] = "Project service account created successfully.";
            s.Responses[400] = "Error response when project is archived.";
        });
    }

    public override async Task HandleAsync(CreateProjectServiceAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Adds a user to the project. Users must already be members of the organization to be added to a project.
/// </summary>

public class CreateProjectUserEndpoint : FastEndpoints.Endpoint<CreateProjectUserRequest, ProjectUser>
{
    public override void Configure()
    {
        Post("/v1/organization/projects/{project_id}/users");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Adds a user to the project. Users must already be members of the organization to be added to a project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.projectUserCreateRequest, "The project user create request payload.");
            s.Responses[200] = "User added to project successfully.";
            s.Responses[400] = "Error response for various conditions.";
        });
    }

    public override async Task HandleAsync(CreateProjectUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Deletes an API key from the project.
/// </summary>

public class DeleteProjectApiKeyEndpoint : FastEndpoints.Endpoint<DeleteProjectApiKeyRequest, ProjectApiKeyDeleteResponse>
{
    public override void Configure()
    {
        Delete("/v1/organization/projects/{project_id}/api_keys/{key_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Deletes an API key from the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.KeyId, "The ID of the API key.");
            s.Responses[200] = "Project API key deleted successfully.";
            s.Responses[400] = "Error response for various conditions.";
        });
    }

    public override async Task HandleAsync(DeleteProjectApiKeyRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Deletes a service account from the project.
/// </summary>

public class DeleteProjectServiceAccountEndpoint : FastEndpoints.Endpoint<DeleteProjectServiceAccountRequest, ProjectServiceAccountDeleteResponse>
{
    public override void Configure()
    {
        Delete("/v1/organization/projects/{project_id}/service_accounts/{service_account_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Deletes a service account from the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.ServiceAccountId, "The ID of the service account.");
            s.Responses[200] = "Project service account deleted successfully.";
        });
    }

    public override async Task HandleAsync(DeleteProjectServiceAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Deletes a user from the project.
/// </summary>

public class DeleteProjectUserEndpoint : FastEndpoints.Endpoint<DeleteProjectUserRequest, ProjectUserDeleteResponse>
{
    public override void Configure()
    {
        Delete("/v1/organization/projects/{project_id}/users/{user_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Deletes a user from the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.UserId, "The ID of the user.");
            s.Responses[200] = "Project user deleted successfully.";
            s.Responses[400] = "Error response for various conditions.";
        });
    }

    public override async Task HandleAsync(DeleteProjectUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of API keys in the project.
/// </summary>

public class ListProjectApiKeysEndpoint : FastEndpoints.Endpoint<ListProjectApiKeysRequest, ProjectApiKeyListResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}/api_keys");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Returns a list of API keys in the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.Responses[200] = "Project API keys listed successfully.";
        });
    }

    public override async Task HandleAsync(ListProjectApiKeysRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns the rate limits per model for a project.
/// </summary>

public class ListProjectRateLimitsEndpoint : FastEndpoints.Endpoint<ListProjectRateLimitsRequest, ProjectRateLimitListResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}/rate_limits");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Returns the rate limits per model for a project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. The default is 100. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, beginning with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.Responses[200] = "Project rate limits listed successfully.";
        });
    }

    public override async Task HandleAsync(ListProjectRateLimitsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of service accounts in the project.
/// </summary>

public class ListProjectServiceAccountsEndpoint : FastEndpoints.Endpoint<ListProjectServiceAccountsRequest, ProjectServiceAccountListResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}/service_accounts");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Returns a list of service accounts in the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.Responses[200] = "Project service accounts listed successfully.";
            s.Responses[400] = "Error response when project is archived.";
        });
    }

    public override async Task HandleAsync(ListProjectServiceAccountsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of users in the project.
/// </summary>

public class ListProjectUsersEndpoint : FastEndpoints.Endpoint<ListProjectUsersRequest, ProjectUserListResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}/users");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Returns a list of users in the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.Responses[200] = "Project users listed successfully.";
            s.Responses[400] = "Error response when project is archived.";
        });
    }

    public override async Task HandleAsync(ListProjectUsersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of projects.
/// </summary>

public class ListProjectsEndpoint : FastEndpoints.Endpoint<ListProjectsRequest, ProjectListResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/projects");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Returns a list of projects.";
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.IncludeArchived, "If &#x60;true&#x60; returns all projects including those that have been &#x60;archived&#x60;. Archived projects are not included by default.");
            s.Responses[200] = "Projects listed successfully.";
        });
    }

    public override async Task HandleAsync(ListProjectsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies a project in the organization.
/// </summary>

public class ModifyProjectEndpoint : FastEndpoints.Endpoint<ModifyProjectRequest, Project>
{
    public override void Configure()
    {
        Post("/v1/organization/projects/{project_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Modifies a project in the organization.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.projectUpdateRequest, "The project update request payload.");
            s.Responses[200] = "Project updated successfully.";
            s.Responses[400] = "Error response when updating the default project.";
        });
    }

    public override async Task HandleAsync(ModifyProjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies a user&#39;s role in the project.
/// </summary>

public class ModifyProjectUserEndpoint : FastEndpoints.Endpoint<ModifyProjectUserRequest, ProjectUser>
{
    public override void Configure()
    {
        Post("/v1/organization/projects/{project_id}/users/{user_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Modifies a user&#39;s role in the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.UserId, "The ID of the user.");
            s.RequestParam(r => r.projectUserUpdateRequest, "The project user update request payload.");
            s.Responses[200] = "Project user&#39;s role updated successfully.";
            s.Responses[400] = "Error response for various conditions.";
        });
    }

    public override async Task HandleAsync(ModifyProjectUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a project.
/// </summary>

public class RetrieveProjectEndpoint : FastEndpoints.Endpoint<RetrieveProjectRequest, Project>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Retrieves a project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.Responses[200] = "Project retrieved successfully.";
        });
    }

    public override async Task HandleAsync(RetrieveProjectRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves an API key in the project.
/// </summary>

public class RetrieveProjectApiKeyEndpoint : FastEndpoints.Endpoint<RetrieveProjectApiKeyRequest, ProjectApiKey>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}/api_keys/{key_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Retrieves an API key in the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.KeyId, "The ID of the API key.");
            s.Responses[200] = "Project API key retrieved successfully.";
        });
    }

    public override async Task HandleAsync(RetrieveProjectApiKeyRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a service account in the project.
/// </summary>

public class RetrieveProjectServiceAccountEndpoint : FastEndpoints.Endpoint<RetrieveProjectServiceAccountRequest, ProjectServiceAccount>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}/service_accounts/{service_account_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Retrieves a service account in the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.ServiceAccountId, "The ID of the service account.");
            s.Responses[200] = "Project service account retrieved successfully.";
        });
    }

    public override async Task HandleAsync(RetrieveProjectServiceAccountRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a user in the project.
/// </summary>

public class RetrieveProjectUserEndpoint : FastEndpoints.Endpoint<RetrieveProjectUserRequest, ProjectUser>
{
    public override void Configure()
    {
        Get("/v1/organization/projects/{project_id}/users/{user_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
        });

        Summary(s => {
            s.Summary = "Retrieves a user in the project.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.UserId, "The ID of the user.");
            s.Responses[200] = "Project user retrieved successfully.";
        });
    }

    public override async Task HandleAsync(RetrieveProjectUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Updates a project rate limit.
/// </summary>

public class UpdateProjectRateLimitsEndpoint : FastEndpoints.Endpoint<UpdateProjectRateLimitsRequest, ProjectRateLimit>
{
    public override void Configure()
    {
        Post("/v1/organization/projects/{project_id}/rate_limits/{rate_limit_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Projects");
            FastEndpoints.RouteHandlerBuilderExtensions.ProducesProblemFE(x, 400);
        });

        Summary(s => {
            s.Summary = "Updates a project rate limit.";
            s.RequestParam(r => r.ProjectId, "The ID of the project.");
            s.RequestParam(r => r.RateLimitId, "The ID of the rate limit.");
            s.RequestParam(r => r.projectRateLimitUpdateRequest, "The project rate limit update request payload.");
            s.Responses[200] = "Project rate limit updated successfully.";
            s.Responses[400] = "Error response for various conditions.";
        });
    }

    public override async Task HandleAsync(UpdateProjectRateLimitsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

