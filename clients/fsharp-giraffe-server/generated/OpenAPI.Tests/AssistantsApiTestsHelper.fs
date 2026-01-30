namespace OpenAPI.Tests

open System
open System.Net
open System.Net.Http
open System.IO
open Microsoft.AspNetCore.Builder
open Microsoft.AspNetCore.Hosting
open Microsoft.AspNetCore.TestHost
open Microsoft.Extensions.DependencyInjection
open FSharp.Control.Tasks.V2.ContextInsensitive
open Xunit
open System.Text
open TestHelper
open OpenAPI.AssistantsApiHandler
open OpenAPI.AssistantsApiHandlerParams

module AssistantsApiHandlerTestsHelper =

  ()


  let mutable CreateAssistantExamples = Map.empty
  let mutable CreateAssistantBody = ""

  CreateAssistantBody <- WebUtility.HtmlDecode "{
  &quot;top_p&quot; : 1,
  &quot;instructions&quot; : &quot;instructions&quot;,
  &quot;tool_resources&quot; : {
    &quot;code_interpreter&quot; : {
      &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
    },
    &quot;file_search&quot; : {
      &quot;vector_store_ids&quot; : [ &quot;vector_store_ids&quot; ],
      &quot;vector_stores&quot; : [ {
        &quot;chunking_strategy&quot; : {
          &quot;type&quot; : &quot;auto&quot;
        },
        &quot;metadata&quot; : &quot;{}&quot;,
        &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
      } ]
    }
  },
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;response_format&quot; : &quot;auto&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;temperature&quot; : 1,
  &quot;description&quot; : &quot;description&quot;,
  &quot;model&quot; : &quot;gpt-4o&quot;,
  &quot;tools&quot; : [ {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  } ]
}"
  CreateAssistantExamples <- CreateAssistantExamples.Add("application/json", CreateAssistantBody)

  let getCreateAssistantExample mediaType =
    CreateAssistantExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateMessageExamples = Map.empty
  let mutable CreateMessageBody = ""

  CreateMessageBody <- WebUtility.HtmlDecode "{
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;role&quot; : &quot;user&quot;,
  &quot;attachments&quot; : [ {
    &quot;file_id&quot; : &quot;file_id&quot;,
    &quot;tools&quot; : [ {
      &quot;type&quot; : &quot;code_interpreter&quot;
    }, {
      &quot;type&quot; : &quot;code_interpreter&quot;
    } ]
  }, {
    &quot;file_id&quot; : &quot;file_id&quot;,
    &quot;tools&quot; : [ {
      &quot;type&quot; : &quot;code_interpreter&quot;
    }, {
      &quot;type&quot; : &quot;code_interpreter&quot;
    } ]
  } ],
  &quot;content&quot; : &quot;CreateMessageRequest_content&quot;
}"
  CreateMessageExamples <- CreateMessageExamples.Add("application/json", CreateMessageBody)

  let getCreateMessageExample mediaType =
    CreateMessageExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateRunExamples = Map.empty
  let mutable CreateRunBody = ""

  CreateRunBody <- WebUtility.HtmlDecode "{
  &quot;instructions&quot; : &quot;instructions&quot;,
  &quot;additional_instructions&quot; : &quot;additional_instructions&quot;,
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;assistant_id&quot; : &quot;assistant_id&quot;,
  &quot;additional_messages&quot; : [ {
    &quot;metadata&quot; : &quot;{}&quot;,
    &quot;role&quot; : &quot;user&quot;,
    &quot;attachments&quot; : [ {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    }, {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    } ],
    &quot;content&quot; : &quot;CreateMessageRequest_content&quot;
  }, {
    &quot;metadata&quot; : &quot;{}&quot;,
    &quot;role&quot; : &quot;user&quot;,
    &quot;attachments&quot; : [ {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    }, {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    } ],
    &quot;content&quot; : &quot;CreateMessageRequest_content&quot;
  } ],
  &quot;tools&quot; : [ {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  } ],
  &quot;truncation_strategy&quot; : {
    &quot;last_messages&quot; : 1,
    &quot;type&quot; : &quot;auto&quot;
  },
  &quot;top_p&quot; : 1,
  &quot;max_completion_tokens&quot; : 256,
  &quot;response_format&quot; : &quot;auto&quot;,
  &quot;parallel_tool_calls&quot; : true,
  &quot;stream&quot; : true,
  &quot;temperature&quot; : 1,
  &quot;tool_choice&quot; : &quot;none&quot;,
  &quot;model&quot; : &quot;gpt-4o&quot;,
  &quot;max_prompt_tokens&quot; : 256
}"
  CreateRunExamples <- CreateRunExamples.Add("application/json", CreateRunBody)

  let getCreateRunExample mediaType =
    CreateRunExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateThreadExamples = Map.empty
  let mutable CreateThreadBody = ""

  CreateThreadBody <- WebUtility.HtmlDecode "{
  &quot;tool_resources&quot; : {
    &quot;code_interpreter&quot; : {
      &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
    },
    &quot;file_search&quot; : {
      &quot;vector_store_ids&quot; : [ &quot;vector_store_ids&quot; ],
      &quot;vector_stores&quot; : [ {
        &quot;chunking_strategy&quot; : {
          &quot;type&quot; : &quot;auto&quot;
        },
        &quot;metadata&quot; : &quot;{}&quot;,
        &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
      } ]
    }
  },
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;messages&quot; : [ {
    &quot;metadata&quot; : &quot;{}&quot;,
    &quot;role&quot; : &quot;user&quot;,
    &quot;attachments&quot; : [ {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    }, {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    } ],
    &quot;content&quot; : &quot;CreateMessageRequest_content&quot;
  }, {
    &quot;metadata&quot; : &quot;{}&quot;,
    &quot;role&quot; : &quot;user&quot;,
    &quot;attachments&quot; : [ {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    }, {
      &quot;file_id&quot; : &quot;file_id&quot;,
      &quot;tools&quot; : [ {
        &quot;type&quot; : &quot;code_interpreter&quot;
      }, {
        &quot;type&quot; : &quot;code_interpreter&quot;
      } ]
    } ],
    &quot;content&quot; : &quot;CreateMessageRequest_content&quot;
  } ]
}"
  CreateThreadExamples <- CreateThreadExamples.Add("application/json", CreateThreadBody)

  let getCreateThreadExample mediaType =
    CreateThreadExamples.[mediaType]
      |> getConverter mediaType

  let mutable CreateThreadAndRunExamples = Map.empty
  let mutable CreateThreadAndRunBody = ""

  CreateThreadAndRunBody <- WebUtility.HtmlDecode "{
  &quot;instructions&quot; : &quot;instructions&quot;,
  &quot;tool_resources&quot; : {
    &quot;code_interpreter&quot; : {
      &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
    },
    &quot;file_search&quot; : {
      &quot;vector_store_ids&quot; : [ &quot;vector_store_ids&quot; ]
    }
  },
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;assistant_id&quot; : &quot;assistant_id&quot;,
  &quot;thread&quot; : {
    &quot;tool_resources&quot; : {
      &quot;code_interpreter&quot; : {
        &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
      },
      &quot;file_search&quot; : {
        &quot;vector_store_ids&quot; : [ &quot;vector_store_ids&quot; ],
        &quot;vector_stores&quot; : [ {
          &quot;chunking_strategy&quot; : {
            &quot;type&quot; : &quot;auto&quot;
          },
          &quot;metadata&quot; : &quot;{}&quot;,
          &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
        } ]
      }
    },
    &quot;metadata&quot; : &quot;{}&quot;,
    &quot;messages&quot; : [ {
      &quot;metadata&quot; : &quot;{}&quot;,
      &quot;role&quot; : &quot;user&quot;,
      &quot;attachments&quot; : [ {
        &quot;file_id&quot; : &quot;file_id&quot;,
        &quot;tools&quot; : [ {
          &quot;type&quot; : &quot;code_interpreter&quot;
        }, {
          &quot;type&quot; : &quot;code_interpreter&quot;
        } ]
      }, {
        &quot;file_id&quot; : &quot;file_id&quot;,
        &quot;tools&quot; : [ {
          &quot;type&quot; : &quot;code_interpreter&quot;
        }, {
          &quot;type&quot; : &quot;code_interpreter&quot;
        } ]
      } ],
      &quot;content&quot; : &quot;CreateMessageRequest_content&quot;
    }, {
      &quot;metadata&quot; : &quot;{}&quot;,
      &quot;role&quot; : &quot;user&quot;,
      &quot;attachments&quot; : [ {
        &quot;file_id&quot; : &quot;file_id&quot;,
        &quot;tools&quot; : [ {
          &quot;type&quot; : &quot;code_interpreter&quot;
        }, {
          &quot;type&quot; : &quot;code_interpreter&quot;
        } ]
      }, {
        &quot;file_id&quot; : &quot;file_id&quot;,
        &quot;tools&quot; : [ {
          &quot;type&quot; : &quot;code_interpreter&quot;
        }, {
          &quot;type&quot; : &quot;code_interpreter&quot;
        } ]
      } ],
      &quot;content&quot; : &quot;CreateMessageRequest_content&quot;
    } ]
  },
  &quot;tools&quot; : [ {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  } ],
  &quot;truncation_strategy&quot; : {
    &quot;last_messages&quot; : 1,
    &quot;type&quot; : &quot;auto&quot;
  },
  &quot;top_p&quot; : 1,
  &quot;max_completion_tokens&quot; : 256,
  &quot;response_format&quot; : &quot;auto&quot;,
  &quot;parallel_tool_calls&quot; : true,
  &quot;stream&quot; : true,
  &quot;temperature&quot; : 1,
  &quot;tool_choice&quot; : &quot;none&quot;,
  &quot;model&quot; : &quot;gpt-4o&quot;,
  &quot;max_prompt_tokens&quot; : 256
}"
  CreateThreadAndRunExamples <- CreateThreadAndRunExamples.Add("application/json", CreateThreadAndRunBody)

  let getCreateThreadAndRunExample mediaType =
    CreateThreadAndRunExamples.[mediaType]
      |> getConverter mediaType
  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()

  ()


  let mutable ModifyAssistantExamples = Map.empty
  let mutable ModifyAssistantBody = ""

  ModifyAssistantBody <- WebUtility.HtmlDecode "{
  &quot;top_p&quot; : 1,
  &quot;instructions&quot; : &quot;instructions&quot;,
  &quot;tool_resources&quot; : {
    &quot;code_interpreter&quot; : {
      &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
    },
    &quot;file_search&quot; : {
      &quot;vector_store_ids&quot; : [ &quot;vector_store_ids&quot; ]
    }
  },
  &quot;metadata&quot; : &quot;{}&quot;,
  &quot;response_format&quot; : &quot;auto&quot;,
  &quot;name&quot; : &quot;name&quot;,
  &quot;temperature&quot; : 1,
  &quot;description&quot; : &quot;description&quot;,
  &quot;model&quot; : &quot;model&quot;,
  &quot;tools&quot; : [ {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  }, {
    &quot;type&quot; : &quot;code_interpreter&quot;
  } ]
}"
  ModifyAssistantExamples <- ModifyAssistantExamples.Add("application/json", ModifyAssistantBody)

  let getModifyAssistantExample mediaType =
    ModifyAssistantExamples.[mediaType]
      |> getConverter mediaType

  let mutable ModifyMessageExamples = Map.empty
  let mutable ModifyMessageBody = ""

  ModifyMessageBody <- WebUtility.HtmlDecode "{
  &quot;metadata&quot; : &quot;{}&quot;
}"
  ModifyMessageExamples <- ModifyMessageExamples.Add("application/json", ModifyMessageBody)

  let getModifyMessageExample mediaType =
    ModifyMessageExamples.[mediaType]
      |> getConverter mediaType

  let mutable ModifyRunExamples = Map.empty
  let mutable ModifyRunBody = ""

  ModifyRunBody <- WebUtility.HtmlDecode "{
  &quot;metadata&quot; : &quot;{}&quot;
}"
  ModifyRunExamples <- ModifyRunExamples.Add("application/json", ModifyRunBody)

  let getModifyRunExample mediaType =
    ModifyRunExamples.[mediaType]
      |> getConverter mediaType

  let mutable ModifyThreadExamples = Map.empty
  let mutable ModifyThreadBody = ""

  ModifyThreadBody <- WebUtility.HtmlDecode "{
  &quot;tool_resources&quot; : {
    &quot;code_interpreter&quot; : {
      &quot;file_ids&quot; : [ &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot;, &quot;file_ids&quot; ]
    },
    &quot;file_search&quot; : {
      &quot;vector_store_ids&quot; : [ &quot;vector_store_ids&quot; ]
    }
  },
  &quot;metadata&quot; : &quot;{}&quot;
}"
  ModifyThreadExamples <- ModifyThreadExamples.Add("application/json", ModifyThreadBody)

  let getModifyThreadExample mediaType =
    ModifyThreadExamples.[mediaType]
      |> getConverter mediaType

  let mutable SubmitToolOuputsToRunExamples = Map.empty
  let mutable SubmitToolOuputsToRunBody = ""

  SubmitToolOuputsToRunBody <- WebUtility.HtmlDecode "{
  &quot;stream&quot; : true,
  &quot;tool_outputs&quot; : [ {
    &quot;output&quot; : &quot;output&quot;,
    &quot;tool_call_id&quot; : &quot;tool_call_id&quot;
  }, {
    &quot;output&quot; : &quot;output&quot;,
    &quot;tool_call_id&quot; : &quot;tool_call_id&quot;
  } ]
}"
  SubmitToolOuputsToRunExamples <- SubmitToolOuputsToRunExamples.Add("application/json", SubmitToolOuputsToRunBody)

  let getSubmitToolOuputsToRunExample mediaType =
    SubmitToolOuputsToRunExamples.[mediaType]
      |> getConverter mediaType
