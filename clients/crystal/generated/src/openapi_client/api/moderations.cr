require "json"

module OpenAPIClient
  module Api
  class Moderations
    def initialize(@conn : Connection); end

    # Classifies if text and/or image inputs are potentially harmful. Learn more in the [moderation guide](/docs/guides/moderation). 
    def create(create_moderation_request : OpenAPIClient::CreateModerationRequest) : Response(OpenAPIClient::CreateModerationResponse)
      @conn.request(OpenAPIClient::CreateModerationResponse,
        method: :POST,
        path: "/moderations",
        body: create_moderation_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
