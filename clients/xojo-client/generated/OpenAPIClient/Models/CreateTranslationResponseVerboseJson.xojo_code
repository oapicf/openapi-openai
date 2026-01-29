#tag Class
Protected Class CreateTranslationResponseVerboseJson

	#tag Property, Flags = &h0
		#tag Note
			The language of the output translation (always `english`).
		#tag EndNote
		language As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The duration of the input audio.
		#tag EndNote
		duration As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The translated text.
		#tag EndNote
		text As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Segments of the translated text and their corresponding details.
		#tag EndNote
		segments() As OpenAPIClient.Models.TranscriptionSegment
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
			Name="language"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="duration"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="text"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="segments"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="TranscriptionSegment"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


