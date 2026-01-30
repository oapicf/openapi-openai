#tag Class
Protected Class Batch

	#tag Property, Flags = &h0
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always `batch`.
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The OpenAI API endpoint used by the batch.
		#tag EndNote
		endpoint As String
	#tag EndProperty


	#tag Property, Flags = &h0
		errors As OpenAPIClient.Models.BatchErrors
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the input file for the batch.
		#tag EndNote
		input_file_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The time frame within which the batch should be processed.
		#tag EndNote
		completion_window As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The current status of the batch.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the file containing the outputs of successfully executed requests.
		#tag EndNote
		output_file_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of the file containing the outputs of requests with errors.
		#tag EndNote
		error_file_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch started processing.
		#tag EndNote
		in_progress_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch will expire.
		#tag EndNote
		expires_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch started finalizing.
		#tag EndNote
		finalizing_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch was completed.
		#tag EndNote
		completed_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch failed.
		#tag EndNote
		failed_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch expired.
		#tag EndNote
		expired_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch started cancelling.
		#tag EndNote
		cancelling_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the batch was cancelled.
		#tag EndNote
		cancelled_at As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		request_counts As OpenAPIClient.Models.BatchRequestCounts
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Set of 16 key-value pairs that can be attached to an object. This can be useful for storing additional information about the object in a structured format. Keys can be a maximum of 64 characters long and values can be a maximum of 512 characters long. 
		#tag EndNote
		metadata As Object
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        Batch
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        Validating
        Failed
        InProgress
        Finalizing
        Completed
        Expired
        Cancelling
        Cancelled
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.Batch
		      Return "batch"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.Validating
		      Return "validating"
		    Case StatusEnum.Failed
		      Return "failed"
		    Case StatusEnum.InProgress
		      Return "in_progress"
		    Case StatusEnum.Finalizing
		      Return "finalizing"
		    Case StatusEnum.Completed
		      Return "completed"
		    Case StatusEnum.Expired
		      Return "expired"
		    Case StatusEnum.Cancelling
		      Return "cancelling"
		    Case StatusEnum.Cancelled
		      Return "cancelled"
		    
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
			Name="endpoint"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="errors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BatchErrors"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input_file_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="completion_window"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="output_file_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="error_file_id"
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
			Name="in_progress_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="finalizing_at"
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
			Name="failed_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="cancelling_at"
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
			Name="request_counts"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BatchRequestCounts"
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


