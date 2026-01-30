#tag Class
Protected Class ModifyAssistantRequestToolResources

	#tag Property, Flags = &h0
		code_interpreter As OpenAPIClient.Models.ModifyAssistantRequestToolResourcesCodeInterpreter
	#tag EndProperty


	#tag Property, Flags = &h0
		file_search As OpenAPIClient.Models.ModifyAssistantRequestToolResourcesFileSearch
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
			Name="code_interpreter"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ModifyAssistantRequestToolResourcesCodeInterpreter"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="file_search"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="ModifyAssistantRequestToolResourcesFileSearch"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


