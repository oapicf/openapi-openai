#tag Class
Protected Class RunStepDetailsToolCallsFileSearchObjectFileSearch

	#tag Property, Flags = &h0
		ranking_options As OpenAPIClient.Models.RunStepDetailsToolCallsFileSearchRankingOptionsObject
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The results of the file search.
		#tag EndNote
		results() As OpenAPIClient.Models.RunStepDetailsToolCallsFileSearchResultObject
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
			Name="ranking_options"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDetailsToolCallsFileSearchRankingOptionsObject"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="results"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDetailsToolCallsFileSearchResultObject"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


