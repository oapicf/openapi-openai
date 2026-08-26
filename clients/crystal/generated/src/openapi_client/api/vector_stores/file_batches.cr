require "json"

module OpenAPIClient
  module Api
  class VectorStores::FileBatches
    def initialize(@conn : Connection); end

    # Cancel a vector store file batch. This attempts to cancel the processing of files in this batch as soon as possible.
    def cancel(vector_store_id : String, batch_id : String) : Response(OpenAPIClient::VectorStoreFileBatchObject)
      @conn.request(OpenAPIClient::VectorStoreFileBatchObject,
        method: :POST,
        path: "/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)).sub("{batch_id}", OpenAPIClient.enc(batch_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Create a vector store file batch.
    def create(vector_store_id : String, create_vector_store_file_batch_request : OpenAPIClient::CreateVectorStoreFileBatchRequest) : Response(OpenAPIClient::VectorStoreFileBatchObject)
      @conn.request(OpenAPIClient::VectorStoreFileBatchObject,
        method: :POST,
        path: "/vector_stores/{vector_store_id}/file_batches".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)),
        body: create_vector_store_file_batch_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of vector store files in a batch.
    def files(vector_store_id : String, batch_id : String, *, limit : Int32? = nil, order : String? = nil, after : String? = nil, before : String? = nil, filter : String? = nil) : Response(OpenAPIClient::ListVectorStoreFilesResponse)
      @conn.request(OpenAPIClient::ListVectorStoreFilesResponse,
        method: :GET,
        path: "/vector_stores/{vector_store_id}/file_batches/{batch_id}/files".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)).sub("{batch_id}", OpenAPIClient.enc(batch_id)),
        query: { "limit" => limit, "order" => order, "after" => after, "before" => before, "filter" => filter },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a vector store file batch.
    def get(vector_store_id : String, batch_id : String) : Response(OpenAPIClient::VectorStoreFileBatchObject)
      @conn.request(OpenAPIClient::VectorStoreFileBatchObject,
        method: :GET,
        path: "/vector_stores/{vector_store_id}/file_batches/{batch_id}".sub("{vector_store_id}", OpenAPIClient.enc(vector_store_id)).sub("{batch_id}", OpenAPIClient.enc(batch_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
