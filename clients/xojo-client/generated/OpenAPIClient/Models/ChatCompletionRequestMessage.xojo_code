#tag Class
Protected Class ChatCompletionRequestMessage

	#tag Property, Flags = &h0
		#tag Note
			The role of the messages author. One of `system`, `user`, `assistant`, or `function`.
		#tag EndNote
		role As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The contents of the message. `content` is required for all messages except assistant messages with function calls.
		#tag EndNote
		content As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the author of this message. `name` is required if role is `function`, and it should be the name of the function whose response is in the `content`. May contain a-z, A-Z, 0-9, and underscores, with a maximum length of 64 characters.
		#tag EndNote
		name As Xoson.O.OptionalString
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
			Name="name"
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


