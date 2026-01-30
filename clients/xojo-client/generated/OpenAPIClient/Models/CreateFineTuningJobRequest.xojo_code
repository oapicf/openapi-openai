#tag Class
Protected Class CreateFineTuningJobRequest

	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateFineTuningJobRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/create) for how to upload a file.  Your dataset must be formatted as a JSONL file. Additionally, you must upload your file with the purpose `fine-tune`.  The contents of the file should differ depending on if the model uses the [chat](/docs/api-reference/fine-tuning/chat-input), [completions](/docs/api-reference/fine-tuning/completions-input) format, or if the fine-tuning method uses the [preference](/docs/api-reference/fine-tuning/preference-input) format.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
		#tag EndNote
		training_file As String
	#tag EndProperty


	#tag Property, Flags = &h0
		Attributes( Deprecated ) hyperparameters As OpenAPIClient.Models.CreateFineTuningJobRequestHyperparameters
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A string of up to 64 characters that will be added to your fine-tuned model name.  For example, a `suffix` of "custom-model-name" would produce a model name like `ft:gpt-4o-mini:openai:custom-model-name:7p4lURel`. 
		#tag EndNote
		suffix As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the fine-tuning results file. The same data should not be present in both train and validation files.  Your dataset must be formatted as a JSONL file. You must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning) for more details. 
		#tag EndNote
		validation_file As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A list of integrations to enable for your fine-tuning job.
		#tag EndNote
		integrations() As OpenAPIClient.Models.CreateFineTuningJobRequestIntegrationsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The seed controls the reproducibility of the job. Passing in the same seed and job parameters should produce the same results, but may differ in rare cases. If a seed is not specified, one will be generated for you. 
		#tag EndNote
		seed As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		method As OpenAPIClient.Models.FineTuneMethod
	#tag EndProperty





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
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateFineTuningJobRequestModel"
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
			Name="hyperparameters"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateFineTuningJobRequestHyperparameters"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="suffix"
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
			Type="CreateFineTuningJobRequestIntegrationsInner"
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


