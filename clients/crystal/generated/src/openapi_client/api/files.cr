require "json"

module OpenAPIClient
  module Api
  class Files
    def initialize(@conn : Connection); end

    # Returns the contents of the specified file.
    def content(file_id : String) : Response(String)
      @conn.request(String,
        method: :GET,
        path: "/files/{file_id}/content".sub("{file_id}", OpenAPIClient.enc(file_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Upload a file that can be used across various endpoints. Individual files can be up to 512 MB, and the size of all files uploaded by one organization can be up to 100 GB.  The Assistants API supports files up to 2 million tokens and of specific file types. See the [Assistants Tools guide](/docs/assistants/tools) for details.  The Fine-tuning API only supports &#x60;.jsonl&#x60; files. The input also has certain required formats for fine-tuning [chat](/docs/api-reference/fine-tuning/chat-input) or [completions](/docs/api-reference/fine-tuning/completions-input) models.  The Batch API only supports &#x60;.jsonl&#x60; files up to 200 MB in size. The input also has a specific required [format](/docs/api-reference/batch/request-input).  Please [contact us](https://help.openai.com/) if you need to increase these storage limits. 
    def create(file : ::File? = nil, purpose : String? = nil) : Response(OpenAPIClient::OpenAIFile)
      @conn.request(OpenAPIClient::OpenAIFile,
        method: :POST,
        path: "/files",
        form: Hash(String, Crest::ParamsValue){ "file" => file, "purpose" => purpose },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Delete a file.
    def delete(file_id : String) : Response(OpenAPIClient::DeleteFileResponse)
      @conn.request(OpenAPIClient::DeleteFileResponse,
        method: :DELETE,
        path: "/files/{file_id}".sub("{file_id}", OpenAPIClient.enc(file_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns information about a specific file.
    def get(file_id : String) : Response(OpenAPIClient::OpenAIFile)
      @conn.request(OpenAPIClient::OpenAIFile,
        method: :GET,
        path: "/files/{file_id}".sub("{file_id}", OpenAPIClient.enc(file_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of files.
    def list(*, purpose : String? = nil, limit : Int32? = nil, order : String? = nil, after : String? = nil) : Response(OpenAPIClient::ListFilesResponse)
      @conn.request(OpenAPIClient::ListFilesResponse,
        method: :GET,
        path: "/files",
        query: { "purpose" => purpose, "limit" => limit, "order" => order, "after" => after },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
