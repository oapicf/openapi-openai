-module(openapi_create_message_request_content).

-export([encode/1]).

-export_type([openapi_create_message_request_content/0]).

-type openapi_create_message_request_content() ::
    #{ 
     }.

encode(#{ 
        }) ->
    #{ 
     }.
