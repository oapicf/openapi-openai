#tag Class
Protected Class FineTuningJobHyperparameters

	#tag Property, Flags = &h0
		batch_size As OpenAPIClient.Models.CreateFineTuningJobRequestHyperparametersBatchSize
	#tag EndProperty


	#tag Property, Flags = &h0
		learning_rate_multiplier As OpenAPIClient.Models.CreateFineTuningJobRequestHyperparametersLearningRateMultiplier
	#tag EndProperty


	#tag Property, Flags = &h0
		n_epochs As OpenAPIClient.Models.CreateFineTuningJobRequestHyperparametersNEpochs
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
			Name="batch_size"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateFineTuningJobRequestHyperparametersBatchSize"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="learning_rate_multiplier"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateFineTuningJobRequestHyperparametersLearningRateMultiplier"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="n_epochs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateFineTuningJobRequestHyperparametersNEpochs"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


