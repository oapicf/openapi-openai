
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;


public class CancelRunRequest
{
    /// <summary>
    /// The ID of the thread to which this run belongs.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the run to cancel.
    /// </summary>
    [FastEndpoints.BindFrom("run_id")]
    public string RunId { get; set; }
}
public class CreateAssistantRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateAssistantRequest createAssistantRequest { get; set; }
}
public class CreateMessageRequest
{
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) to create a message for.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateMessageRequest createMessageRequest { get; set; }
}
public class CreateRunRequest
{
    /// <summary>
    /// The ID of the thread to run.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include[]")]
    public List<string>? Include { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateRunRequest createRunRequest { get; set; }
}
public class CreateThreadRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateThreadRequest? createThreadRequest { get; set; }
}
public class CreateThreadAndRunRequest
{
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public CreateThreadAndRunRequest createThreadAndRunRequest { get; set; }
}
public class DeleteAssistantRequest
{
    /// <summary>
    /// The ID of the assistant to delete.
    /// </summary>
    [FastEndpoints.BindFrom("assistant_id")]
    public string AssistantId { get; set; }
}
public class DeleteMessageRequest
{
    /// <summary>
    /// The ID of the thread to which this message belongs.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the message to delete.
    /// </summary>
    [FastEndpoints.BindFrom("message_id")]
    public string MessageId { get; set; }
}
public class DeleteThreadRequest
{
    /// <summary>
    /// The ID of the thread to delete.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
}
public class GetAssistantRequest
{
    /// <summary>
    /// The ID of the assistant to retrieve.
    /// </summary>
    [FastEndpoints.BindFrom("assistant_id")]
    public string AssistantId { get; set; }
}
public class GetMessageRequest
{
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) to which this message belongs.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the message to retrieve.
    /// </summary>
    [FastEndpoints.BindFrom("message_id")]
    public string MessageId { get; set; }
}
public class GetRunRequest
{
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) that was run.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the run to retrieve.
    /// </summary>
    [FastEndpoints.BindFrom("run_id")]
    public string RunId { get; set; }
}
public class GetRunStepRequest
{
    /// <summary>
    /// The ID of the thread to which the run and run step belongs.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the run to which the run step belongs.
    /// </summary>
    [FastEndpoints.BindFrom("run_id")]
    public string RunId { get; set; }
    /// <summary>
    /// The ID of the run step to retrieve.
    /// </summary>
    [FastEndpoints.BindFrom("step_id")]
    public string StepId { get; set; }
    /// <summary>
    /// A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include[]")]
    public List<string>? Include { get; set; }
}
public class GetThreadRequest
{
    /// <summary>
    /// The ID of the thread to retrieve.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
}
public class ListAssistantsRequest
{
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
}
public class ListMessagesRequest
{
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) the messages belong to.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
    /// <summary>
    /// Filter messages by the run ID that generated them. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("run_id")]
    public string? RunId { get; set; }
}
public class ListRunStepsRequest
{
    /// <summary>
    /// The ID of the thread the run and run steps belong to.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the run the run steps belong to.
    /// </summary>
    [FastEndpoints.BindFrom("run_id")]
    public string RunId { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
    /// <summary>
    /// A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("include[]")]
    public List<string>? Include { get; set; }
}
public class ListRunsRequest
{
    /// <summary>
    /// The ID of the thread the run belongs to.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("limit")]
    public int? Limit { get; set; }
    /// <summary>
    /// Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("order")]
    public string? Order { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("after")]
    public string? After { get; set; }
    /// <summary>
    /// A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. 
    /// </summary>
    [FastEndpoints.QueryParam, FastEndpoints.BindFrom("before")]
    public string? Before { get; set; }
}
public class ModifyAssistantRequest
{
    /// <summary>
    /// The ID of the assistant to modify.
    /// </summary>
    [FastEndpoints.BindFrom("assistant_id")]
    public string AssistantId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public ModifyAssistantRequest modifyAssistantRequest { get; set; }
}
public class ModifyMessageRequest
{
    /// <summary>
    /// The ID of the thread to which this message belongs.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the message to modify.
    /// </summary>
    [FastEndpoints.BindFrom("message_id")]
    public string MessageId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public ModifyMessageRequest modifyMessageRequest { get; set; }
}
public class ModifyRunRequest
{
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) that was run.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the run to modify.
    /// </summary>
    [FastEndpoints.BindFrom("run_id")]
    public string RunId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public ModifyRunRequest modifyRunRequest { get; set; }
}
public class ModifyThreadRequest
{
    /// <summary>
    /// The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public ModifyThreadRequest modifyThreadRequest { get; set; }
}
public class SubmitToolOuputsToRunRequest
{
    /// <summary>
    /// The ID of the [thread](/docs/api-reference/threads) to which this run belongs.
    /// </summary>
    [FastEndpoints.BindFrom("thread_id")]
    public string ThreadId { get; set; }
    /// <summary>
    /// The ID of the run that requires the tool output submission.
    /// </summary>
    [FastEndpoints.BindFrom("run_id")]
    public string RunId { get; set; }
    /// <summary>
    /// 
    /// </summary>
    [FastEndpoints.FromBody]
    public SubmitToolOutputsRunRequest submitToolOutputsRunRequest { get; set; }
}


