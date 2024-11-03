-module(openapi_list_fine_tuning_job_checkpoints_response).

-include("openapi.hrl").

-export([openapi_list_fine_tuning_job_checkpoints_response/0]).

-export([openapi_list_fine_tuning_job_checkpoints_response/1]).

-export_type([openapi_list_fine_tuning_job_checkpoints_response/0]).

-type openapi_list_fine_tuning_job_checkpoints_response() ::
  [ {'data', list(openapi_fine_tuning_job_checkpoint:openapi_fine_tuning_job_checkpoint()) }
  | {'object', binary() }
  | {'first_id', binary() }
  | {'last_id', binary() }
  | {'has_more', boolean() }
  ].


openapi_list_fine_tuning_job_checkpoints_response() ->
    openapi_list_fine_tuning_job_checkpoints_response([]).

openapi_list_fine_tuning_job_checkpoints_response(Fields) ->
  Default = [ {'data', list(openapi_fine_tuning_job_checkpoint:openapi_fine_tuning_job_checkpoint()) }
            , {'object', elements([<<"list">>]) }
            , {'first_id', binary() }
            , {'last_id', binary() }
            , {'has_more', boolean() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

