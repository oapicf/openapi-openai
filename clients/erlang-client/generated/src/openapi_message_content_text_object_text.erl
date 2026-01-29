-module(openapi_message_content_text_object_text).

-export([encode/1]).

-export_type([openapi_message_content_text_object_text/0]).

-type openapi_message_content_text_object_text() ::
    #{ 'value' := binary(),
       'annotations' := list()
     }.

encode(#{ 'value' := Value,
          'annotations' := Annotations
        }) ->
    #{ 'value' => Value,
       'annotations' => Annotations
     }.
