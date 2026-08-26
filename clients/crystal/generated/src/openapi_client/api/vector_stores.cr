require "json"

module OpenAPIClient
  module Api
  class VectorStores
    def initialize(@conn : Connection); end

    # Create a vector store.
    def create(create_vector_store_request : OpenAPIClient::CreateVectorStoreRequest) : Response(OpenAPIClient::VectorStoreObject)
      @conn.request(OpenAPIClient::VectorStoreObject,
        method: :POST,
        path: "/vector_stores",
        body: create_vector_store_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Modifies a vector store.
    def create_post(vector_store_id : String, update_vector_store_request : OpenAPIClient::UpdateVectorStoreRequest) : Response(OpenAPIClient::VectorStoreObject)
      @conn.request(OpenAPIClient::VectorStoreObject,
        method: :POST,
        path: "/vector_stores/{vector_store_id}".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)),
        body: update_vector_store_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Delete a vector store.
    def delete(vector_store_id : String) : Response(OpenAPIClient::DeleteVectorStoreResponse)
      @conn.request(OpenAPIClient::DeleteVectorStoreResponse,
        method: :DELETE,
        path: "/vector_stores/{vector_store_id}".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a vector store.
    def get(vector_store_id : String) : Response(OpenAPIClient::VectorStoreObject)
      @conn.request(OpenAPIClient::VectorStoreObject,
        method: :GET,
        path: "/vector_stores/{vector_store_id}".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of vector stores.
    def list(*, limit : Int32? = nil, order : String? = nil, after : String? = nil, before : String? = nil) : Response(OpenAPIClient::ListVectorStoresResponse)
      @conn.request(OpenAPIClient::ListVectorStoresResponse,
        method: :GET,
        path: "/vector_stores",
        query: { "limit" => limit, "order" => order, "after" => after, "before" => before },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
