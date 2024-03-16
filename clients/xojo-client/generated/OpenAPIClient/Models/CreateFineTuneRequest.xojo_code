#tag Class
Protected Class CreateFineTuneRequest

	#tag Property, Flags = &h0
		#tag Note
			The ID of an uploaded file that contains training data.  See [upload file](/docs/api-reference/files/upload) for how to upload a file.  Your dataset must be formatted as a JSONL file, where each training example is a JSON object with the keys "prompt" and "completion". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
		#tag EndNote
		training_file As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The ID of an uploaded file that contains validation data.  If you provide this file, the data is used to generate validation metrics periodically during fine-tuning. These metrics can be viewed in the [fine-tuning results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model). Your train and validation data should be mutually exclusive.  Your dataset must be formatted as a JSONL file, where each validation example is a JSON object with the keys "prompt" and "completion". Additionally, you must upload your file with the purpose `fine-tune`.  See the [fine-tuning guide](/docs/guides/fine-tuning/creating-training-data) for more details. 
		#tag EndNote
		validation_file As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateFineTuneRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
		#tag EndNote
		n_epochs As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The batch size to use for training. The batch size is the number of training examples used to train a single forward and backward pass.  By default, the batch size will be dynamically configured to be ~0.2% of the number of examples in the training set, capped at 256 - in general, we've found that larger batch sizes tend to work better for larger datasets. 
		#tag EndNote
		batch_size As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The learning rate multiplier to use for training. The fine-tuning learning rate is the original learning rate used for pretraining multiplied by this value.  By default, the learning rate multiplier is the 0.05, 0.1, or 0.2 depending on final `batch_size` (larger learning rates tend to perform better with larger batch sizes). We recommend experimenting with values in the range 0.02 to 0.2 to see what produces the best results. 
		#tag EndNote
		learning_rate_multiplier As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The weight to use for loss on the prompt tokens. This controls how much the model tries to learn to generate the prompt (as compared to the completion which always has a weight of 1.0), and can add a stabilizing effect to training when completions are short.  If prompts are extremely long (relative to completions), it may make sense to reduce this weight so as to avoid over-prioritizing learning the prompt. 
		#tag EndNote
		prompt_loss_weight As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If set, we calculate classification-specific metrics such as accuracy and F-1 score using the validation set at the end of every epoch. These metrics can be viewed in the [results file](/docs/guides/fine-tuning/analyzing-your-fine-tuned-model).  In order to compute classification metrics, you must provide a `validation_file`. Additionally, you must specify `classification_n_classes` for multiclass classification or `classification_positive_class` for binary classification. 
		#tag EndNote
		compute_classification_metrics As Xoson.O.OptionalBoolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of classes in a classification task.  This parameter is required for multiclass classification. 
		#tag EndNote
		classification_n_classes As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The positive class in binary classification.  This parameter is needed to generate precision, recall, and F1 metrics when doing binary classification. 
		#tag EndNote
		classification_positive_class As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If this is provided, we calculate F-beta scores at the specified beta values. The F-beta score is a generalization of F-1 score. This is only used for binary classification.  With a beta of 1 (i.e. the F-1 score), precision and recall are given the same weight. A larger beta score puts more weight on recall and less on precision. A smaller beta score puts more weight on precision and less on recall. 
		#tag EndNote
		classification_betas() As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A string of up to 40 characters that will be added to your fine-tuned model name.  For example, a `suffix` of "custom-model-name" would produce a model name like `ada:ft-your-org:custom-model-name-2022-02-15-04-21-04`. 
		#tag EndNote
		suffix As Xoson.O.OptionalString
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
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateFineTuneRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="n_epochs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="batch_size"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="learning_rate_multiplier"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="prompt_loss_weight"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="compute_classification_metrics"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="classification_n_classes"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="classification_positive_class"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="classification_betas"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
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
	#tag EndViewBehavior
End Class
#tag EndClass


