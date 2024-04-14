#tag Class
Protected Class AssistantStreamEvent

	#tag Property, Flags = &h0
		Escapedevent As String
	#tag EndProperty


	#tag Property, Flags = &h0
		data As String
	#tag EndProperty


    #tag Enum, Name = EscapedeventEnum, Type = Integer, Flags = &h0
        
        Done
        
    #tag EndEnum

    #tag Enum, Name = DataEnum, Type = Integer, Flags = &h0
        
        LeftSquareBracketDoneRightSquareBracket
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function EscapedeventEnumToString(value As EscapedeventEnum) As String
		  Select Case value
		    
		    Case EscapedeventEnum.Done
		      Return "done"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function DataEnumToString(value As DataEnum) As String
		  Select Case value
		    
		    Case DataEnum.LeftSquareBracketDoneRightSquareBracket
		      Return "[DONE]"
		    
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
	#tag EndViewBehavior
End Class
#tag EndClass


