# frozen_string_literal: true

module OpenapiClient
  module Api
    class Embeddings
      def initialize(connection)
        @connection = connection
      end

      def create(create_embedding_request:)
        raise ArgumentError, 'create_embedding_request is required' if create_embedding_request.nil?

        @connection.call(
          :POST,
          '/embeddings',
          type: OpenapiClient::Models::CreateEmbeddingResponse,
          auth: ['ApiKeyAuth'],
          body: create_embedding_request
        )
      end
    end
  end
end
