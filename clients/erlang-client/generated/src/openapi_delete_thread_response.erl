-module(openapi_delete_thread_response).

-export([encode/1]).

-export_type([openapi_delete_thread_response/0]).

-type openapi_delete_thread_response() ::
    #{ 'id' := binary(),
       'deleted' := boolean(),
       'object' := binary()
     }.

encode(#{ 'id' := Id,
          'deleted' := Deleted,
          'object' := Object
        }) ->
    #{ 'id' => Id,
       'deleted' => Deleted,
       'object' => Object
     }.
