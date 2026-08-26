# frozen_string_literal: true

module OpenapiClient
  module Api
    class Images
      def initialize(connection)
        @connection = connection
      end

      def edits(image:, prompt:, mask: nil, model: nil, n: nil, size: nil, response_format: nil, user: nil)
        raise ArgumentError, 'image is required' if image.nil?
        raise ArgumentError, 'prompt is required' if prompt.nil?

        @connection.call(
          :POST,
          '/images/edits',
          type: OpenapiClient::Models::ImagesResponse,
          auth: ['ApiKeyAuth'],
          form: { 'image' => image, 'prompt' => prompt, 'mask' => mask, 'model' => model, 'n' => n, 'size' => size, 'response_format' => response_format, 'user' => user }
        )
      end

      def generations(create_image_request:)
        raise ArgumentError, 'create_image_request is required' if create_image_request.nil?

        @connection.call(
          :POST,
          '/images/generations',
          type: OpenapiClient::Models::ImagesResponse,
          auth: ['ApiKeyAuth'],
          body: create_image_request
        )
      end

      def variations(image:, model: nil, n: nil, response_format: nil, size: nil, user: nil)
        raise ArgumentError, 'image is required' if image.nil?

        @connection.call(
          :POST,
          '/images/variations',
          type: OpenapiClient::Models::ImagesResponse,
          auth: ['ApiKeyAuth'],
          form: { 'image' => image, 'model' => model, 'n' => n, 'response_format' => response_format, 'size' => size, 'user' => user }
        )
      end
    end
  end
end
