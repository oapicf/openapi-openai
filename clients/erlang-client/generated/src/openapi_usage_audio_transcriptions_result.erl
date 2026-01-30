-module(openapi_usage_audio_transcriptions_result).

-export([encode/1]).

-export_type([openapi_usage_audio_transcriptions_result/0]).

-type openapi_usage_audio_transcriptions_result() ::
    #{ 'object' := binary(),
       'seconds' := integer(),
       'num_model_requests' := integer(),
       'project_id' => binary(),
       'user_id' => binary(),
       'api_key_id' => binary(),
       'model' => binary()
     }.

encode(#{ 'object' := Object,
          'seconds' := Seconds,
          'num_model_requests' := NumModelRequests,
          'project_id' := ProjectId,
          'user_id' := UserId,
          'api_key_id' := ApiKeyId,
          'model' := Model
        }) ->
    #{ 'object' => Object,
       'seconds' => Seconds,
       'num_model_requests' => NumModelRequests,
       'project_id' => ProjectId,
       'user_id' => UserId,
       'api_key_id' => ApiKeyId,
       'model' => Model
     }.
