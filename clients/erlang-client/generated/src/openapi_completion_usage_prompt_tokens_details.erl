-module(openapi_completion_usage_prompt_tokens_details).

-export([encode/1]).

-export_type([openapi_completion_usage_prompt_tokens_details/0]).

-type openapi_completion_usage_prompt_tokens_details() ::
    #{ 'audio_tokens' => integer(),
       'cached_tokens' => integer()
     }.

encode(#{ 'audio_tokens' := AudioTokens,
          'cached_tokens' := CachedTokens
        }) ->
    #{ 'audio_tokens' => AudioTokens,
       'cached_tokens' => CachedTokens
     }.
