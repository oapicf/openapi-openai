#tag Class
Protected Class MessageContentImageUrlObjectImageUrl

	#tag Property, Flags = &h0
		#tag Note
			The external URL of the image, must be a supported image types: jpeg, jpg, png, gif, webp.
		#tag EndNote
		url As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Specifies the detail level of the image. `low` uses fewer tokens, you can opt in to high resolution using `high`. Default value is `auto`
		#tag EndNote
		detail As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = DetailEnum, Type = Integer, Flags = &h0
        
        Auto
        Low
        High
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function DetailEnumToString(value As DetailEnum) As String
		  Select Case value
		    
		    Case DetailEnum.Auto
		      Return "auto"
		    Case DetailEnum.Low
		      Return "low"
		    Case DetailEnum.High
		      Return "high"
		    
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
			Name="url"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


