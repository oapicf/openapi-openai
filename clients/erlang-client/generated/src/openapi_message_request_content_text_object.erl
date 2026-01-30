-module(openapi_message_request_content_text_object).

-export([encode/1]).

-export_type([openapi_message_request_content_text_object/0]).

-type openapi_message_request_content_text_object() ::
    #{ 'type' := binary(),
       'text' := binary()
     }.

encode(#{ 'type' := Type,
          'text' := Text
        }) ->
    #{ 'type' => Type,
       'text' => Text
     }.
