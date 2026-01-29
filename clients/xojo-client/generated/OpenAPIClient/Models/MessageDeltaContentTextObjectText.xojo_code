#tag Class
Protected Class MessageDeltaContentTextObjectText

	#tag Property, Flags = &h0
		#tag Note
			The data that makes up the text.
		#tag EndNote
		value As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		annotations() As OpenAPIClient.Models.MessageDeltaContentTextObjectTextAnnotationsInner
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
			Name="value"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="annotations"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MessageDeltaContentTextObjectTextAnnotationsInner"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


