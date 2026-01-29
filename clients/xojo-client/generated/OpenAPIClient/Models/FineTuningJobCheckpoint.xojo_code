#tag Class
Protected Class FineTuningJobCheckpoint

	#tag Property, Flags = &h0
		#tag Note
			The checkpoint identifier, which can be referenced in the API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the checkpoint was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the fine-tuned checkpoint model that is created.
		#tag EndNote
		fine_tuned_model_checkpoint As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The step number that the checkpoint was created at.
		#tag EndNote
		step_number As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		metrics As OpenAPIClient.Models.FineTuningJobCheckpointMetrics
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the fine-tuning job that this checkpoint was created from.
		#tag EndNote
		fine_tuning_job_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always "fine_tuning.job.checkpoint".
		#tag EndNote
		object As String
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        FineTuningPeriodJobPeriodCheckpoint
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.FineTuningPeriodJobPeriodCheckpoint
		      Return "fine_tuning.job.checkpoint"
		    
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
			Name="fine_tuned_model_checkpoint"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="step_number"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuningJobCheckpointMetrics"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fine_tuning_job_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


