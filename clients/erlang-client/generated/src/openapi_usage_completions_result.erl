-module(openapi_usage_completions_result).

-export([encode/1]).

-export_type([openapi_usage_completions_result/0]).

-type openapi_usage_completions_result() ::
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
       'batch' => boolean()
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
          'batch' := Batch
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
       'batch' => Batch
     }.
