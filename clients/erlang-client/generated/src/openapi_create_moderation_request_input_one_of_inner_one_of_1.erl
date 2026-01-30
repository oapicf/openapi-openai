-module(openapi_create_moderation_request_input_one_of_inner_one_of_1).

-export([encode/1]).

-export_type([openapi_create_moderation_request_input_one_of_inner_one_of_1/0]).

-type openapi_create_moderation_request_input_one_of_inner_one_of_1() ::
    #{ 'type' := binary(),
       'text' := binary()
     }.

encode(#{ 'type' := Type,
          'text' := Text
        }) ->
    #{ 'type' => Type,
       'text' => Text
     }.
