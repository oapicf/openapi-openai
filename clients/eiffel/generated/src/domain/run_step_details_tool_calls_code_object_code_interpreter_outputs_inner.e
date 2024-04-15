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
class RUN_STEP_DETAILS_TOOL_CALLS_CODE_OBJECT_CODE_INTERPRETER_OUTPUTS_INNER




feature --Access

    type: detachable STRING_32
      -- Always `logs`.
    logs: detachable STRING_32
      -- The text output from the Code Interpreter tool call.
    image: detachable RUN_STEP_DETAILS_TOOL_CALLS_CODE_OUTPUT_IMAGE_OBJECT_IMAGE
      

feature -- Change Element

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_logs (a_name: like logs)
        -- Set 'logs' with 'a_name'.
      do
        logs := a_name
      ensure
        logs_set: logs = a_name
      end

    set_image (a_name: like image)
        -- Set 'image' with 'a_name'.
      do
        image := a_name
      ensure
        image_set: image = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RUN_STEP_DETAILS_TOOL_CALLS_CODE_OBJECT_CODE_INTERPRETER_OUTPUTS_INNER%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached logs as l_logs then
          Result.append ("%Nlogs:")
          Result.append (l_logs.out)
          Result.append ("%N")
        end
        if attached image as l_image then
          Result.append ("%Nimage:")
          Result.append (l_image.out)
          Result.append ("%N")
        end
      end
end
