#tag Class
Protected Class CreateEditRequest

	#tag Property, Flags = &h0
		model As OpenAPIClient.Models.CreateEditRequestModel
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The input text to use as a starting point for the edit.
		#tag EndNote
		input As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The instruction that tells the model how to edit the prompt.
		#tag EndNote
		instruction As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			How many edits to generate for the input and instruction.
		#tag EndNote
		n As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			What sampling temperature to use, between 0 and 2. Higher values like 0.8 will make the output more random, while lower values like 0.2 will make it more focused and deterministic.  We generally recommend altering this or `top_p` but not both. 
		#tag EndNote
		temperature As Xoson.O.OptionalDouble
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both. 
		#tag EndNote
		top_p As Xoson.O.OptionalDouble
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
			Name="model"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="CreateEditRequestModel"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="input"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="instruction"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="n"
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
			Type="Double"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="top_p"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


