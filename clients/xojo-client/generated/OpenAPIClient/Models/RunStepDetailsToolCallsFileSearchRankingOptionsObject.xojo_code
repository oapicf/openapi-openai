#tag Class
Protected Class RunStepDetailsToolCallsFileSearchRankingOptionsObject

	#tag Property, Flags = &h0
		#tag Note
			The ranker used for the file search.
		#tag EndNote
		ranker As String
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The score threshold for the file search. All values must be a floating point number between 0 and 1.
		#tag EndNote
		score_threshold As Double
	#tag EndProperty


    #tag Enum, Name = RankerEnum, Type = Integer, Flags = &h0
        
        Default20240821
        
    #tag EndEnum


	#tag Method, Flags = &h0
		Shared Function RankerEnumToString(value As RankerEnum) As String
		  Select Case value
		    
		    Case RankerEnum.Default20240821
		      Return "default_2024_08_21"
		    
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
			Name="score_threshold"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Double"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


