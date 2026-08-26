# frozen_string_literal: true

module OpenapiClient
  module Api
    class Models
      def initialize(connection)
        @connection = connection
      end

      def delete(model:)
        raise ArgumentError, 'model is required' if model.nil?

        @connection.call(
          :DELETE,
          '/models/{model}'
            .gsub('{model}', ERB::Util.url_encode(model.to_s)),
          type: OpenapiClient::Models::DeleteModelResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(model:)
        raise ArgumentError, 'model is required' if model.nil?

        @connection.call(
          :GET,
          '/models/{model}'
            .gsub('{model}', ERB::Util.url_encode(model.to_s)),
          type: OpenapiClient::Models::Model,
          auth: ['ApiKeyAuth']
        )
      end

      def list
        @connection.call(
          :GET,
          '/models',
          type: OpenapiClient::Models::ListModelsResponse,
          auth: ['ApiKeyAuth']
        )
      end
    end
  end
end
