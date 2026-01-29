-module(openapi_modify_message_request).

-export([encode/1]).

-export_type([openapi_modify_message_request/0]).

-type openapi_modify_message_request() ::
    #{ 'metadata' => maps:map()
     }.

encode(#{ 'metadata' := Metadata
        }) ->
    #{ 'metadata' => Metadata
     }.
