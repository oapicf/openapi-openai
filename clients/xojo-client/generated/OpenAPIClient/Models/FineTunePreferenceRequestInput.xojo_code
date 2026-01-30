#tag Class
Protected Class FineTunePreferenceRequestInput

	#tag Property, Flags = &h0
		input As OpenAPIClient.Models.FineTunePreferenceRequestInputInput
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The preferred completion message for the output.
		#tag EndNote
		preferred_completion() As OpenAPIClient.Models.FineTunePreferenceRequestInputPreferredCompletionInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The non-preferred completion message for the output.
		#tag EndNote
		non_preferred_completion() As OpenAPIClient.Models.FineTunePreferenceRequestInputPreferredCompletionInner
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
			Name="input"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTunePreferenceRequestInputInput"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="preferred_completion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTunePreferenceRequestInputPreferredCompletionInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="non_preferred_completion"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTunePreferenceRequestInputPreferredCompletionInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


