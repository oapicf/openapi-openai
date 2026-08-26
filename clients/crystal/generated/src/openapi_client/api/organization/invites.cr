require "json"

module OpenAPIClient
  module Api
  class Organization::Invites
    def initialize(@conn : Connection); end

    # Create an invite for a user to the organization. The invite must be accepted by the user before they have access to the organization.
    def create(invite_request : OpenAPIClient::InviteRequest) : Response(OpenAPIClient::Invite)
      @conn.request(OpenAPIClient::Invite,
        method: :POST,
        path: "/organization/invites",
        body: invite_request,
        accept: %w[application/json],
        content_type: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Delete an invite. If the invite has already been accepted, it cannot be deleted.
    def delete(invite_id : String) : Response(OpenAPIClient::InviteDeleteResponse)
      @conn.request(OpenAPIClient::InviteDeleteResponse,
        method: :DELETE,
        path: "/organization/invites/{invite_id}".sub("{invite_id}", OpenAPIClient.enc(invite_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Retrieves an invite.
    def get(invite_id : String) : Response(OpenAPIClient::Invite)
      @conn.request(OpenAPIClient::Invite,
        method: :GET,
        path: "/organization/invites/{invite_id}".sub("{invite_id}", OpenAPIClient.enc(invite_id)),
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end

    # Returns a list of invites in the organization.
    def list(*, limit : Int32? = nil, after : String? = nil) : Response(OpenAPIClient::InviteListResponse)
      @conn.request(OpenAPIClient::InviteListResponse,
        method: :GET,
        path: "/organization/invites",
        query: { "limit" => limit, "after" => after },
        accept: %w[application/json],
        auth: %w[ApiKeyAuth])
    end
  end
  end

end
