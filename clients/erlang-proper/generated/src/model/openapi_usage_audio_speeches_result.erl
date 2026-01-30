-module(openapi_usage_audio_speeches_result).

-include("openapi.hrl").

-export([openapi_usage_audio_speeches_result/0]).

-export([openapi_usage_audio_speeches_result/1]).

-export_type([openapi_usage_audio_speeches_result/0]).

-type openapi_usage_audio_speeches_result() ::
  [ {'object', binary() }
  | {'characters', integer() }
  | {'num_model_requests', integer() }
  | {'project_id', binary() }
  | {'user_id', binary() }
  | {'api_key_id', binary() }
  | {'model', binary() }
  ].


openapi_usage_audio_speeches_result() ->
    openapi_usage_audio_speeches_result([]).

openapi_usage_audio_speeches_result(Fields) ->
  Default = [ {'object', elements([<<"organization.usage.audio_speeches.result">>]) }
            , {'characters', integer() }
            , {'num_model_requests', integer() }
            , {'project_id', binary() }
            , {'user_id', binary() }
            , {'api_key_id', binary() }
            , {'model', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

