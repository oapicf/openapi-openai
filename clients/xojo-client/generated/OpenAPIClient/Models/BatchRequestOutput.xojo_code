#tag Class
Protected Class BatchRequestOutput

	#tag Property, Flags = &h0
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A developer-provided per-request id that will be used to match outputs to inputs.
		#tag EndNote
		custom_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		response As OpenAPIClient.Models.BatchRequestOutputResponse
	#tag EndProperty


	#tag Property, Flags = &h0
		error As OpenAPIClient.Models.BatchRequestOutputError
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
			Name="custom_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="response"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BatchRequestOutputResponse"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="error"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="BatchRequestOutputError"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


