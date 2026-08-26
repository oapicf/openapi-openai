# frozen_string_literal: true

module OpenapiClient
  module Api
    class VectorStores::Files
      def initialize(connection)
        @connection = connection
      end

      def create(vector_store_id:, create_vector_store_file_request:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'create_vector_store_file_request is required' if create_vector_store_file_request.nil?

        @connection.call(
          :POST,
          '/vector_stores/{vector_store_id}/files'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s)),
          type: OpenapiClient::Models::VectorStoreFileObject,
          auth: ['ApiKeyAuth'],
          body: create_vector_store_file_request
        )
      end

      def delete(vector_store_id:, file_id:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'file_id is required' if file_id.nil?

        @connection.call(
          :DELETE,
          '/vector_stores/{vector_store_id}/files/{file_id}'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s))
            .gsub('{file_id}', ERB::Util.url_encode(file_id.to_s)),
          type: OpenapiClient::Models::DeleteVectorStoreFileResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(vector_store_id:, file_id:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'file_id is required' if file_id.nil?

        @connection.call(
          :GET,
          '/vector_stores/{vector_store_id}/files/{file_id}'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s))
            .gsub('{file_id}', ERB::Util.url_encode(file_id.to_s)),
          type: OpenapiClient::Models::VectorStoreFileObject,
          auth: ['ApiKeyAuth']
        )
      end

      def list(vector_store_id:, limit: nil, order: nil, after: nil, before: nil, filter: nil)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?

        @connection.call(
          :GET,
          '/vector_stores/{vector_store_id}/files'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s)),
          type: OpenapiClient::Models::ListVectorStoreFilesResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'order' => order, 'after' => after, 'before' => before, 'filter' => filter }
        )
      end
    end
  end
end
