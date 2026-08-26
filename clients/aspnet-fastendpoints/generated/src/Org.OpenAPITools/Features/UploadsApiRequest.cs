
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AddUploadPartRequest
{
    /// <summary>
    /// The ID of the Upload. 
    /// </summary>
    [FastEndpoints.BindFrom("upload_id")]
    public string UploadId { get; set; }
    /// <summary>
    /// The chunk of bytes for this Part. 
    /// </summary>
    [FastEndpoints.BindFrom("data")]
    public System.IO.Stream Data { get; set; }
}
public class CancelUploadRequest
{
    /// <summary>
    /// The ID of the Upload. 
    /// </summary>
    [FastEndpoints.BindFrom("upload_id")]
    public string UploadId { get; set; }
}
public class CompleteUploadRequest
{
    /// <summary>
    /// The ID of the Upload. 
    /// </summary>
    [FastEndpoints.BindFrom("upload_id")]
    public string UploadId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CompleteUploadRequest completeUploadRequest { get; set; }
}
public class CreateUploadRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateUploadRequest createUploadRequest { get; set; }
}


