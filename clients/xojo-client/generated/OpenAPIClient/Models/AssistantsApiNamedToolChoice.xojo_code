#tag Class
Protected Class AssistantsApiNamedToolChoice

	#tag Property, Flags = &h0
		#tag Note
			The type of the tool. If type is `function`, the function name must be set
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedfunction As OpenAPIClient.Models.ChatCompletionNamedToolChoiceFunction
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Escapedfunction
        CodeInterpreter
        Retrieval
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Escapedfunction
		      Return "function"
		    Case TypeEnum.CodeInterpreter
		      Return "code_interpreter"
		    Case TypeEnum.Retrieval
		      Return "retrieval"
		    
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
			Name="Escapedfunction"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ChatCompletionNamedToolChoiceFunction"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


