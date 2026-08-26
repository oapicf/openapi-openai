using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Immediately cancel a fine-tune job. 
/// </summary>

public class CancelFineTuningJobEndpoint : FastEndpoints.Endpoint<CancelFineTuningJobRequest, FineTuningJob>
{
    public override void Configure()
    {
        Post("/v1/fine_tuning/jobs/{fine_tuning_job_id}/cancel");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Fine-tuning");
        });

        Summary(s => {
            s.Summary = "Immediately cancel a fine-tune job. ";
            s.RequestParam(r => r.FineTuningJobId, "The ID of the fine-tuning job to cancel. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CancelFineTuningJobRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
/// </summary>

public class CreateFineTuningJobEndpoint : FastEndpoints.Endpoint<CreateFineTuningJobRequest, FineTuningJob>
{
    public override void Configure()
    {
        Post("/v1/fine_tuning/jobs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Fine-tuning");
        });

        Summary(s => {
            s.Summary = "Creates a fine-tuning job which begins the process of creating a new model from a given dataset.  Response includes details of the enqueued job including job status and the name of the fine-tuned models once complete.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ";
            s.RequestParam(r => r.createFineTuningJobRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateFineTuningJobRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get status updates for a fine-tuning job. 
/// </summary>

public class ListFineTuningEventsEndpoint : FastEndpoints.Endpoint<ListFineTuningEventsRequest, ListFineTuningJobEventsResponse>
{
    public override void Configure()
    {
        Get("/v1/fine_tuning/jobs/{fine_tuning_job_id}/events");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Fine-tuning");
        });

        Summary(s => {
            s.Summary = "Get status updates for a fine-tuning job. ";
            s.RequestParam(r => r.FineTuningJobId, "The ID of the fine-tuning job to get events for. ");
            s.RequestParam(r => r.After, "Identifier for the last event from the previous pagination request.");
            s.RequestParam(r => r.Limit, "Number of events to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListFineTuningEventsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List checkpoints for a fine-tuning job. 
/// </summary>

public class ListFineTuningJobCheckpointsEndpoint : FastEndpoints.Endpoint<ListFineTuningJobCheckpointsRequest, ListFineTuningJobCheckpointsResponse>
{
    public override void Configure()
    {
        Get("/v1/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Fine-tuning");
        });

        Summary(s => {
            s.Summary = "List checkpoints for a fine-tuning job. ";
            s.RequestParam(r => r.FineTuningJobId, "The ID of the fine-tuning job to get checkpoints for. ");
            s.RequestParam(r => r.After, "Identifier for the last checkpoint ID from the previous pagination request.");
            s.RequestParam(r => r.Limit, "Number of checkpoints to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListFineTuningJobCheckpointsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// List your organization&#39;s fine-tuning jobs 
/// </summary>

public class ListPaginatedFineTuningJobsEndpoint : FastEndpoints.Endpoint<ListPaginatedFineTuningJobsRequest, ListPaginatedFineTuningJobsResponse>
{
    public override void Configure()
    {
        Get("/v1/fine_tuning/jobs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Fine-tuning");
        });

        Summary(s => {
            s.Summary = "List your organization&#39;s fine-tuning jobs ";
            s.RequestParam(r => r.After, "Identifier for the last job from the previous pagination request.");
            s.RequestParam(r => r.Limit, "Number of fine-tuning jobs to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListPaginatedFineTuningJobsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) 
/// </summary>

public class RetrieveFineTuningJobEndpoint : FastEndpoints.Endpoint<RetrieveFineTuningJobRequest, FineTuningJob>
{
    public override void Configure()
    {
        Get("/v1/fine_tuning/jobs/{fine_tuning_job_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Fine-tuning");
        });

        Summary(s => {
            s.Summary = "Get info about a fine-tuning job.  [Learn more about fine-tuning](/docs/guides/fine-tuning) ";
            s.RequestParam(r => r.FineTuningJobId, "The ID of the fine-tuning job. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(RetrieveFineTuningJobRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

