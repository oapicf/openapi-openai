note
 description:"[
		OpenAI API
 		The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
  		The version of the OpenAPI document: 2.0.0
 	    Contact: blah+oapicf@cliffano.com

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class RUN_OBJECT




feature --Access

    id: detachable STRING_32
      -- The identifier, which can be referenced in API endpoints.
    object: detachable STRING_32
      -- The object type, which is always `thread.run`.
    created_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run was created.
    thread_id: detachable STRING_32
      -- The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
    assistant_id: detachable STRING_32
      -- The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
    status: detachable STRING_32
      -- The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, or `expired`.
    required_action: detachable RUN_OBJECT_REQUIRED_ACTION
      
    last_error: detachable RUN_OBJECT_LAST_ERROR
      
    expires_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run will expire.
    started_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run was started.
    cancelled_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run was cancelled.
    failed_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run failed.
    completed_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run was completed.
    incomplete_details: detachable RUN_OBJECT_INCOMPLETE_DETAILS
      
    model: detachable STRING_32
      -- The model that the [assistant](/docs/api-reference/assistants) used for this run.
    instructions: detachable STRING_32
      -- The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
    tools: detachable LIST [ASSISTANT_OBJECT_TOOLS_INNER]
      -- The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
    file_ids: detachable LIST [STRING_32]
      -- The list of [File](/docs/api-reference/files) IDs the [assistant](/docs/api-reference/assistants) used for this run.
    metadata: detachable ANY
      -- Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    usage: detachable RUN_COMPLETION_USAGE
      
    temperature: REAL_32
      -- The sampling temperature used for this run. If not set, defaults to 1.
    max_prompt_tokens: INTEGER_32
      -- The maximum number of prompt tokens specified to have been used over the course of the run. 
    max_completion_tokens: INTEGER_32
      -- The maximum number of completion tokens specified to have been used over the course of the run. 
    truncation_strategy: detachable TRUNCATION_OBJECT
      
    tool_choice: detachable ASSISTANTS_API_TOOL_CHOICE_OPTION
      
    response_format: detachable ASSISTANTS_API_RESPONSE_FORMAT_OPTION
      

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_object (a_name: like object)
        -- Set 'object' with 'a_name'.
      do
        object := a_name
      ensure
        object_set: object = a_name
      end

    set_created_at (a_name: like created_at)
        -- Set 'created_at' with 'a_name'.
      do
        created_at := a_name
      ensure
        created_at_set: created_at = a_name
      end

    set_thread_id (a_name: like thread_id)
        -- Set 'thread_id' with 'a_name'.
      do
        thread_id := a_name
      ensure
        thread_id_set: thread_id = a_name
      end

    set_assistant_id (a_name: like assistant_id)
        -- Set 'assistant_id' with 'a_name'.
      do
        assistant_id := a_name
      ensure
        assistant_id_set: assistant_id = a_name
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_required_action (a_name: like required_action)
        -- Set 'required_action' with 'a_name'.
      do
        required_action := a_name
      ensure
        required_action_set: required_action = a_name
      end

    set_last_error (a_name: like last_error)
        -- Set 'last_error' with 'a_name'.
      do
        last_error := a_name
      ensure
        last_error_set: last_error = a_name
      end

    set_expires_at (a_name: like expires_at)
        -- Set 'expires_at' with 'a_name'.
      do
        expires_at := a_name
      ensure
        expires_at_set: expires_at = a_name
      end

    set_started_at (a_name: like started_at)
        -- Set 'started_at' with 'a_name'.
      do
        started_at := a_name
      ensure
        started_at_set: started_at = a_name
      end

    set_cancelled_at (a_name: like cancelled_at)
        -- Set 'cancelled_at' with 'a_name'.
      do
        cancelled_at := a_name
      ensure
        cancelled_at_set: cancelled_at = a_name
      end

    set_failed_at (a_name: like failed_at)
        -- Set 'failed_at' with 'a_name'.
      do
        failed_at := a_name
      ensure
        failed_at_set: failed_at = a_name
      end

    set_completed_at (a_name: like completed_at)
        -- Set 'completed_at' with 'a_name'.
      do
        completed_at := a_name
      ensure
        completed_at_set: completed_at = a_name
      end

    set_incomplete_details (a_name: like incomplete_details)
        -- Set 'incomplete_details' with 'a_name'.
      do
        incomplete_details := a_name
      ensure
        incomplete_details_set: incomplete_details = a_name
      end

    set_model (a_name: like model)
        -- Set 'model' with 'a_name'.
      do
        model := a_name
      ensure
        model_set: model = a_name
      end

    set_instructions (a_name: like instructions)
        -- Set 'instructions' with 'a_name'.
      do
        instructions := a_name
      ensure
        instructions_set: instructions = a_name
      end

    set_tools (a_name: like tools)
        -- Set 'tools' with 'a_name'.
      do
        tools := a_name
      ensure
        tools_set: tools = a_name
      end

    set_file_ids (a_name: like file_ids)
        -- Set 'file_ids' with 'a_name'.
      do
        file_ids := a_name
      ensure
        file_ids_set: file_ids = a_name
      end

    set_metadata (a_name: like metadata)
        -- Set 'metadata' with 'a_name'.
      do
        metadata := a_name
      ensure
        metadata_set: metadata = a_name
      end

    set_usage (a_name: like usage)
        -- Set 'usage' with 'a_name'.
      do
        usage := a_name
      ensure
        usage_set: usage = a_name
      end

    set_temperature (a_name: like temperature)
        -- Set 'temperature' with 'a_name'.
      do
        temperature := a_name
      ensure
        temperature_set: temperature = a_name
      end

    set_max_prompt_tokens (a_name: like max_prompt_tokens)
        -- Set 'max_prompt_tokens' with 'a_name'.
      do
        max_prompt_tokens := a_name
      ensure
        max_prompt_tokens_set: max_prompt_tokens = a_name
      end

    set_max_completion_tokens (a_name: like max_completion_tokens)
        -- Set 'max_completion_tokens' with 'a_name'.
      do
        max_completion_tokens := a_name
      ensure
        max_completion_tokens_set: max_completion_tokens = a_name
      end

    set_truncation_strategy (a_name: like truncation_strategy)
        -- Set 'truncation_strategy' with 'a_name'.
      do
        truncation_strategy := a_name
      ensure
        truncation_strategy_set: truncation_strategy = a_name
      end

    set_tool_choice (a_name: like tool_choice)
        -- Set 'tool_choice' with 'a_name'.
      do
        tool_choice := a_name
      ensure
        tool_choice_set: tool_choice = a_name
      end

    set_response_format (a_name: like response_format)
        -- Set 'response_format' with 'a_name'.
      do
        response_format := a_name
      ensure
        response_format_set: response_format = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RUN_OBJECT%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached object as l_object then
          Result.append ("%Nobject:")
          Result.append (l_object.out)
          Result.append ("%N")
        end
        if attached created_at as l_created_at then
          Result.append ("%Ncreated_at:")
          Result.append (l_created_at.out)
          Result.append ("%N")
        end
        if attached thread_id as l_thread_id then
          Result.append ("%Nthread_id:")
          Result.append (l_thread_id.out)
          Result.append ("%N")
        end
        if attached assistant_id as l_assistant_id then
          Result.append ("%Nassistant_id:")
          Result.append (l_assistant_id.out)
          Result.append ("%N")
        end
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached required_action as l_required_action then
          Result.append ("%Nrequired_action:")
          Result.append (l_required_action.out)
          Result.append ("%N")
        end
        if attached last_error as l_last_error then
          Result.append ("%Nlast_error:")
          Result.append (l_last_error.out)
          Result.append ("%N")
        end
        if attached expires_at as l_expires_at then
          Result.append ("%Nexpires_at:")
          Result.append (l_expires_at.out)
          Result.append ("%N")
        end
        if attached started_at as l_started_at then
          Result.append ("%Nstarted_at:")
          Result.append (l_started_at.out)
          Result.append ("%N")
        end
        if attached cancelled_at as l_cancelled_at then
          Result.append ("%Ncancelled_at:")
          Result.append (l_cancelled_at.out)
          Result.append ("%N")
        end
        if attached failed_at as l_failed_at then
          Result.append ("%Nfailed_at:")
          Result.append (l_failed_at.out)
          Result.append ("%N")
        end
        if attached completed_at as l_completed_at then
          Result.append ("%Ncompleted_at:")
          Result.append (l_completed_at.out)
          Result.append ("%N")
        end
        if attached incomplete_details as l_incomplete_details then
          Result.append ("%Nincomplete_details:")
          Result.append (l_incomplete_details.out)
          Result.append ("%N")
        end
        if attached model as l_model then
          Result.append ("%Nmodel:")
          Result.append (l_model.out)
          Result.append ("%N")
        end
        if attached instructions as l_instructions then
          Result.append ("%Ninstructions:")
          Result.append (l_instructions.out)
          Result.append ("%N")
        end
        if attached tools as l_tools then
          across l_tools as ic loop
            Result.append ("%N tools:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached file_ids as l_file_ids then
          across l_file_ids as ic loop
            Result.append ("%N file_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached metadata as l_metadata then
          Result.append ("%Nmetadata:")
          Result.append (l_metadata.out)
          Result.append ("%N")
        end
        if attached usage as l_usage then
          Result.append ("%Nusage:")
          Result.append (l_usage.out)
          Result.append ("%N")
        end
        if attached temperature as l_temperature then
          Result.append ("%Ntemperature:")
          Result.append (l_temperature.out)
          Result.append ("%N")
        end
        if attached max_prompt_tokens as l_max_prompt_tokens then
          Result.append ("%Nmax_prompt_tokens:")
          Result.append (l_max_prompt_tokens.out)
          Result.append ("%N")
        end
        if attached max_completion_tokens as l_max_completion_tokens then
          Result.append ("%Nmax_completion_tokens:")
          Result.append (l_max_completion_tokens.out)
          Result.append ("%N")
        end
        if attached truncation_strategy as l_truncation_strategy then
          Result.append ("%Ntruncation_strategy:")
          Result.append (l_truncation_strategy.out)
          Result.append ("%N")
        end
        if attached tool_choice as l_tool_choice then
          Result.append ("%Ntool_choice:")
          Result.append (l_tool_choice.out)
          Result.append ("%N")
        end
        if attached response_format as l_response_format then
          Result.append ("%Nresponse_format:")
          Result.append (l_response_format.out)
          Result.append ("%N")
        end
      end
end

