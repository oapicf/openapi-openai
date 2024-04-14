-module(openapi_run_step_delta_step_details_message_creation_object_message_creation).

-include("openapi.hrl").

-export([openapi_run_step_delta_step_details_message_creation_object_message_creation/0]).

-export([openapi_run_step_delta_step_details_message_creation_object_message_creation/1]).

-export_type([openapi_run_step_delta_step_details_message_creation_object_message_creation/0]).

-type openapi_run_step_delta_step_details_message_creation_object_message_creation() ::
  [ {'message_id', binary() }
  ].


openapi_run_step_delta_step_details_message_creation_object_message_creation() ->
    openapi_run_step_delta_step_details_message_creation_object_message_creation([]).

openapi_run_step_delta_step_details_message_creation_object_message_creation(Fields) ->
  Default = [ {'message_id', binary() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

