#tag Class
Protected Class CreateEditResponse

	#tag Property, Flags = &h0
		object As String
	#tag EndProperty


	#tag Property, Flags = &h0
		created As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		choices() As OpenAPIClient.Models.CreateEditResponseChoicesInner
	#tag EndProperty


	#tag Property, Flags = &h0
		usage As OpenAPIClient.Models.CreateCompletionResponseUsage
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
			Name="object"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="created"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="choices"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateEditResponseChoicesInner"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="usage"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateCompletionResponseUsage"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


