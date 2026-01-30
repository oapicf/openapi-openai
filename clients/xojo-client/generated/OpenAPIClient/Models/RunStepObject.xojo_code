#tag Class
Protected Class RunStepObject

	#tag Property, Flags = &h0
		#tag Note
			The identifier of the run step, which can be referenced in API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `thread.run.step`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run step was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the [assistant](/docs/api-reference/assistants) associated with the run step.
		#tag EndNote
		assistant_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the [thread](/docs/api-reference/threads) that was run.
		#tag EndNote
		thread_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the [run](/docs/api-reference/runs) that this run step is a part of.
		#tag EndNote
		run_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The type of run step, which can be either `message_creation` or `tool_calls`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The status of the run step, which can be either `in_progress`, `cancelled`, `failed`, `completed`, or `expired`.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		step_details As OpenAPIClient.Models.RunStepObjectStepDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		last_error As OpenAPIClient.Models.RunStepObjectLastError
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run step expired. A step is considered expired if the parent run is expired.
		#tag EndNote
		expired_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run step was cancelled.
		#tag EndNote
		cancelled_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run step failed.
		#tag EndNote
		failed_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run step completed.
		#tag EndNote
		completed_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
		#tag EndNote
		metadata As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		usage As OpenAPIClient.Models.RunStepCompletionUsage
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        ThreadPeriodRunPeriodStep
        
    #tag EndEnum

    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        MessageCreation
        ToolCalls
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        InProgress
        Cancelled
        Failed
        Completed
        Expired
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.ThreadPeriodRunPeriodStep
		      Return "thread.run.step"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
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
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.InProgress
		      Return "in_progress"
		    Case StatusEnum.Cancelled
		      Return "cancelled"
		    Case StatusEnum.Failed
		      Return "failed"
		    Case StatusEnum.Completed
		      Return "completed"
		    Case StatusEnum.Expired
		      Return "expired"
		    
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="assistant_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="thread_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="run_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="step_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepObjectStepDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="last_error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepObjectLastError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expired_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cancelled_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="failed_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="completed_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metadata"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="usage"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepCompletionUsage"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


