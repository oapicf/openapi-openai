-module(openapi_create_message_request).

-export([encode/1]).

-export_type([openapi_create_message_request/0]).

-type openapi_create_message_request() ::
    #{ 'role' := binary(),
       'content' := openapi_create_message_request_content:openapi_create_message_request_content(),
       'attachments' => list(),
       'metadata' => maps:map()
     }.

encode(#{ 'role' := Role,
          'content' := Content,
          'attachments' := Attachments,
          'metadata' := Metadata
        }) ->
    #{ 'role' => Role,
       'content' => Content,
       'attachments' => Attachments,
       'metadata' => Metadata
     }.
