-module(openapi_admin_api_key).

-export([encode/1]).

-export_type([openapi_admin_api_key/0]).

-type openapi_admin_api_key() ::
    #{ 'object' => binary(),
       'id' => binary(),
       'name' => binary(),
       'redacted_value' => binary(),
       'value' => binary(),
       'created_at' => integer(),
       'owner' => openapi_admin_api_key_owner:openapi_admin_api_key_owner()
     }.

encode(#{ 'object' := Object,
          'id' := Id,
          'name' := Name,
          'redacted_value' := RedactedValue,
          'value' := Value,
          'created_at' := CreatedAt,
          'owner' := Owner
        }) ->
    #{ 'object' => Object,
       'id' => Id,
       'name' => Name,
       'redacted_value' => RedactedValue,
       'value' => Value,
       'created_at' => CreatedAt,
       'owner' => Owner
     }.
