#tag Class
Protected Class ListAuditLogsEffectiveAtParameter

	#tag Property, Flags = &h0
		#tag Note
			Return only events whose `effective_at` (Unix seconds) is greater than this value.
		#tag EndNote
		gt As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Return only events whose `effective_at` (Unix seconds) is greater than or equal to this value.
		#tag EndNote
		gte As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Return only events whose `effective_at` (Unix seconds) is less than this value.
		#tag EndNote
		lt As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Return only events whose `effective_at` (Unix seconds) is less than or equal to this value.
		#tag EndNote
		lte As Xoson.O.OptionalInteger
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
			Name="gt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="gte"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="lte"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


