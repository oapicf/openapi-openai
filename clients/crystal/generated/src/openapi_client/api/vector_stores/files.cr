require "json"

module OpenAPIClient
  module Api
  class VectorStores::Files
    def initialize(@conn : Connection); end

    # Create a vector store file by attaching a [File](/docs/api-reference/files) to a [vector store](/docs/api-reference/vector-stores/object).
    def create(vector_store_id : String, create_vector_store_file_request : OpenAPIClient::CreateVectorStoreFileRequest) : Response(OpenAPIClient::VectorStoreFileObject)
      @conn.request(OpenAPIClient::VectorStoreFileObject,
        method: :POST,
        path: "/vector_stores/{vector_store_id}/files".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)),
        body: create_vector_store_file_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Delete a vector store file. This will remove the file from the vector store but the file itself will not be deleted. To delete the file, use the [delete file](/docs/api-reference/files/delete) endpoint.
    def delete(vector_store_id : String, file_id : String) : Response(OpenAPIClient::DeleteVectorStoreFileResponse)
      @conn.request(OpenAPIClient::DeleteVectorStoreFileResponse,
        method: :DELETE,
        path: "/vector_stores/{vector_store_id}/files/{file_id}".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)).sub("{file_id}", OpenAPIClient.enc(file_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a vector store file.
    def get(vector_store_id : String, file_id : String) : Response(OpenAPIClient::VectorStoreFileObject)
      @conn.request(OpenAPIClient::VectorStoreFileObject,
        method: :GET,
        path: "/vector_stores/{vector_store_id}/files/{file_id}".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)).sub("{file_id}", OpenAPIClient.enc(file_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of vector store files.
    def list(vector_store_id : String, *, limit : Int32? = nil, order : String? = nil, after : String? = nil, before : String? = nil, filter : String? = nil) : Response(OpenAPIClient::ListVectorStoreFilesResponse)
      @conn.request(OpenAPIClient::ListVectorStoreFilesResponse,
        method: :GET,
        path: "/vector_stores/{vector_store_id}/files".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)),
        query: { "limit" => limit, "order" => order, "after" => after, "before" => before, "filter" => filter },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
