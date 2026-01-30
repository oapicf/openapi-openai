-module(openapi_fine_tune_dpo_method).

-export([encode/1]).

-export_type([openapi_fine_tune_dpo_method/0]).

-type openapi_fine_tune_dpo_method() ::
    #{ 'hyperparameters' => openapi_fine_tune_dpo_method_hyperparameters:openapi_fine_tune_dpo_method_hyperparameters()
     }.

encode(#{ 'hyperparameters' := Hyperparameters
        }) ->
    #{ 'hyperparameters' => Hyperparameters
     }.
