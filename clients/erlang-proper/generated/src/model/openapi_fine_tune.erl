-module(openapi_fine_tune).

-include("openapi.hrl").

-export([openapi_fine_tune/0]).

-export([openapi_fine_tune/1]).

-export_type([openapi_fine_tune/0]).

-type openapi_fine_tune() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'updated_at', integer() }
  | {'model', binary() }
  | {'fine_tuned_model', binary() }
  | {'organization_id', binary() }
  | {'status', binary() }
  | {'hyperparams', map() }
  | {'training_files', list(openapi_open_ai_file:openapi_open_ai_file()) }
  | {'validation_files', list(openapi_open_ai_file:openapi_open_ai_file()) }
  | {'result_files', list(openapi_open_ai_file:openapi_open_ai_file()) }
  | {'events', list(openapi_fine_tune_event:openapi_fine_tune_event()) }
  ].


openapi_fine_tune() ->
    openapi_fine_tune([]).

openapi_fine_tune(Fields) ->
  Default = [ {'id', binary() }
            , {'object', binary() }
            , {'created_at', integer() }
            , {'updated_at', integer() }
            , {'model', binary() }
            , {'fine_tuned_model', binary() }
            , {'organization_id', binary() }
            , {'status', binary() }
            , {'hyperparams', map() }
            , {'training_files', list(openapi_open_ai_file:openapi_open_ai_file()) }
            , {'validation_files', list(openapi_open_ai_file:openapi_open_ai_file()) }
            , {'result_files', list(openapi_open_ai_file:openapi_open_ai_file()) }
            , {'events', list(openapi_fine_tune_event:openapi_fine_tune_event()) }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

