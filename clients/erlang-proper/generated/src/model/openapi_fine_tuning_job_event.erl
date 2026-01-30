-module(openapi_fine_tuning_job_event).

-include("openapi.hrl").

-export([openapi_fine_tuning_job_event/0]).

-export([openapi_fine_tuning_job_event/1]).

-export_type([openapi_fine_tuning_job_event/0]).

-type openapi_fine_tuning_job_event() ::
  [ {'object', binary() }
  | {'id', binary() }
  | {'created_at', integer() }
  | {'level', binary() }
  | {'message', binary() }
  | {'type', binary() }
  | {'data', map() }
  ].


openapi_fine_tuning_job_event() ->
    openapi_fine_tuning_job_event([]).

openapi_fine_tuning_job_event(Fields) ->
  Default = [ {'object', elements([<<"fine_tuning.job.event">>]) }
            , {'id', binary() }
            , {'created_at', integer() }
            , {'level', elements([<<"info">>, <<"warn">>, <<"error">>]) }
            , {'message', binary() }
            , {'type', elements([<<"message">>, <<"metrics">>]) }
            , {'data', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

