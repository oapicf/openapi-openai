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
class CREATE_ASSISTANT_REQUEST




feature --Access

    model: detachable CREATE_ASSISTANT_REQUEST_MODEL
      
    name: detachable STRING_32
      -- The name of the assistant. The maximum length is 256 characters. 
    description: detachable STRING_32
      -- The description of the assistant. The maximum length is 512 characters. 
    instructions: detachable STRING_32
      -- The system instructions that the assistant uses. The maximum length is 256,000 characters. 
    tools: detachable LIST [ASSISTANT_OBJECT_TOOLS_INNER]
      -- A list of tool enabled on the assistant. There can be a maximum of 128 tools per assistant. Tools can be of types `code_interpreter`, `retrieval`, or `function`. 
    file_ids: detachable LIST [STRING_32]
      -- A list of [file](/docs/api-reference/files) IDs attached to this assistant. There can be a maximum of 20 files attached to the assistant. Files are ordered by their creation date in ascending order. 
    metadata: detachable ANY
      -- Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 

feature -- Change Element

    set_model (a_name: like model)
        -- Set 'model' with 'a_name'.
      do
        model := a_name
      ensure
        model_set: model = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_description (a_name: like description)
        -- Set 'description' with 'a_name'.
      do
        description := a_name
      ensure
        description_set: description = a_name
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


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass CREATE_ASSISTANT_REQUEST%N")
        if attached model as l_model then
          Result.append ("%Nmodel:")
          Result.append (l_model.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached description as l_description then
          Result.append ("%Ndescription:")
          Result.append (l_description.out)
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
      end
end

