-module(openapi_project_rate_limit).

-include("openapi.hrl").

-export([openapi_project_rate_limit/0]).

-export([openapi_project_rate_limit/1]).

-export_type([openapi_project_rate_limit/0]).

-type openapi_project_rate_limit() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'model', binary() }
  | {'max_requests_per_1_minute', integer() }
  | {'max_tokens_per_1_minute', integer() }
  | {'max_images_per_1_minute', integer() }
  | {'max_audio_megabytes_per_1_minute', integer() }
  | {'max_requests_per_1_day', integer() }
  | {'batch_1_day_max_input_tokens', integer() }
  ].


openapi_project_rate_limit() ->
    openapi_project_rate_limit([]).

openapi_project_rate_limit(Fields) ->
  Default = [ {'object', elements([<<"project.rate_limit">>]) }
            , {'id', binary() }
            , {'model', binary() }
            , {'max_requests_per_1_minute', integer() }
            , {'max_tokens_per_1_minute', integer() }
            , {'max_images_per_1_minute', integer() }
            , {'max_audio_megabytes_per_1_minute', integer() }
            , {'max_requests_per_1_day', integer() }
            , {'batch_1_day_max_input_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

