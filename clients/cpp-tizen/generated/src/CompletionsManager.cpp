#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "CompletionsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


CompletionsManager::CompletionsManager()
{

}

CompletionsManager::~CompletionsManager()
{

}

static gboolean __CompletionsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __CompletionsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__CompletionsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool createCompletionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateCompletionResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateCompletionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateCompletionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateCompletionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateCompletionResponse", "CreateCompletionResponse");
			json_node_free(pJson);

			if ("CreateCompletionResponse" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
			out.fromJson(data);
			char *jsonStr =  out.toJson();
			printf("\n%s\n", jsonStr);
			g_free(static_cast<gpointer>(jsonStr));
			
		}
		handler(out, error, userData);
		return true;
		//TODO: handle case where json parsing has an error

	} else {
		Error error;
		if (errormsg != NULL) {
			error = Error(code, string(errormsg));
		} else if (p_chunk.memory != NULL) {
			error = Error(code, string(p_chunk.memory));
		} else {
			error = Error(code, string("Unknown Error"));
		}
		 handler(out, error, userData);
		return false;
			}
}

static bool createCompletionHelper(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: application/json");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	if (isprimitive("CreateCompletionRequest")) {
		node = converttoJson(&createCompletionRequest, "CreateCompletionRequest", "");
	}
	
	char *jsonStr =  createCompletionRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/completions");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("POST");

	if(strcmp("PUT", "POST") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(CompletionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createCompletionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

		curl_slist_free_all(headerList);
		if (p_chunk) {
			if(p_chunk->memory) {
				free(p_chunk->memory);
			}
			delete (p_chunk);
		}
		if (errormsg) {
			free(errormsg);
		}
		return retval;
	} else{
		GThread *thread = NULL;
		RequestInfo *requestInfo = NULL;

		requestInfo = new(nothrow) RequestInfo (CompletionsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createCompletionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __CompletionsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool CompletionsManager::createCompletionAsync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData)
{
	return createCompletionHelper(accessToken,
	createCompletionRequest, 
	handler, userData, true);
}

bool CompletionsManager::createCompletionSync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData)
{
	return createCompletionHelper(accessToken,
	createCompletionRequest, 
	handler, userData, false);
}

