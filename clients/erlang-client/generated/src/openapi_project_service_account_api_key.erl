-module(openapi_project_service_account_api_key).

-export([encode/1]).

-export_type([openapi_project_service_account_api_key/0]).

-type openapi_project_service_account_api_key() ::
    #{ 'object' := binary(),
       'value' := binary(),
       'name' := binary(),
       'created_at' := integer(),
       'id' := binary()
     }.

encode(#{ 'object' := Object,
          'value' := Value,
          'name' := Name,
          'created_at' := CreatedAt,
          'id' := Id
        }) ->
    #{ 'object' => Object,
       'value' => Value,
       'name' => Name,
       'created_at' => CreatedAt,
       'id' => Id
     }.
