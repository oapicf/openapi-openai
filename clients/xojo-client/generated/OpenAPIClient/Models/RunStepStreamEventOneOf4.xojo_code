#tag Class
Protected Class RunStepStreamEventOneOf4

	#tag Property, Flags = &h0
		Escapedevent As String
	#tag EndProperty


	#tag Property, Flags = &h0
		data As OpenAPIClient.Models.RunStepObject
	#tag EndProperty


    #tag Enum, Name = EscapedeventEnum, Type = Integer, Flags = &h0
        
        ThreadPeriodRunPeriodStepPeriodFailed
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function EscapedeventEnumToString(value As EscapedeventEnum) As String
		  Select Case value
		    
		    Case EscapedeventEnum.ThreadPeriodRunPeriodStepPeriodFailed
		      Return "thread.run.step.failed"
		    
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
			Name="data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepObject"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


