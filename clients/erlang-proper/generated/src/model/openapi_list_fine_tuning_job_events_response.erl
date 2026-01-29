-module(openapi_list_fine_tuning_job_events_response).

-include("openapi.hrl").

-export([openapi_list_fine_tuning_job_events_response/0]).

-export([openapi_list_fine_tuning_job_events_response/1]).

-export_type([openapi_list_fine_tuning_job_events_response/0]).

-type openapi_list_fine_tuning_job_events_response() ::
  [ {'data', list(openapi_fine_tuning_job_event:openapi_fine_tuning_job_event()) }
  | {'object', binary() }
  ].


openapi_list_fine_tuning_job_events_response() ->
    openapi_list_fine_tuning_job_events_response([]).

openapi_list_fine_tuning_job_events_response(Fields) ->
  Default = [ {'data', list(openapi_fine_tuning_job_event:openapi_fine_tuning_job_event()) }
            , {'object', elements([<<"list">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

