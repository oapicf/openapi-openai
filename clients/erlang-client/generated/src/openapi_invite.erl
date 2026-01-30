-module(openapi_invite).

-export([encode/1]).

-export_type([openapi_invite/0]).

-type openapi_invite() ::
    #{ 'object' := binary(),
       'id' := binary(),
       'email' := binary(),
       'role' := binary(),
       'status' := binary(),
       'invited_at' := integer(),
       'expires_at' := integer(),
       'accepted_at' => integer(),
       'projects' => list()
     }.

encode(#{ 'object' := Object,
          'id' := Id,
          'email' := Email,
          'role' := Role,
          'status' := Status,
          'invited_at' := InvitedAt,
          'expires_at' := ExpiresAt,
          'accepted_at' := AcceptedAt,
          'projects' := Projects
        }) ->
    #{ 'object' => Object,
       'id' => Id,
       'email' => Email,
       'role' => Role,
       'status' => Status,
       'invited_at' => InvitedAt,
       'expires_at' => ExpiresAt,
       'accepted_at' => AcceptedAt,
       'projects' => Projects
     }.
