#tag Class
Protected Class RunObject

	#tag Property, Flags = &h0
		#tag Note
			The identifier, which can be referenced in API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `thread.run`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the [thread](/docs/api-reference/threads) that was executed on as a part of this run.
		#tag EndNote
		thread_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the [assistant](/docs/api-reference/assistants) used for execution of this run.
		#tag EndNote
		assistant_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The status of the run, which can be either `queued`, `in_progress`, `requires_action`, `cancelling`, `cancelled`, `failed`, `completed`, `incomplete`, or `expired`.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		required_action As OpenAPIClient.Models.RunObjectRequiredAction
	#tag EndProperty


	#tag Property, Flags = &h0
		last_error As OpenAPIClient.Models.RunObjectLastError
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run will expire.
		#tag EndNote
		expires_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run was started.
		#tag EndNote
		started_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run was cancelled.
		#tag EndNote
		cancelled_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run failed.
		#tag EndNote
		failed_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the run was completed.
		#tag EndNote
		completed_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		incomplete_details As OpenAPIClient.Models.RunObjectIncompleteDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The model that the [assistant](/docs/api-reference/assistants) used for this run.
		#tag EndNote
		model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The instructions that the [assistant](/docs/api-reference/assistants) used for this run.
		#tag EndNote
		instructions As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The list of tools that the [assistant](/docs/api-reference/assistants) used for this run.
		#tag EndNote
		tools() As OpenAPIClient.Models.AssistantObjectToolsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
		#tag EndNote
		metadata As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		usage As OpenAPIClient.Models.RunCompletionUsage
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The sampling temperature used for this run. If not set, defaults to 1.
		#tag EndNote
		temperature As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The nucleus sampling value used for this run. If not set, defaults to 1.
		#tag EndNote
		top_p As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of prompt tokens specified to have been used over the course of the run. 
		#tag EndNote
		max_prompt_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The maximum number of completion tokens specified to have been used over the course of the run. 
		#tag EndNote
		max_completion_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		truncation_strategy As OpenAPIClient.Models.TruncationObject
	#tag EndProperty


	#tag Property, Flags = &h0
		tool_choice As OpenAPIClient.Models.AssistantsApiToolChoiceOption
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to enable [parallel function calling](/docs/guides/function-calling#configuring-parallel-function-calling) during tool use.
		#tag EndNote
		parallel_tool_calls As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		response_format As OpenAPIClient.Models.AssistantsApiResponseFormatOption
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        ThreadPeriodRun
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Queued
        InProgress
        RequiresAction
        Cancelling
        Cancelled
        Failed
        Completed
        Incomplete
        Expired
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.ThreadPeriodRun
		      Return "thread.run"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Queued
		      Return "queued"
		    Case StatusEnum.InProgress
		      Return "in_progress"
		    Case StatusEnum.RequiresAction
		      Return "requires_action"
		    Case StatusEnum.Cancelling
		      Return "cancelling"
		    Case StatusEnum.Cancelled
		      Return "cancelled"
		    Case StatusEnum.Failed
		      Return "failed"
		    Case StatusEnum.Completed
		      Return "completed"
		    Case StatusEnum.Incomplete
		      Return "incomplete"
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
			Name="thread_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
			Name="required_action"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunObjectRequiredAction"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="last_error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunObjectLastError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="expires_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="started_at"
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
			Name="incomplete_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunObjectIncompleteDetails"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="instructions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tools"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssistantObjectToolsInner"
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
			Type="RunCompletionUsage"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="temperature"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="top_p"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_prompt_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="max_completion_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="truncation_strategy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TruncationObject"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="tool_choice"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssistantsApiToolChoiceOption"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="parallel_tool_calls"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="response_format"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssistantsApiResponseFormatOption"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


