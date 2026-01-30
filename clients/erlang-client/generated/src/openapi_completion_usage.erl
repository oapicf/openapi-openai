-module(openapi_completion_usage).

-export([encode/1]).

-export_type([openapi_completion_usage/0]).

-type openapi_completion_usage() ::
    #{ 'completion_tokens' := integer(),
       'prompt_tokens' := integer(),
       'total_tokens' := integer(),
       'completion_tokens_details' => openapi_completion_usage_completion_tokens_details:openapi_completion_usage_completion_tokens_details(),
       'prompt_tokens_details' => openapi_completion_usage_prompt_tokens_details:openapi_completion_usage_prompt_tokens_details()
     }.

encode(#{ 'completion_tokens' := CompletionTokens,
          'prompt_tokens' := PromptTokens,
          'total_tokens' := TotalTokens,
          'completion_tokens_details' := CompletionTokensDetails,
          'prompt_tokens_details' := PromptTokensDetails
        }) ->
    #{ 'completion_tokens' => CompletionTokens,
       'prompt_tokens' => PromptTokens,
       'total_tokens' => TotalTokens,
       'completion_tokens_details' => CompletionTokensDetails,
       'prompt_tokens_details' => PromptTokensDetails
     }.
