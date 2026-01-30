#tag Class
Protected Class RunStepObjectStepDetails

	#tag Property, Flags = &h0
		#tag Note
			Always `message_creation`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		message_creation As OpenAPIClient.Models.RunStepDetailsMessageCreationObjectMessageCreation
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An array of tool calls the run step was involved in. These can be associated with one of three types of tools: `code_interpreter`, `file_search`, or `function`. 
		#tag EndNote
		tool_calls() As OpenAPIClient.Models.RunStepDetailsToolCallsObjectToolCallsInner
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        MessageCreation
        ToolCalls
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.MessageCreation
		      Return "message_creation"
		    Case TypeEnum.ToolCalls
		      Return "tool_calls"
		    
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
			Name="message_creation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDetailsMessageCreationObjectMessageCreation"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tool_calls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDetailsToolCallsObjectToolCallsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


