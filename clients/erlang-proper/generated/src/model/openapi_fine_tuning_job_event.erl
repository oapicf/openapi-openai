-module(openapi_fine_tuning_job_event).

-include("openapi.hrl").

-export([openapi_fine_tuning_job_event/0]).

-export([openapi_fine_tuning_job_event/1]).

-export_type([openapi_fine_tuning_job_event/0]).

-type openapi_fine_tuning_job_event() ::
  [ {'id', binary() }
  | {'created_at', integer() }
  | {'level', binary() }
  | {'message', binary() }
  | {'object', binary() }
  ].


openapi_fine_tuning_job_event() ->
    openapi_fine_tuning_job_event([]).

openapi_fine_tuning_job_event(Fields) ->
  Default = [ {'id', binary() }
            , {'created_at', integer() }
            , {'level', elements([<<"info">>, <<"warn">>, <<"error">>]) }
            , {'message', binary() }
            , {'object', elements([<<"fine_tuning.job.event">>]) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

