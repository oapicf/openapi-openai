#tag Class
Protected Class ResponseFormatJsonSchemaJsonSchema

	#tag Property, Flags = &h0
		#tag Note
			A description of what the response format is for, used by the model to determine how to respond in the format.
		#tag EndNote
		description As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The name of the response format. Must be a-z, A-Z, 0-9, or contain underscores and dashes, with a maximum length of 64.
		#tag EndNote
		name As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The schema for the response format, described as a JSON Schema object.
		#tag EndNote
		schema As Dictionary
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Whether to enable strict schema adherence when generating the output. If set to true, the model will always follow the exact schema defined in the `schema` field. Only a subset of JSON Schema is supported when `strict` is `true`. To learn more, read the [Structured Outputs guide](/docs/guides/structured-outputs).
		#tag EndNote
		strict As Xoson.O.OptionalBoolean
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
			Name="description"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="name"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="schema"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Dictionary"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="strict"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


