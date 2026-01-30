-module(openapi_message_object).

-include("openapi.hrl").

-export([openapi_message_object/0]).

-export([openapi_message_object/1]).

-export_type([openapi_message_object/0]).

-type openapi_message_object() ::
  [ {'id', binary() }
  | {'object', binary() }
  | {'created_at', integer() }
  | {'thread_id', binary() }
  | {'status', binary() }
  | {'incomplete_details', openapi_message_object_incomplete_details:openapi_message_object_incomplete_details() }
  | {'completed_at', integer() }
  | {'incomplete_at', integer() }
  | {'role', binary() }
  | {'content', list(openapi_message_object_content_inner:openapi_message_object_content_inner()) }
  | {'assistant_id', binary() }
  | {'run_id', binary() }
  | {'attachments', list(openapi_create_message_request_attachments_inner:openapi_create_message_request_attachments_inner()) }
  | {'metadata', map() }
  ].


openapi_message_object() ->
    openapi_message_object([]).

openapi_message_object(Fields) ->
  Default = [ {'id', binary() }
            , {'object', elements([<<"thread.message">>]) }
            , {'created_at', integer() }
            , {'thread_id', binary() }
            , {'status', elements([<<"in_progress">>, <<"incomplete">>, <<"completed">>]) }
            , {'incomplete_details', openapi_message_object_incomplete_details:openapi_message_object_incomplete_details() }
            , {'completed_at', integer() }
            , {'incomplete_at', integer() }
            , {'role', elements([<<"user">>, <<"assistant">>]) }
            , {'content', list(openapi_message_object_content_inner:openapi_message_object_content_inner()) }
            , {'assistant_id', binary() }
            , {'run_id', binary() }
            , {'attachments', list(openapi_create_message_request_attachments_inner:openapi_create_message_request_attachments_inner()) }
            , {'metadata', map() }
            ],
  lists:ukeymerge(1, lists:sort(Fields), lists:sort(Default)).

