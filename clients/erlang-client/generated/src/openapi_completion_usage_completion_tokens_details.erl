-module(openapi_completion_usage_completion_tokens_details).

-export([encode/1]).

-export_type([openapi_completion_usage_completion_tokens_details/0]).

-type openapi_completion_usage_completion_tokens_details() ::
    #{ 'accepted_prediction_tokens' => integer(),
       'audio_tokens' => integer(),
       'reasoning_tokens' => integer(),
       'rejected_prediction_tokens' => integer()
     }.

encode(#{ 'accepted_prediction_tokens' := AcceptedPredictionTokens,
          'audio_tokens' := AudioTokens,
          'reasoning_tokens' := ReasoningTokens,
          'rejected_prediction_tokens' := RejectedPredictionTokens
        }) ->
    #{ 'accepted_prediction_tokens' => AcceptedPredictionTokens,
       'audio_tokens' => AudioTokens,
       'reasoning_tokens' => ReasoningTokens,
       'rejected_prediction_tokens' => RejectedPredictionTokens
     }.
