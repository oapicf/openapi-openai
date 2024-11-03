-module(openapi_create_fine_tuning_job_request_hyperparameters).

-export([encode/1]).

-export_type([openapi_create_fine_tuning_job_request_hyperparameters/0]).

-type openapi_create_fine_tuning_job_request_hyperparameters() ::
    #{ 'batch_size' => openapi_create_fine_tuning_job_request_hyperparameters_batch_size:openapi_create_fine_tuning_job_request_hyperparameters_batch_size(),
       'learning_rate_multiplier' => openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier:openapi_create_fine_tuning_job_request_hyperparameters_learning_rate_multiplier(),
       'n_epochs' => openapi_create_fine_tuning_job_request_hyperparameters_n_epochs:openapi_create_fine_tuning_job_request_hyperparameters_n_epochs()
     }.

encode(#{ 'batch_size' := BatchSize,
          'learning_rate_multiplier' := LearningRateMultiplier,
          'n_epochs' := NEpochs
        }) ->
    #{ 'batch_size' => BatchSize,
       'learning_rate_multiplier' => LearningRateMultiplier,
       'n_epochs' => NEpochs
     }.
