-module(openapi_fine_tune_dpo_method_hyperparameters).

-export([encode/1]).

-export_type([openapi_fine_tune_dpo_method_hyperparameters/0]).

-type openapi_fine_tune_dpo_method_hyperparameters() ::
    #{ 'beta' => openapi_fine_tune_dpo_method_hyperparameters_beta:openapi_fine_tune_dpo_method_hyperparameters_beta(),
       'batch_size' => openapi_fine_tune_dpo_method_hyperparameters_batch_size:openapi_fine_tune_dpo_method_hyperparameters_batch_size(),
       'learning_rate_multiplier' => openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier:openapi_fine_tune_dpo_method_hyperparameters_learning_rate_multiplier(),
       'n_epochs' => openapi_fine_tune_dpo_method_hyperparameters_n_epochs:openapi_fine_tune_dpo_method_hyperparameters_n_epochs()
     }.

encode(#{ 'beta' := Beta,
          'batch_size' := BatchSize,
          'learning_rate_multiplier' := LearningRateMultiplier,
          'n_epochs' := NEpochs
        }) ->
    #{ 'beta' => Beta,
       'batch_size' => BatchSize,
       'learning_rate_multiplier' => LearningRateMultiplier,
       'n_epochs' => NEpochs
     }.
