require "json"

module OpenAPIClient
  module Api
  class Organization::Users
    def initialize(@conn : Connection); end

    # Modifies a user&#39;s role in the organization.
    def create(user_id : String, user_role_update_request : OpenAPIClient::UserRoleUpdateRequest) : Response(OpenAPIClient::User)
      @conn.request(OpenAPIClient::User,
        method: :POST,
        path: "/organization/users/{user_id}".sub("{user_id}", OpenAPIClient.enc(user_id)),
        body: user_role_update_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Deletes a user from the organization.
    def delete(user_id : String) : Response(OpenAPIClient::UserDeleteResponse)
      @conn.request(OpenAPIClient::UserDeleteResponse,
        method: :DELETE,
        path: "/organization/users/{user_id}".sub("{user_id}", OpenAPIClient.enc(user_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a user by their identifier.
    def get(user_id : String) : Response(OpenAPIClient::User)
      @conn.request(OpenAPIClient::User,
        method: :GET,
        path: "/organization/users/{user_id}".sub("{user_id}", OpenAPIClient.enc(user_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Lists all of the users in the organization.
    def list(*, limit : Int32? = nil, after : String? = nil) : Response(OpenAPIClient::UserListResponse)
      @conn.request(OpenAPIClient::UserListResponse,
        method: :GET,
        path: "/organization/users",
        query: { "limit" => limit, "after" => after },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
