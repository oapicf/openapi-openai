-module(openapi_run_step_delta_step_details_message_creation_object).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_message_creation_object/0]).

-export([openapi_run_step_delta_step_details_message_creation_object/1]).

-export_type([openapi_run_step_delta_step_details_message_creation_object/0]).

-type openapi_run_step_delta_step_details_message_creation_object() ::
  [ {'type', binary() }
  | {'message_creation', openapi_run_step_delta_step_details_message_creation_object_message_creation:openapi_run_step_delta_step_details_message_creation_object_message_creation() }
  ].


openapi_run_step_delta_step_details_message_creation_object() ->
    openapi_run_step_delta_step_details_message_creation_object([]).

openapi_run_step_delta_step_details_message_creation_object(Fields) ->
  Default = [ {'type', elements([<<"message_creation">>]) }
            , {'message_creation', openapi_run_step_delta_step_details_message_creation_object_message_creation:openapi_run_step_delta_step_details_message_creation_object_message_creation() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

