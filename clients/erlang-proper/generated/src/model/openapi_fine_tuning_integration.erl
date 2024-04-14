-module(openapi_fine_tuning_integration).

-include("openapi.hrl").

-export([openapi_fine_tuning_integration/0]).

-export([openapi_fine_tuning_integration/1]).

-export_type([openapi_fine_tuning_integration/0]).

-type openapi_fine_tuning_integration() ::
  [ {'type', binary() }
  | {'wandb', openapi_create_fine_tuning_job_request_integrations_inner_wandb:openapi_create_fine_tuning_job_request_integrations_inner_wandb() }
  ].


openapi_fine_tuning_integration() ->
    openapi_fine_tuning_integration([]).

openapi_fine_tuning_integration(Fields) ->
  Default = [ {'type', elements([<<"wandb">>]) }
            , {'wandb', openapi_create_fine_tuning_job_request_integrations_inner_wandb:openapi_create_fine_tuning_job_request_integrations_inner_wandb() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

