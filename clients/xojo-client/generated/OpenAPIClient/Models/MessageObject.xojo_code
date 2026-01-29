#tag Class
Protected Class MessageObject

	#tag Property, Flags = &h0
		#tag Note
			The identifier, which can be referenced in API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `thread.message`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the message was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The [thread](/docs/api-reference/threads) ID that this message belongs to.
		#tag EndNote
		thread_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The status of the message, which can be either `in_progress`, `incomplete`, or `completed`.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		incomplete_details As OpenAPIClient.Models.MessageObjectIncompleteDetails
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the message was completed.
		#tag EndNote
		completed_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the message was marked as incomplete.
		#tag EndNote
		incomplete_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The entity that produced the message. One of `user` or `assistant`.
		#tag EndNote
		role As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The content of the message in array of text and/or images.
		#tag EndNote
		content() As OpenAPIClient.Models.MessageObjectContentInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If applicable, the ID of the [assistant](/docs/api-reference/assistants) that authored this message.
		#tag EndNote
		assistant_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the [run](/docs/api-reference/runs) associated with the creation of this message. Value is `null` when messages are created manually using the create message or create thread endpoints.
		#tag EndNote
		run_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of [file](/docs/api-reference/files) IDs that the assistant should use. Useful for tools like retrieval and code_interpreter that can access files. A maximum of 10 files can be attached to a message.
		#tag EndNote
		file_ids() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maxium of 512 characters long. 
		#tag EndNote
		metadata As Object
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        ThreadPeriodMessage
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        InProgress
        Incomplete
        Completed
        
    #tag EndEnum

    #tag Enum, Name = RoleEnum, Type = Integer, Flags = &h0
        
        User
        Assistant
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.ThreadPeriodMessage
		      Return "thread.message"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.InProgress
		      Return "in_progress"
		    Case StatusEnum.Incomplete
		      Return "incomplete"
		    Case StatusEnum.Completed
		      Return "completed"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function RoleEnumToString(value As RoleEnum) As String
		  Select Case value
		    
		    Case RoleEnum.User
		      Return "user"
		    Case RoleEnum.Assistant
		      Return "assistant"
		    
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
			Name="incomplete_details"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MessageObjectIncompleteDetails"
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
			Name="incomplete_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="content"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MessageObjectContentInner"
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
			Name="run_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="file_ids"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
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
	#tag EndViewBehavior
End Class
#tag EndClass


