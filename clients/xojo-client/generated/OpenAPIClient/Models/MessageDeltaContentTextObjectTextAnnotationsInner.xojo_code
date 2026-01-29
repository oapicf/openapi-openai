#tag Class
Protected Class MessageDeltaContentTextObjectTextAnnotationsInner

	#tag Property, Flags = &h0
		#tag Note
			The index of the annotation in the text content part.
		#tag EndNote
		index As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			Always `file_citation`.
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The text in the message content that needs to be replaced.
		#tag EndNote
		text As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		file_citation As OpenAPIClient.Models.MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation
	#tag EndProperty


	#tag Property, Flags = &h0
		start_index As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		end_index As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		file_path As OpenAPIClient.Models.MessageDeltaContentTextAnnotationsFilePathObjectFilePath
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        FileCitation
        FilePath
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.FileCitation
		      Return "file_citation"
		    Case TypeEnum.FilePath
		      Return "file_path"
		    
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
			Name="index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="text"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="file_citation"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MessageDeltaContentTextAnnotationsFileCitationObjectFileCitation"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="start_index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="end_index"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="file_path"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="MessageDeltaContentTextAnnotationsFilePathObjectFilePath"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


