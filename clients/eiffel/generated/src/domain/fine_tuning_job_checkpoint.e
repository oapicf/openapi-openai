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
class FINE_TUNING_JOB_CHECKPOINT




feature --Access

    id: detachable STRING_32
      -- The checkpoint identifier, which can be referenced in the API endpoints.
    created_at: INTEGER_32
      -- The Unix timestamp (in seconds) for when the checkpoint was created.
    fine_tuned_model_checkpoint: detachable STRING_32
      -- The name of the fine-tuned checkpoint model that is created.
    step_number: INTEGER_32
      -- The step number that the checkpoint was created at.
    metrics: detachable FINE_TUNING_JOB_CHECKPOINT_METRICS
      
    fine_tuning_job_id: detachable STRING_32
      -- The name of the fine-tuning job that this checkpoint was created from.
    object: detachable STRING_32
      -- The object type, which is always \"fine_tuning.job.checkpoint\".

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_created_at (a_name: like created_at)
        -- Set 'created_at' with 'a_name'.
      do
        created_at := a_name
      ensure
        created_at_set: created_at = a_name
      end

    set_fine_tuned_model_checkpoint (a_name: like fine_tuned_model_checkpoint)
        -- Set 'fine_tuned_model_checkpoint' with 'a_name'.
      do
        fine_tuned_model_checkpoint := a_name
      ensure
        fine_tuned_model_checkpoint_set: fine_tuned_model_checkpoint = a_name
      end

    set_step_number (a_name: like step_number)
        -- Set 'step_number' with 'a_name'.
      do
        step_number := a_name
      ensure
        step_number_set: step_number = a_name
      end

    set_metrics (a_name: like metrics)
        -- Set 'metrics' with 'a_name'.
      do
        metrics := a_name
      ensure
        metrics_set: metrics = a_name
      end

    set_fine_tuning_job_id (a_name: like fine_tuning_job_id)
        -- Set 'fine_tuning_job_id' with 'a_name'.
      do
        fine_tuning_job_id := a_name
      ensure
        fine_tuning_job_id_set: fine_tuning_job_id = a_name
      end

    set_object (a_name: like object)
        -- Set 'object' with 'a_name'.
      do
        object := a_name
      ensure
        object_set: object = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass FINE_TUNING_JOB_CHECKPOINT%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached created_at as l_created_at then
          Result.append ("%Ncreated_at:")
          Result.append (l_created_at.out)
          Result.append ("%N")
        end
        if attached fine_tuned_model_checkpoint as l_fine_tuned_model_checkpoint then
          Result.append ("%Nfine_tuned_model_checkpoint:")
          Result.append (l_fine_tuned_model_checkpoint.out)
          Result.append ("%N")
        end
        if attached step_number as l_step_number then
          Result.append ("%Nstep_number:")
          Result.append (l_step_number.out)
          Result.append ("%N")
        end
        if attached metrics as l_metrics then
          Result.append ("%Nmetrics:")
          Result.append (l_metrics.out)
          Result.append ("%N")
        end
        if attached fine_tuning_job_id as l_fine_tuning_job_id then
          Result.append ("%Nfine_tuning_job_id:")
          Result.append (l_fine_tuning_job_id.out)
          Result.append ("%N")
        end
        if attached object as l_object then
          Result.append ("%Nobject:")
          Result.append (l_object.out)
          Result.append ("%N")
        end
      end
end

