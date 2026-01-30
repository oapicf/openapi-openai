-module(openapi_project_user_create_request).

-export([encode/1]).

-export_type([openapi_project_user_create_request/0]).

-type openapi_project_user_create_request() ::
    #{ 'user_id' := binary(),
       'role' := binary()
     }.

encode(#{ 'user_id' := UserId,
          'role' := Role
        }) ->
    #{ 'user_id' => UserId,
       'role' => Role
     }.
