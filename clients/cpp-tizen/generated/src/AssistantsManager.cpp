#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "AssistantsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


AssistantsManager::AssistantsManager()
{

}

AssistantsManager::~AssistantsManager()
{

}

static gboolean __AssistantsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __AssistantsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__AssistantsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool cancelRunProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RunObject, Error, void* )
	= reinterpret_cast<void(*)(RunObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RunObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RunObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RunObject", "RunObject");
			json_node_free(pJson);

			if ("RunObject" == "std::string") {
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

static bool cancelRunHelper(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
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

	string url("/threads/{thread_id}/runs/{run_id}/cancel");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_runId("{");
	s_runId.append("run_id");
	s_runId.append("}");
	pos = url.find(s_runId);
	url.erase(pos, s_runId.length());
	url.insert(pos, stringify(&runId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelRunProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelRunProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::cancelRunAsync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return cancelRunHelper(accessToken,
	threadId, runId, 
	handler, userData, true);
}

bool AssistantsManager::cancelRunSync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return cancelRunHelper(accessToken,
	threadId, runId, 
	handler, userData, false);
}

static bool createAssistantProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssistantObject, Error, void* )
	= reinterpret_cast<void(*)(AssistantObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssistantObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssistantObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssistantObject", "AssistantObject");
			json_node_free(pJson);

			if ("AssistantObject" == "std::string") {
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

static bool createAssistantHelper(char * accessToken,
	std::shared_ptr<CreateAssistantRequest> createAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
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

	if (isprimitive("CreateAssistantRequest")) {
		node = converttoJson(&createAssistantRequest, "CreateAssistantRequest", "");
	}
	
	char *jsonStr =  createAssistantRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/assistants");
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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createAssistantProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createAssistantProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::createAssistantAsync(char * accessToken,
	std::shared_ptr<CreateAssistantRequest> createAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData)
{
	return createAssistantHelper(accessToken,
	createAssistantRequest, 
	handler, userData, true);
}

bool AssistantsManager::createAssistantSync(char * accessToken,
	std::shared_ptr<CreateAssistantRequest> createAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData)
{
	return createAssistantHelper(accessToken,
	createAssistantRequest, 
	handler, userData, false);
}

static bool createAssistantFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssistantFileObject, Error, void* )
	= reinterpret_cast<void(*)(AssistantFileObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssistantFileObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssistantFileObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssistantFileObject", "AssistantFileObject");
			json_node_free(pJson);

			if ("AssistantFileObject" == "std::string") {
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

static bool createAssistantFileHelper(char * accessToken,
	std::string assistantId, std::shared_ptr<CreateAssistantFileRequest> createAssistantFileRequest, 
	void(* handler)(AssistantFileObject, Error, void* )
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

	if (isprimitive("CreateAssistantFileRequest")) {
		node = converttoJson(&createAssistantFileRequest, "CreateAssistantFileRequest", "");
	}
	
	char *jsonStr =  createAssistantFileRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/assistants/{assistant_id}/files");
	int pos;

	string s_assistantId("{");
	s_assistantId.append("assistant_id");
	s_assistantId.append("}");
	pos = url.find(s_assistantId);
	url.erase(pos, s_assistantId.length());
	url.insert(pos, stringify(&assistantId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createAssistantFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createAssistantFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::createAssistantFileAsync(char * accessToken,
	std::string assistantId, std::shared_ptr<CreateAssistantFileRequest> createAssistantFileRequest, 
	void(* handler)(AssistantFileObject, Error, void* )
	, void* userData)
{
	return createAssistantFileHelper(accessToken,
	assistantId, createAssistantFileRequest, 
	handler, userData, true);
}

bool AssistantsManager::createAssistantFileSync(char * accessToken,
	std::string assistantId, std::shared_ptr<CreateAssistantFileRequest> createAssistantFileRequest, 
	void(* handler)(AssistantFileObject, Error, void* )
	, void* userData)
{
	return createAssistantFileHelper(accessToken,
	assistantId, createAssistantFileRequest, 
	handler, userData, false);
}

static bool createMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(MessageObject, Error, void* )
	= reinterpret_cast<void(*)(MessageObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	MessageObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("MessageObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "MessageObject", "MessageObject");
			json_node_free(pJson);

			if ("MessageObject" == "std::string") {
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

static bool createMessageHelper(char * accessToken,
	std::string threadId, std::shared_ptr<CreateMessageRequest> createMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
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

	if (isprimitive("CreateMessageRequest")) {
		node = converttoJson(&createMessageRequest, "CreateMessageRequest", "");
	}
	
	char *jsonStr =  createMessageRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads/{thread_id}/messages");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::createMessageAsync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateMessageRequest> createMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData)
{
	return createMessageHelper(accessToken,
	threadId, createMessageRequest, 
	handler, userData, true);
}

bool AssistantsManager::createMessageSync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateMessageRequest> createMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData)
{
	return createMessageHelper(accessToken,
	threadId, createMessageRequest, 
	handler, userData, false);
}

static bool createRunProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RunObject, Error, void* )
	= reinterpret_cast<void(*)(RunObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RunObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RunObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RunObject", "RunObject");
			json_node_free(pJson);

			if ("RunObject" == "std::string") {
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

static bool createRunHelper(char * accessToken,
	std::string threadId, std::shared_ptr<CreateRunRequest> createRunRequest, 
	void(* handler)(RunObject, Error, void* )
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

	if (isprimitive("CreateRunRequest")) {
		node = converttoJson(&createRunRequest, "CreateRunRequest", "");
	}
	
	char *jsonStr =  createRunRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads/{thread_id}/runs");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createRunProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createRunProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::createRunAsync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateRunRequest> createRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return createRunHelper(accessToken,
	threadId, createRunRequest, 
	handler, userData, true);
}

bool AssistantsManager::createRunSync(char * accessToken,
	std::string threadId, std::shared_ptr<CreateRunRequest> createRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return createRunHelper(accessToken,
	threadId, createRunRequest, 
	handler, userData, false);
}

static bool createThreadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ThreadObject, Error, void* )
	= reinterpret_cast<void(*)(ThreadObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ThreadObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ThreadObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ThreadObject", "ThreadObject");
			json_node_free(pJson);

			if ("ThreadObject" == "std::string") {
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

static bool createThreadHelper(char * accessToken,
	std::shared_ptr<CreateThreadRequest> createThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
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

	if (isprimitive("CreateThreadRequest")) {
		node = converttoJson(&createThreadRequest, "CreateThreadRequest", "");
	}
	
	char *jsonStr =  createThreadRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads");
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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createThreadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createThreadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::createThreadAsync(char * accessToken,
	std::shared_ptr<CreateThreadRequest> createThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData)
{
	return createThreadHelper(accessToken,
	createThreadRequest, 
	handler, userData, true);
}

bool AssistantsManager::createThreadSync(char * accessToken,
	std::shared_ptr<CreateThreadRequest> createThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData)
{
	return createThreadHelper(accessToken,
	createThreadRequest, 
	handler, userData, false);
}

static bool createThreadAndRunProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RunObject, Error, void* )
	= reinterpret_cast<void(*)(RunObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RunObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RunObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RunObject", "RunObject");
			json_node_free(pJson);

			if ("RunObject" == "std::string") {
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

static bool createThreadAndRunHelper(char * accessToken,
	std::shared_ptr<CreateThreadAndRunRequest> createThreadAndRunRequest, 
	void(* handler)(RunObject, Error, void* )
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

	if (isprimitive("CreateThreadAndRunRequest")) {
		node = converttoJson(&createThreadAndRunRequest, "CreateThreadAndRunRequest", "");
	}
	
	char *jsonStr =  createThreadAndRunRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads/runs");
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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createThreadAndRunProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createThreadAndRunProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::createThreadAndRunAsync(char * accessToken,
	std::shared_ptr<CreateThreadAndRunRequest> createThreadAndRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return createThreadAndRunHelper(accessToken,
	createThreadAndRunRequest, 
	handler, userData, true);
}

bool AssistantsManager::createThreadAndRunSync(char * accessToken,
	std::shared_ptr<CreateThreadAndRunRequest> createThreadAndRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return createThreadAndRunHelper(accessToken,
	createThreadAndRunRequest, 
	handler, userData, false);
}

static bool deleteAssistantProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteAssistantResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteAssistantResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteAssistantResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteAssistantResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteAssistantResponse", "DeleteAssistantResponse");
			json_node_free(pJson);

			if ("DeleteAssistantResponse" == "std::string") {
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

static bool deleteAssistantHelper(char * accessToken,
	std::string assistantId, 
	void(* handler)(DeleteAssistantResponse, Error, void* )
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

	string url("/assistants/{assistant_id}");
	int pos;

	string s_assistantId("{");
	s_assistantId.append("assistant_id");
	s_assistantId.append("}");
	pos = url.find(s_assistantId);
	url.erase(pos, s_assistantId.length());
	url.insert(pos, stringify(&assistantId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteAssistantProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteAssistantProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::deleteAssistantAsync(char * accessToken,
	std::string assistantId, 
	void(* handler)(DeleteAssistantResponse, Error, void* )
	, void* userData)
{
	return deleteAssistantHelper(accessToken,
	assistantId, 
	handler, userData, true);
}

bool AssistantsManager::deleteAssistantSync(char * accessToken,
	std::string assistantId, 
	void(* handler)(DeleteAssistantResponse, Error, void* )
	, void* userData)
{
	return deleteAssistantHelper(accessToken,
	assistantId, 
	handler, userData, false);
}

static bool deleteAssistantFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteAssistantFileResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteAssistantFileResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteAssistantFileResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteAssistantFileResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteAssistantFileResponse", "DeleteAssistantFileResponse");
			json_node_free(pJson);

			if ("DeleteAssistantFileResponse" == "std::string") {
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

static bool deleteAssistantFileHelper(char * accessToken,
	std::string assistantId, std::string fileId, 
	void(* handler)(DeleteAssistantFileResponse, Error, void* )
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

	string url("/assistants/{assistant_id}/files/{file_id}");
	int pos;

	string s_assistantId("{");
	s_assistantId.append("assistant_id");
	s_assistantId.append("}");
	pos = url.find(s_assistantId);
	url.erase(pos, s_assistantId.length());
	url.insert(pos, stringify(&assistantId, "std::string"));
	string s_fileId("{");
	s_fileId.append("file_id");
	s_fileId.append("}");
	pos = url.find(s_fileId);
	url.erase(pos, s_fileId.length());
	url.insert(pos, stringify(&fileId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteAssistantFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteAssistantFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::deleteAssistantFileAsync(char * accessToken,
	std::string assistantId, std::string fileId, 
	void(* handler)(DeleteAssistantFileResponse, Error, void* )
	, void* userData)
{
	return deleteAssistantFileHelper(accessToken,
	assistantId, fileId, 
	handler, userData, true);
}

bool AssistantsManager::deleteAssistantFileSync(char * accessToken,
	std::string assistantId, std::string fileId, 
	void(* handler)(DeleteAssistantFileResponse, Error, void* )
	, void* userData)
{
	return deleteAssistantFileHelper(accessToken,
	assistantId, fileId, 
	handler, userData, false);
}

static bool deleteThreadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteThreadResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteThreadResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteThreadResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteThreadResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteThreadResponse", "DeleteThreadResponse");
			json_node_free(pJson);

			if ("DeleteThreadResponse" == "std::string") {
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

static bool deleteThreadHelper(char * accessToken,
	std::string threadId, 
	void(* handler)(DeleteThreadResponse, Error, void* )
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

	string url("/threads/{thread_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("DELETE");

	if(strcmp("PUT", "DELETE") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteThreadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteThreadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::deleteThreadAsync(char * accessToken,
	std::string threadId, 
	void(* handler)(DeleteThreadResponse, Error, void* )
	, void* userData)
{
	return deleteThreadHelper(accessToken,
	threadId, 
	handler, userData, true);
}

bool AssistantsManager::deleteThreadSync(char * accessToken,
	std::string threadId, 
	void(* handler)(DeleteThreadResponse, Error, void* )
	, void* userData)
{
	return deleteThreadHelper(accessToken,
	threadId, 
	handler, userData, false);
}

static bool getAssistantProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssistantObject, Error, void* )
	= reinterpret_cast<void(*)(AssistantObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssistantObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssistantObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssistantObject", "AssistantObject");
			json_node_free(pJson);

			if ("AssistantObject" == "std::string") {
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

static bool getAssistantHelper(char * accessToken,
	std::string assistantId, 
	void(* handler)(AssistantObject, Error, void* )
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

	string url("/assistants/{assistant_id}");
	int pos;

	string s_assistantId("{");
	s_assistantId.append("assistant_id");
	s_assistantId.append("}");
	pos = url.find(s_assistantId);
	url.erase(pos, s_assistantId.length());
	url.insert(pos, stringify(&assistantId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAssistantProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAssistantProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::getAssistantAsync(char * accessToken,
	std::string assistantId, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData)
{
	return getAssistantHelper(accessToken,
	assistantId, 
	handler, userData, true);
}

bool AssistantsManager::getAssistantSync(char * accessToken,
	std::string assistantId, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData)
{
	return getAssistantHelper(accessToken,
	assistantId, 
	handler, userData, false);
}

static bool getAssistantFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssistantFileObject, Error, void* )
	= reinterpret_cast<void(*)(AssistantFileObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssistantFileObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssistantFileObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssistantFileObject", "AssistantFileObject");
			json_node_free(pJson);

			if ("AssistantFileObject" == "std::string") {
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

static bool getAssistantFileHelper(char * accessToken,
	std::string assistantId, std::string fileId, 
	void(* handler)(AssistantFileObject, Error, void* )
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

	string url("/assistants/{assistant_id}/files/{file_id}");
	int pos;

	string s_assistantId("{");
	s_assistantId.append("assistant_id");
	s_assistantId.append("}");
	pos = url.find(s_assistantId);
	url.erase(pos, s_assistantId.length());
	url.insert(pos, stringify(&assistantId, "std::string"));
	string s_fileId("{");
	s_fileId.append("file_id");
	s_fileId.append("}");
	pos = url.find(s_fileId);
	url.erase(pos, s_fileId.length());
	url.insert(pos, stringify(&fileId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getAssistantFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getAssistantFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::getAssistantFileAsync(char * accessToken,
	std::string assistantId, std::string fileId, 
	void(* handler)(AssistantFileObject, Error, void* )
	, void* userData)
{
	return getAssistantFileHelper(accessToken,
	assistantId, fileId, 
	handler, userData, true);
}

bool AssistantsManager::getAssistantFileSync(char * accessToken,
	std::string assistantId, std::string fileId, 
	void(* handler)(AssistantFileObject, Error, void* )
	, void* userData)
{
	return getAssistantFileHelper(accessToken,
	assistantId, fileId, 
	handler, userData, false);
}

static bool getMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(MessageObject, Error, void* )
	= reinterpret_cast<void(*)(MessageObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	MessageObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("MessageObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "MessageObject", "MessageObject");
			json_node_free(pJson);

			if ("MessageObject" == "std::string") {
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

static bool getMessageHelper(char * accessToken,
	std::string threadId, std::string messageId, 
	void(* handler)(MessageObject, Error, void* )
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

	string url("/threads/{thread_id}/messages/{message_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::getMessageAsync(char * accessToken,
	std::string threadId, std::string messageId, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData)
{
	return getMessageHelper(accessToken,
	threadId, messageId, 
	handler, userData, true);
}

bool AssistantsManager::getMessageSync(char * accessToken,
	std::string threadId, std::string messageId, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData)
{
	return getMessageHelper(accessToken,
	threadId, messageId, 
	handler, userData, false);
}

static bool getMessageFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(MessageFileObject, Error, void* )
	= reinterpret_cast<void(*)(MessageFileObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	MessageFileObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("MessageFileObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "MessageFileObject", "MessageFileObject");
			json_node_free(pJson);

			if ("MessageFileObject" == "std::string") {
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

static bool getMessageFileHelper(char * accessToken,
	std::string threadId, std::string messageId, std::string fileId, 
	void(* handler)(MessageFileObject, Error, void* )
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

	string url("/threads/{thread_id}/messages/{message_id}/files/{file_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "std::string"));
	string s_fileId("{");
	s_fileId.append("file_id");
	s_fileId.append("}");
	pos = url.find(s_fileId);
	url.erase(pos, s_fileId.length());
	url.insert(pos, stringify(&fileId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getMessageFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getMessageFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::getMessageFileAsync(char * accessToken,
	std::string threadId, std::string messageId, std::string fileId, 
	void(* handler)(MessageFileObject, Error, void* )
	, void* userData)
{
	return getMessageFileHelper(accessToken,
	threadId, messageId, fileId, 
	handler, userData, true);
}

bool AssistantsManager::getMessageFileSync(char * accessToken,
	std::string threadId, std::string messageId, std::string fileId, 
	void(* handler)(MessageFileObject, Error, void* )
	, void* userData)
{
	return getMessageFileHelper(accessToken,
	threadId, messageId, fileId, 
	handler, userData, false);
}

static bool getRunProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RunObject, Error, void* )
	= reinterpret_cast<void(*)(RunObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RunObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RunObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RunObject", "RunObject");
			json_node_free(pJson);

			if ("RunObject" == "std::string") {
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

static bool getRunHelper(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
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

	string url("/threads/{thread_id}/runs/{run_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_runId("{");
	s_runId.append("run_id");
	s_runId.append("}");
	pos = url.find(s_runId);
	url.erase(pos, s_runId.length());
	url.insert(pos, stringify(&runId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getRunProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getRunProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::getRunAsync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return getRunHelper(accessToken,
	threadId, runId, 
	handler, userData, true);
}

bool AssistantsManager::getRunSync(char * accessToken,
	std::string threadId, std::string runId, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return getRunHelper(accessToken,
	threadId, runId, 
	handler, userData, false);
}

static bool getRunStepProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RunStepObject, Error, void* )
	= reinterpret_cast<void(*)(RunStepObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RunStepObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RunStepObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RunStepObject", "RunStepObject");
			json_node_free(pJson);

			if ("RunStepObject" == "std::string") {
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

static bool getRunStepHelper(char * accessToken,
	std::string threadId, std::string runId, std::string stepId, 
	void(* handler)(RunStepObject, Error, void* )
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

	string url("/threads/{thread_id}/runs/{run_id}/steps/{step_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_runId("{");
	s_runId.append("run_id");
	s_runId.append("}");
	pos = url.find(s_runId);
	url.erase(pos, s_runId.length());
	url.insert(pos, stringify(&runId, "std::string"));
	string s_stepId("{");
	s_stepId.append("step_id");
	s_stepId.append("}");
	pos = url.find(s_stepId);
	url.erase(pos, s_stepId.length());
	url.insert(pos, stringify(&stepId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getRunStepProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getRunStepProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::getRunStepAsync(char * accessToken,
	std::string threadId, std::string runId, std::string stepId, 
	void(* handler)(RunStepObject, Error, void* )
	, void* userData)
{
	return getRunStepHelper(accessToken,
	threadId, runId, stepId, 
	handler, userData, true);
}

bool AssistantsManager::getRunStepSync(char * accessToken,
	std::string threadId, std::string runId, std::string stepId, 
	void(* handler)(RunStepObject, Error, void* )
	, void* userData)
{
	return getRunStepHelper(accessToken,
	threadId, runId, stepId, 
	handler, userData, false);
}

static bool getThreadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ThreadObject, Error, void* )
	= reinterpret_cast<void(*)(ThreadObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ThreadObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ThreadObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ThreadObject", "ThreadObject");
			json_node_free(pJson);

			if ("ThreadObject" == "std::string") {
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

static bool getThreadHelper(char * accessToken,
	std::string threadId, 
	void(* handler)(ThreadObject, Error, void* )
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

	string url("/threads/{thread_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getThreadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getThreadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::getThreadAsync(char * accessToken,
	std::string threadId, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData)
{
	return getThreadHelper(accessToken,
	threadId, 
	handler, userData, true);
}

bool AssistantsManager::getThreadSync(char * accessToken,
	std::string threadId, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData)
{
	return getThreadHelper(accessToken,
	threadId, 
	handler, userData, false);
}

static bool listAssistantFilesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListAssistantFilesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListAssistantFilesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListAssistantFilesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListAssistantFilesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListAssistantFilesResponse", "ListAssistantFilesResponse");
			json_node_free(pJson);

			if ("ListAssistantFilesResponse" == "std::string") {
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

static bool listAssistantFilesHelper(char * accessToken,
	std::string assistantId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantFilesResponse, Error, void* )
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
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/assistants/{assistant_id}/files");
	int pos;

	string s_assistantId("{");
	s_assistantId.append("assistant_id");
	s_assistantId.append("}");
	pos = url.find(s_assistantId);
	url.erase(pos, s_assistantId.length());
	url.insert(pos, stringify(&assistantId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listAssistantFilesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listAssistantFilesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::listAssistantFilesAsync(char * accessToken,
	std::string assistantId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantFilesResponse, Error, void* )
	, void* userData)
{
	return listAssistantFilesHelper(accessToken,
	assistantId, limit, order, after, before, 
	handler, userData, true);
}

bool AssistantsManager::listAssistantFilesSync(char * accessToken,
	std::string assistantId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantFilesResponse, Error, void* )
	, void* userData)
{
	return listAssistantFilesHelper(accessToken,
	assistantId, limit, order, after, before, 
	handler, userData, false);
}

static bool listAssistantsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListAssistantsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListAssistantsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListAssistantsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListAssistantsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListAssistantsResponse", "ListAssistantsResponse");
			json_node_free(pJson);

			if ("ListAssistantsResponse" == "std::string") {
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

static bool listAssistantsHelper(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantsResponse, Error, void* )
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
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/assistants");
	int pos;


	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listAssistantsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listAssistantsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::listAssistantsAsync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantsResponse, Error, void* )
	, void* userData)
{
	return listAssistantsHelper(accessToken,
	limit, order, after, before, 
	handler, userData, true);
}

bool AssistantsManager::listAssistantsSync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListAssistantsResponse, Error, void* )
	, void* userData)
{
	return listAssistantsHelper(accessToken,
	limit, order, after, before, 
	handler, userData, false);
}

static bool listMessageFilesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListMessageFilesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListMessageFilesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListMessageFilesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListMessageFilesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListMessageFilesResponse", "ListMessageFilesResponse");
			json_node_free(pJson);

			if ("ListMessageFilesResponse" == "std::string") {
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

static bool listMessageFilesHelper(char * accessToken,
	std::string threadId, std::string messageId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListMessageFilesResponse, Error, void* )
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
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/threads/{thread_id}/messages/{message_id}/files");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listMessageFilesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listMessageFilesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::listMessageFilesAsync(char * accessToken,
	std::string threadId, std::string messageId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListMessageFilesResponse, Error, void* )
	, void* userData)
{
	return listMessageFilesHelper(accessToken,
	threadId, messageId, limit, order, after, before, 
	handler, userData, true);
}

bool AssistantsManager::listMessageFilesSync(char * accessToken,
	std::string threadId, std::string messageId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListMessageFilesResponse, Error, void* )
	, void* userData)
{
	return listMessageFilesHelper(accessToken,
	threadId, messageId, limit, order, after, before, 
	handler, userData, false);
}

static bool listMessagesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListMessagesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListMessagesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListMessagesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListMessagesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListMessagesResponse", "ListMessagesResponse");
			json_node_free(pJson);

			if ("ListMessagesResponse" == "std::string") {
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

static bool listMessagesHelper(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, std::string runId, 
	void(* handler)(ListMessagesResponse, Error, void* )
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
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}


	itemAtq = stringify(&runId, "std::string");
	queryParams.insert(pair<string, string>("run_id", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("run_id");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/threads/{thread_id}/messages");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listMessagesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listMessagesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::listMessagesAsync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, std::string runId, 
	void(* handler)(ListMessagesResponse, Error, void* )
	, void* userData)
{
	return listMessagesHelper(accessToken,
	threadId, limit, order, after, before, runId, 
	handler, userData, true);
}

bool AssistantsManager::listMessagesSync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, std::string runId, 
	void(* handler)(ListMessagesResponse, Error, void* )
	, void* userData)
{
	return listMessagesHelper(accessToken,
	threadId, limit, order, after, before, runId, 
	handler, userData, false);
}

static bool listRunStepsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListRunStepsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListRunStepsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListRunStepsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListRunStepsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListRunStepsResponse", "ListRunStepsResponse");
			json_node_free(pJson);

			if ("ListRunStepsResponse" == "std::string") {
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

static bool listRunStepsHelper(char * accessToken,
	std::string threadId, std::string runId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunStepsResponse, Error, void* )
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
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/threads/{thread_id}/runs/{run_id}/steps");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_runId("{");
	s_runId.append("run_id");
	s_runId.append("}");
	pos = url.find(s_runId);
	url.erase(pos, s_runId.length());
	url.insert(pos, stringify(&runId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listRunStepsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listRunStepsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::listRunStepsAsync(char * accessToken,
	std::string threadId, std::string runId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunStepsResponse, Error, void* )
	, void* userData)
{
	return listRunStepsHelper(accessToken,
	threadId, runId, limit, order, after, before, 
	handler, userData, true);
}

bool AssistantsManager::listRunStepsSync(char * accessToken,
	std::string threadId, std::string runId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunStepsResponse, Error, void* )
	, void* userData)
{
	return listRunStepsHelper(accessToken,
	threadId, runId, limit, order, after, before, 
	handler, userData, false);
}

static bool listRunsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListRunsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListRunsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListRunsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListRunsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListRunsResponse", "ListRunsResponse");
			json_node_free(pJson);

			if ("ListRunsResponse" == "std::string") {
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

static bool listRunsHelper(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunsResponse, Error, void* )
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
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/threads/{thread_id}/runs");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));

	//TODO: free memory of errormsg, memorystruct
	MemoryStruct_s* p_chunk = new MemoryStruct_s();
	long code;
	char* errormsg = NULL;
	string myhttpmethod("GET");

	if(strcmp("PUT", "GET") == 0){
		if(strcmp("", mBody.c_str()) == 0){
			mBody.append("{}");
		}
	}

	if(!isAsync){
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listRunsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listRunsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::listRunsAsync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunsResponse, Error, void* )
	, void* userData)
{
	return listRunsHelper(accessToken,
	threadId, limit, order, after, before, 
	handler, userData, true);
}

bool AssistantsManager::listRunsSync(char * accessToken,
	std::string threadId, int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListRunsResponse, Error, void* )
	, void* userData)
{
	return listRunsHelper(accessToken,
	threadId, limit, order, after, before, 
	handler, userData, false);
}

static bool modifyAssistantProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AssistantObject, Error, void* )
	= reinterpret_cast<void(*)(AssistantObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AssistantObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AssistantObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AssistantObject", "AssistantObject");
			json_node_free(pJson);

			if ("AssistantObject" == "std::string") {
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

static bool modifyAssistantHelper(char * accessToken,
	std::string assistantId, std::shared_ptr<ModifyAssistantRequest> modifyAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
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

	if (isprimitive("ModifyAssistantRequest")) {
		node = converttoJson(&modifyAssistantRequest, "ModifyAssistantRequest", "");
	}
	
	char *jsonStr =  modifyAssistantRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/assistants/{assistant_id}");
	int pos;

	string s_assistantId("{");
	s_assistantId.append("assistant_id");
	s_assistantId.append("}");
	pos = url.find(s_assistantId);
	url.erase(pos, s_assistantId.length());
	url.insert(pos, stringify(&assistantId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyAssistantProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyAssistantProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::modifyAssistantAsync(char * accessToken,
	std::string assistantId, std::shared_ptr<ModifyAssistantRequest> modifyAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData)
{
	return modifyAssistantHelper(accessToken,
	assistantId, modifyAssistantRequest, 
	handler, userData, true);
}

bool AssistantsManager::modifyAssistantSync(char * accessToken,
	std::string assistantId, std::shared_ptr<ModifyAssistantRequest> modifyAssistantRequest, 
	void(* handler)(AssistantObject, Error, void* )
	, void* userData)
{
	return modifyAssistantHelper(accessToken,
	assistantId, modifyAssistantRequest, 
	handler, userData, false);
}

static bool modifyMessageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(MessageObject, Error, void* )
	= reinterpret_cast<void(*)(MessageObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	MessageObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("MessageObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "MessageObject", "MessageObject");
			json_node_free(pJson);

			if ("MessageObject" == "std::string") {
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

static bool modifyMessageHelper(char * accessToken,
	std::string threadId, std::string messageId, std::shared_ptr<ModifyMessageRequest> modifyMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
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

	if (isprimitive("ModifyMessageRequest")) {
		node = converttoJson(&modifyMessageRequest, "ModifyMessageRequest", "");
	}
	
	char *jsonStr =  modifyMessageRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads/{thread_id}/messages/{message_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_messageId("{");
	s_messageId.append("message_id");
	s_messageId.append("}");
	pos = url.find(s_messageId);
	url.erase(pos, s_messageId.length());
	url.insert(pos, stringify(&messageId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyMessageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyMessageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::modifyMessageAsync(char * accessToken,
	std::string threadId, std::string messageId, std::shared_ptr<ModifyMessageRequest> modifyMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData)
{
	return modifyMessageHelper(accessToken,
	threadId, messageId, modifyMessageRequest, 
	handler, userData, true);
}

bool AssistantsManager::modifyMessageSync(char * accessToken,
	std::string threadId, std::string messageId, std::shared_ptr<ModifyMessageRequest> modifyMessageRequest, 
	void(* handler)(MessageObject, Error, void* )
	, void* userData)
{
	return modifyMessageHelper(accessToken,
	threadId, messageId, modifyMessageRequest, 
	handler, userData, false);
}

static bool modifyRunProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RunObject, Error, void* )
	= reinterpret_cast<void(*)(RunObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RunObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RunObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RunObject", "RunObject");
			json_node_free(pJson);

			if ("RunObject" == "std::string") {
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

static bool modifyRunHelper(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<ModifyRunRequest> modifyRunRequest, 
	void(* handler)(RunObject, Error, void* )
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

	if (isprimitive("ModifyRunRequest")) {
		node = converttoJson(&modifyRunRequest, "ModifyRunRequest", "");
	}
	
	char *jsonStr =  modifyRunRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads/{thread_id}/runs/{run_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_runId("{");
	s_runId.append("run_id");
	s_runId.append("}");
	pos = url.find(s_runId);
	url.erase(pos, s_runId.length());
	url.insert(pos, stringify(&runId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyRunProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyRunProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::modifyRunAsync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<ModifyRunRequest> modifyRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return modifyRunHelper(accessToken,
	threadId, runId, modifyRunRequest, 
	handler, userData, true);
}

bool AssistantsManager::modifyRunSync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<ModifyRunRequest> modifyRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return modifyRunHelper(accessToken,
	threadId, runId, modifyRunRequest, 
	handler, userData, false);
}

static bool modifyThreadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ThreadObject, Error, void* )
	= reinterpret_cast<void(*)(ThreadObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ThreadObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ThreadObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ThreadObject", "ThreadObject");
			json_node_free(pJson);

			if ("ThreadObject" == "std::string") {
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

static bool modifyThreadHelper(char * accessToken,
	std::string threadId, std::shared_ptr<ModifyThreadRequest> modifyThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
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

	if (isprimitive("ModifyThreadRequest")) {
		node = converttoJson(&modifyThreadRequest, "ModifyThreadRequest", "");
	}
	
	char *jsonStr =  modifyThreadRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads/{thread_id}");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyThreadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyThreadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::modifyThreadAsync(char * accessToken,
	std::string threadId, std::shared_ptr<ModifyThreadRequest> modifyThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData)
{
	return modifyThreadHelper(accessToken,
	threadId, modifyThreadRequest, 
	handler, userData, true);
}

bool AssistantsManager::modifyThreadSync(char * accessToken,
	std::string threadId, std::shared_ptr<ModifyThreadRequest> modifyThreadRequest, 
	void(* handler)(ThreadObject, Error, void* )
	, void* userData)
{
	return modifyThreadHelper(accessToken,
	threadId, modifyThreadRequest, 
	handler, userData, false);
}

static bool submitToolOuputsToRunProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(RunObject, Error, void* )
	= reinterpret_cast<void(*)(RunObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	RunObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("RunObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "RunObject", "RunObject");
			json_node_free(pJson);

			if ("RunObject" == "std::string") {
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

static bool submitToolOuputsToRunHelper(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<SubmitToolOutputsRunRequest> submitToolOutputsRunRequest, 
	void(* handler)(RunObject, Error, void* )
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

	if (isprimitive("SubmitToolOutputsRunRequest")) {
		node = converttoJson(&submitToolOutputsRunRequest, "SubmitToolOutputsRunRequest", "");
	}
	
	char *jsonStr =  submitToolOutputsRunRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/threads/{thread_id}/runs/{run_id}/submit_tool_outputs");
	int pos;

	string s_threadId("{");
	s_threadId.append("thread_id");
	s_threadId.append("}");
	pos = url.find(s_threadId);
	url.erase(pos, s_threadId.length());
	url.insert(pos, stringify(&threadId, "std::string"));
	string s_runId("{");
	s_runId.append("run_id");
	s_runId.append("}");
	pos = url.find(s_runId);
	url.erase(pos, s_runId.length());
	url.insert(pos, stringify(&runId, "std::string"));

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
		NetClient::easycurl(AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = submitToolOuputsToRunProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (AssistantsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), submitToolOuputsToRunProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __AssistantsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool AssistantsManager::submitToolOuputsToRunAsync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<SubmitToolOutputsRunRequest> submitToolOutputsRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return submitToolOuputsToRunHelper(accessToken,
	threadId, runId, submitToolOutputsRunRequest, 
	handler, userData, true);
}

bool AssistantsManager::submitToolOuputsToRunSync(char * accessToken,
	std::string threadId, std::string runId, std::shared_ptr<SubmitToolOutputsRunRequest> submitToolOutputsRunRequest, 
	void(* handler)(RunObject, Error, void* )
	, void* userData)
{
	return submitToolOuputsToRunHelper(accessToken,
	threadId, runId, submitToolOutputsRunRequest, 
	handler, userData, false);
}

