#tag Class
Protected Class ChatCompletionRequestDeveloperMessage

	#tag Property, Flags = &h0
		content As OpenAPIClient.Models.ChatCompletionRequestDeveloperMessageContent
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The role of the messages author, in this case `developer`.
		#tag EndNote
		role As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An optional name for the participant. Provides the model information to differentiate between participants of the same role.
		#tag EndNote
		name As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = RoleEnum, Type = Integer, Flags = &h0
        
        Developer
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function RoleEnumToString(value As RoleEnum) As String
		  Select Case value
		    
		    Case RoleEnum.Developer
		      Return "developer"
		    
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
			Name="content"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionRequestDeveloperMessageContent"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


