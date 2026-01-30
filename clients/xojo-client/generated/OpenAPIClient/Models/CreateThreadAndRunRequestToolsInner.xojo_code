#tag Class
Protected Class CreateThreadAndRunRequestToolsInner

	#tag Property, Flags = &h0
		#tag Note
			The type of tool being defined: `code_interpreter`
		#tag EndNote
		type As String
	#tag EndProperty


	#tag Property, Flags = &h0
		file_search As OpenAPIClient.Models.AssistantToolsFileSearchFileSearch
	#tag EndProperty


	#tag Property, Flags = &h0
		Escapedfunction As OpenAPIClient.Models.FunctionObject
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        CodeInterpreter
        FileSearch
        Escapedfunction
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.CodeInterpreter
		      Return "code_interpreter"
		    Case TypeEnum.FileSearch
		      Return "file_search"
		    Case TypeEnum.Escapedfunction
		      Return "function"
		    
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
			Name="file_search"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="AssistantToolsFileSearchFileSearch"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="Escapedfunction"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FunctionObject"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


