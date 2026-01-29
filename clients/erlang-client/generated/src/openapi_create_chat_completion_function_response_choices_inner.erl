-module(openapi_create_chat_completion_function_response_choices_inner).

-export([encode/1]).

-export_type([openapi_create_chat_completion_function_response_choices_inner/0]).

-type openapi_create_chat_completion_function_response_choices_inner() ::
    #{ 'finish_reason' := binary(),
       'index' := integer(),
       'message' := openapi_chat_completion_response_message:openapi_chat_completion_response_message()
     }.

encode(#{ 'finish_reason' := FinishReason,
          'index' := Index,
          'message' := Message
        }) ->
    #{ 'finish_reason' => FinishReason,
       'index' => Index,
       'message' => Message
     }.
