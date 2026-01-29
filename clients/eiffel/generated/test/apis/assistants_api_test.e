note
    description: "API tests for ASSISTANTS_API"
    date: "$Date$"
    revision: "$Revision$"


class ASSISTANTS_API_TEST

inherit

    EQA_TEST_SET

feature -- Test routines


    test_assistant
            -- Retrieves an assistant.
            --
            -- 
        local
            l_response: ASSISTANT_OBJECT
            l_assistant_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_assistant_id

            -- l_response := api.assistant(l_assistant_id)
            assert ("not_implemented", False)
        end

    test_assistant_file
            -- Retrieves an AssistantFile.
            --
            -- 
        local
            l_response: ASSISTANT_FILE_OBJECT
            l_assistant_id: STRING_32
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_assistant_id
            -- l_file_id

            -- l_response := api.assistant_file(l_assistant_id, l_file_id)
            assert ("not_implemented", False)
        end

    test_cancel_run
            -- Cancels a run that is &#x60;in_progress&#x60;.
            --
            -- 
        local
            l_response: RUN_OBJECT
            l_thread_id: STRING_32
            l_run_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_run_id

            -- l_response := api.cancel_run(l_thread_id, l_run_id)
            assert ("not_implemented", False)
        end

    test_create_assistant
            -- Create an assistant with a model and instructions.
            --
            -- 
        local
            l_response: ASSISTANT_OBJECT
            l_create_assistant_request: CREATE_ASSISTANT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_assistant_request

            -- l_response := api.create_assistant(l_create_assistant_request)
            assert ("not_implemented", False)
        end

    test_create_assistant_file
            -- Create an assistant file by attaching a [File](/docs/api-reference/files) to an [assistant](/docs/api-reference/assistants).
            --
            -- 
        local
            l_response: ASSISTANT_FILE_OBJECT
            l_assistant_id: STRING_32
            l_create_assistant_file_request: CREATE_ASSISTANT_FILE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_assistant_id
            -- l_create_assistant_file_request

            -- l_response := api.create_assistant_file(l_assistant_id, l_create_assistant_file_request)
            assert ("not_implemented", False)
        end

    test_create_message
            -- Create a message.
            --
            -- 
        local
            l_response: MESSAGE_OBJECT
            l_thread_id: STRING_32
            l_create_message_request: CREATE_MESSAGE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_create_message_request

            -- l_response := api.create_message(l_thread_id, l_create_message_request)
            assert ("not_implemented", False)
        end

    test_create_run
            -- Create a run.
            --
            -- 
        local
            l_response: RUN_OBJECT
            l_thread_id: STRING_32
            l_create_run_request: CREATE_RUN_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_create_run_request

            -- l_response := api.create_run(l_thread_id, l_create_run_request)
            assert ("not_implemented", False)
        end

    test_create_thread
            -- Create a thread.
            --
            -- 
        local
            l_response: THREAD_OBJECT
            l_create_thread_request: CREATE_THREAD_REQUEST
        do
            -- TODO: Initialize required params.

            -- l_response := api.create_thread(l_create_thread_request)
            assert ("not_implemented", False)
        end

    test_create_thread_and_run
            -- Create a thread and run it in one request.
            --
            -- 
        local
            l_response: RUN_OBJECT
            l_create_thread_and_run_request: CREATE_THREAD_AND_RUN_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_create_thread_and_run_request

            -- l_response := api.create_thread_and_run(l_create_thread_and_run_request)
            assert ("not_implemented", False)
        end

    test_delete_assistant
            -- Delete an assistant.
            --
            -- 
        local
            l_response: DELETE_ASSISTANT_RESPONSE
            l_assistant_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_assistant_id

            -- l_response := api.delete_assistant(l_assistant_id)
            assert ("not_implemented", False)
        end

    test_delete_assistant_file
            -- Delete an assistant file.
            --
            -- 
        local
            l_response: DELETE_ASSISTANT_FILE_RESPONSE
            l_assistant_id: STRING_32
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_assistant_id
            -- l_file_id

            -- l_response := api.delete_assistant_file(l_assistant_id, l_file_id)
            assert ("not_implemented", False)
        end

    test_delete_thread
            -- Delete a thread.
            --
            -- 
        local
            l_response: DELETE_THREAD_RESPONSE
            l_thread_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id

            -- l_response := api.delete_thread(l_thread_id)
            assert ("not_implemented", False)
        end

    test_list_assistant_files
            -- Returns a list of assistant files.
            --
            -- 
        local
            l_response: LIST_ASSISTANT_FILES_RESPONSE
            l_assistant_id: STRING_32
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_assistant_id

            -- l_response := api.list_assistant_files(l_assistant_id, l_limit, l_order, l_after, l_before)
            assert ("not_implemented", False)
        end

    test_list_assistants
            -- Returns a list of assistants.
            --
            -- 
        local
            l_response: LIST_ASSISTANTS_RESPONSE
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.

            -- l_response := api.list_assistants(l_limit, l_order, l_after, l_before)
            assert ("not_implemented", False)
        end

    test_list_message_files
            -- Returns a list of message files.
            --
            -- 
        local
            l_response: LIST_MESSAGE_FILES_RESPONSE
            l_thread_id: STRING_32
            l_message_id: STRING_32
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_message_id

            -- l_response := api.list_message_files(l_thread_id, l_message_id, l_limit, l_order, l_after, l_before)
            assert ("not_implemented", False)
        end

    test_list_messages
            -- Returns a list of messages for a given thread.
            --
            -- 
        local
            l_response: LIST_MESSAGES_RESPONSE
            l_thread_id: STRING_32
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
            l_run_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id

            -- l_response := api.list_messages(l_thread_id, l_limit, l_order, l_after, l_before, l_run_id)
            assert ("not_implemented", False)
        end

    test_list_run_steps
            -- Returns a list of run steps belonging to a run.
            --
            -- 
        local
            l_response: LIST_RUN_STEPS_RESPONSE
            l_thread_id: STRING_32
            l_run_id: STRING_32
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_run_id

            -- l_response := api.list_run_steps(l_thread_id, l_run_id, l_limit, l_order, l_after, l_before)
            assert ("not_implemented", False)
        end

    test_list_runs
            -- Returns a list of runs belonging to a thread.
            --
            -- 
        local
            l_response: LIST_RUNS_RESPONSE
            l_thread_id: STRING_32
            l_limit: INTEGER_32
            l_order: STRING_32
            l_after: STRING_32
            l_before: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id

            -- l_response := api.list_runs(l_thread_id, l_limit, l_order, l_after, l_before)
            assert ("not_implemented", False)
        end

    test_message
            -- Retrieve a message.
            --
            -- 
        local
            l_response: MESSAGE_OBJECT
            l_thread_id: STRING_32
            l_message_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_message_id

            -- l_response := api.message(l_thread_id, l_message_id)
            assert ("not_implemented", False)
        end

    test_message_file
            -- Retrieves a message file.
            --
            -- 
        local
            l_response: MESSAGE_FILE_OBJECT
            l_thread_id: STRING_32
            l_message_id: STRING_32
            l_file_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_message_id
            -- l_file_id

            -- l_response := api.message_file(l_thread_id, l_message_id, l_file_id)
            assert ("not_implemented", False)
        end

    test_modify_assistant
            -- Modifies an assistant.
            --
            -- 
        local
            l_response: ASSISTANT_OBJECT
            l_assistant_id: STRING_32
            l_modify_assistant_request: MODIFY_ASSISTANT_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_assistant_id
            -- l_modify_assistant_request

            -- l_response := api.modify_assistant(l_assistant_id, l_modify_assistant_request)
            assert ("not_implemented", False)
        end

    test_modify_message
            -- Modifies a message.
            --
            -- 
        local
            l_response: MESSAGE_OBJECT
            l_thread_id: STRING_32
            l_message_id: STRING_32
            l_modify_message_request: MODIFY_MESSAGE_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_message_id
            -- l_modify_message_request

            -- l_response := api.modify_message(l_thread_id, l_message_id, l_modify_message_request)
            assert ("not_implemented", False)
        end

    test_modify_run
            -- Modifies a run.
            --
            -- 
        local
            l_response: RUN_OBJECT
            l_thread_id: STRING_32
            l_run_id: STRING_32
            l_modify_run_request: MODIFY_RUN_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_run_id
            -- l_modify_run_request

            -- l_response := api.modify_run(l_thread_id, l_run_id, l_modify_run_request)
            assert ("not_implemented", False)
        end

    test_modify_thread
            -- Modifies a thread.
            --
            -- 
        local
            l_response: THREAD_OBJECT
            l_thread_id: STRING_32
            l_modify_thread_request: MODIFY_THREAD_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_modify_thread_request

            -- l_response := api.modify_thread(l_thread_id, l_modify_thread_request)
            assert ("not_implemented", False)
        end

    test_run
            -- Retrieves a run.
            --
            -- 
        local
            l_response: RUN_OBJECT
            l_thread_id: STRING_32
            l_run_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_run_id

            -- l_response := api.run(l_thread_id, l_run_id)
            assert ("not_implemented", False)
        end

    test_run_step
            -- Retrieves a run step.
            --
            -- 
        local
            l_response: RUN_STEP_OBJECT
            l_thread_id: STRING_32
            l_run_id: STRING_32
            l_step_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_run_id
            -- l_step_id

            -- l_response := api.run_step(l_thread_id, l_run_id, l_step_id)
            assert ("not_implemented", False)
        end

    test_submit_tool_ouputs_to_run
            -- When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
            --
            -- 
        local
            l_response: RUN_OBJECT
            l_thread_id: STRING_32
            l_run_id: STRING_32
            l_submit_tool_outputs_run_request: SUBMIT_TOOL_OUTPUTS_RUN_REQUEST
        do
            -- TODO: Initialize required params.
            -- l_thread_id
            -- l_run_id
            -- l_submit_tool_outputs_run_request

            -- l_response := api.submit_tool_ouputs_to_run(l_thread_id, l_run_id, l_submit_tool_outputs_run_request)
            assert ("not_implemented", False)
        end

    test_thread
            -- Retrieves a thread.
            --
            -- 
        local
            l_response: THREAD_OBJECT
            l_thread_id: STRING_32
        do
            -- TODO: Initialize required params.
            -- l_thread_id

            -- l_response := api.thread(l_thread_id)
            assert ("not_implemented", False)
        end

feature {NONE} -- Implementation

    api: ASSISTANTS_API
            -- Create an object instance of `ASSISTANTS_API'.
        once
            create { ASSISTANTS_API } Result
        end

end
