require "json"

module OpenAPIClient
  module Api
  class Realtime
    def initialize(@conn : Connection); end

    # Create an ephemeral API token for use in client-side applications with the Realtime API. Can be configured with the same session parameters as the &#x60;session.update&#x60; client event.  It responds with a session object, plus a &#x60;client_secret&#x60; key which contains a usable ephemeral API token that can be used to authenticate browser clients for the Realtime API. 
    def sessions(realtime_session_create_request : OpenAPIClient::RealtimeSessionCreateRequest) : Response(OpenAPIClient::RealtimeSessionCreateResponse)
      @conn.request(OpenAPIClient::RealtimeSessionCreateResponse,
        method: :POST,
        path: "/realtime/sessions",
        body: realtime_session_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
