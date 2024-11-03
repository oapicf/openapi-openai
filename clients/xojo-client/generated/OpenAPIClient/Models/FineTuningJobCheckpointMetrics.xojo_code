#tag Class
Protected Class FineTuningJobCheckpointMetrics

	#tag Property, Flags = &h0
		Escapedstep As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		train_loss As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		train_mean_token_accuracy As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		valid_loss As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		valid_mean_token_accuracy As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		full_valid_loss As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		full_valid_mean_token_accuracy As Xoson.O.OptionalDouble
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
			Name="Escapedstep"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="train_loss"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="train_mean_token_accuracy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="valid_loss"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="valid_mean_token_accuracy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="full_valid_loss"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="full_valid_mean_token_accuracy"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


