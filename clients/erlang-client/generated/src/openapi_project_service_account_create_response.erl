-module(openapi_project_service_account_create_response).

-export([encode/1]).

-export_type([openapi_project_service_account_create_response/0]).

-type openapi_project_service_account_create_response() ::
    #{ 'object' := binary(),
       'id' := binary(),
       'name' := binary(),
       'role' := binary(),
       'created_at' := integer(),
       'api_key' := openapi_project_service_account_api_key:openapi_project_service_account_api_key()
     }.

encode(#{ 'object' := Object,
          'id' := Id,
          'name' := Name,
          'role' := Role,
          'created_at' := CreatedAt,
          'api_key' := ApiKey
        }) ->
    #{ 'object' => Object,
       'id' => Id,
       'name' => Name,
       'role' => Role,
       'created_at' => CreatedAt,
       'api_key' => ApiKey
     }.
