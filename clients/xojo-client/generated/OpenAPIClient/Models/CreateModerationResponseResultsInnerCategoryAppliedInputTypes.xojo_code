#tag Class
Protected Class CreateModerationResponseResultsInnerCategoryAppliedInputTypes

	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'hate'.
		#tag EndNote
		hate() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'hate/threatening'.
		#tag EndNote
		hate_threatening() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'harassment'.
		#tag EndNote
		harassment() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'harassment/threatening'.
		#tag EndNote
		harassment_threatening() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'illicit'.
		#tag EndNote
		illicit() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'illicit/violent'.
		#tag EndNote
		illicit_violent() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'self-harm'.
		#tag EndNote
		self_harm() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'self-harm/intent'.
		#tag EndNote
		self_harm_intent() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'self-harm/instructions'.
		#tag EndNote
		self_harm_instructions() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'sexual'.
		#tag EndNote
		sexual() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'sexual/minors'.
		#tag EndNote
		sexual_minors() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'violence'.
		#tag EndNote
		violence() As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The applied input type(s) for the category 'violence/graphic'.
		#tag EndNote
		violence_graphic() As String
	#tag EndProperty


    #tag Enum, Name = HateEnum, Type = Integer, Flags = &h0
        
        Text
        
    #tag EndEnum

    #tag Enum, Name = Hate_threateningEnum, Type = Integer, Flags = &h0
        
        Text
        
    #tag EndEnum

    #tag Enum, Name = HarassmentEnum, Type = Integer, Flags = &h0
        
        Text
        
    #tag EndEnum

    #tag Enum, Name = Harassment_threateningEnum, Type = Integer, Flags = &h0
        
        Text
        
    #tag EndEnum

    #tag Enum, Name = IllicitEnum, Type = Integer, Flags = &h0
        
        Text
        
    #tag EndEnum

    #tag Enum, Name = Illicit_violentEnum, Type = Integer, Flags = &h0
        
        Text
        
    #tag EndEnum

    #tag Enum, Name = Self_harmEnum, Type = Integer, Flags = &h0
        
        Text
        Image
        
    #tag EndEnum

    #tag Enum, Name = Self_harm_intentEnum, Type = Integer, Flags = &h0
        
        Text
        Image
        
    #tag EndEnum

    #tag Enum, Name = Self_harm_instructionsEnum, Type = Integer, Flags = &h0
        
        Text
        Image
        
    #tag EndEnum

    #tag Enum, Name = SexualEnum, Type = Integer, Flags = &h0
        
        Text
        Image
        
    #tag EndEnum

    #tag Enum, Name = Sexual_minorsEnum, Type = Integer, Flags = &h0
        
        Text
        
    #tag EndEnum

    #tag Enum, Name = ViolenceEnum, Type = Integer, Flags = &h0
        
        Text
        Image
        
    #tag EndEnum

    #tag Enum, Name = Violence_graphicEnum, Type = Integer, Flags = &h0
        
        Text
        Image
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function HateEnumToString(value As HateEnum) As String
		  Select Case value
		    
		    Case HateEnum.Text
		      Return "text"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Hate_threateningEnumToString(value As Hate_threateningEnum) As String
		  Select Case value
		    
		    Case Hate_threateningEnum.Text
		      Return "text"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function HarassmentEnumToString(value As HarassmentEnum) As String
		  Select Case value
		    
		    Case HarassmentEnum.Text
		      Return "text"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Harassment_threateningEnumToString(value As Harassment_threateningEnum) As String
		  Select Case value
		    
		    Case Harassment_threateningEnum.Text
		      Return "text"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function IllicitEnumToString(value As IllicitEnum) As String
		  Select Case value
		    
		    Case IllicitEnum.Text
		      Return "text"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Illicit_violentEnumToString(value As Illicit_violentEnum) As String
		  Select Case value
		    
		    Case Illicit_violentEnum.Text
		      Return "text"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Self_harmEnumToString(value As Self_harmEnum) As String
		  Select Case value
		    
		    Case Self_harmEnum.Text
		      Return "text"
		    Case Self_harmEnum.Image
		      Return "image"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Self_harm_intentEnumToString(value As Self_harm_intentEnum) As String
		  Select Case value
		    
		    Case Self_harm_intentEnum.Text
		      Return "text"
		    Case Self_harm_intentEnum.Image
		      Return "image"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Self_harm_instructionsEnumToString(value As Self_harm_instructionsEnum) As String
		  Select Case value
		    
		    Case Self_harm_instructionsEnum.Text
		      Return "text"
		    Case Self_harm_instructionsEnum.Image
		      Return "image"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function SexualEnumToString(value As SexualEnum) As String
		  Select Case value
		    
		    Case SexualEnum.Text
		      Return "text"
		    Case SexualEnum.Image
		      Return "image"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Sexual_minorsEnumToString(value As Sexual_minorsEnum) As String
		  Select Case value
		    
		    Case Sexual_minorsEnum.Text
		      Return "text"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function ViolenceEnumToString(value As ViolenceEnum) As String
		  Select Case value
		    
		    Case ViolenceEnum.Text
		      Return "text"
		    Case ViolenceEnum.Image
		      Return "image"
		    
		  End Select
		  Return ""
		End Function
	#tag EndMethod
	#tag Method, Flags = &h0
		Shared Function Violence_graphicEnumToString(value As Violence_graphicEnum) As String
		  Select Case value
		    
		    Case Violence_graphicEnum.Text
		      Return "text"
		    Case Violence_graphicEnum.Image
		      Return "image"
		    
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


