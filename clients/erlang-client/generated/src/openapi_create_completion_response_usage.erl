-module(openapi_create_completion_response_usage).

-export([encode/1]).

-export_type([openapi_create_completion_response_usage/0]).

-type openapi_create_completion_response_usage() ::
    #{ 'prompt_tokens' := integer(),
       'completion_tokens' := integer(),
       'total_tokens' := integer()
     }.

encode(#{ 'prompt_tokens' := PromptTokens,
          'completion_tokens' := CompletionTokens,
          'total_tokens' := TotalTokens
        }) ->
    #{ 'prompt_tokens' => PromptTokens,
       'completion_tokens' => CompletionTokens,
       'total_tokens' => TotalTokens
     }.
