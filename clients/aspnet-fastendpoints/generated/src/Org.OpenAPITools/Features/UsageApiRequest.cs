
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class UsageAudioSpeechesRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Return only usage for these users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("user_ids")]
    public List<string>? UserIds { get; set; }
    /// <summary>
    /// Return only usage for these API keys.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("api_key_ids")]
    public List<string>? ApiKeyIds { get; set; }
    /// <summary>
    /// Return only usage for these models.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("models")]
    public List<string>? Models { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageAudioTranscriptionsRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Return only usage for these users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("user_ids")]
    public List<string>? UserIds { get; set; }
    /// <summary>
    /// Return only usage for these API keys.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("api_key_ids")]
    public List<string>? ApiKeyIds { get; set; }
    /// <summary>
    /// Return only usage for these models.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("models")]
    public List<string>? Models { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageCodeInterpreterSessionsRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageCompletionsRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Return only usage for these users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("user_ids")]
    public List<string>? UserIds { get; set; }
    /// <summary>
    /// Return only usage for these API keys.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("api_key_ids")]
    public List<string>? ApiKeyIds { get; set; }
    /// <summary>
    /// Return only usage for these models.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("models")]
    public List<string>? Models { get; set; }
    /// <summary>
    /// If &#x60;true&#x60;, return batch jobs only. If &#x60;false&#x60;, return non-batch jobs only. By default, return both. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("batch")]
    public bool? Batch { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;batch&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageCostsRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently only &#x60;1d&#x60; is supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only costs for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Group the costs by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;line_item&#x60; and any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// A limit on the number of buckets to be returned. Limit can range between 1 and 180, and the default is 7. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageEmbeddingsRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Return only usage for these users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("user_ids")]
    public List<string>? UserIds { get; set; }
    /// <summary>
    /// Return only usage for these API keys.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("api_key_ids")]
    public List<string>? ApiKeyIds { get; set; }
    /// <summary>
    /// Return only usage for these models.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("models")]
    public List<string>? Models { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageImagesRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usages for these sources. Possible values are &#x60;image.generation&#x60;, &#x60;image.edit&#x60;, &#x60;image.variation&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sources")]
    public List<string>? Sources { get; set; }
    /// <summary>
    /// Return only usages for these image sizes. Possible values are &#x60;256x256&#x60;, &#x60;512x512&#x60;, &#x60;1024x1024&#x60;, &#x60;1792x1792&#x60;, &#x60;1024x1792&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("sizes")]
    public List<string>? Sizes { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Return only usage for these users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("user_ids")]
    public List<string>? UserIds { get; set; }
    /// <summary>
    /// Return only usage for these API keys.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("api_key_ids")]
    public List<string>? ApiKeyIds { get; set; }
    /// <summary>
    /// Return only usage for these models.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("models")]
    public List<string>? Models { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60;, &#x60;size&#x60;, &#x60;source&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageModerationsRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Return only usage for these users.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("user_ids")]
    public List<string>? UserIds { get; set; }
    /// <summary>
    /// Return only usage for these API keys.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("api_key_ids")]
    public List<string>? ApiKeyIds { get; set; }
    /// <summary>
    /// Return only usage for these models.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("models")]
    public List<string>? Models { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;, &#x60;user_id&#x60;, &#x60;api_key_id&#x60;, &#x60;model&#x60; or any combination of them.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}
public class UsageVectorStoresRequest
{
    /// <summary>
    /// Start time (Unix seconds) of the query time range, inclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("start_time")]
    public int StartTime { get; set; }
    /// <summary>
    /// End time (Unix seconds) of the query time range, exclusive.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("end_time")]
    public int? EndTime { get; set; }
    /// <summary>
    /// Width of each time bucket in response. Currently &#x60;1m&#x60;, &#x60;1h&#x60; and &#x60;1d&#x60; are supported, default to &#x60;1d&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("bucket_width")]
    public string? BucketWidth { get; set; }
    /// <summary>
    /// Return only usage for these projects.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("project_ids")]
    public List<string>? ProjectIds { get; set; }
    /// <summary>
    /// Group the usage data by the specified fields. Support fields include &#x60;project_id&#x60;.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("group_by")]
    public List<string>? GroupBy { get; set; }
    /// <summary>
    /// Specifies the number of buckets to return. - &#x60;bucket_width&#x3D;1d&#x60;: default: 7, max: 31 - &#x60;bucket_width&#x3D;1h&#x60;: default: 24, max: 168 - &#x60;bucket_width&#x3D;1m&#x60;: default: 60, max: 1440 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// A cursor for use in pagination. Corresponding to the &#x60;next_page&#x60; field from the previous response.
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("page")]
    public string? Page { get; set; }
}


