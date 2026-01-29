#tag Class
Protected Class CreateEmbeddingRequest

	#tag Property, Flags = &h0
		input As OpenAPIClient.Models.CreateEmbeddingRequestInput
	#tag EndProperty


	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateEmbeddingRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The format to return the embeddings in. Can be either `float` or [`base64`](https://pypi.org/project/pybase64/).
		#tag EndNote
		encoding_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of dimensions the resulting output embeddings should have. Only supported in `text-embedding-3` and later models. 
		#tag EndNote
		dimensions As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
		#tag EndNote
		user As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = Encoding_formatEnum, Type = Integer, Flags = &h0
        
        Float
        Base64
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function Encoding_formatEnumToString(value As Encoding_formatEnum) As String
		  Select Case value
		    
		    Case Encoding_formatEnum.Float
		      Return "float"
		    Case Encoding_formatEnum.Base64
		      Return "base64"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag ViewBehavior
		#tag ViewProperty
			Name="Index"
			Visible=true
			Group="ID"
			InitialValue="-2147483648"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Super"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Left"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Top"
			Visible=true
			Group="Position"
			InitialValue="0"
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateEmbeddingRequestInput"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateEmbeddingRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dimensions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


