-module(openapi_usage_images_result).

-export([encode/1]).

-export_type([openapi_usage_images_result/0]).

-type openapi_usage_images_result() ::
    #{ 'object' := binary(),
       'images' := integer(),
       'num_model_requests' := integer(),
       'source' => binary(),
       'size' => binary(),
       'project_id' => binary(),
       'user_id' => binary(),
       'api_key_id' => binary(),
       'model' => binary()
     }.

encode(#{ 'object' := Object,
          'images' := Images,
          'num_model_requests' := NumModelRequests,
          'source' := Source,
          'size' := Size,
          'project_id' := ProjectId,
          'user_id' := UserId,
          'api_key_id' := ApiKeyId,
          'model' := Model
        }) ->
    #{ 'object' => Object,
       'images' => Images,
       'num_model_requests' => NumModelRequests,
       'source' => Source,
       'size' => Size,
       'project_id' => ProjectId,
       'user_id' => UserId,
       'api_key_id' => ApiKeyId,
       'model' => Model
     }.
