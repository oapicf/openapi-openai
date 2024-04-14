/*
 * OpenAI API
 *
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using Microsoft.AspNetCore.Authorization;
using Microsoft.AspNetCore.Mvc;
using Microsoft.AspNetCore.Http;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    [ApiController]
    public class ChatApiController : ControllerBase
    { 
        /// <summary>
        /// Creates a model response for the given chat conversation.
        /// </summary>
        /// <param name="createChatCompletionRequest"></param>
        /// <response code="200">OK</response>
        [HttpPost]
        [Route("/v1/chat/completions")]
        [Authorize]
        [Consumes("application/json")]
        [ValidateModelState]
        [SwaggerOperation("CreateChatCompletion")]
        [SwaggerResponse(statusCode: 200, type: typeof(CreateChatCompletionResponse), description: "OK")]
        public virtual IActionResult CreateChatCompletion([FromBody]CreateChatCompletionRequest createChatCompletionRequest)
        {

            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(CreateChatCompletionResponse));
            string exampleJson = null;
            exampleJson = "{\n  \"created\" : 2,\n  \"usage\" : {\n    \"completion_tokens\" : 7,\n    \"prompt_tokens\" : 9,\n    \"total_tokens\" : 3\n  },\n  \"model\" : \"model\",\n  \"id\" : \"id\",\n  \"choices\" : [ {\n    \"finish_reason\" : \"stop\",\n    \"index\" : 0,\n    \"message\" : {\n      \"role\" : \"assistant\",\n      \"function_call\" : {\n        \"name\" : \"name\",\n        \"arguments\" : \"arguments\"\n      },\n      \"tool_calls\" : [ {\n        \"function\" : {\n          \"name\" : \"name\",\n          \"arguments\" : \"arguments\"\n        },\n        \"id\" : \"id\",\n        \"type\" : \"function\"\n      }, {\n        \"function\" : {\n          \"name\" : \"name\",\n          \"arguments\" : \"arguments\"\n        },\n        \"id\" : \"id\",\n        \"type\" : \"function\"\n      } ],\n      \"content\" : \"content\"\n    },\n    \"logprobs\" : {\n      \"content\" : [ {\n        \"top_logprobs\" : [ {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        }, {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        } ],\n        \"logprob\" : 6.027456183070403,\n        \"bytes\" : [ 1, 1 ],\n        \"token\" : \"token\"\n      }, {\n        \"top_logprobs\" : [ {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        }, {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        } ],\n        \"logprob\" : 6.027456183070403,\n        \"bytes\" : [ 1, 1 ],\n        \"token\" : \"token\"\n      } ]\n    }\n  }, {\n    \"finish_reason\" : \"stop\",\n    \"index\" : 0,\n    \"message\" : {\n      \"role\" : \"assistant\",\n      \"function_call\" : {\n        \"name\" : \"name\",\n        \"arguments\" : \"arguments\"\n      },\n      \"tool_calls\" : [ {\n        \"function\" : {\n          \"name\" : \"name\",\n          \"arguments\" : \"arguments\"\n        },\n        \"id\" : \"id\",\n        \"type\" : \"function\"\n      }, {\n        \"function\" : {\n          \"name\" : \"name\",\n          \"arguments\" : \"arguments\"\n        },\n        \"id\" : \"id\",\n        \"type\" : \"function\"\n      } ],\n      \"content\" : \"content\"\n    },\n    \"logprobs\" : {\n      \"content\" : [ {\n        \"top_logprobs\" : [ {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        }, {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        } ],\n        \"logprob\" : 6.027456183070403,\n        \"bytes\" : [ 1, 1 ],\n        \"token\" : \"token\"\n      }, {\n        \"top_logprobs\" : [ {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        }, {\n          \"logprob\" : 5.962133916683182,\n          \"bytes\" : [ 5, 5 ],\n          \"token\" : \"token\"\n        } ],\n        \"logprob\" : 6.027456183070403,\n        \"bytes\" : [ 1, 1 ],\n        \"token\" : \"token\"\n      } ]\n    }\n  } ],\n  \"system_fingerprint\" : \"system_fingerprint\",\n  \"object\" : \"chat.completion\"\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<CreateChatCompletionResponse>(exampleJson)
            : default(CreateChatCompletionResponse);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}
