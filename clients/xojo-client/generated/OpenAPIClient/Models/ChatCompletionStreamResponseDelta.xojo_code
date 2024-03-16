#tag Class
Protected Class ChatCompletionStreamResponseDelta

	#tag Property, Flags = &h0
		#tag Note
			The role of the author of this message.
		#tag EndNote
		role As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The contents of the chunk message.
		#tag EndNote
		content As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		function_call As OpenAPIClient.Models.ChatCompletionRequestMessageFunctionCall
	#tag EndProperty


    #tag Enum, Name = RoleEnum, Type = Integer, Flags = &h0
        
        System
        User
        Assistant
        Escapedfunction
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function RoleEnumToString(value As RoleEnum) As String
		  Select Case value
		    
		    Case RoleEnum.System
		      Return "system"
		    Case RoleEnum.User
		      Return "user"
		    Case RoleEnum.Assistant
		      Return "assistant"
		    Case RoleEnum.Escapedfunction
		      Return "function"
		    
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
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="function_call"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionRequestMessageFunctionCall"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


