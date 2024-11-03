#tag Module
Protected Module Models
	#tag Method, Flags = &h21
		Protected Function ChatCompletionRoleToString(value As ChatCompletionRole) As String
		  Select Case value
		    Case ChatCompletionRole.System
		      Return "system"
		    Case ChatCompletionRole.User
		      Return "user"
		    Case ChatCompletionRole.Assistant
		      Return "assistant"
		    Case ChatCompletionRole.Tool
		      Return "tool"
		    Case ChatCompletionRole.Escapedfunction
		      Return "function"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod


	#tag Enum, Name = ChatCompletionRole, Type = Integer, Flags = &h1
		
		System
		User
		Assistant
		Tool
		Escapedfunction
		
	#tag EndEnum


	#tag ViewBehavior
		#tag ViewProperty
			Name="Name"
			Visible=true
			Group="ID"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
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
End Module
#tag EndModule
