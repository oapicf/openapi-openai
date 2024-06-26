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
class RUN_STEP_DELTA_STEP_DETAILS_TOOL_CALLS_OBJECT




feature --Access

    type: detachable STRING_32
      -- Always `tool_calls`.
    tool_calls: detachable LIST [RUN_STEP_DELTA_STEP_DETAILS_TOOL_CALLS_OBJECT_TOOL_CALLS_INNER]
      -- An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `retrieval`, or `function`. 

feature -- Change Element

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_tool_calls (a_name: like tool_calls)
        -- Set 'tool_calls' with 'a_name'.
      do
        tool_calls := a_name
      ensure
        tool_calls_set: tool_calls = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RUN_STEP_DELTA_STEP_DETAILS_TOOL_CALLS_OBJECT%N")
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached tool_calls as l_tool_calls then
          across l_tool_calls as ic loop
            Result.append ("%N tool_calls:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

