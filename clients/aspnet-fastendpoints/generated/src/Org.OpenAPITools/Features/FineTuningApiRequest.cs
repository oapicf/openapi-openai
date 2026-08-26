
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CancelFineTuningJobRequest
{
    /// <summary>
    /// The ID of the fine-tuning job to cancel. 
    /// </summary>
    [FastEndpoints.BindFrom("fine_tuning_job_id")]
    public string FineTuningJobId { get; set; }
}
public class CreateFineTuningJobRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateFineTuningJobRequest createFineTuningJobRequest { get; set; }
}
public class ListFineTuningEventsRequest
{
    /// <summary>
    /// The ID of the fine-tuning job to get events for. 
    /// </summary>
    [FastEndpoints.BindFrom("fine_tuning_job_id")]
    public string FineTuningJobId { get; set; }
    /// <summary>
    /// Identifier for the last event from the previous pagination request.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// Number of events to retrieve.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class ListFineTuningJobCheckpointsRequest
{
    /// <summary>
    /// The ID of the fine-tuning job to get checkpoints for. 
    /// </summary>
    [FastEndpoints.BindFrom("fine_tuning_job_id")]
    public string FineTuningJobId { get; set; }
    /// <summary>
    /// Identifier for the last checkpoint ID from the previous pagination request.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// Number of checkpoints to retrieve.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class ListPaginatedFineTuningJobsRequest
{
    /// <summary>
    /// Identifier for the last job from the previous pagination request.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// Number of fine-tuning jobs to retrieve.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class RetrieveFineTuningJobRequest
{
    /// <summary>
    /// The ID of the fine-tuning job. 
    /// </summary>
    [FastEndpoints.BindFrom("fine_tuning_job_id")]
    public string FineTuningJobId { get; set; }
}


