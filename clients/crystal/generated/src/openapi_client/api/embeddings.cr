require "json"

module OpenAPIClient
  module Api
  class Embeddings
    def initialize(@conn : Connection); end

    # Creates an embedding vector representing the input text.
    def create(create_embedding_request : OpenAPIClient::CreateEmbeddingRequest) : Response(OpenAPIClient::CreateEmbeddingResponse)
      @conn.request(OpenAPIClient::CreateEmbeddingResponse,
        method: :POST,
        path: "/embeddings",
        body: create_embedding_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
