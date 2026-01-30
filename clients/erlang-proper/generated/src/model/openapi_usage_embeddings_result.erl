-module(openapi_usage_embeddings_result).

-include("openapi.hrl").

-export([openapi_usage_embeddings_result/0]).

-export([openapi_usage_embeddings_result/1]).

-export_type([openapi_usage_embeddings_result/0]).

-type openapi_usage_embeddings_result() ::
  [ {'object', binary() }
  | {'input_tokens', integer() }
  | {'num_model_requests', integer() }
  | {'project_id', binary() }
  | {'user_id', binary() }
  | {'api_key_id', binary() }
  | {'model', binary() }
  ].


openapi_usage_embeddings_result() ->
    openapi_usage_embeddings_result([]).

openapi_usage_embeddings_result(Fields) ->
  Default = [ {'object', elements([<<"organization.usage.embeddings.result">>]) }
            , {'input_tokens', integer() }
            , {'num_model_requests', integer() }
            , {'project_id', binary() }
            , {'user_id', binary() }
            , {'api_key_id', binary() }
            , {'model', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

