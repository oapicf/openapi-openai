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
class MODEL




feature --Access

    id: detachable STRING_32
      -- The model identifier, which can be referenced in the API endpoints.
    created: INTEGER_32
      -- The Unix timestamp (in seconds) when the model was created.
    object: detachable STRING_32
      -- The object type, which is always \"model\".
    owned_by: detachable STRING_32
      -- The organization that owns the model.

feature -- Change Element

    set_id (a_name: like id)
        -- Set 'id' with 'a_name'.
      do
        id := a_name
      ensure
        id_set: id = a_name
      end

    set_created (a_name: like created)
        -- Set 'created' with 'a_name'.
      do
        created := a_name
      ensure
        created_set: created = a_name
      end

    set_object (a_name: like object)
        -- Set 'object' with 'a_name'.
      do
        object := a_name
      ensure
        object_set: object = a_name
      end

    set_owned_by (a_name: like owned_by)
        -- Set 'owned_by' with 'a_name'.
      do
        owned_by := a_name
      ensure
        owned_by_set: owned_by = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass MODEL%N")
        if attached id as l_id then
          Result.append ("%Nid:")
          Result.append (l_id.out)
          Result.append ("%N")
        end
        if attached created as l_created then
          Result.append ("%Ncreated:")
          Result.append (l_created.out)
          Result.append ("%N")
        end
        if attached object as l_object then
          Result.append ("%Nobject:")
          Result.append (l_object.out)
          Result.append ("%N")
        end
        if attached owned_by as l_owned_by then
          Result.append ("%Nowned_by:")
          Result.append (l_owned_by.out)
          Result.append ("%N")
        end
      end
end

