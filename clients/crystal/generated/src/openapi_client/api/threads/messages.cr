require "json"

module OpenAPIClient
  module Api
  class Threads::Messages
    def initialize(@conn : Connection); end

    # Create a message.
    def create(thread_id : String, create_message_request : OpenAPIClient::CreateMessageRequest) : Response(OpenAPIClient::MessageObject)
      @conn.request(OpenAPIClient::MessageObject,
        method: :POST,
        path: "/threads/{thread_id}/messages".sub("{thread_id}", OpenAPIClient.enc(thread_id)),
        body: create_message_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Modifies a message.
    def create_post(thread_id : String, message_id : String, modify_message_request : OpenAPIClient::ModifyMessageRequest) : Response(OpenAPIClient::MessageObject)
      @conn.request(OpenAPIClient::MessageObject,
        method: :POST,
        path: "/threads/{thread_id}/messages/{message_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{message_id}", OpenAPIClient.enc(message_id)),
        body: modify_message_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Deletes a message.
    def delete(thread_id : String, message_id : String) : Response(OpenAPIClient::DeleteMessageResponse)
      @conn.request(OpenAPIClient::DeleteMessageResponse,
        method: :DELETE,
        path: "/threads/{thread_id}/messages/{message_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{message_id}", OpenAPIClient.enc(message_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieve a message.
    def get(thread_id : String, message_id : String) : Response(OpenAPIClient::MessageObject)
      @conn.request(OpenAPIClient::MessageObject,
        method: :GET,
        path: "/threads/{thread_id}/messages/{message_id}".sub("{thread_id}", OpenAPIClient.enc(thread_id)).sub("{message_id}", OpenAPIClient.enc(message_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of messages for a given thread.
    def list(thread_id : String, *, limit : Int32? = nil, order : String? = nil, after : String? = nil, before : String? = nil, run_id : String? = nil) : Response(OpenAPIClient::ListMessagesResponse)
      @conn.request(OpenAPIClient::ListMessagesResponse,
        method: :GET,
        path: "/threads/{thread_id}/messages".sub("{thread_id}", OpenAPIClient.enc(thread_id)),
        query: { "limit" => limit, "order" => order, "after" => after, "before" => before, "run_id" => run_id },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
