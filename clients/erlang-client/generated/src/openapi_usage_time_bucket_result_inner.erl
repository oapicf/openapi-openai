-module(openapi_usage_time_bucket_result_inner).

-export([encode/1]).

-export_type([openapi_usage_time_bucket_result_inner/0]).

-type openapi_usage_time_bucket_result_inner() ::
    #{ 'object' := binary(),
       'input_tokens' := integer(),
       'input_cached_tokens' => integer(),
       'output_tokens' := integer(),
       'input_audio_tokens' => integer(),
       'output_audio_tokens' => integer(),
       'num_model_requests' := integer(),
       'project_id' => binary(),
       'user_id' => binary(),
       'api_key_id' => binary(),
       'model' => binary(),
       'batch' => boolean(),
       'images' := integer(),
       'source' => binary(),
       'size' => binary(),
       'characters' := integer(),
       'seconds' := integer(),
       'usage_bytes' := integer(),
       'sessions' := integer(),
       'amount' => openapi_costs_result_amount:openapi_costs_result_amount(),
       'line_item' => binary()
     }.

encode(#{ 'object' := Object,
          'input_tokens' := InputTokens,
          'input_cached_tokens' := InputCachedTokens,
          'output_tokens' := OutputTokens,
          'input_audio_tokens' := InputAudioTokens,
          'output_audio_tokens' := OutputAudioTokens,
          'num_model_requests' := NumModelRequests,
          'project_id' := ProjectId,
          'user_id' := UserId,
          'api_key_id' := ApiKeyId,
          'model' := Model,
          'batch' := Batch,
          'images' := Images,
          'source' := Source,
          'size' := Size,
          'characters' := Characters,
          'seconds' := Seconds,
          'usage_bytes' := UsageBytes,
          'sessions' := Sessions,
          'amount' := Amount,
          'line_item' := LineItem
        }) ->
    #{ 'object' => Object,
       'input_tokens' => InputTokens,
       'input_cached_tokens' => InputCachedTokens,
       'output_tokens' => OutputTokens,
       'input_audio_tokens' => InputAudioTokens,
       'output_audio_tokens' => OutputAudioTokens,
       'num_model_requests' => NumModelRequests,
       'project_id' => ProjectId,
       'user_id' => UserId,
       'api_key_id' => ApiKeyId,
       'model' => Model,
       'batch' => Batch,
       'images' => Images,
       'source' => Source,
       'size' => Size,
       'characters' => Characters,
       'seconds' => Seconds,
       'usage_bytes' => UsageBytes,
       'sessions' => Sessions,
       'amount' => Amount,
       'line_item' => LineItem
     }.
