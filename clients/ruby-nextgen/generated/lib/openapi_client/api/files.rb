# frozen_string_literal: true

module OpenapiClient
  module Api
    class Files
      def initialize(connection)
        @connection = connection
      end

      def content(file_id:)
        raise ArgumentError, 'file_id is required' if file_id.nil?

        @connection.call(
          :GET,
          '/files/{file_id}/content'
            .gsub('{file_id}', ERB::Util.url_encode(file_id.to_s)),
          type: nil,
          auth: ['ApiKeyAuth']
        )
      end

      def create(file:, purpose:)
        raise ArgumentError, 'file is required' if file.nil?
        raise ArgumentError, 'purpose is required' if purpose.nil?

        @connection.call(
          :POST,
          '/files',
          type: OpenapiClient::Models::OpenAIFile,
          auth: ['ApiKeyAuth'],
          form: { 'file' => file, 'purpose' => purpose }
        )
      end

      def delete(file_id:)
        raise ArgumentError, 'file_id is required' if file_id.nil?

        @connection.call(
          :DELETE,
          '/files/{file_id}'
            .gsub('{file_id}', ERB::Util.url_encode(file_id.to_s)),
          type: OpenapiClient::Models::DeleteFileResponse,
          auth: ['ApiKeyAuth']
        )
      end

      def get(file_id:)
        raise ArgumentError, 'file_id is required' if file_id.nil?

        @connection.call(
          :GET,
          '/files/{file_id}'
            .gsub('{file_id}', ERB::Util.url_encode(file_id.to_s)),
          type: OpenapiClient::Models::OpenAIFile,
          auth: ['ApiKeyAuth']
        )
      end

      def list(purpose: nil, limit: nil, order: nil, after: nil)
        @connection.call(
          :GET,
          '/files',
          type: OpenapiClient::Models::ListFilesResponse,
          auth: ['ApiKeyAuth'],
          query: { 'purpose' => purpose, 'limit' => limit, 'order' => order, 'after' => after }
        )
      end
    end
  end
end
