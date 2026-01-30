-module(openapi_usage_audio_speeches_result).

-export([encode/1]).

-export_type([openapi_usage_audio_speeches_result/0]).

-type openapi_usage_audio_speeches_result() ::
    #{ 'object' := binary(),
       'characters' := integer(),
       'num_model_requests' := integer(),
       'project_id' => binary(),
       'user_id' => binary(),
       'api_key_id' => binary(),
       'model' => binary()
     }.

encode(#{ 'object' := Object,
          'characters' := Characters,
          'num_model_requests' := NumModelRequests,
          'project_id' := ProjectId,
          'user_id' := UserId,
          'api_key_id' := ApiKeyId,
          'model' := Model
        }) ->
    #{ 'object' => Object,
       'characters' => Characters,
       'num_model_requests' => NumModelRequests,
       'project_id' => ProjectId,
       'user_id' => UserId,
       'api_key_id' => ApiKeyId,
       'model' => Model
     }.
