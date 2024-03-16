-module(openapi_delete_file_response).

-export([encode/1]).

-export_type([openapi_delete_file_response/0]).

-type openapi_delete_file_response() ::
    #{ 'id' := binary(),
       'object' := binary(),
       'deleted' := boolean()
     }.

encode(#{ 'id' := Id,
          'object' := Object,
          'deleted' := Deleted
        }) ->
    #{ 'id' => Id,
       'object' => Object,
       'deleted' => Deleted
     }.
