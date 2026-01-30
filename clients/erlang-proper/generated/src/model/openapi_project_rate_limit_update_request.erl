-module(openapi_project_rate_limit_update_request).

-include("openapi.hrl").

-export([openapi_project_rate_limit_update_request/0]).

-export([openapi_project_rate_limit_update_request/1]).

-export_type([openapi_project_rate_limit_update_request/0]).

-type openapi_project_rate_limit_update_request() ::
  [ {'max_requests_per_1_minute', integer() }
  | {'max_tokens_per_1_minute', integer() }
  | {'max_images_per_1_minute', integer() }
  | {'max_audio_megabytes_per_1_minute', integer() }
  | {'max_requests_per_1_day', integer() }
  | {'batch_1_day_max_input_tokens', integer() }
  ].


openapi_project_rate_limit_update_request() ->
    openapi_project_rate_limit_update_request([]).

openapi_project_rate_limit_update_request(Fields) ->
  Default = [ {'max_requests_per_1_minute', integer() }
            , {'max_tokens_per_1_minute', integer() }
            , {'max_images_per_1_minute', integer() }
            , {'max_audio_megabytes_per_1_minute', integer() }
            , {'max_requests_per_1_day', integer() }
            , {'batch_1_day_max_input_tokens', integer() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

