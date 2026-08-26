require "json"

module OpenAPIClient
  module Api
  class Organization::AdminApiKeys
    def initialize(@conn : Connection); end

    # Create an organization admin API key Create a new admin-level API key for the organization.
    def create(admin_api_keys_create_request : OpenAPIClient::AdminApiKeysCreateRequest) : Response(OpenAPIClient::AdminApiKey)
      @conn.request(OpenAPIClient::AdminApiKey,
        method: :POST,
        path: "/organization/admin_api_keys",
        body: admin_api_keys_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Delete an organization admin API key Delete the specified admin API key.
    def delete(key_id : String) : Response(OpenAPIClient::AdminApiKeysDelete200Response)
      @conn.request(OpenAPIClient::AdminApiKeysDelete200Response,
        method: :DELETE,
        path: "/organization/admin_api_keys/{key_id}".sub("{key_id}", OpenAPIClient.enc(key_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieve a single organization API key Get details for a specific organization API key by its ID.
    def get(key_id : String) : Response(OpenAPIClient::AdminApiKey)
      @conn.request(OpenAPIClient::AdminApiKey,
        method: :GET,
        path: "/organization/admin_api_keys/{key_id}".sub("{key_id}", OpenAPIClient.enc(key_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # List organization API keys Retrieve a paginated list of organization admin API keys.
    def list(*, after : String? = nil, order : String? = nil, limit : Int32? = nil) : Response(OpenAPIClient::ApiKeyList)
      @conn.request(OpenAPIClient::ApiKeyList,
        method: :GET,
        path: "/organization/admin_api_keys",
        query: { "after" => after, "order" => order, "limit" => limit },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
