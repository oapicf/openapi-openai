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
class CREATE_FINE_TUNING_JOB_REQUEST_INTEGRATIONS_INNER_WANDB




feature --Access

    project: detachable STRING_32
      -- The name of the project that the new run will be created under. 
    name: detachable STRING_32
      -- A display name to set for the run. If not set, we will use the Job ID as the name. 
    entity: detachable STRING_32
      -- The entity to use for the run. This allows you to set the team or username of the WandB user that you would like associated with the run. If not set, the default entity for the registered WandB API key is used. 
    tags: detachable LIST [STRING_32]
      -- A list of tags to be attached to the newly created run. These tags are passed through directly to WandB. Some default tags are generated by OpenAI: \"openai/finetune\", \"openai/{base-model}\", \"openai/{ftjob-abcdef}\". 

feature -- Change Element

    set_project (a_name: like project)
        -- Set 'project' with 'a_name'.
      do
        project := a_name
      ensure
        project_set: project = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_entity (a_name: like entity)
        -- Set 'entity' with 'a_name'.
      do
        entity := a_name
      ensure
        entity_set: entity = a_name
      end

    set_tags (a_name: like tags)
        -- Set 'tags' with 'a_name'.
      do
        tags := a_name
      ensure
        tags_set: tags = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_FINE_TUNING_JOB_REQUEST_INTEGRATIONS_INNER_WANDB%N")
        if attached project as l_project then
          Result.append ("%Nproject:")
          Result.append (l_project.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached entity as l_entity then
          Result.append ("%Nentity:")
          Result.append (l_entity.out)
          Result.append ("%N")
        end
        if attached tags as l_tags then
          across l_tags as ic loop
            Result.append ("%N tags:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

