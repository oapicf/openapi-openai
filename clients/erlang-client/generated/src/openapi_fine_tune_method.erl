-module(openapi_fine_tune_method).

-export([encode/1]).

-export_type([openapi_fine_tune_method/0]).

-type openapi_fine_tune_method() ::
    #{ 'type' => binary(),
       'supervised' => openapi_fine_tune_supervised_method:openapi_fine_tune_supervised_method(),
       'dpo' => openapi_fine_tune_dpo_method:openapi_fine_tune_dpo_method()
     }.

encode(#{ 'type' := Type,
          'supervised' := Supervised,
          'dpo' := Dpo
        }) ->
    #{ 'type' => Type,
       'supervised' => Supervised,
       'dpo' => Dpo
     }.
