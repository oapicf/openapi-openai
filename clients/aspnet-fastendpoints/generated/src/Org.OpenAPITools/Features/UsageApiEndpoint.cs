using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Get audio speeches usage details for the organization.
/// </summary>

public class UsageAudioSpeechesEndpoint : FastEndpoints.Endpoint<UsageAudioSpeechesRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/audio_speeches");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get audio speeches usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.UserIds, "Return only usage for these users.");
            s.RequestParam(r => r.ApiKeyIds, "Return only usage for these API keys.");
            s.RequestParam(r => r.Models, "Return only usage for these models.");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageAudioSpeechesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get audio transcriptions usage details for the organization.
/// </summary>

public class UsageAudioTranscriptionsEndpoint : FastEndpoints.Endpoint<UsageAudioTranscriptionsRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/audio_transcriptions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get audio transcriptions usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.UserIds, "Return only usage for these users.");
            s.RequestParam(r => r.ApiKeyIds, "Return only usage for these API keys.");
            s.RequestParam(r => r.Models, "Return only usage for these models.");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageAudioTranscriptionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get code interpreter sessions usage details for the organization.
/// </summary>

public class UsageCodeInterpreterSessionsEndpoint : FastEndpoints.Endpoint<UsageCodeInterpreterSessionsRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/code_interpreter_sessions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get code interpreter sessions usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageCodeInterpreterSessionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get completions usage details for the organization.
/// </summary>

public class UsageCompletionsEndpoint : FastEndpoints.Endpoint<UsageCompletionsRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/completions");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get completions usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.UserIds, "Return only usage for these users.");
            s.RequestParam(r => r.ApiKeyIds, "Return only usage for these API keys.");
            s.RequestParam(r => r.Models, "Return only usage for these models.");
            s.RequestParam(r => r.Batch, "If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. ");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageCompletionsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get costs details for the organization.
/// </summary>

public class UsageCostsEndpoint : FastEndpoints.Endpoint<UsageCostsRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/costs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get costs details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only costs for these projects.");
            s.RequestParam(r => r.GroupBy, "Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.");
            s.RequestParam(r => r.Limit, "A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Costs data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageCostsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get embeddings usage details for the organization.
/// </summary>

public class UsageEmbeddingsEndpoint : FastEndpoints.Endpoint<UsageEmbeddingsRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/embeddings");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get embeddings usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.UserIds, "Return only usage for these users.");
            s.RequestParam(r => r.ApiKeyIds, "Return only usage for these API keys.");
            s.RequestParam(r => r.Models, "Return only usage for these models.");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageEmbeddingsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get images usage details for the organization.
/// </summary>

public class UsageImagesEndpoint : FastEndpoints.Endpoint<UsageImagesRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/images");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get images usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.Sources, "Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.");
            s.RequestParam(r => r.Sizes, "Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.UserIds, "Return only usage for these users.");
            s.RequestParam(r => r.ApiKeyIds, "Return only usage for these API keys.");
            s.RequestParam(r => r.Models, "Return only usage for these models.");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageImagesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get moderations usage details for the organization.
/// </summary>

public class UsageModerationsEndpoint : FastEndpoints.Endpoint<UsageModerationsRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/moderations");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get moderations usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.UserIds, "Return only usage for these users.");
            s.RequestParam(r => r.ApiKeyIds, "Return only usage for these API keys.");
            s.RequestParam(r => r.Models, "Return only usage for these models.");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageModerationsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get vector stores usage details for the organization.
/// </summary>

public class UsageVectorStoresEndpoint : FastEndpoints.Endpoint<UsageVectorStoresRequest, UsageResponse>
{
    public override void Configure()
    {
        Get("/v1/organization/usage/vector_stores");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Usage");
        });

        Summary(s => {
            s.Summary = "Get vector stores usage details for the organization.";
            s.RequestParam(r => r.StartTime, "Start time (Unix seconds) of the query time range, inclusive.");
            s.RequestParam(r => r.EndTime, "End time (Unix seconds) of the query time range, exclusive.");
            s.RequestParam(r => r.BucketWidth, "Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.");
            s.RequestParam(r => r.ProjectIds, "Return only usage for these projects.");
            s.RequestParam(r => r.GroupBy, "Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.");
            s.RequestParam(r => r.Limit, "Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 ");
            s.RequestParam(r => r.Page, "A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.");
            s.Responses[200] = "Usage data retrieved successfully.";
        });
    }

    public override async Task HandleAsync(UsageVectorStoresRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

