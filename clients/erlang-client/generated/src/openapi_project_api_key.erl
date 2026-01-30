-module(openapi_project_api_key).

-export([encode/1]).

-export_type([openapi_project_api_key/0]).

-type openapi_project_api_key() ::
    #{ 'object' := binary(),
       'redacted_value' := binary(),
       'name' := binary(),
       'created_at' := integer(),
       'id' := binary(),
       'owner' := openapi_project_api_key_owner:openapi_project_api_key_owner()
     }.

encode(#{ 'object' := Object,
          'redacted_value' := RedactedValue,
          'name' := Name,
          'created_at' := CreatedAt,
          'id' := Id,
          'owner' := Owner
        }) ->
    #{ 'object' => Object,
       'redacted_value' => RedactedValue,
       'name' => Name,
       'created_at' => CreatedAt,
       'id' => Id,
       'owner' => Owner
     }.
