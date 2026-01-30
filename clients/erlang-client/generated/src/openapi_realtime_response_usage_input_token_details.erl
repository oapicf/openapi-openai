-module(openapi_realtime_response_usage_input_token_details).

-export([encode/1]).

-export_type([openapi_realtime_response_usage_input_token_details/0]).

-type openapi_realtime_response_usage_input_token_details() ::
    #{ 'cached_tokens' => integer(),
       'text_tokens' => integer(),
       'audio_tokens' => integer()
     }.

encode(#{ 'cached_tokens' := CachedTokens,
          'text_tokens' := TextTokens,
          'audio_tokens' := AudioTokens
        }) ->
    #{ 'cached_tokens' => CachedTokens,
       'text_tokens' => TextTokens,
       'audio_tokens' => AudioTokens
     }.
