-module(openapi_message_delta_content_refusal_object).

-export([encode/1]).

-export_type([openapi_message_delta_content_refusal_object/0]).

-type openapi_message_delta_content_refusal_object() ::
    #{ 'index' := integer(),
       'type' := binary(),
       'refusal' => binary()
     }.

encode(#{ 'index' := Index,
          'type' := Type,
          'refusal' := Refusal
        }) ->
    #{ 'index' => Index,
       'type' => Type,
       'refusal' => Refusal
     }.
