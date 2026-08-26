using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Deletes a user from the organization.
/// </summary>

public class DeleteUserEndpoint : FastEndpoints.Endpoint<DeleteUserRequest, UserDeleteResponse>
{
    public override void Configure()
    {
        Delete("/v1/organization/users/{user_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Users");
        });

        Summary(s => {
            s.Summary = "Deletes a user from the organization.";
            s.RequestParam(r => r.UserId, "The ID of the user.");
            s.Responses[200] = "User deleted successfully.";
        });
    }

    public override async Task HandleAsync(DeleteUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Lists all of the users in the organization.
/// </summary>

public class ListUsersEndpoint : FastEndpoints.Endpoint<ListUsersRequest, UserListResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/users");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Users");
        });

        Summary(s => {
            s.Summary = "Lists all of the users in the organization.";
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.Responses[200] = "Users listed successfully.";
        });
    }

    public override async Task HandleAsync(ListUsersRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies a user&#39;s role in the organization.
/// </summary>

public class ModifyUserEndpoint : FastEndpoints.Endpoint<ModifyUserRequest, User>
{
    public override void Configure()
    {
        Post("/v1/organization/users/{user_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Users");
        });

        Summary(s => {
            s.Summary = "Modifies a user&#39;s role in the organization.";
            s.RequestParam(r => r.UserId, "The ID of the user.");
            s.RequestParam(r => r.userRoleUpdateRequest, "The new user role to modify. This must be one of &#x60;owner&#x60; or &#x60;member&#x60;.");
            s.Responses[200] = "User role updated successfully.";
        });
    }

    public override async Task HandleAsync(ModifyUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a user by their identifier.
/// </summary>

public class RetrieveUserEndpoint : FastEndpoints.Endpoint<RetrieveUserRequest, User>
{
    public override void Configure()
    {
        Get("/v1/organization/users/{user_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Users");
        });

        Summary(s => {
            s.Summary = "Retrieves a user by their identifier.";
            s.RequestParam(r => r.UserId, "The ID of the user.");
            s.Responses[200] = "User retrieved successfully.";
        });
    }

    public override async Task HandleAsync(RetrieveUserRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

