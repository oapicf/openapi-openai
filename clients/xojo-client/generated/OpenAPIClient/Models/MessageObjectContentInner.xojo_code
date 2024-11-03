#tag Class
Protected Class MessageObjectContentInner

	#tag Property, Flags = &h0
		#tag Note
			Always `image_file`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		image_file As OpenAPIClient.Models.MessageContentImageFileObjectImageFile
	#tag EndProperty


	#tag Property, Flags = &h0
		text As OpenAPIClient.Models.MessageContentTextObjectText
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        ImageFile
        Text
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.ImageFile
		      Return "image_file"
		    Case TypeEnum.Text
		      Return "text"
		    
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
			Name="image_file"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MessageContentImageFileObjectImageFile"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="text"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MessageContentTextObjectText"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


