#tag Class
Protected Class CreateImageRequest

	#tag Property, Flags = &h0
		#tag Note
			A text description of the desired image(s). The maximum length is 1000 characters.
		#tag EndNote
		prompt As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of images to generate. Must be between 1 and 10.
		#tag EndNote
		n As Xoson.O.OptionalInteger
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`.
		#tag EndNote
		size As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The format in which the generated images are returned. Must be one of `url` or `b64_json`.
		#tag EndNote
		response_format As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			A unique identifier representing your end-user, which can help OpenAI to monitor and detect abuse. [Learn more](/docs/guides/safety-best-practices/end-user-ids). 
		#tag EndNote
		user As Xoson.O.OptionalString
	#tag EndProperty


    #tag Enum, Name = SizeEnum, Type = Integer, Flags = &h0
        
        Escaped256x256
        Escaped512x512
        Escaped1024x1024
        
    #tag EndEnum

    #tag Enum, Name = Response_formatEnum, Type = Integer, Flags = &h0
        
        Url
        B64Json
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function SizeEnumToString(value As SizeEnum) As String
		  Select Case value
		    
		    Case SizeEnum.Escaped256x256
		      Return "256x256"
		    Case SizeEnum.Escaped512x512
		      Return "512x512"
		    Case SizeEnum.Escaped1024x1024
		      Return "1024x1024"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Response_formatEnumToString(value As Response_formatEnum) As String
		  Select Case value
		    
		    Case Response_formatEnum.Url
		      Return "url"
		    Case Response_formatEnum.B64Json
		      Return "b64_json"
		    
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
			Name="prompt"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="n"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="user"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="String"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


