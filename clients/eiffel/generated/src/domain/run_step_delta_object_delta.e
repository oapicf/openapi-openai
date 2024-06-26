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
class RUN_STEP_DELTA_OBJECT_DELTA




feature --Access

    step_details: detachable RUN_STEP_DELTA_OBJECT_DELTA_STEP_DETAILS
      

feature -- Change Element

    set_step_details (a_name: like step_details)
        -- Set 'step_details' with 'a_name'.
      do
        step_details := a_name
      ensure
        step_details_set: step_details = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RUN_STEP_DELTA_OBJECT_DELTA%N")
        if attached step_details as l_step_details then
          Result.append ("%Nstep_details:")
          Result.append (l_step_details.out)
          Result.append ("%N")
        end
      end
end

