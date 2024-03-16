-module(openapi_create_fine_tune_request).

-include("openapi.hrl").

-export([openapi_create_fine_tune_request/0]).

-export([openapi_create_fine_tune_request/1]).

-export_type([openapi_create_fine_tune_request/0]).

-type openapi_create_fine_tune_request() ::
  [ {'training_file', binary() }
  | {'validation_file', binary() }
  | {'model', openapi_create_fine_tune_request_model:openapi_create_fine_tune_request_model() }
  | {'n_epochs', integer() }
  | {'batch_size', integer() }
  | {'learning_rate_multiplier', integer() }
  | {'prompt_loss_weight', integer() }
  | {'compute_classification_metrics', boolean() }
  | {'classification_n_classes', integer() }
  | {'classification_positive_class', binary() }
  | {'classification_betas', list(integer()) }
  | {'suffix', binary() }
  ].


openapi_create_fine_tune_request() ->
    openapi_create_fine_tune_request([]).

openapi_create_fine_tune_request(Fields) ->
  Default = [ {'training_file', binary() }
            , {'validation_file', binary() }
            , {'model', openapi_create_fine_tune_request_model:openapi_create_fine_tune_request_model() }
            , {'n_epochs', integer() }
            , {'batch_size', integer() }
            , {'learning_rate_multiplier', integer() }
            , {'prompt_loss_weight', integer() }
            , {'compute_classification_metrics', boolean() }
            , {'classification_n_classes', integer() }
            , {'classification_positive_class', binary() }
            , {'classification_betas', list(integer()) }
            , {'suffix', binary(1, 40) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

