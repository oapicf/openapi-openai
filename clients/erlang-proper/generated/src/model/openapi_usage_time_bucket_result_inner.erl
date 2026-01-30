-module(openapi_usage_time_bucket_result_inner).

-include("openapi.hrl").

-export([openapi_usage_time_bucket_result_inner/0]).

-export([openapi_usage_time_bucket_result_inner/1]).

-export_type([openapi_usage_time_bucket_result_inner/0]).

-type openapi_usage_time_bucket_result_inner() ::
  [ {'object', binary() }
  | {'input_tokens', integer() }
  | {'input_cached_tokens', integer() }
  | {'output_tokens', integer() }
  | {'input_audio_tokens', integer() }
  | {'output_audio_tokens', integer() }
  | {'num_model_requests', integer() }
  | {'project_id', binary() }
  | {'user_id', binary() }
  | {'api_key_id', binary() }
  | {'model', binary() }
  | {'batch', boolean() }
  | {'images', integer() }
  | {'source', binary() }
  | {'size', binary() }
  | {'characters', integer() }
  | {'seconds', integer() }
  | {'usage_bytes', integer() }
  | {'sessions', integer() }
  | {'amount', openapi_costs_result_amount:openapi_costs_result_amount() }
  | {'line_item', binary() }
  ].


openapi_usage_time_bucket_result_inner() ->
    openapi_usage_time_bucket_result_inner([]).

openapi_usage_time_bucket_result_inner(Fields) ->
  Default = [ {'object', elements([<<"organization.costs.result">>]) }
            , {'input_tokens', integer() }
            , {'input_cached_tokens', integer() }
            , {'output_tokens', integer() }
            , {'input_audio_tokens', integer() }
            , {'output_audio_tokens', integer() }
            , {'num_model_requests', integer() }
            , {'project_id', binary() }
            , {'user_id', binary() }
            , {'api_key_id', binary() }
            , {'model', binary() }
            , {'batch', boolean() }
            , {'images', integer() }
            , {'source', binary() }
            , {'size', binary() }
            , {'characters', integer() }
            , {'seconds', integer() }
            , {'usage_bytes', integer() }
            , {'sessions', integer() }
            , {'amount', openapi_costs_result_amount:openapi_costs_result_amount() }
            , {'line_item', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

