require "json"

module OpenAPIClient
  module Api
  class Completions
    def initialize(@conn : Connection); end

    # Creates a completion for the provided prompt and parameters.
    def create(create_completion_request : OpenAPIClient::CreateCompletionRequest) : Response(OpenAPIClient::CreateCompletionResponse)
      @conn.request(OpenAPIClient::CreateCompletionResponse,
        method: :POST,
        path: "/completions",
        body: create_completion_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
