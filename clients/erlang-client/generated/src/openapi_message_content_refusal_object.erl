-module(openapi_message_content_refusal_object).

-export([encode/1]).

-export_type([openapi_message_content_refusal_object/0]).

-type openapi_message_content_refusal_object() ::
    #{ 'type' := binary(),
       'refusal' := binary()
     }.

encode(#{ 'type' := Type,
          'refusal' := Refusal
        }) ->
    #{ 'type' => Type,
       'refusal' => Refusal
     }.
