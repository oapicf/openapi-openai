
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class AdminApiKeysCreateRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public AdminApiKeysCreateRequest adminApiKeysCreateRequest { get; set; }
}
public class AdminApiKeysDeleteRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("key_id")]
    public string KeyId { get; set; }
}
public class AdminApiKeysGetRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.BindFrom("key_id")]
    public string KeyId { get; set; }
}
public class AdminApiKeysListRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
}


