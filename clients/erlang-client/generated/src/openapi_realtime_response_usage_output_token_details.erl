-module(openapi_realtime_response_usage_output_token_details).

-export([encode/1]).

-export_type([openapi_realtime_response_usage_output_token_details/0]).

-type openapi_realtime_response_usage_output_token_details() ::
    #{ 'text_tokens' => integer(),
       'audio_tokens' => integer()
     }.

encode(#{ 'text_tokens' := TextTokens,
          'audio_tokens' := AudioTokens
        }) ->
    #{ 'text_tokens' => TextTokens,
       'audio_tokens' => AudioTokens
     }.
