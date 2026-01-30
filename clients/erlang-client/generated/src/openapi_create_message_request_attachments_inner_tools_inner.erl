-module(openapi_create_message_request_attachments_inner_tools_inner).

-export([encode/1]).

-export_type([openapi_create_message_request_attachments_inner_tools_inner/0]).

-type openapi_create_message_request_attachments_inner_tools_inner() ::
    #{ 'type' := binary()
     }.

encode(#{ 'type' := Type
        }) ->
    #{ 'type' => Type
     }.
