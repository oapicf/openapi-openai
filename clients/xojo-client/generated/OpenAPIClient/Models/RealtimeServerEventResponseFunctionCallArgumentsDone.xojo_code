#tag Class
Protected Class RealtimeServerEventResponseFunctionCallArgumentsDone

	#tag Property, Flags = &h0
		#tag Note
			The unique ID of the server event.
		#tag EndNote
		event_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The event type, must be `response.function_call_arguments.done`. 
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the response.
		#tag EndNote
		response_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the function call item.
		#tag EndNote
		item_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The index of the output item in the response.
		#tag EndNote
		output_index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the function call.
		#tag EndNote
		call_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The final arguments as a JSON string.
		#tag EndNote
		arguments As String
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        ResponsePeriodFunctionCallArgumentsPeriodDone
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.ResponsePeriodFunctionCallArgumentsPeriodDone
		      Return "response.function_call_arguments.done"
		    
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
			Name="event_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="response_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="item_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="output_index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="call_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="arguments"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


