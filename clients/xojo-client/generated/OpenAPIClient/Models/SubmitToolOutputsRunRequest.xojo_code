#tag Class
Protected Class SubmitToolOutputsRunRequest

	#tag Property, Flags = &h0
		#tag Note
			A list of tools for which the outputs are being submitted.
		#tag EndNote
		tool_outputs() As OpenAPIClient.Models.SubmitToolOutputsRunRequestToolOutputsInner
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			If `true`, returns a stream of events that happen during the Run as server-sent events, terminating when the Run enters a terminal state with a `data: [DONE]` message. 
		#tag EndNote
		stream As Xoson.O.OptionalBoolean
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
			Name="tool_outputs"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="SubmitToolOutputsRunRequestToolOutputsInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="stream"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


