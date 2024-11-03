-module(openapi_fine_tuning_job_hyperparameters).

-export([encode/1]).

-export_type([openapi_fine_tuning_job_hyperparameters/0]).

-type openapi_fine_tuning_job_hyperparameters() ::
    #{ 'n_epochs' := openapi_fine_tuning_job_hyperparameters_n_epochs:openapi_fine_tuning_job_hyperparameters_n_epochs()
     }.

encode(#{ 'n_epochs' := NEpochs
        }) ->
    #{ 'n_epochs' => NEpochs
     }.
