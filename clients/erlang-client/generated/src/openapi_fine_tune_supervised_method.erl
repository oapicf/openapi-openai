-module(openapi_fine_tune_supervised_method).

-export([encode/1]).

-export_type([openapi_fine_tune_supervised_method/0]).

-type openapi_fine_tune_supervised_method() ::
    #{ 'hyperparameters' => openapi_fine_tune_supervised_method_hyperparameters:openapi_fine_tune_supervised_method_hyperparameters()
     }.

encode(#{ 'hyperparameters' := Hyperparameters
        }) ->
    #{ 'hyperparameters' => Hyperparameters
     }.
