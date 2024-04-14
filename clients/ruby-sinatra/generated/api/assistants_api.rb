require 'json'


MyApp.add_route('POST', '/v1/threads/{thread_id}/runs/{run_id}/cancel', {
  "resourcePath" => "/Assistants",
  "summary" => "Cancels a run that is `in_progress`.",
  "nickname" => "cancel_run",
  "responseClass" => "RunObject",
  "endpoint" => "/threads/{thread_id}/runs/{run_id}/cancel",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to which this run belongs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "run_id",
      "description" => "The ID of the run to cancel.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/assistants', {
  "resourcePath" => "/Assistants",
  "summary" => "Create an assistant with a model and instructions.",
  "nickname" => "create_assistant",
  "responseClass" => "AssistantObject",
  "endpoint" => "/assistants",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateAssistantRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/assistants/{assistant_id}/files', {
  "resourcePath" => "/Assistants",
  "summary" => "Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).",
  "nickname" => "create_assistant_file",
  "responseClass" => "AssistantFileObject",
  "endpoint" => "/assistants/{assistant_id}/files",
  "notes" => "",
  "parameters" => [
    {
      "name" => "assistant_id",
      "description" => "The ID of the assistant for which to create a File. ",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateAssistantFileRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads/{thread_id}/messages', {
  "resourcePath" => "/Assistants",
  "summary" => "Create a message.",
  "nickname" => "create_message",
  "responseClass" => "MessageObject",
  "endpoint" => "/threads/{thread_id}/messages",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the [thread](/docs/api-reference/threads) to create a message for.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateMessageRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads/{thread_id}/runs', {
  "resourcePath" => "/Assistants",
  "summary" => "Create a run.",
  "nickname" => "create_run",
  "responseClass" => "RunObject",
  "endpoint" => "/threads/{thread_id}/runs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to run.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateRunRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads', {
  "resourcePath" => "/Assistants",
  "summary" => "Create a thread.",
  "nickname" => "create_thread",
  "responseClass" => "ThreadObject",
  "endpoint" => "/threads",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateThreadRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads/runs', {
  "resourcePath" => "/Assistants",
  "summary" => "Create a thread and run it in one request.",
  "nickname" => "create_thread_and_run",
  "responseClass" => "RunObject",
  "endpoint" => "/threads/runs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "body",
      "description" => "",
      "dataType" => "CreateThreadAndRunRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/assistants/{assistant_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Delete an assistant.",
  "nickname" => "delete_assistant",
  "responseClass" => "DeleteAssistantResponse",
  "endpoint" => "/assistants/{assistant_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "assistant_id",
      "description" => "The ID of the assistant to delete.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/assistants/{assistant_id}/files/{file_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Delete an assistant file.",
  "nickname" => "delete_assistant_file",
  "responseClass" => "DeleteAssistantFileResponse",
  "endpoint" => "/assistants/{assistant_id}/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "assistant_id",
      "description" => "The ID of the assistant that the file belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "file_id",
      "description" => "The ID of the file to delete.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('DELETE', '/v1/threads/{thread_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Delete a thread.",
  "nickname" => "delete_thread",
  "responseClass" => "DeleteThreadResponse",
  "endpoint" => "/threads/{thread_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to delete.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/assistants/{assistant_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Retrieves an assistant.",
  "nickname" => "get_assistant",
  "responseClass" => "AssistantObject",
  "endpoint" => "/assistants/{assistant_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "assistant_id",
      "description" => "The ID of the assistant to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/assistants/{assistant_id}/files/{file_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Retrieves an AssistantFile.",
  "nickname" => "get_assistant_file",
  "responseClass" => "AssistantFileObject",
  "endpoint" => "/assistants/{assistant_id}/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "assistant_id",
      "description" => "The ID of the assistant who the file belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "file_id",
      "description" => "The ID of the file we&#39;re getting.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/messages/{message_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Retrieve a message.",
  "nickname" => "get_message",
  "responseClass" => "MessageObject",
  "endpoint" => "/threads/{thread_id}/messages/{message_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the [thread](/docs/api-reference/threads) to which this message belongs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "message_id",
      "description" => "The ID of the message to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/messages/{message_id}/files/{file_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Retrieves a message file.",
  "nickname" => "get_message_file",
  "responseClass" => "MessageFileObject",
  "endpoint" => "/threads/{thread_id}/messages/{message_id}/files/{file_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to which the message and File belong.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "message_id",
      "description" => "The ID of the message the file belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "file_id",
      "description" => "The ID of the file being retrieved.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/runs/{run_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Retrieves a run.",
  "nickname" => "get_run",
  "responseClass" => "RunObject",
  "endpoint" => "/threads/{thread_id}/runs/{run_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the [thread](/docs/api-reference/threads) that was run.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "run_id",
      "description" => "The ID of the run to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Retrieves a run step.",
  "nickname" => "get_run_step",
  "responseClass" => "RunStepObject",
  "endpoint" => "/threads/{thread_id}/runs/{run_id}/steps/{step_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to which the run and run step belongs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "run_id",
      "description" => "The ID of the run to which the run step belongs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "step_id",
      "description" => "The ID of the run step to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Retrieves a thread.",
  "nickname" => "get_thread",
  "responseClass" => "ThreadObject",
  "endpoint" => "/threads/{thread_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to retrieve.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/assistants/{assistant_id}/files', {
  "resourcePath" => "/Assistants",
  "summary" => "Returns a list of assistant files.",
  "nickname" => "list_assistant_files",
  "responseClass" => "ListAssistantFilesResponse",
  "endpoint" => "/assistants/{assistant_id}/files",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "assistant_id",
      "description" => "The ID of the assistant the file belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/assistants', {
  "resourcePath" => "/Assistants",
  "summary" => "Returns a list of assistants.",
  "nickname" => "list_assistants",
  "responseClass" => "ListAssistantsResponse",
  "endpoint" => "/assistants",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/messages/{message_id}/files', {
  "resourcePath" => "/Assistants",
  "summary" => "Returns a list of message files.",
  "nickname" => "list_message_files",
  "responseClass" => "ListMessageFilesResponse",
  "endpoint" => "/threads/{thread_id}/messages/{message_id}/files",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "thread_id",
      "description" => "The ID of the thread that the message and files belong to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "message_id",
      "description" => "The ID of the message that the files belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/messages', {
  "resourcePath" => "/Assistants",
  "summary" => "Returns a list of messages for a given thread.",
  "nickname" => "list_messages",
  "responseClass" => "ListMessagesResponse",
  "endpoint" => "/threads/{thread_id}/messages",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "run_id",
      "description" => "Filter messages by the run ID that generated them. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "thread_id",
      "description" => "The ID of the [thread](/docs/api-reference/threads) the messages belong to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/runs/{run_id}/steps', {
  "resourcePath" => "/Assistants",
  "summary" => "Returns a list of run steps belonging to a run.",
  "nickname" => "list_run_steps",
  "responseClass" => "ListRunStepsResponse",
  "endpoint" => "/threads/{thread_id}/runs/{run_id}/steps",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "thread_id",
      "description" => "The ID of the thread the run and run steps belong to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "run_id",
      "description" => "The ID of the run the run steps belong to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('GET', '/v1/threads/{thread_id}/runs', {
  "resourcePath" => "/Assistants",
  "summary" => "Returns a list of runs belonging to a thread.",
  "nickname" => "list_runs",
  "responseClass" => "ListRunsResponse",
  "endpoint" => "/threads/{thread_id}/runs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "limit",
      "description" => "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ",
      "dataType" => "Integer",
      "allowableValues" => "",
      "defaultValue" => "20",
      "paramType" => "query",
    },
    {
      "name" => "order",
      "description" => "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ",
      "dataType" => "String",
      "allowableValues" => "[asc, desc]",
      "defaultValue" => "'desc'",
      "paramType" => "query",
    },
    {
      "name" => "after",
      "description" => "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "before",
      "description" => "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ",
      "dataType" => "String",
      "allowableValues" => "",
      "paramType" => "query",
    },
    {
      "name" => "thread_id",
      "description" => "The ID of the thread the run belongs to.",
      "dataType" => "String",
      "paramType" => "path",
    },
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/assistants/{assistant_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Modifies an assistant.",
  "nickname" => "modify_assistant",
  "responseClass" => "AssistantObject",
  "endpoint" => "/assistants/{assistant_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "assistant_id",
      "description" => "The ID of the assistant to modify.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ModifyAssistantRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads/{thread_id}/messages/{message_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Modifies a message.",
  "nickname" => "modify_message",
  "responseClass" => "MessageObject",
  "endpoint" => "/threads/{thread_id}/messages/{message_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to which this message belongs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "message_id",
      "description" => "The ID of the message to modify.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ModifyMessageRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads/{thread_id}/runs/{run_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Modifies a run.",
  "nickname" => "modify_run",
  "responseClass" => "RunObject",
  "endpoint" => "/threads/{thread_id}/runs/{run_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the [thread](/docs/api-reference/threads) that was run.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "run_id",
      "description" => "The ID of the run to modify.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ModifyRunRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads/{thread_id}', {
  "resourcePath" => "/Assistants",
  "summary" => "Modifies a thread.",
  "nickname" => "modify_thread",
  "responseClass" => "ThreadObject",
  "endpoint" => "/threads/{thread_id}",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "ModifyThreadRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end


MyApp.add_route('POST', '/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs', {
  "resourcePath" => "/Assistants",
  "summary" => "When a run has the `status: \"requires_action\"` and `required_action.type` is `submit_tool_outputs`, this endpoint can be used to submit the outputs from the tool calls once they're all completed. All outputs must be submitted in a single request. ",
  "nickname" => "submit_tool_ouputs_to_run",
  "responseClass" => "RunObject",
  "endpoint" => "/threads/{thread_id}/runs/{run_id}/submit_tool_outputs",
  "notes" => "",
  "parameters" => [
    {
      "name" => "thread_id",
      "description" => "The ID of the [thread](/docs/api-reference/threads) to which this run belongs.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "run_id",
      "description" => "The ID of the run that requires the tool output submission.",
      "dataType" => "String",
      "paramType" => "path",
    },
    {
      "name" => "body",
      "description" => "",
      "dataType" => "SubmitToolOutputsRunRequest",
      "paramType" => "body",
    }
    ]}) do
  cross_origin
  # the guts live here

  {"message" => "yes, it worked"}.to_json
end

