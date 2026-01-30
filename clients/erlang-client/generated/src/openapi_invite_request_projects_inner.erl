-module(openapi_invite_request_projects_inner).

-export([encode/1]).

-export_type([openapi_invite_request_projects_inner/0]).

-type openapi_invite_request_projects_inner() ::
    #{ 'id' := binary(),
       'role' := binary()
     }.

encode(#{ 'id' := Id,
          'role' := Role
        }) ->
    #{ 'id' => Id,
       'role' => Role
     }.
