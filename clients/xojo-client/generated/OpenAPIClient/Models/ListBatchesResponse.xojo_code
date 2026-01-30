#tag Class
Protected Class ListBatchesResponse

	#tag Property, Flags = &h0
		data() As OpenAPIClient.Models.Batch
	#tag EndProperty


	#tag Property, Flags = &h0
		first_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		last_id As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		has_more As Boolean
	#tag EndProperty


	#tag Property, Flags = &h0
		object As String
	#tag EndProperty


    #tag Enum, Name = ObjectEnum, Type = Integer, Flags = &h0
        
        List
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function ObjectEnumToString(value As ObjectEnum) As String
		  Select Case value
		    
		    Case ObjectEnum.List
		      Return "list"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


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
			Name="data"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Batch"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="first_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="last_id"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="has_more"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Boolean"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


