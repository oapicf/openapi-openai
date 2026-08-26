require "json"

module OpenAPIClient
  module Api
  class Organization::Projects
    def initialize(@conn : Connection); end

    # Returns a list of API keys in the project.
    def api_keys(project_id : String, *, limit : Int32? = nil, after : String? = nil) : Response(OpenAPIClient::ProjectApiKeyListResponse)
      @conn.request(OpenAPIClient::ProjectApiKeyListResponse,
        method: :GET,
        path: "/organization/projects/{project_id}/api_keys".sub("{project_id}", OpenAPIClient.enc(project_id)),
        query: { "limit" => limit, "after" => after },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Deletes an API key from the project.
    def api_keys_delete(project_id : String, key_id : String) : Response(OpenAPIClient::ProjectApiKeyDeleteResponse)
      @conn.request(OpenAPIClient::ProjectApiKeyDeleteResponse,
        method: :DELETE,
        path: "/organization/projects/{project_id}/api_keys/{key_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{key_id}", OpenAPIClient.enc(key_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves an API key in the project.
    def api_keys_get(project_id : String, key_id : String) : Response(OpenAPIClient::ProjectApiKey)
      @conn.request(OpenAPIClient::ProjectApiKey,
        method: :GET,
        path: "/organization/projects/{project_id}/api_keys/{key_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{key_id}", OpenAPIClient.enc(key_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Archives a project in the organization. Archived projects cannot be used or updated.
    def archive(project_id : String) : Response(OpenAPIClient::Project)
      @conn.request(OpenAPIClient::Project,
        method: :POST,
        path: "/organization/projects/{project_id}/archive".sub("{project_id}", OpenAPIClient.enc(project_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Create a new project in the organization. Projects can be created and archived, but cannot be deleted.
    def create(project_create_request : OpenAPIClient::ProjectCreateRequest) : Response(OpenAPIClient::Project)
      @conn.request(OpenAPIClient::Project,
        method: :POST,
        path: "/organization/projects",
        body: project_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Modifies a project in the organization.
    def create_post(project_id : String, project_update_request : OpenAPIClient::ProjectUpdateRequest) : Response(OpenAPIClient::Project)
      @conn.request(OpenAPIClient::Project,
        method: :POST,
        path: "/organization/projects/{project_id}".sub("{project_id}", OpenAPIClient.enc(project_id)),
        body: project_update_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a project.
    def get(project_id : String) : Response(OpenAPIClient::Project)
      @conn.request(OpenAPIClient::Project,
        method: :GET,
        path: "/organization/projects/{project_id}".sub("{project_id}", OpenAPIClient.enc(project_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of projects.
    def list(*, limit : Int32? = nil, after : String? = nil, include_archived : Bool? = nil) : Response(OpenAPIClient::ProjectListResponse)
      @conn.request(OpenAPIClient::ProjectListResponse,
        method: :GET,
        path: "/organization/projects",
        query: { "limit" => limit, "after" => after, "include_archived" => include_archived },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns the rate limits per model for a project.
    def rate_limits(project_id : String, *, limit : Int32? = nil, after : String? = nil, before : String? = nil) : Response(OpenAPIClient::ProjectRateLimitListResponse)
      @conn.request(OpenAPIClient::ProjectRateLimitListResponse,
        method: :GET,
        path: "/organization/projects/{project_id}/rate_limits".sub("{project_id}", OpenAPIClient.enc(project_id)),
        query: { "limit" => limit, "after" => after, "before" => before },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Updates a project rate limit.
    def rate_limits_post(project_id : String, rate_limit_id : String, project_rate_limit_update_request : OpenAPIClient::ProjectRateLimitUpdateRequest) : Response(OpenAPIClient::ProjectRateLimit)
      @conn.request(OpenAPIClient::ProjectRateLimit,
        method: :POST,
        path: "/organization/projects/{project_id}/rate_limits/{rate_limit_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{rate_limit_id}", OpenAPIClient.enc(rate_limit_id)),
        body: project_rate_limit_update_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of service accounts in the project.
    def service_accounts(project_id : String, *, limit : Int32? = nil, after : String? = nil) : Response(OpenAPIClient::ProjectServiceAccountListResponse)
      @conn.request(OpenAPIClient::ProjectServiceAccountListResponse,
        method: :GET,
        path: "/organization/projects/{project_id}/service_accounts".sub("{project_id}", OpenAPIClient.enc(project_id)),
        query: { "limit" => limit, "after" => after },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Deletes a service account from the project.
    def service_accounts_delete(project_id : String, service_account_id : String) : Response(OpenAPIClient::ProjectServiceAccountDeleteResponse)
      @conn.request(OpenAPIClient::ProjectServiceAccountDeleteResponse,
        method: :DELETE,
        path: "/organization/projects/{project_id}/service_accounts/{service_account_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{service_account_id}", OpenAPIClient.enc(service_account_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a service account in the project.
    def service_accounts_get(project_id : String, service_account_id : String) : Response(OpenAPIClient::ProjectServiceAccount)
      @conn.request(OpenAPIClient::ProjectServiceAccount,
        method: :GET,
        path: "/organization/projects/{project_id}/service_accounts/{service_account_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{service_account_id}", OpenAPIClient.enc(service_account_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Creates a new service account in the project. This also returns an unredacted API key for the service account.
    def service_accounts_post(project_id : String, project_service_account_create_request : OpenAPIClient::ProjectServiceAccountCreateRequest) : Response(OpenAPIClient::ProjectServiceAccountCreateResponse)
      @conn.request(OpenAPIClient::ProjectServiceAccountCreateResponse,
        method: :POST,
        path: "/organization/projects/{project_id}/service_accounts".sub("{project_id}", OpenAPIClient.enc(project_id)),
        body: project_service_account_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of users in the project.
    def users(project_id : String, *, limit : Int32? = nil, after : String? = nil) : Response(OpenAPIClient::ProjectUserListResponse)
      @conn.request(OpenAPIClient::ProjectUserListResponse,
        method: :GET,
        path: "/organization/projects/{project_id}/users".sub("{project_id}", OpenAPIClient.enc(project_id)),
        query: { "limit" => limit, "after" => after },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Deletes a user from the project.
    def users_delete(project_id : String, user_id : String) : Response(OpenAPIClient::ProjectUserDeleteResponse)
      @conn.request(OpenAPIClient::ProjectUserDeleteResponse,
        method: :DELETE,
        path: "/organization/projects/{project_id}/users/{user_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{user_id}", OpenAPIClient.enc(user_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves a user in the project.
    def users_get(project_id : String, user_id : String) : Response(OpenAPIClient::ProjectUser)
      @conn.request(OpenAPIClient::ProjectUser,
        method: :GET,
        path: "/organization/projects/{project_id}/users/{user_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{user_id}", OpenAPIClient.enc(user_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Adds a user to the project. Users must already be members of the organization to be added to a project.
    def users_post(project_id : String, project_user_create_request : OpenAPIClient::ProjectUserCreateRequest) : Response(OpenAPIClient::ProjectUser)
      @conn.request(OpenAPIClient::ProjectUser,
        method: :POST,
        path: "/organization/projects/{project_id}/users".sub("{project_id}", OpenAPIClient.enc(project_id)),
        body: project_user_create_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Modifies a user&#39;s role in the project.
    def users_post_1(project_id : String, user_id : String, project_user_update_request : OpenAPIClient::ProjectUserUpdateRequest) : Response(OpenAPIClient::ProjectUser)
      @conn.request(OpenAPIClient::ProjectUser,
        method: :POST,
        path: "/organization/projects/{project_id}/users/{user_id}".sub("{project_id}", OpenAPIClient.enc(project_id)).sub("{user_id}", OpenAPIClient.enc(user_id)),
        body: project_user_update_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
