# frozen_string_literal: true

module OpenapiClient
  module Api
    class Uploads
      def initialize(connection)
        @connection = connection
      end

      def cancel(upload_id:)
        raise ArgumentError, 'upload_id is required' if upload_id.nil?

        @connection.call(
          :POST,
          '/uploads/{upload_id}/cancel'
            .gsub('{upload_id}', ERB::Util.url_encode(upload_id.to_s)),
          type: OpenapiClient::Models::Upload,
          auth: ['ApiKeyAuth']
        )
      end

      def complete(upload_id:, complete_upload_request:)
        raise ArgumentError, 'upload_id is required' if upload_id.nil?
        raise ArgumentError, 'complete_upload_request is required' if complete_upload_request.nil?

        @connection.call(
          :POST,
          '/uploads/{upload_id}/complete'
            .gsub('{upload_id}', ERB::Util.url_encode(upload_id.to_s)),
          type: OpenapiClient::Models::Upload,
          auth: ['ApiKeyAuth'],
          body: complete_upload_request
        )
      end

      def create(create_upload_request:)
        raise ArgumentError, 'create_upload_request is required' if create_upload_request.nil?

        @connection.call(
          :POST,
          '/uploads',
          type: OpenapiClient::Models::Upload,
          auth: ['ApiKeyAuth'],
          body: create_upload_request
        )
      end

      def parts(upload_id:, data:)
        raise ArgumentError, 'upload_id is required' if upload_id.nil?
        raise ArgumentError, 'data is required' if data.nil?

        @connection.call(
          :POST,
          '/uploads/{upload_id}/parts'
            .gsub('{upload_id}', ERB::Util.url_encode(upload_id.to_s)),
          type: OpenapiClient::Models::UploadPart,
          auth: ['ApiKeyAuth'],
          form: { 'data' => data }
        )
      end
    end
  end
end
