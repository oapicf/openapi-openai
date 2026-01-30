-module(openapi_admin_api_key_owner).

-export([encode/1]).

-export_type([openapi_admin_api_key_owner/0]).

-type openapi_admin_api_key_owner() ::
    #{ 'type' => binary(),
       'id' => binary(),
       'name' => binary(),
       'created_at' => integer(),
       'role' => binary()
     }.

encode(#{ 'type' := Type,
          'id' := Id,
          'name' := Name,
          'created_at' := CreatedAt,
          'role' := Role
        }) ->
    #{ 'type' => Type,
       'id' => Id,
       'name' => Name,
       'created_at' => CreatedAt,
       'role' => Role
     }.
