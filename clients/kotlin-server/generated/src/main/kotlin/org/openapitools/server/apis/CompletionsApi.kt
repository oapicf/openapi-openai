/**
* OpenAI API
* The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
*
* The version of the OpenAPI document: 2.0.0
* Contact: blah+oapicf@cliffano.com
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package org.openapitools.server.apis

import com.google.gson.Gson
import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.auth.*
import io.ktor.server.response.*
import org.openapitools.server.Paths
import io.ktor.server.resources.options
import io.ktor.server.resources.get
import io.ktor.server.resources.post
import io.ktor.server.resources.put
import io.ktor.server.resources.delete
import io.ktor.server.resources.head
import io.ktor.server.resources.patch
import io.ktor.server.routing.*
import org.openapitools.server.infrastructure.ApiPrincipal
import org.openapitools.server.models.CreateCompletionRequest
import org.openapitools.server.models.CreateCompletionResponse

fun Route.CompletionsApi() {
    val gson = Gson()
    val empty = mutableMapOf<String, Any?>()

    authenticate("ApiKeyAuth") {
    post<Paths.createCompletion> {
        
        val principal = null!!
        
        
        val exampleContentType = "application/json"
            val exampleContentString = """{
              "created" : 5,
              "usage" : {
                "completion_tokens" : 7,
                "prompt_tokens" : 9,
                "total_tokens" : 3
              },
              "model" : "model",
              "id" : "id",
              "choices" : [ {
                "finish_reason" : "stop",
                "index" : 0,
                "text" : "text",
                "logprobs" : {
                  "top_logprobs" : [ {
                    "key" : 5.962133916683182
                  }, {
                    "key" : 5.962133916683182
                  } ],
                  "token_logprobs" : [ 1.4658129805029452, 1.4658129805029452 ],
                  "tokens" : [ "tokens", "tokens" ],
                  "text_offset" : [ 6, 6 ]
                }
              }, {
                "finish_reason" : "stop",
                "index" : 0,
                "text" : "text",
                "logprobs" : {
                  "top_logprobs" : [ {
                    "key" : 5.962133916683182
                  }, {
                    "key" : 5.962133916683182
                  } ],
                  "token_logprobs" : [ 1.4658129805029452, 1.4658129805029452 ],
                  "tokens" : [ "tokens", "tokens" ],
                  "text_offset" : [ 6, 6 ]
                }
              } ],
              "system_fingerprint" : "system_fingerprint",
              "object" : "text_completion"
            }"""
            
            when (exampleContentType) {
                "application/json" -> call.respond(gson.fromJson(exampleContentString, empty::class.java))
                "application/xml" -> call.respondText(exampleContentString, ContentType.Text.Xml)
                else -> call.respondText(exampleContentString)
            }
        
    }
    }

}
