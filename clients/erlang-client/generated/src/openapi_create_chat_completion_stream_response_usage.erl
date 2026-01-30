-module(openapi_create_chat_completion_stream_response_usage).

-export([encode/1]).

-export_type([openapi_create_chat_completion_stream_response_usage/0]).

-type openapi_create_chat_completion_stream_response_usage() ::
    #{ 'completion_tokens' := integer(),
       'prompt_tokens' := integer(),
       'total_tokens' := integer()
     }.

encode(#{ 'completion_tokens' := CompletionTokens,
          'prompt_tokens' := PromptTokens,
          'total_tokens' := TotalTokens
        }) ->
    #{ 'completion_tokens' => CompletionTokens,
       'prompt_tokens' => PromptTokens,
       'total_tokens' => TotalTokens
     }.
