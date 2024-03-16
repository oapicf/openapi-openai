#tag Class
Protected Class FineTune

	#tag Property, Flags = &h0
		id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		created_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		updated_at As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		fine_tuned_model As String
	#tag EndProperty


	#tag Property, Flags = &h0
		organization_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		status As String
	#tag EndProperty


	#tag Property, Flags = &h0
		hyperparams As Object
	#tag EndProperty


	#tag Property, Flags = &h0
		training_files() As OpenAPIClient.Models.OpenAIFile
	#tag EndProperty


	#tag Property, Flags = &h0
		validation_files() As OpenAPIClient.Models.OpenAIFile
	#tag EndProperty


	#tag Property, Flags = &h0
		result_files() As OpenAPIClient.Models.OpenAIFile
	#tag EndProperty


	#tag Property, Flags = &h0
		events() As OpenAPIClient.Models.FineTuneEvent
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
			Name="id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="object"
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
			Name="updated_at"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
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
			Name="fine_tuned_model"
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
			Name="status"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hyperparams"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Object"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="training_files"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OpenAIFile"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="validation_files"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OpenAIFile"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="result_files"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="OpenAIFile"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="events"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuneEvent"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


