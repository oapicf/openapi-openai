require "json"

module OpenAPIClient
  module Api
  class Chat
    def initialize(@conn : Connection); end

    # Creates a model response for the given chat conversation. Learn more in the [text generation](/docs/guides/text-generation), [vision](/docs/guides/vision), and [audio](/docs/guides/audio) guides.  Parameter support can differ depending on the model used to generate the response, particularly for newer reasoning models. Parameters that are only supported for reasoning models are noted below. For the current state of  unsupported parameters in reasoning models,  [refer to the reasoning guide](/docs/guides/reasoning). 
    def completions(create_chat_completion_request : OpenAPIClient::CreateChatCompletionRequest) : Response(OpenAPIClient::CreateChatCompletionResponse)
      @conn.request(OpenAPIClient::CreateChatCompletionResponse,
        method: :POST,
        path: "/chat/completions",
        body: create_chat_completion_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
