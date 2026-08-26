require "json"

module OpenAPIClient
  module Api
  class Assistants
    def initialize(@conn : Connection); end

    # Create an assistant with a model and instructions.
    def create(create_assistant_request : OpenAPIClient::CreateAssistantRequest) : Response(OpenAPIClient::AssistantObject)
      @conn.request(OpenAPIClient::AssistantObject,
        method: :POST,
        path: "/assistants",
        body: create_assistant_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Modifies an assistant.
    def create_post(assistant_id : String, modify_assistant_request : OpenAPIClient::ModifyAssistantRequest) : Response(OpenAPIClient::AssistantObject)
      @conn.request(OpenAPIClient::AssistantObject,
        method: :POST,
        path: "/assistants/{assistant_id}".sub("{assistant_id}", OpenAPIClient.enc(assistant_id)),
        body: modify_assistant_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Delete an assistant.
    def delete(assistant_id : String) : Response(OpenAPIClient::DeleteAssistantResponse)
      @conn.request(OpenAPIClient::DeleteAssistantResponse,
        method: :DELETE,
        path: "/assistants/{assistant_id}".sub("{assistant_id}", OpenAPIClient.enc(assistant_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves an assistant.
    def get(assistant_id : String) : Response(OpenAPIClient::AssistantObject)
      @conn.request(OpenAPIClient::AssistantObject,
        method: :GET,
        path: "/assistants/{assistant_id}".sub("{assistant_id}", OpenAPIClient.enc(assistant_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of assistants.
    def list(*, limit : Int32? = nil, order : String? = nil, after : String? = nil, before : String? = nil) : Response(OpenAPIClient::ListAssistantsResponse)
      @conn.request(OpenAPIClient::ListAssistantsResponse,
        method: :GET,
        path: "/assistants",
        query: { "limit" => limit, "order" => order, "after" => after, "before" => before },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
