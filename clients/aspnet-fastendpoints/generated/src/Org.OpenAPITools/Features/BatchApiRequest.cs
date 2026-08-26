
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CancelBatchRequest
{
    /// <summary>
    /// The ID of the batch to cancel.
    /// </summary>
    [FastEndpoints.BindFrom("batch_id")]
    public string BatchId { get; set; }
}
public class CreateBatchRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateBatchRequest createBatchRequest { get; set; }
}
public class ListBatchesRequest
{
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}
public class RetrieveBatchRequest
{
    /// <summary>
    /// The ID of the batch to retrieve.
    /// </summary>
    [FastEndpoints.BindFrom("batch_id")]
    public string BatchId { get; set; }
}


