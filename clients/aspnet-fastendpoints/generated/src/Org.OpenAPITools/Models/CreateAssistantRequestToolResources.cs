namespace Org.OpenAPITools.Models;


/// <summary>
/// A set of resources that are used by the assistant&#39;s tools. The resources are specific to the type of tool. For example, the &#x60;code_interpreter&#x60; tool requires a list of file IDs, while the &#x60;file_search&#x60; tool requires a list of vector store IDs. 
/// </summary>
public class CreateAssistantRequestToolResources 
{
    public CreateAssistantRequestToolResourcesCodeInterpreter CodeInterpreter { get; set; }
    public CreateAssistantRequestToolResourcesFileSearch FileSearch { get; set; }
}


