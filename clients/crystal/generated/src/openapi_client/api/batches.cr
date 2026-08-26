require "json"

module OpenAPIClient
  module Api
  class Batches
    def initialize(@conn : Connection); end

    # Cancels an in-progress batch. The batch will be in status &#x60;cancelling&#x60; for up to 10 minutes, before changing to &#x60;cancelled&#x60;, where it will have partial results (if any) available in the output file.
    def cancel(batch_id : String) : Response(OpenAPIClient::Batch)
      @conn.request(OpenAPIClient::Batch,
        method: :POST,
        path: "/batches/{batch_id}/cancel".sub("{batch_id}", OpenAPIClient.enc(batch_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Creates and executes a batch from an uploaded file of requests
    def create(create_batch_request : OpenAPIClient::CreateBatchRequest) : Response(OpenAPIClient::Batch)
      @conn.request(OpenAPIClient::Batch,
        method: :POST,
        path: "/batches",
        body: create_batch_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a batch.
    def get(batch_id : String) : Response(OpenAPIClient::Batch)
      @conn.request(OpenAPIClient::Batch,
        method: :GET,
        path: "/batches/{batch_id}".sub("{batch_id}", OpenAPIClient.enc(batch_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # List your organization&#39;s batches.
    def list(*, after : String? = nil, limit : Int32? = nil) : Response(OpenAPIClient::ListBatchesResponse)
      @conn.request(OpenAPIClient::ListBatchesResponse,
        method: :GET,
        path: "/batches",
        query: { "after" => after, "limit" => limit },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
