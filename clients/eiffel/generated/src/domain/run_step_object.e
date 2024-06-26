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
class RUN_STEP_OBJECT




feature --Access

    id: detachable STRING_32
      -- The identifier of the run step, which can be referenced in API endpoints.
    object: detachable STRING_32
      -- The object type, which is always `thread.run.step`.
    created_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run step was created.
    assistant_id: detachable STRING_32
      -- The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
    thread_id: detachable STRING_32
      -- The ID of the [thread](/docs/api-reference/threads) that was run.
    run_id: detachable STRING_32
      -- The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
    type: detachable STRING_32
      -- The type of run step, which can be either `message_creation` or `tool_calls`.
    status: detachable STRING_32
      -- The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
    step_details: detachable RUN_STEP_OBJECT_STEP_DETAILS
      
    last_error: detachable RUN_STEP_OBJECT_LAST_ERROR
      
    expired_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
    cancelled_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run step was cancelled.
    failed_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run step failed.
    completed_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the run step completed.
    metadata: detachable ANY
      -- Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
    usage: detachable RUN_STEP_COMPLETION_USAGE
      

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

    set_assistant_id (a_name: like assistant_id)
        -- Set 'assistant_id' with 'a_name'.
      do
        assistant_id := a_name
      ensure
        assistant_id_set: assistant_id = a_name
      end

    set_thread_id (a_name: like thread_id)
        -- Set 'thread_id' with 'a_name'.
      do
        thread_id := a_name
      ensure
        thread_id_set: thread_id = a_name
      end

    set_run_id (a_name: like run_id)
        -- Set 'run_id' with 'a_name'.
      do
        run_id := a_name
      ensure
        run_id_set: run_id = a_name
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_status (a_name: like status)
        -- Set 'status' with 'a_name'.
      do
        status := a_name
      ensure
        status_set: status = a_name
      end

    set_step_details (a_name: like step_details)
        -- Set 'step_details' with 'a_name'.
      do
        step_details := a_name
      ensure
        step_details_set: step_details = a_name
      end

    set_last_error (a_name: like last_error)
        -- Set 'last_error' with 'a_name'.
      do
        last_error := a_name
      ensure
        last_error_set: last_error = a_name
      end

    set_expired_at (a_name: like expired_at)
        -- Set 'expired_at' with 'a_name'.
      do
        expired_at := a_name
      ensure
        expired_at_set: expired_at = a_name
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


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RUN_STEP_OBJECT%N")
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
        if attached assistant_id as l_assistant_id then
          Result.append ("%Nassistant_id:")
          Result.append (l_assistant_id.out)
          Result.append ("%N")
        end
        if attached thread_id as l_thread_id then
          Result.append ("%Nthread_id:")
          Result.append (l_thread_id.out)
          Result.append ("%N")
        end
        if attached run_id as l_run_id then
          Result.append ("%Nrun_id:")
          Result.append (l_run_id.out)
          Result.append ("%N")
        end
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached status as l_status then
          Result.append ("%Nstatus:")
          Result.append (l_status.out)
          Result.append ("%N")
        end
        if attached step_details as l_step_details then
          Result.append ("%Nstep_details:")
          Result.append (l_step_details.out)
          Result.append ("%N")
        end
        if attached last_error as l_last_error then
          Result.append ("%Nlast_error:")
          Result.append (l_last_error.out)
          Result.append ("%N")
        end
        if attached expired_at as l_expired_at then
          Result.append ("%Nexpired_at:")
          Result.append (l_expired_at.out)
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
      end
end

