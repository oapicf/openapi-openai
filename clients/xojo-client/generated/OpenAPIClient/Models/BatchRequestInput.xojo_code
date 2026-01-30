#tag Class
Protected Class BatchRequestInput

	#tag Property, Flags = &h0
		#tag Note
			A developer-provided per-request id that will be used to match outputs to inputs. Must be unique for each request in a batch.
		#tag EndNote
		custom_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The HTTP method to be used for the request. Currently only `POST` is supported.
		#tag EndNote
		method As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The OpenAI API relative URL to be used for the request. Currently `/v1/chat/completions`, `/v1/embeddings`, and `/v1/completions` are supported.
		#tag EndNote
		url As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = MethodEnum, Type = Integer, Flags = &h0
        
        Post
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function MethodEnumToString(value As MethodEnum) As String
		  Select Case value
		    
		    Case MethodEnum.Post
		      Return "POST"
		    
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
			Name="custom_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


