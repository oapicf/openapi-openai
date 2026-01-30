#tag Class
Protected Class CreateChatCompletionRequestResponseFormat

	#tag Property, Flags = &h0
		#tag Note
			The type of response format being defined: `text`
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		json_schema As OpenAPIClient.Models.ResponseFormatJsonSchemaJsonSchema
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Text
        JsonObject
        JsonSchema
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Text
		      Return "text"
		    Case TypeEnum.JsonObject
		      Return "json_object"
		    Case TypeEnum.JsonSchema
		      Return "json_schema"
		    
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
			Name="json_schema"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ResponseFormatJsonSchemaJsonSchema"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


