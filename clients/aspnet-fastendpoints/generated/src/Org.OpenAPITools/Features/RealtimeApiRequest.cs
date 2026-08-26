
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CreateRealtimeSessionRequest
{
    /// <summary>
    /// Create an ephemeral API key with the given session configuration.
    /// </summary>
    [FastEndpoints.FromBody]
    public RealtimeSessionCreateRequest realtimeSessionCreateRequest { get; set; }
}


