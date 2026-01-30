#tag Class
Protected Class AuditLogApiKeyUpdated

	#tag Property, Flags = &h0
		#tag Note
			The tracking ID of the API key.
		#tag EndNote
		id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		changes_requested As OpenAPIClient.Models.AuditLogApiKeyUpdatedChangesRequested
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
			Name="changes_requested"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AuditLogApiKeyUpdatedChangesRequested"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


