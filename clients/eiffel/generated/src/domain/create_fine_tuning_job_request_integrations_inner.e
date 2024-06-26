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
class CREATE_FINE_TUNING_JOB_REQUEST_INTEGRATIONS_INNER




feature --Access

    type: detachable CREATE_FINE_TUNING_JOB_REQUEST_INTEGRATIONS_INNER_TYPE
      
    wandb: detachable CREATE_FINE_TUNING_JOB_REQUEST_INTEGRATIONS_INNER_WANDB
      

feature -- Change Element

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_wandb (a_name: like wandb)
        -- Set 'wandb' with 'a_name'.
      do
        wandb := a_name
      ensure
        wandb_set: wandb = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_FINE_TUNING_JOB_REQUEST_INTEGRATIONS_INNER%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached wandb as l_wandb then
          Result.append ("%Nwandb:")
          Result.append (l_wandb.out)
          Result.append ("%N")
        end
      end
end

