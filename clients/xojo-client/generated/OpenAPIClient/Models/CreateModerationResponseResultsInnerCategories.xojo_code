#tag Class
Protected Class CreateModerationResponseResultsInnerCategories

	#tag Property, Flags = &h0
		#tag Note
			Content that expresses, incites, or promotes hate based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste. Hateful content aimed at non-protected groups (e.g., chess players) is harassment.
		#tag EndNote
		hate As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Hateful content that also includes violence or serious harm towards the targeted group based on race, gender, ethnicity, religion, nationality, sexual orientation, disability status, or caste.
		#tag EndNote
		hate_threatening As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content that expresses, incites, or promotes harassing language towards any target.
		#tag EndNote
		harassment As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Harassment content that also includes violence or serious harm towards any target.
		#tag EndNote
		harassment_threatening As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content that includes instructions or advice that facilitate the planning or execution of wrongdoing, or that gives advice or instruction on how to commit illicit acts. For example, "how to shoplift" would fit this category.
		#tag EndNote
		illicit As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content that includes instructions or advice that facilitate the planning or execution of wrongdoing that also includes violence, or that gives advice or instruction on the procurement of any weapon.
		#tag EndNote
		illicit_violent As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content that promotes, encourages, or depicts acts of self-harm, such as suicide, cutting, and eating disorders.
		#tag EndNote
		self_harm As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content where the speaker expresses that they are engaging or intend to engage in acts of self-harm, such as suicide, cutting, and eating disorders.
		#tag EndNote
		self_harm_intent As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content that encourages performing acts of self-harm, such as suicide, cutting, and eating disorders, or that gives instructions or advice on how to commit such acts.
		#tag EndNote
		self_harm_instructions As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content meant to arouse sexual excitement, such as the description of sexual activity, or that promotes sexual services (excluding sex education and wellness).
		#tag EndNote
		sexual As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Sexual content that includes an individual who is under 18 years old.
		#tag EndNote
		sexual_minors As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content that depicts death, violence, or physical injury.
		#tag EndNote
		violence As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Content that depicts death, violence, or physical injury in graphic detail.
		#tag EndNote
		violence_graphic As Boolean
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
			Name="hate"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="hate_threatening"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="harassment"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="harassment_threatening"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="illicit"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="illicit_violent"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="self_harm"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="self_harm_intent"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="self_harm_instructions"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sexual"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="sexual_minors"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="violence"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="violence_graphic"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


