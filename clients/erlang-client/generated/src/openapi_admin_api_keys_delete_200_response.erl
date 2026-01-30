-module(openapi_admin_api_keys_delete_200_response).

-export([encode/1]).

-export_type([openapi_admin_api_keys_delete_200_response/0]).

-type openapi_admin_api_keys_delete_200_response() ::
    #{ 'id' => binary(),
       'object' => binary(),
       'deleted' => boolean()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'deleted' := Deleted
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'deleted' => Deleted
     }.
