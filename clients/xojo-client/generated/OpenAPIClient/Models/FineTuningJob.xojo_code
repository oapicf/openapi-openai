#tag Class
Protected Class FineTuningJob

	#tag Property, Flags = &h0
		#tag Note
			The object identifier, which can be referenced in the API endpoints.
		#tag EndNote
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the fine-tuning job was created.
		#tag EndNote
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		error As OpenAPIClient.Models.FineTuningJobError
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the fine-tuned model that is being created. The value will be null if the fine-tuning job is still running.
		#tag EndNote
		fine_tuned_model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the fine-tuning job was finished. The value will be null if the fine-tuning job is still running.
		#tag EndNote
		finished_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		hyperparameters As OpenAPIClient.Models.FineTuningJobHyperparameters
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The base model that is being fine-tuned.
		#tag EndNote
		model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The object type, which is always "fine_tuning.job".
		#tag EndNote
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The organization that owns the fine-tuning job.
		#tag EndNote
		organization_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The compiled results file ID(s) for the fine-tuning job. You can retrieve the results with the [Files API](/docs/api-reference/files/retrieve-contents).
		#tag EndNote
		result_files() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The current status of the fine-tuning job, which can be either `validating_files`, `queued`, `running`, `succeeded`, `failed`, or `cancelled`.
		#tag EndNote
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The total number of billable tokens processed by this fine-tuning job. The value will be null if the fine-tuning job is still running.
		#tag EndNote
		trained_tokens As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The file ID used for training. You can retrieve the training data with the [Files API](/docs/api-reference/files/retrieve-contents).
		#tag EndNote
		training_file As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The file ID used for validation. You can retrieve the validation results with the [Files API](/docs/api-reference/files/retrieve-contents).
		#tag EndNote
		validation_file As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of integrations to enable for this fine-tuning job.
		#tag EndNote
		integrations() As OpenAPIClient.Models.FineTuningJobIntegrationsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The seed used for the fine-tuning job.
		#tag EndNote
		seed As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The Unix timestamp (in seconds) for when the fine-tuning job is estimated to finish. The value will be null if the fine-tuning job is not running.
		#tag EndNote
		estimated_finish As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		method As OpenAPIClient.Models.FineTuneMethod
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        FineTuningPeriodJob
        
    #tag EndEnum

    #tag Enum, Name = StatusEnum, Type = Integer, Flags = &h0
        
        ValidatingFiles
        Queued
        Running
        Succeeded
        Failed
        Cancelled
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.FineTuningPeriodJob
		      Return "fine_tuning.job"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function StatusEnumToString(value As StatusEnum) As String
		  Select Case value
		    
		    Case StatusEnum.ValidatingFiles
		      Return "validating_files"
		    Case StatusEnum.Queued
		      Return "queued"
		    Case StatusEnum.Running
		      Return "running"
		    Case StatusEnum.Succeeded
		      Return "succeeded"
		    Case StatusEnum.Failed
		      Return "failed"
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
			Name="created_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuningJobError"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="fine_tuned_model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="finished_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hyperparameters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuningJobHyperparameters"
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
			Name="organization_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="result_files"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="trained_tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="training_file"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="validation_file"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="integrations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuningJobIntegrationsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="seed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="estimated_finish"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="method"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuneMethod"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


