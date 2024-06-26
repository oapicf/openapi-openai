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
class EMBEDDING




feature --Access

    index: INTEGER_32
      -- The index of the embedding in the list of embeddings.
    embedding: detachable LIST [REAL_32]
      -- The embedding vector, which is a list of floats. The length of vector depends on the model as listed in the [embedding guide](/docs/guides/embeddings). 
    object: detachable STRING_32
      -- The object type, which is always \"embedding\".

feature -- Change Element

    set_index (a_name: like index)
        -- Set 'index' with 'a_name'.
      do
        index := a_name
      ensure
        index_set: index = a_name
      end

    set_embedding (a_name: like embedding)
        -- Set 'embedding' with 'a_name'.
      do
        embedding := a_name
      ensure
        embedding_set: embedding = a_name
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
        Result.append("%Nclass EMBEDDING%N")
        if attached index as l_index then
          Result.append ("%Nindex:")
          Result.append (l_index.out)
          Result.append ("%N")
        end
        if attached embedding as l_embedding then
          across l_embedding as ic loop
            Result.append ("%N embedding:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached object as l_object then
          Result.append ("%Nobject:")
          Result.append (l_object.out)
          Result.append ("%N")
        end
      end
end

