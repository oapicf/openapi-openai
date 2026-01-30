-module(openapi_project_user_update_request).

-export([encode/1]).

-export_type([openapi_project_user_update_request/0]).

-type openapi_project_user_update_request() ::
    #{ 'role' := binary()
     }.

encode(#{ 'role' := Role
        }) ->
    #{ 'role' => Role
     }.
