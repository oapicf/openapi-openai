-module(openapi_project_api_key_delete_response).

-export([encode/1]).

-export_type([openapi_project_api_key_delete_response/0]).

-type openapi_project_api_key_delete_response() ::
    #{ 'object' := binary(),
       'id' := binary(),
       'deleted' := boolean()
     }.

encode(#{ 'object' := Object,
          'id' := Id,
          'deleted' := Deleted
        }) ->
    #{ 'object' => Object,
       'id' => Id,
       'deleted' => Deleted
     }.
