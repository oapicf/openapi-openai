-module(openapi_usage_completions_result).

-include("openapi.hrl").

-export([openapi_usage_completions_result/0]).

-export([openapi_usage_completions_result/1]).

-export_type([openapi_usage_completions_result/0]).

-type openapi_usage_completions_result() ::
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
  ].


openapi_usage_completions_result() ->
    openapi_usage_completions_result([]).

openapi_usage_completions_result(Fields) ->
  Default = [ {'object', elements([<<"organization.usage.completions.result">>]) }
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
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

