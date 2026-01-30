-module(openapi_usage_embeddings_result).

-export([encode/1]).

-export_type([openapi_usage_embeddings_result/0]).

-type openapi_usage_embeddings_result() ::
    #{ 'object' := binary(),
       'input_tokens' := integer(),
       'num_model_requests' := integer(),
       'project_id' => binary(),
       'user_id' => binary(),
       'api_key_id' => binary(),
       'model' => binary()
     }.

encode(#{ 'object' := Object,
          'input_tokens' := InputTokens,
          'num_model_requests' := NumModelRequests,
          'project_id' := ProjectId,
          'user_id' := UserId,
          'api_key_id' := ApiKeyId,
          'model' := Model
        }) ->
    #{ 'object' => Object,
       'input_tokens' => InputTokens,
       'num_model_requests' => NumModelRequests,
       'project_id' => ProjectId,
       'user_id' => UserId,
       'api_key_id' => ApiKeyId,
       'model' => Model
     }.
