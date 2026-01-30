-module(openapi_admin_api_keys_create_request).

-export([encode/1]).

-export_type([openapi_admin_api_keys_create_request/0]).

-type openapi_admin_api_keys_create_request() ::
    #{ 'name' := binary()
     }.

encode(#{ 'name' := Name
        }) ->
    #{ 'name' => Name
     }.
