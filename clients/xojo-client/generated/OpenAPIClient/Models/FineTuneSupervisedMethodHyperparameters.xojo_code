#tag Class
Protected Class FineTuneSupervisedMethodHyperparameters

	#tag Property, Flags = &h0
		batch_size As OpenAPIClient.Models.FineTuneDPOMethodHyperparametersBatchSize
	#tag EndProperty


	#tag Property, Flags = &h0
		learning_rate_multiplier As OpenAPIClient.Models.FineTuneDPOMethodHyperparametersLearningRateMultiplier
	#tag EndProperty


	#tag Property, Flags = &h0
		n_epochs As OpenAPIClient.Models.FineTuneDPOMethodHyperparametersNEpochs
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
			Type="FineTuneDPOMethodHyperparametersBatchSize"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="learning_rate_multiplier"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuneDPOMethodHyperparametersLearningRateMultiplier"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="n_epochs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuneDPOMethodHyperparametersNEpochs"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


