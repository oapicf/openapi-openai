-module(openapi_create_chat_completion_response_choices_inner).

-export([encode/1]).

-export_type([openapi_create_chat_completion_response_choices_inner/0]).

-type openapi_create_chat_completion_response_choices_inner() ::
    #{ 'index' => integer(),
       'message' => openapi_chat_completion_response_message:openapi_chat_completion_response_message(),
       'finish_reason' => binary()
     }.

encode(#{ 'index' := Index,
          'message' := Message,
          'finish_reason' := FinishReason
        }) ->
    #{ 'index' => Index,
       'message' => Message,
       'finish_reason' => FinishReason
     }.
