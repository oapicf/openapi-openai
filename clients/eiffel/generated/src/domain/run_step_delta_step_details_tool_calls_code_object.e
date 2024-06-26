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
class RUN_STEP_DELTA_STEP_DETAILS_TOOL_CALLS_CODE_OBJECT




feature --Access

    index: INTEGER_32
      -- The index of the tool call in the tool calls array.
    id: detachable STRING_32
      -- The ID of the tool call.
    type: detachable STRING_32
      -- The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
    code_interpreter: detachable RUN_STEP_DELTA_STEP_DETAILS_TOOL_CALLS_CODE_OBJECT_CODE_INTERPRETER
      

feature -- Change Element

    set_index (a_name: like index)
        -- Set 'index' with 'a_name'.
      do
        index := a_name
      ensure
        index_set: index = a_name
      end

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_type (a_name: like type)
        -- Set 'type' with 'a_name'.
      do
        type := a_name
      ensure
        type_set: type = a_name
      end

    set_code_interpreter (a_name: like code_interpreter)
        -- Set 'code_interpreter' with 'a_name'.
      do
        code_interpreter := a_name
      ensure
        code_interpreter_set: code_interpreter = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RUN_STEP_DELTA_STEP_DETAILS_TOOL_CALLS_CODE_OBJECT%N")
        if attached index as l_index then
          Result.append ("%Nindex:")
          Result.append (l_index.out)
          Result.append ("%N")
        end
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached type as l_type then
          Result.append ("%Ntype:")
          Result.append (l_type.out)
          Result.append ("%N")
        end
        if attached code_interpreter as l_code_interpreter then
          Result.append ("%Ncode_interpreter:")
          Result.append (l_code_interpreter.out)
          Result.append ("%N")
        end
      end
end

