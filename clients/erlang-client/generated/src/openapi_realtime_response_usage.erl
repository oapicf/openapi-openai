-module(openapi_realtime_response_usage).

-export([encode/1]).

-export_type([openapi_realtime_response_usage/0]).

-type openapi_realtime_response_usage() ::
    #{ 'total_tokens' => integer(),
       'input_tokens' => integer(),
       'output_tokens' => integer(),
       'input_token_details' => openapi_realtime_response_usage_input_token_details:openapi_realtime_response_usage_input_token_details(),
       'output_token_details' => openapi_realtime_response_usage_output_token_details:openapi_realtime_response_usage_output_token_details()
     }.

encode(#{ 'total_tokens' := TotalTokens,
          'input_tokens' := InputTokens,
          'output_tokens' := OutputTokens,
          'input_token_details' := InputTokenDetails,
          'output_token_details' := OutputTokenDetails
        }) ->
    #{ 'total_tokens' => TotalTokens,
       'input_tokens' => InputTokens,
       'output_tokens' => OutputTokens,
       'input_token_details' => InputTokenDetails,
       'output_token_details' => OutputTokenDetails
     }.
