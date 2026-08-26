using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
/// </summary>

public class CancelBatchEndpoint : FastEndpoints.Endpoint<CancelBatchRequest, Batch>
{
    public override void Configure()
    {
        Post("/v1/batches/{batch_id}/cancel");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Batch");
        });

        Summary(s => {
            s.Summary = "Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.";
            s.RequestParam(r => r.BatchId, "The ID of the batch to cancel.");
            s.Responses[200] = "Batch is cancelling. Returns the cancelling batch&#39;s details.";
        });
    }

    public override async Task HandleAsync(CancelBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Creates and executes a batch from an uploaded file of requests
/// </summary>

public class CreateBatchEndpoint : FastEndpoints.Endpoint<CreateBatchRequest, Batch>
{
    public override void Configure()
    {
        Post("/v1/batches");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Batch");
        });

        Summary(s => {
            s.Summary = "Creates and executes a batch from an uploaded file of requests";
            s.RequestParam(r => r.createBatchRequest, "");
            s.Responses[200] = "Batch created successfully.";
        });
    }

    public override async Task HandleAsync(CreateBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List your organization&#39;s batches.
/// </summary>

public class ListBatchesEndpoint : FastEndpoints.Endpoint<ListBatchesRequest, ListBatchesResponse>
{
    public override void Configure()
    {
        Get("/v1/batches");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Batch");
        });

        Summary(s => {
            s.Summary = "List your organization&#39;s batches.";
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.Responses[200] = "Batch listed successfully.";
        });
    }

    public override async Task HandleAsync(ListBatchesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a batch.
/// </summary>

public class RetrieveBatchEndpoint : FastEndpoints.Endpoint<RetrieveBatchRequest, Batch>
{
    public override void Configure()
    {
        Get("/v1/batches/{batch_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Batch");
        });

        Summary(s => {
            s.Summary = "Retrieves a batch.";
            s.RequestParam(r => r.BatchId, "The ID of the batch to retrieve.");
            s.Responses[200] = "Batch retrieved successfully.";
        });
    }

    public override async Task HandleAsync(RetrieveBatchRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

