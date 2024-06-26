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
class RUN_STEP_DETAILS_TOOL_CALLS_RETRIEVAL_OBJECT




feature --Access

    id: detachable STRING_32
      -- The ID of the tool call object.
    type: detachable STRING_32
      -- The type of tool call. This is always going to be `retrieval` for this type of tool call.
    retrieval: detachable ANY
      -- For now, this is always going to be an empty object.

feature -- Change Element

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

    set_retrieval (a_name: like retrieval)
        -- Set 'retrieval' with 'a_name'.
      do
        retrieval := a_name
      ensure
        retrieval_set: retrieval = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RUN_STEP_DETAILS_TOOL_CALLS_RETRIEVAL_OBJECT%N")
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
        if attached retrieval as l_retrieval then
          Result.append ("%Nretrieval:")
          Result.append (l_retrieval.out)
          Result.append ("%N")
        end
      end
end

