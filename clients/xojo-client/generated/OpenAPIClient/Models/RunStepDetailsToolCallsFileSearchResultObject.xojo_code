#tag Class
Protected Class RunStepDetailsToolCallsFileSearchResultObject

	#tag Property, Flags = &h0
		#tag Note
			The ID of the file that result was found in.
		#tag EndNote
		file_id As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the file that result was found in.
		#tag EndNote
		file_name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The score of the result. All values must be a floating point number between 0 and 1.
		#tag EndNote
		score As Double
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The content of the result that was found. The content is only included if requested via the include query parameter.
		#tag EndNote
		content() As OpenAPIClient.Models.RunStepDetailsToolCallsFileSearchResultObjectContentInner
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
			Name="file_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="file_name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="score"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="content"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="RunStepDetailsToolCallsFileSearchResultObjectContentInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


