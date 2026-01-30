#tag Class
Protected Class FineTuneMethod

	#tag Property, Flags = &h0
		#tag Note
			The type of method. Is either `supervised` or `dpo`.
		#tag EndNote
		type As Xoson.O.OptionalString
	#tag EndProperty


	#tag Property, Flags = &h0
		supervised As FineTuneSupervisedMethod
	#tag EndProperty


	#tag Property, Flags = &h0
		dpo As FineTuneDPOMethod
	#tag EndProperty


    #tag Enum, Name = TypeEnum, Type = Integer, Flags = &h0
        
        Supervised
        Dpo
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function TypeEnumToString(value As TypeEnum) As String
		  Select Case value
		    
		    Case TypeEnum.Supervised
		      Return "supervised"
		    Case TypeEnum.Dpo
		      Return "dpo"
		    
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
			Name="supervised"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuneSupervisedMethod"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="dpo"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="FineTuneDPOMethod"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


