#tag Class
Protected Class RunStepDeltaStepDetailsToolCallsObjectToolCallsInner

	#tag Property, Flags = &h0
		#tag Note
			The index of the tool call in the tool calls array.
		#tag EndNote
		index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the tool call object.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of tool call. This is always going to be `code_interpreter` for this type of tool call.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		code_interpreter As OpenAPIClient.Models.RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			For now, this is always going to be an empty object.
		#tag EndNote
		retrieval As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedfunction As OpenAPIClient.Models.RunStepDeltaStepDetailsToolCallsFunctionObjectFunction
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        CodeInterpreter
        Retrieval
        Escapedfunction
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.CodeInterpreter
		      Return "code_interpreter"
		    Case TypeEnum.Retrieval
		      Return "retrieval"
		    Case TypeEnum.Escapedfunction
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
			Name="index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="code_interpreter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDeltaStepDetailsToolCallsCodeObjectCodeInterpreter"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="retrieval"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedfunction"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDeltaStepDetailsToolCallsFunctionObjectFunction"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


