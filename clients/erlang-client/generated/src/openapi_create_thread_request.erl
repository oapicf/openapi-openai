-module(openapi_create_thread_request).

-export([encode/1]).

-export_type([openapi_create_thread_request/0]).

-type openapi_create_thread_request() ::
    #{ 'messages' => list(),
       'metadata' => maps:map()
     }.

encode(#{ 'messages' := Messages,
          'metadata' := Metadata
        }) ->
    #{ 'messages' => Messages,
       'metadata' => Metadata
     }.
