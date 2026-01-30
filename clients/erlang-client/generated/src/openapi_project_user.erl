-module(openapi_project_user).

-export([encode/1]).

-export_type([openapi_project_user/0]).

-type openapi_project_user() ::
    #{ 'object' := binary(),
       'id' := binary(),
       'name' := binary(),
       'email' := binary(),
       'role' := binary(),
       'added_at' := integer()
     }.

encode(#{ 'object' := Object,
          'id' := Id,
          'name' := Name,
          'email' := Email,
          'role' := Role,
          'added_at' := AddedAt
        }) ->
    #{ 'object' => Object,
       'id' => Id,
       'name' => Name,
       'email' => Email,
       'role' => Role,
       'added_at' => AddedAt
     }.
