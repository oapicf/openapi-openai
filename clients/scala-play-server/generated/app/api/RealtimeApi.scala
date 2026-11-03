package api

import play.api.libs.json._
import model.RealtimeSessionCreateRequest
import model.RealtimeSessionCreateResponse

@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:38:29.809972473Z[Etc/UTC]", comments = "Generator version: 7.26.0")
trait RealtimeApi {
  /**
    * Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    * @param realtimeSessionCreateRequest Create an ephemeral API key with the given session configuration.
    */
  def createRealtimeSession(realtimeSessionCreateRequest: RealtimeSessionCreateRequest): RealtimeSessionCreateResponse
}
