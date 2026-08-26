require "json"

module OpenAPIClient
  module Api
  class Threads
    def initialize(@conn : Connection); end

    # Create a thread.
    def create(create_thread_request : OpenAPIClient::CreateThreadRequest? = nil) : Response(OpenAPIClient::ThreadObject)
      @conn.request(OpenAPIClient::ThreadObject,
        method: :POST,
        path: "/threads",
        body: create_thread_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Modifies a thread.
    def create_post(thread_id : String, modify_thread_request : OpenAPIClient::ModifyThreadRequest) : Response(OpenAPIClient::ThreadObject)
      @conn.request(OpenAPIClient::ThreadObject,
        method: :POST,
        path: "/threads/{thread_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)),
        body: modify_thread_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Delete a thread.
    def delete(thread_id : String) : Response(OpenAPIClient::DeleteThreadResponse)
      @conn.request(OpenAPIClient::DeleteThreadResponse,
        method: :DELETE,
        path: "/threads/{thread_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a thread.
    def get(thread_id : String) : Response(OpenAPIClient::ThreadObject)
      @conn.request(OpenAPIClient::ThreadObject,
        method: :GET,
        path: "/threads/{thread_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
