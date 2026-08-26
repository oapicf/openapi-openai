# frozen_string_literal: true

module OpenapiClient
  module Api
    class Batches
      def initialize(connection)
        @connection = connection
      end

      def cancel(batch_id:)
        raise ArgumentError, 'batch_id is required' if batch_id.nil?

        @connection.call(
          :POST,
          '/batches/{batch_id}/cancel'
            .gsub('{batch_id}', ERB::Util.url_encode(batch_id.to_s)),
          type: OpenapiClient::Models::Batch,
          auth: ['ApiKeyAuth']
        )
      end

      def create(create_batch_request:)
        raise ArgumentError, 'create_batch_request is required' if create_batch_request.nil?

        @connection.call(
          :POST,
          '/batches',
          type: OpenapiClient::Models::Batch,
          auth: ['ApiKeyAuth'],
          body: create_batch_request
        )
      end

      def get(batch_id:)
        raise ArgumentError, 'batch_id is required' if batch_id.nil?

        @connection.call(
          :GET,
          '/batches/{batch_id}'
            .gsub('{batch_id}', ERB::Util.url_encode(batch_id.to_s)),
          type: OpenapiClient::Models::Batch,
          auth: ['ApiKeyAuth']
        )
      end

      def list(after: nil, limit: nil)
        @connection.call(
          :GET,
          '/batches',
          type: OpenapiClient::Models::ListBatchesResponse,
          auth: ['ApiKeyAuth'],
          query: { 'after' => after, 'limit' => limit }
        )
      end
    end
  end
end
