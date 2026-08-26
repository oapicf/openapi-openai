using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Create an organization admin API key
/// </summary>

public class AdminApiKeysCreateEndpoint : FastEndpoints.Endpoint<AdminApiKeysCreateRequest, AdminApiKey>
{
    public override void Configure()
    {
        Post("/v1/organization/admin_api_keys");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Create an organization admin API key";
            s.RequestParam(r => r.adminApiKeysCreateRequest, "");
            s.Responses[200] = "The newly created admin API key.";
        });
    }

    public override async Task HandleAsync(AdminApiKeysCreateRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete an organization admin API key
/// </summary>

public class AdminApiKeysDeleteEndpoint : FastEndpoints.Endpoint<AdminApiKeysDeleteRequest, AdminApiKeysDelete200Response>
{
    public override void Configure()
    {
        Delete("/v1/organization/admin_api_keys/{key_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Delete an organization admin API key";
            s.RequestParam(r => r.KeyId, "");
            s.Responses[200] = "Confirmation that the API key was deleted.";
        });
    }

    public override async Task HandleAsync(AdminApiKeysDeleteRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieve a single organization API key
/// </summary>

public class AdminApiKeysGetEndpoint : FastEndpoints.Endpoint<AdminApiKeysGetRequest, AdminApiKey>
{
    public override void Configure()
    {
        Get("/v1/organization/admin_api_keys/{key_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "Retrieve a single organization API key";
            s.RequestParam(r => r.KeyId, "");
            s.Responses[200] = "Details of the requested API key.";
        });
    }

    public override async Task HandleAsync(AdminApiKeysGetRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List organization API keys
/// </summary>

public class AdminApiKeysListEndpoint : FastEndpoints.Endpoint<AdminApiKeysListRequest, ApiKeyList>
{
    public override void Configure()
    {
        Get("/v1/organization/admin_api_keys");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("default");
        });

        Summary(s => {
            s.Summary = "List organization API keys";
            s.RequestParam(r => r.After, "");
            s.RequestParam(r => r.Order, "");
            s.RequestParam(r => r.Limit, "");
            s.Responses[200] = "A list of organization API keys.";
        });
    }

    public override async Task HandleAsync(AdminApiKeysListRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

