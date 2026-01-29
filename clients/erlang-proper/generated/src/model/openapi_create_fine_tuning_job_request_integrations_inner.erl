-module(openapi_create_fine_tuning_job_request_integrations_inner).

-include("openapi.hrl").

-export([openapi_create_fine_tuning_job_request_integrations_inner/0]).

-export([openapi_create_fine_tuning_job_request_integrations_inner/1]).

-export_type([openapi_create_fine_tuning_job_request_integrations_inner/0]).

-type openapi_create_fine_tuning_job_request_integrations_inner() ::
  [ {'type', binary() }
  | {'wandb', openapi_create_fine_tuning_job_request_integrations_inner_wandb:openapi_create_fine_tuning_job_request_integrations_inner_wandb() }
  ].


openapi_create_fine_tuning_job_request_integrations_inner() ->
    openapi_create_fine_tuning_job_request_integrations_inner([]).

openapi_create_fine_tuning_job_request_integrations_inner(Fields) ->
  Default = [ {'type', elements([<<"wandb">>]) }
            , {'wandb', openapi_create_fine_tuning_job_request_integrations_inner_wandb:openapi_create_fine_tuning_job_request_integrations_inner_wandb() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

