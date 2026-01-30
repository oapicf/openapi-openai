-module(openapi_project_service_account).

-export([encode/1]).

-export_type([openapi_project_service_account/0]).

-type openapi_project_service_account() ::
    #{ 'object' := binary(),
       'id' := binary(),
       'name' := binary(),
       'role' := binary(),
       'created_at' := integer()
     }.

encode(#{ 'object' := Object,
          'id' := Id,
          'name' := Name,
          'role' := Role,
          'created_at' := CreatedAt
        }) ->
    #{ 'object' => Object,
       'id' => Id,
       'name' => Name,
       'role' => Role,
       'created_at' => CreatedAt
     }.
