#tag Class
Protected Class TranscriptionSegment

	#tag Property, Flags = &h0
		#tag Note
			Unique identifier of the segment.
		#tag EndNote
		id As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Seek offset of the segment.
		#tag EndNote
		seek As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Start time of the segment in seconds.
		#tag EndNote
		start As Single
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			End time of the segment in seconds.
		#tag EndNote
		Escapedend As Single
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Text content of the segment.
		#tag EndNote
		text As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Array of token IDs for the text content.
		#tag EndNote
		tokens() As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Temperature parameter used for generating the segment.
		#tag EndNote
		temperature As Single
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Average logprob of the segment. If the value is lower than -1, consider the logprobs failed.
		#tag EndNote
		avg_logprob As Single
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Compression ratio of the segment. If the value is greater than 2.4, consider the compression failed.
		#tag EndNote
		compression_ratio As Single
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Probability of no speech in the segment. If the value is higher than 1.0 and the `avg_logprob` is below -1, consider this segment silent.
		#tag EndNote
		no_speech_prob As Single
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
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="seek"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedend"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
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
			Name="tokens"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="temperature"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="avg_logprob"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="compression_ratio"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="no_speech_prob"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Single"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


