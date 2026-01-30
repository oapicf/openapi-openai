#tag Class
Protected Class CreateModerationResponseResultsInner

	#tag Property, Flags = &h0
		#tag Note
			Whether any of the below categories are flagged.
		#tag EndNote
		flagged As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		categories As OpenAPIClient.Models.CreateModerationResponseResultsInnerCategories
	#tag EndProperty


	#tag Property, Flags = &h0
		category_scores As OpenAPIClient.Models.CreateModerationResponseResultsInnerCategoryScores
	#tag EndProperty


	#tag Property, Flags = &h0
		category_applied_input_types As OpenAPIClient.Models.CreateModerationResponseResultsInnerCategoryAppliedInputTypes
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
			Name="flagged"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="categories"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateModerationResponseResultsInnerCategories"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="category_scores"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateModerationResponseResultsInnerCategoryScores"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="category_applied_input_types"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateModerationResponseResultsInnerCategoryAppliedInputTypes"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


