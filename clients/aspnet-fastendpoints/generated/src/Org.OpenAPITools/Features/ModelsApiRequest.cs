
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class DeleteModelRequest
{
    /// <summary>
    /// The model to delete
    /// </summary>
    [FastEndpoints.BindFrom("model")]
    public string Model { get; set; }
}
public class ListModelsRequest
{
}
public class RetrieveModelRequest
{
    /// <summary>
    /// The ID of the model to use for this request
    /// </summary>
    [FastEndpoints.BindFrom("model")]
    public string Model { get; set; }
}


