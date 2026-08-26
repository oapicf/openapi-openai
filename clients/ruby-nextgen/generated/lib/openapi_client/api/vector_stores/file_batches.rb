# frozen_string_literal: true

module OpenapiClient
  module Api
    class VectorStores::FileBatches
      def initialize(connection)
        @connection = connection
      end

      def cancel(vector_store_id:, batch_id:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'batch_id is required' if batch_id.nil?

        @connection.call(
          :POST,
          '/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s))
            .gsub('{batch_id}', ERB::Util.url_encode(batch_id.to_s)),
          type: OpenapiClient::Models::VectorStoreFileBatchObject,
          auth: ['ApiKeyAuth']
        )
      end

      def create(vector_store_id:, create_vector_store_file_batch_request:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'create_vector_store_file_batch_request is required' if create_vector_store_file_batch_request.nil?

        @connection.call(
          :POST,
          '/vector_stores/{vector_store_id}/file_batches'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s)),
          type: OpenapiClient::Models::VectorStoreFileBatchObject,
          auth: ['ApiKeyAuth'],
          body: create_vector_store_file_batch_request
        )
      end

      def files(vector_store_id:, batch_id:, limit: nil, order: nil, after: nil, before: nil, filter: nil)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'batch_id is required' if batch_id.nil?

        @connection.call(
          :GET,
          '/vector_stores/{vector_store_id}/file_batches/{batch_id}/files'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s))
            .gsub('{batch_id}', ERB::Util.url_encode(batch_id.to_s)),
          type: OpenapiClient::Models::ListVectorStoreFilesResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'order' => order, 'after' => after, 'before' => before, 'filter' => filter }
        )
      end

      def get(vector_store_id:, batch_id:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'batch_id is required' if batch_id.nil?

        @connection.call(
          :GET,
          '/vector_stores/{vector_store_id}/file_batches/{batch_id}'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s))
            .gsub('{batch_id}', ERB::Util.url_encode(batch_id.to_s)),
          type: OpenapiClient::Models::VectorStoreFileBatchObject,
          auth: ['ApiKeyAuth']
        )
      end
    end
  end
end
