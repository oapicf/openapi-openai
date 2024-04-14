-module(openapi_create_chat_completion_response_choices_inner_logprobs).

-export([encode/1]).

-export_type([openapi_create_chat_completion_response_choices_inner_logprobs/0]).

-type openapi_create_chat_completion_response_choices_inner_logprobs() ::
    #{ 'content' := list()
     }.

encode(#{ 'content' := Content
        }) ->
    #{ 'content' => Content
     }.
