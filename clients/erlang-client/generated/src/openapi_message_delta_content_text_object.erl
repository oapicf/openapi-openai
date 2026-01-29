-module(openapi_message_delta_content_text_object).

-export([encode/1]).

-export_type([openapi_message_delta_content_text_object/0]).

-type openapi_message_delta_content_text_object() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'text' => openapi_message_delta_content_text_object_text:openapi_message_delta_content_text_object_text()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'text' := Text
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'text' => Text
     }.
