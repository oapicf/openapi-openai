#tag Class
Protected Class VectorStoreFileBatchObjectFileCounts

	#tag Property, Flags = &h0
		#tag Note
			The number of files that are currently being processed.
		#tag EndNote
		in_progress As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of files that have been processed.
		#tag EndNote
		completed As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of files that have failed to process.
		#tag EndNote
		failed As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The number of files that where cancelled.
		#tag EndNote
		cancelled As Integer
	#tag EndProperty


	#tag Property, Flags = &h0
		#tag Note
			The total number of files.
		#tag EndNote
		total As Integer
	#tag EndProperty





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
			Name="in_progress"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="completed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="failed"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="cancelled"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
		#tag ViewProperty
			Name="total"
			Visible=false
			Group="Behavior"
			InitialValue=""
			Type="Integer"
			EditorType=""
		#tag EndViewProperty
	#tag EndViewBehavior
End Class
#tag EndClass


