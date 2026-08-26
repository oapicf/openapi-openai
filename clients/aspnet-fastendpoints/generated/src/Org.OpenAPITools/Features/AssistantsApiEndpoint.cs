using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Features;



/// <summary>
/// Cancels a run that is &#x60;in_progress&#x60;.
/// </summary>

public class CancelRunEndpoint : FastEndpoints.Endpoint<CancelRunRequest, RunObject>
{
    public override void Configure()
    {
        Post("/v1/threads/{thread_id}/runs/{run_id}/cancel");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Cancels a run that is &#x60;in_progress&#x60;.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to which this run belongs.");
            s.RequestParam(r => r.RunId, "The ID of the run to cancel.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CancelRunRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create an assistant with a model and instructions.
/// </summary>

public class CreateAssistantEndpoint : FastEndpoints.Endpoint<CreateAssistantRequest, AssistantObject>
{
    public override void Configure()
    {
        Post("/v1/assistants");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Create an assistant with a model and instructions.";
            s.RequestParam(r => r.createAssistantRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateAssistantRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a message.
/// </summary>

public class CreateMessageEndpoint : FastEndpoints.Endpoint<CreateMessageRequest, MessageObject>
{
    public override void Configure()
    {
        Post("/v1/threads/{thread_id}/messages");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Create a message.";
            s.RequestParam(r => r.ThreadId, "The ID of the [thread](/docs/api-reference/threads) to create a message for.");
            s.RequestParam(r => r.createMessageRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateMessageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a run.
/// </summary>

public class CreateRunEndpoint : FastEndpoints.Endpoint<CreateRunRequest, RunObject>
{
    public override void Configure()
    {
        Post("/v1/threads/{thread_id}/runs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Create a run.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to run.");
            s.RequestParam(r => r.createRunRequest, "");
            s.RequestParam(r => r.Include, "A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateRunRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a thread.
/// </summary>

public class CreateThreadEndpoint : FastEndpoints.Endpoint<CreateThreadRequest, ThreadObject>
{
    public override void Configure()
    {
        Post("/v1/threads");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Create a thread.";
            s.RequestParam(r => r.createThreadRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateThreadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Create a thread and run it in one request.
/// </summary>

public class CreateThreadAndRunEndpoint : FastEndpoints.Endpoint<CreateThreadAndRunRequest, RunObject>
{
    public override void Configure()
    {
        Post("/v1/threads/runs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Create a thread and run it in one request.";
            s.RequestParam(r => r.createThreadAndRunRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(CreateThreadAndRunRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete an assistant.
/// </summary>

public class DeleteAssistantEndpoint : FastEndpoints.Endpoint<DeleteAssistantRequest, DeleteAssistantResponse>
{
    public override void Configure()
    {
        Delete("/v1/assistants/{assistant_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Delete an assistant.";
            s.RequestParam(r => r.AssistantId, "The ID of the assistant to delete.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DeleteAssistantRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Deletes a message.
/// </summary>

public class DeleteMessageEndpoint : FastEndpoints.Endpoint<DeleteMessageRequest, DeleteMessageResponse>
{
    public override void Configure()
    {
        Delete("/v1/threads/{thread_id}/messages/{message_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Deletes a message.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to which this message belongs.");
            s.RequestParam(r => r.MessageId, "The ID of the message to delete.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DeleteMessageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Delete a thread.
/// </summary>

public class DeleteThreadEndpoint : FastEndpoints.Endpoint<DeleteThreadRequest, DeleteThreadResponse>
{
    public override void Configure()
    {
        Delete("/v1/threads/{thread_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Delete a thread.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to delete.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(DeleteThreadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves an assistant.
/// </summary>

public class GetAssistantEndpoint : FastEndpoints.Endpoint<GetAssistantRequest, AssistantObject>
{
    public override void Configure()
    {
        Get("/v1/assistants/{assistant_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Retrieves an assistant.";
            s.RequestParam(r => r.AssistantId, "The ID of the assistant to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetAssistantRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieve a message.
/// </summary>

public class GetMessageEndpoint : FastEndpoints.Endpoint<GetMessageRequest, MessageObject>
{
    public override void Configure()
    {
        Get("/v1/threads/{thread_id}/messages/{message_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Retrieve a message.";
            s.RequestParam(r => r.ThreadId, "The ID of the [thread](/docs/api-reference/threads) to which this message belongs.");
            s.RequestParam(r => r.MessageId, "The ID of the message to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetMessageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a run.
/// </summary>

public class GetRunEndpoint : FastEndpoints.Endpoint<GetRunRequest, RunObject>
{
    public override void Configure()
    {
        Get("/v1/threads/{thread_id}/runs/{run_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Retrieves a run.";
            s.RequestParam(r => r.ThreadId, "The ID of the [thread](/docs/api-reference/threads) that was run.");
            s.RequestParam(r => r.RunId, "The ID of the run to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetRunRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a run step.
/// </summary>

public class GetRunStepEndpoint : FastEndpoints.Endpoint<GetRunStepRequest, RunStepObject>
{
    public override void Configure()
    {
        Get("/v1/threads/{thread_id}/runs/{run_id}/steps/{step_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Retrieves a run step.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to which the run and run step belongs.");
            s.RequestParam(r => r.RunId, "The ID of the run to which the run step belongs.");
            s.RequestParam(r => r.StepId, "The ID of the run step to retrieve.");
            s.RequestParam(r => r.Include, "A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetRunStepRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Retrieves a thread.
/// </summary>

public class GetThreadEndpoint : FastEndpoints.Endpoint<GetThreadRequest, ThreadObject>
{
    public override void Configure()
    {
        Get("/v1/threads/{thread_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Retrieves a thread.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to retrieve.");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(GetThreadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of assistants.
/// </summary>

public class ListAssistantsEndpoint : FastEndpoints.Endpoint<ListAssistantsRequest, ListAssistantsResponse>
{
    public override void Configure()
    {
        Get("/v1/assistants");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Returns a list of assistants.";
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListAssistantsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of messages for a given thread.
/// </summary>

public class ListMessagesEndpoint : FastEndpoints.Endpoint<ListMessagesRequest, ListMessagesResponse>
{
    public override void Configure()
    {
        Get("/v1/threads/{thread_id}/messages");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Returns a list of messages for a given thread.";
            s.RequestParam(r => r.ThreadId, "The ID of the [thread](/docs/api-reference/threads) the messages belong to.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.RequestParam(r => r.RunId, "Filter messages by the run ID that generated them. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListMessagesRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of run steps belonging to a run.
/// </summary>

public class ListRunStepsEndpoint : FastEndpoints.Endpoint<ListRunStepsRequest, ListRunStepsResponse>
{
    public override void Configure()
    {
        Get("/v1/threads/{thread_id}/runs/{run_id}/steps");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Returns a list of run steps belonging to a run.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread the run and run steps belong to.");
            s.RequestParam(r => r.RunId, "The ID of the run the run steps belong to.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.RequestParam(r => r.Include, "A list of additional fields to include in the response. Currently the only supported value is &#x60;step_details.tool_calls[*].file_search.results[*].content&#x60; to fetch the file search result content.  See the [file search tool documentation](/docs/assistants/tools/file-search#customizing-file-search-settings) for more information. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListRunStepsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Returns a list of runs belonging to a thread.
/// </summary>

public class ListRunsEndpoint : FastEndpoints.Endpoint<ListRunsRequest, ListRunsResponse>
{
    public override void Configure()
    {
        Get("/v1/threads/{thread_id}/runs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Returns a list of runs belonging to a thread.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread the run belongs to.");
            s.RequestParam(r => r.Limit, "A limit on the number of objects to be returned. Limit can range between 1 and 100, and the default is 20. ");
            s.RequestParam(r => r.Order, "Sort order by the &#x60;created_at&#x60; timestamp of the objects. &#x60;asc&#x60; for ascending order and &#x60;desc&#x60; for descending order. ");
            s.RequestParam(r => r.After, "A cursor for use in pagination. &#x60;after&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, ending with obj_foo, your subsequent call can include after&#x3D;obj_foo in order to fetch the next page of the list. ");
            s.RequestParam(r => r.Before, "A cursor for use in pagination. &#x60;before&#x60; is an object ID that defines your place in the list. For instance, if you make a list request and receive 100 objects, starting with obj_foo, your subsequent call can include before&#x3D;obj_foo in order to fetch the previous page of the list. ");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ListRunsRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies an assistant.
/// </summary>

public class ModifyAssistantEndpoint : FastEndpoints.Endpoint<ModifyAssistantRequest, AssistantObject>
{
    public override void Configure()
    {
        Post("/v1/assistants/{assistant_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Modifies an assistant.";
            s.RequestParam(r => r.AssistantId, "The ID of the assistant to modify.");
            s.RequestParam(r => r.modifyAssistantRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ModifyAssistantRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies a message.
/// </summary>

public class ModifyMessageEndpoint : FastEndpoints.Endpoint<ModifyMessageRequest, MessageObject>
{
    public override void Configure()
    {
        Post("/v1/threads/{thread_id}/messages/{message_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Modifies a message.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to which this message belongs.");
            s.RequestParam(r => r.MessageId, "The ID of the message to modify.");
            s.RequestParam(r => r.modifyMessageRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ModifyMessageRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies a run.
/// </summary>

public class ModifyRunEndpoint : FastEndpoints.Endpoint<ModifyRunRequest, RunObject>
{
    public override void Configure()
    {
        Post("/v1/threads/{thread_id}/runs/{run_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Modifies a run.";
            s.RequestParam(r => r.ThreadId, "The ID of the [thread](/docs/api-reference/threads) that was run.");
            s.RequestParam(r => r.RunId, "The ID of the run to modify.");
            s.RequestParam(r => r.modifyRunRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ModifyRunRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// Modifies a thread.
/// </summary>

public class ModifyThreadEndpoint : FastEndpoints.Endpoint<ModifyThreadRequest, ThreadObject>
{
    public override void Configure()
    {
        Post("/v1/threads/{thread_id}");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "Modifies a thread.";
            s.RequestParam(r => r.ThreadId, "The ID of the thread to modify. Only the &#x60;metadata&#x60; can be modified.");
            s.RequestParam(r => r.modifyThreadRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(ModifyThreadRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}


/// <summary>
/// When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. 
/// </summary>

public class SubmitToolOuputsToRunEndpoint : FastEndpoints.Endpoint<SubmitToolOuputsToRunRequest, RunObject>
{
    public override void Configure()
    {
        Post("/v1/threads/{thread_id}/runs/{run_id}/submit_tool_outputs");
        
        
        AllowAnonymous();
        
        Description(x =>
        {
            x.WithTags("Assistants");
        });

        Summary(s => {
            s.Summary = "When a run has the &#x60;status: \&quot;requires_action\&quot;&#x60; and &#x60;required_action.type&#x60; is &#x60;submit_tool_outputs&#x60;, this endpoint can be used to submit the outputs from the tool calls once they&#39;re all completed. All outputs must be submitted in a single request. ";
            s.RequestParam(r => r.ThreadId, "The ID of the [thread](/docs/api-reference/threads) to which this run belongs.");
            s.RequestParam(r => r.RunId, "The ID of the run that requires the tool output submission.");
            s.RequestParam(r => r.submitToolOutputsRunRequest, "");
            s.Responses[200] = "OK";
        });
    }

    public override async Task HandleAsync(SubmitToolOuputsToRunRequest req, CancellationToken ct)
    {
        //Response = new()
        //{
            //...
        //};
        //return Task.CompletedTask;
    }
}

