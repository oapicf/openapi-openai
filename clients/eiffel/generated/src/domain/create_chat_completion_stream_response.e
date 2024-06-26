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
class CREATE_CHAT_COMPLETION_STREAM_RESPONSE




feature --Access

    id: detachable STRING_32
      -- A unique identifier for the chat completion. Each chunk has the same ID.
    choices: detachable LIST [CREATE_CHAT_COMPLETION_STREAM_RESPONSE_CHOICES_INNER]
      -- A list of chat completion choices. Can be more than one if `n` is greater than 1.
    created: INTEGER_32
      -- The Unix timestamp (in seconds) of when the chat completion was created. Each chunk has the same timestamp.
    model: detachable STRING_32
      -- The model to generate the completion.
    system_fingerprint: detachable STRING_32
      -- This fingerprint represents the backend configuration that the model runs with. Can be used in conjunction with the `seed` request parameter to understand when backend changes have been made that might impact determinism. 
    object: detachable STRING_32
      -- The object type, which is always `chat.completion.chunk`.

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_choices (a_name: like choices)
        -- Set 'choices' with 'a_name'.
      do
        choices := a_name
      ensure
        choices_set: choices = a_name
      end

    set_created (a_name: like created)
        -- Set 'created' with 'a_name'.
      do
        created := a_name
      ensure
        created_set: created = a_name
      end

    set_model (a_name: like model)
        -- Set 'model' with 'a_name'.
      do
        model := a_name
      ensure
        model_set: model = a_name
      end

    set_system_fingerprint (a_name: like system_fingerprint)
        -- Set 'system_fingerprint' with 'a_name'.
      do
        system_fingerprint := a_name
      ensure
        system_fingerprint_set: system_fingerprint = a_name
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
        Result.append("%Nclass CREATE_CHAT_COMPLETION_STREAM_RESPONSE%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached choices as l_choices then
          across l_choices as ic loop
            Result.append ("%N choices:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached created as l_created then
          Result.append ("%Ncreated:")
          Result.append (l_created.out)
          Result.append ("%N")
        end
        if attached model as l_model then
          Result.append ("%Nmodel:")
          Result.append (l_model.out)
          Result.append ("%N")
        end
        if attached system_fingerprint as l_system_fingerprint then
          Result.append ("%Nsystem_fingerprint:")
          Result.append (l_system_fingerprint.out)
          Result.append ("%N")
        end
        if attached object as l_object then
          Result.append ("%Nobject:")
          Result.append (l_object.out)
          Result.append ("%N")
        end
      end
end

