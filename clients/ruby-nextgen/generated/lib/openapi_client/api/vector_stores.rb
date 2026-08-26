# frozen_string_literal: true

module OpenapiClient
  module Api
    class VectorStores
      def initialize(connection)
        @connection = connection
      end

      def create(create_vector_store_request:)
        raise ArgumentError, 'create_vector_store_request is required' if create_vector_store_request.nil?

        @connection.call(
          :POST,
          '/vector_stores',
          type: OpenapiClient::Models::VectorStoreObject,
          auth: ['ApiKeyAuth'],
          body: create_vector_store_request
        )
      end

      def create_post(vector_store_id:, update_vector_store_request:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?
        raise ArgumentError, 'update_vector_store_request is required' if update_vector_store_request.nil?

        @connection.call(
          :POST,
          '/vector_stores/{vector_store_id}'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s)),
          type: OpenapiClient::Models::VectorStoreObject,
          auth: ['ApiKeyAuth'],
          body: update_vector_store_request
        )
      end

      def delete(vector_store_id:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?

        @connection.call(
          :DELETE,
          '/vector_stores/{vector_store_id}'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s)),
          type: OpenapiClient::Models::DeleteVectorStoreResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(vector_store_id:)
        raise ArgumentError, 'vector_store_id is required' if vector_store_id.nil?

        @connection.call(
          :GET,
          '/vector_stores/{vector_store_id}'
            .gsub('{vector_store_id}', ERB::Util.url_encode(vector_store_id.to_s)),
          type: OpenapiClient::Models::VectorStoreObject,
          auth: ['ApiKeyAuth']
        )
      end

      def list(limit: nil, order: nil, after: nil, before: nil)
        @connection.call(
          :GET,
          '/vector_stores',
          type: OpenapiClient::Models::ListVectorStoresResponse,
          auth: ['ApiKeyAuth'],
          query: { 'limit' => limit, 'order' => order, 'after' => after, 'before' => before }
        )
      end
    end
  end
end
