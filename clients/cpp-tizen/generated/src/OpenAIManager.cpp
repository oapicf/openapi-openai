#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "OpenAIManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


OpenAIManager::OpenAIManager()
{

}

OpenAIManager::~OpenAIManager()
{

}

static gboolean __OpenAIManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __OpenAIManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__OpenAIManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool cancelFineTuneProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FineTune, Error, void* )
	= reinterpret_cast<void(*)(FineTune, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FineTune out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FineTune")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FineTune", "FineTune");
			json_node_free(pJson);

			if ("FineTune" == "std::string") {
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

static bool cancelFineTuneHelper(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
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

	string url("/fine-tunes/{fine_tune_id}/cancel");
	int pos;

	string s_fineTuneId("{");
	s_fineTuneId.append("fine_tune_id");
	s_fineTuneId.append("}");
	pos = url.find(s_fineTuneId);
	url.erase(pos, s_fineTuneId.length());
	url.insert(pos, stringify(&fineTuneId, "std::string"));

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelFineTuneProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelFineTuneProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::cancelFineTuneAsync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData)
{
	return cancelFineTuneHelper(accessToken,
	fineTuneId, 
	handler, userData, true);
}

bool OpenAIManager::cancelFineTuneSync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData)
{
	return cancelFineTuneHelper(accessToken,
	fineTuneId, 
	handler, userData, false);
}

static bool createChatCompletionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateChatCompletionResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateChatCompletionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateChatCompletionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateChatCompletionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateChatCompletionResponse", "CreateChatCompletionResponse");
			json_node_free(pJson);

			if ("CreateChatCompletionResponse" == "std::string") {
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

static bool createChatCompletionHelper(char * accessToken,
	std::shared_ptr<CreateChatCompletionRequest> createChatCompletionRequest, 
	void(* handler)(CreateChatCompletionResponse, Error, void* )
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

	if (isprimitive("CreateChatCompletionRequest")) {
		node = converttoJson(&createChatCompletionRequest, "CreateChatCompletionRequest", "");
	}
	
	char *jsonStr =  createChatCompletionRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/chat/completions");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createChatCompletionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createChatCompletionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createChatCompletionAsync(char * accessToken,
	std::shared_ptr<CreateChatCompletionRequest> createChatCompletionRequest, 
	void(* handler)(CreateChatCompletionResponse, Error, void* )
	, void* userData)
{
	return createChatCompletionHelper(accessToken,
	createChatCompletionRequest, 
	handler, userData, true);
}

bool OpenAIManager::createChatCompletionSync(char * accessToken,
	std::shared_ptr<CreateChatCompletionRequest> createChatCompletionRequest, 
	void(* handler)(CreateChatCompletionResponse, Error, void* )
	, void* userData)
{
	return createChatCompletionHelper(accessToken,
	createChatCompletionRequest, 
	handler, userData, false);
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createCompletionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createCompletionAsync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData)
{
	return createCompletionHelper(accessToken,
	createCompletionRequest, 
	handler, userData, true);
}

bool OpenAIManager::createCompletionSync(char * accessToken,
	std::shared_ptr<CreateCompletionRequest> createCompletionRequest, 
	void(* handler)(CreateCompletionResponse, Error, void* )
	, void* userData)
{
	return createCompletionHelper(accessToken,
	createCompletionRequest, 
	handler, userData, false);
}

static bool createEditProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateEditResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateEditResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateEditResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateEditResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateEditResponse", "CreateEditResponse");
			json_node_free(pJson);

			if ("CreateEditResponse" == "std::string") {
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

static bool createEditHelper(char * accessToken,
	std::shared_ptr<CreateEditRequest> createEditRequest, 
	void(* handler)(CreateEditResponse, Error, void* )
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

	if (isprimitive("CreateEditRequest")) {
		node = converttoJson(&createEditRequest, "CreateEditRequest", "");
	}
	
	char *jsonStr =  createEditRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/edits");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createEditProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createEditProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createEditAsync(char * accessToken,
	std::shared_ptr<CreateEditRequest> createEditRequest, 
	void(* handler)(CreateEditResponse, Error, void* )
	, void* userData)
{
	return createEditHelper(accessToken,
	createEditRequest, 
	handler, userData, true);
}

bool OpenAIManager::createEditSync(char * accessToken,
	std::shared_ptr<CreateEditRequest> createEditRequest, 
	void(* handler)(CreateEditResponse, Error, void* )
	, void* userData)
{
	return createEditHelper(accessToken,
	createEditRequest, 
	handler, userData, false);
}

static bool createEmbeddingProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateEmbeddingResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateEmbeddingResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateEmbeddingResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateEmbeddingResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateEmbeddingResponse", "CreateEmbeddingResponse");
			json_node_free(pJson);

			if ("CreateEmbeddingResponse" == "std::string") {
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

static bool createEmbeddingHelper(char * accessToken,
	std::shared_ptr<CreateEmbeddingRequest> createEmbeddingRequest, 
	void(* handler)(CreateEmbeddingResponse, Error, void* )
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

	if (isprimitive("CreateEmbeddingRequest")) {
		node = converttoJson(&createEmbeddingRequest, "CreateEmbeddingRequest", "");
	}
	
	char *jsonStr =  createEmbeddingRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/embeddings");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createEmbeddingProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createEmbeddingProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createEmbeddingAsync(char * accessToken,
	std::shared_ptr<CreateEmbeddingRequest> createEmbeddingRequest, 
	void(* handler)(CreateEmbeddingResponse, Error, void* )
	, void* userData)
{
	return createEmbeddingHelper(accessToken,
	createEmbeddingRequest, 
	handler, userData, true);
}

bool OpenAIManager::createEmbeddingSync(char * accessToken,
	std::shared_ptr<CreateEmbeddingRequest> createEmbeddingRequest, 
	void(* handler)(CreateEmbeddingResponse, Error, void* )
	, void* userData)
{
	return createEmbeddingHelper(accessToken,
	createEmbeddingRequest, 
	handler, userData, false);
}

static bool createFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(OpenAIFile, Error, void* )
	= reinterpret_cast<void(*)(OpenAIFile, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	OpenAIFile out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("OpenAIFile")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "OpenAIFile", "OpenAIFile");
			json_node_free(pJson);

			if ("OpenAIFile" == "std::string") {
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

static bool createFileHelper(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/files");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createFileAsync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return createFileHelper(accessToken,
	file, purpose, 
	handler, userData, true);
}

bool OpenAIManager::createFileSync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return createFileHelper(accessToken,
	file, purpose, 
	handler, userData, false);
}

static bool createFineTuneProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FineTune, Error, void* )
	= reinterpret_cast<void(*)(FineTune, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FineTune out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FineTune")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FineTune", "FineTune");
			json_node_free(pJson);

			if ("FineTune" == "std::string") {
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

static bool createFineTuneHelper(char * accessToken,
	std::shared_ptr<CreateFineTuneRequest> createFineTuneRequest, 
	void(* handler)(FineTune, Error, void* )
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

	if (isprimitive("CreateFineTuneRequest")) {
		node = converttoJson(&createFineTuneRequest, "CreateFineTuneRequest", "");
	}
	
	char *jsonStr =  createFineTuneRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fine-tunes");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createFineTuneProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createFineTuneProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createFineTuneAsync(char * accessToken,
	std::shared_ptr<CreateFineTuneRequest> createFineTuneRequest, 
	void(* handler)(FineTune, Error, void* )
	, void* userData)
{
	return createFineTuneHelper(accessToken,
	createFineTuneRequest, 
	handler, userData, true);
}

bool OpenAIManager::createFineTuneSync(char * accessToken,
	std::shared_ptr<CreateFineTuneRequest> createFineTuneRequest, 
	void(* handler)(FineTune, Error, void* )
	, void* userData)
{
	return createFineTuneHelper(accessToken,
	createFineTuneRequest, 
	handler, userData, false);
}

static bool createImageProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ImagesResponse, Error, void* )
	= reinterpret_cast<void(*)(ImagesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ImagesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ImagesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ImagesResponse", "ImagesResponse");
			json_node_free(pJson);

			if ("ImagesResponse" == "std::string") {
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

static bool createImageHelper(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
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

	if (isprimitive("CreateImageRequest")) {
		node = converttoJson(&createImageRequest, "CreateImageRequest", "");
	}
	
	char *jsonStr =  createImageRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/images/generations");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createImageProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createImageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createImageAsync(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageHelper(accessToken,
	createImageRequest, 
	handler, userData, true);
}

bool OpenAIManager::createImageSync(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageHelper(accessToken,
	createImageRequest, 
	handler, userData, false);
}

static bool createImageEditProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ImagesResponse, Error, void* )
	= reinterpret_cast<void(*)(ImagesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ImagesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ImagesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ImagesResponse", "ImagesResponse");
			json_node_free(pJson);

			if ("ImagesResponse" == "std::string") {
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

static bool createImageEditHelper(char * accessToken,
	std::string image, std::string prompt, std::string mask, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/images/edits");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createImageEditProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createImageEditProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createImageEditAsync(char * accessToken,
	std::string image, std::string prompt, std::string mask, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageEditHelper(accessToken,
	image, prompt, mask, n, size, responseFormat, user, 
	handler, userData, true);
}

bool OpenAIManager::createImageEditSync(char * accessToken,
	std::string image, std::string prompt, std::string mask, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageEditHelper(accessToken,
	image, prompt, mask, n, size, responseFormat, user, 
	handler, userData, false);
}

static bool createImageVariationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ImagesResponse, Error, void* )
	= reinterpret_cast<void(*)(ImagesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ImagesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ImagesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ImagesResponse", "ImagesResponse");
			json_node_free(pJson);

			if ("ImagesResponse" == "std::string") {
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

static bool createImageVariationHelper(char * accessToken,
	std::string image, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/images/variations");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createImageVariationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createImageVariationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createImageVariationAsync(char * accessToken,
	std::string image, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageVariationHelper(accessToken,
	image, n, size, responseFormat, user, 
	handler, userData, true);
}

bool OpenAIManager::createImageVariationSync(char * accessToken,
	std::string image, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageVariationHelper(accessToken,
	image, n, size, responseFormat, user, 
	handler, userData, false);
}

static bool createModerationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateModerationResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateModerationResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateModerationResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateModerationResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateModerationResponse", "CreateModerationResponse");
			json_node_free(pJson);

			if ("CreateModerationResponse" == "std::string") {
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

static bool createModerationHelper(char * accessToken,
	std::shared_ptr<CreateModerationRequest> createModerationRequest, 
	void(* handler)(CreateModerationResponse, Error, void* )
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

	if (isprimitive("CreateModerationRequest")) {
		node = converttoJson(&createModerationRequest, "CreateModerationRequest", "");
	}
	
	char *jsonStr =  createModerationRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/moderations");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createModerationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createModerationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createModerationAsync(char * accessToken,
	std::shared_ptr<CreateModerationRequest> createModerationRequest, 
	void(* handler)(CreateModerationResponse, Error, void* )
	, void* userData)
{
	return createModerationHelper(accessToken,
	createModerationRequest, 
	handler, userData, true);
}

bool OpenAIManager::createModerationSync(char * accessToken,
	std::shared_ptr<CreateModerationRequest> createModerationRequest, 
	void(* handler)(CreateModerationResponse, Error, void* )
	, void* userData)
{
	return createModerationHelper(accessToken,
	createModerationRequest, 
	handler, userData, false);
}

static bool createTranscriptionProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateTranscriptionResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateTranscriptionResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateTranscriptionResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateTranscriptionResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateTranscriptionResponse", "CreateTranscriptionResponse");
			json_node_free(pJson);

			if ("CreateTranscriptionResponse" == "std::string") {
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

static bool createTranscriptionHelper(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, std::string language, 
	void(* handler)(CreateTranscriptionResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/audio/transcriptions");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createTranscriptionProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createTranscriptionProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createTranscriptionAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, std::string language, 
	void(* handler)(CreateTranscriptionResponse, Error, void* )
	, void* userData)
{
	return createTranscriptionHelper(accessToken,
	file, model, prompt, responseFormat, temperature, language, 
	handler, userData, true);
}

bool OpenAIManager::createTranscriptionSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, std::string language, 
	void(* handler)(CreateTranscriptionResponse, Error, void* )
	, void* userData)
{
	return createTranscriptionHelper(accessToken,
	file, model, prompt, responseFormat, temperature, language, 
	handler, userData, false);
}

static bool createTranslationProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(CreateTranslationResponse, Error, void* )
	= reinterpret_cast<void(*)(CreateTranslationResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	CreateTranslationResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("CreateTranslationResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "CreateTranslationResponse", "CreateTranslationResponse");
			json_node_free(pJson);

			if ("CreateTranslationResponse" == "std::string") {
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

static bool createTranslationHelper(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, 
	void(* handler)(CreateTranslationResponse, Error, void* )
	, void* userData, bool isAsync)
{

	//TODO: maybe delete headerList after its used to free up space?
	struct curl_slist *headerList = NULL;

	
	string accessHeader = "Authorization: Bearer ";
	accessHeader.append(accessToken);
	headerList = curl_slist_append(headerList, accessHeader.c_str());
	headerList = curl_slist_append(headerList, "Content-Type: multipart/form-data");

	map <string, string> queryParams;
	string itemAtq;
	
	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/audio/translations");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createTranslationProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createTranslationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::createTranslationAsync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, 
	void(* handler)(CreateTranslationResponse, Error, void* )
	, void* userData)
{
	return createTranslationHelper(accessToken,
	file, model, prompt, responseFormat, temperature, 
	handler, userData, true);
}

bool OpenAIManager::createTranslationSync(char * accessToken,
	std::string file, CreateTranscriptionRequest_model model, std::string prompt, std::string responseFormat, long long temperature, 
	void(* handler)(CreateTranslationResponse, Error, void* )
	, void* userData)
{
	return createTranslationHelper(accessToken,
	file, model, prompt, responseFormat, temperature, 
	handler, userData, false);
}

static bool deleteFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteFileResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteFileResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteFileResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteFileResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteFileResponse", "DeleteFileResponse");
			json_node_free(pJson);

			if ("DeleteFileResponse" == "std::string") {
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

static bool deleteFileHelper(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
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

	string url("/files/{file_id}");
	int pos;

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::deleteFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData)
{
	return deleteFileHelper(accessToken,
	fileId, 
	handler, userData, true);
}

bool OpenAIManager::deleteFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData)
{
	return deleteFileHelper(accessToken,
	fileId, 
	handler, userData, false);
}

static bool deleteModelProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteModelResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteModelResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteModelResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteModelResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteModelResponse", "DeleteModelResponse");
			json_node_free(pJson);

			if ("DeleteModelResponse" == "std::string") {
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

static bool deleteModelHelper(char * accessToken,
	std::string model, 
	void(* handler)(DeleteModelResponse, Error, void* )
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

	string url("/models/{model}");
	int pos;

	string s_model("{");
	s_model.append("model");
	s_model.append("}");
	pos = url.find(s_model);
	url.erase(pos, s_model.length());
	url.insert(pos, stringify(&model, "std::string"));

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteModelProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteModelProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::deleteModelAsync(char * accessToken,
	std::string model, 
	void(* handler)(DeleteModelResponse, Error, void* )
	, void* userData)
{
	return deleteModelHelper(accessToken,
	model, 
	handler, userData, true);
}

bool OpenAIManager::deleteModelSync(char * accessToken,
	std::string model, 
	void(* handler)(DeleteModelResponse, Error, void* )
	, void* userData)
{
	return deleteModelHelper(accessToken,
	model, 
	handler, userData, false);
}

static bool downloadFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(std::string, Error, void* )
	= reinterpret_cast<void(*)(std::string, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	std::string out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("std::string")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "std::string", "std::string");
			json_node_free(pJson);

			if ("std::string" == "std::string") {
				string* val = (std::string*)(&out);
				if (val->empty() && p_chunk.size>4) {
					*val = string(p_chunk.memory, p_chunk.size);
				}
			}
		} else {
			
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

static bool downloadFileHelper(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
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

	string url("/files/{file_id}/content");
	int pos;

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = downloadFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), downloadFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::downloadFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return downloadFileHelper(accessToken,
	fileId, 
	handler, userData, true);
}

bool OpenAIManager::downloadFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return downloadFileHelper(accessToken,
	fileId, 
	handler, userData, false);
}

static bool listFilesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListFilesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListFilesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListFilesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListFilesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListFilesResponse", "ListFilesResponse");
			json_node_free(pJson);

			if ("ListFilesResponse" == "std::string") {
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

static bool listFilesHelper(char * accessToken,
	
	void(* handler)(ListFilesResponse, Error, void* )
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

	string url("/files");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listFilesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFilesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::listFilesAsync(char * accessToken,
	
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData)
{
	return listFilesHelper(accessToken,
	
	handler, userData, true);
}

bool OpenAIManager::listFilesSync(char * accessToken,
	
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData)
{
	return listFilesHelper(accessToken,
	
	handler, userData, false);
}

static bool listFineTuneEventsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListFineTuneEventsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListFineTuneEventsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListFineTuneEventsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListFineTuneEventsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListFineTuneEventsResponse", "ListFineTuneEventsResponse");
			json_node_free(pJson);

			if ("ListFineTuneEventsResponse" == "std::string") {
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

static bool listFineTuneEventsHelper(char * accessToken,
	std::string fineTuneId, bool stream, 
	void(* handler)(ListFineTuneEventsResponse, Error, void* )
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
	

	itemAtq = stringify(&stream, "bool");
	queryParams.insert(pair<string, string>("stream", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("stream");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/fine-tunes/{fine_tune_id}/events");
	int pos;

	string s_fineTuneId("{");
	s_fineTuneId.append("fine_tune_id");
	s_fineTuneId.append("}");
	pos = url.find(s_fineTuneId);
	url.erase(pos, s_fineTuneId.length());
	url.insert(pos, stringify(&fineTuneId, "std::string"));

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listFineTuneEventsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFineTuneEventsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::listFineTuneEventsAsync(char * accessToken,
	std::string fineTuneId, bool stream, 
	void(* handler)(ListFineTuneEventsResponse, Error, void* )
	, void* userData)
{
	return listFineTuneEventsHelper(accessToken,
	fineTuneId, stream, 
	handler, userData, true);
}

bool OpenAIManager::listFineTuneEventsSync(char * accessToken,
	std::string fineTuneId, bool stream, 
	void(* handler)(ListFineTuneEventsResponse, Error, void* )
	, void* userData)
{
	return listFineTuneEventsHelper(accessToken,
	fineTuneId, stream, 
	handler, userData, false);
}

static bool listFineTunesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListFineTunesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListFineTunesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListFineTunesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListFineTunesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListFineTunesResponse", "ListFineTunesResponse");
			json_node_free(pJson);

			if ("ListFineTunesResponse" == "std::string") {
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

static bool listFineTunesHelper(char * accessToken,
	
	void(* handler)(ListFineTunesResponse, Error, void* )
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

	string url("/fine-tunes");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listFineTunesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFineTunesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::listFineTunesAsync(char * accessToken,
	
	void(* handler)(ListFineTunesResponse, Error, void* )
	, void* userData)
{
	return listFineTunesHelper(accessToken,
	
	handler, userData, true);
}

bool OpenAIManager::listFineTunesSync(char * accessToken,
	
	void(* handler)(ListFineTunesResponse, Error, void* )
	, void* userData)
{
	return listFineTunesHelper(accessToken,
	
	handler, userData, false);
}

static bool listModelsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListModelsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListModelsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListModelsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListModelsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListModelsResponse", "ListModelsResponse");
			json_node_free(pJson);

			if ("ListModelsResponse" == "std::string") {
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

static bool listModelsHelper(char * accessToken,
	
	void(* handler)(ListModelsResponse, Error, void* )
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

	string url("/models");
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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listModelsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listModelsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::listModelsAsync(char * accessToken,
	
	void(* handler)(ListModelsResponse, Error, void* )
	, void* userData)
{
	return listModelsHelper(accessToken,
	
	handler, userData, true);
}

bool OpenAIManager::listModelsSync(char * accessToken,
	
	void(* handler)(ListModelsResponse, Error, void* )
	, void* userData)
{
	return listModelsHelper(accessToken,
	
	handler, userData, false);
}

static bool retrieveFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(OpenAIFile, Error, void* )
	= reinterpret_cast<void(*)(OpenAIFile, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	OpenAIFile out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("OpenAIFile")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "OpenAIFile", "OpenAIFile");
			json_node_free(pJson);

			if ("OpenAIFile" == "std::string") {
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

static bool retrieveFileHelper(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
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

	string url("/files/{file_id}");
	int pos;

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::retrieveFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return retrieveFileHelper(accessToken,
	fileId, 
	handler, userData, true);
}

bool OpenAIManager::retrieveFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return retrieveFileHelper(accessToken,
	fileId, 
	handler, userData, false);
}

static bool retrieveFineTuneProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FineTune, Error, void* )
	= reinterpret_cast<void(*)(FineTune, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FineTune out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FineTune")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FineTune", "FineTune");
			json_node_free(pJson);

			if ("FineTune" == "std::string") {
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

static bool retrieveFineTuneHelper(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
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

	string url("/fine-tunes/{fine_tune_id}");
	int pos;

	string s_fineTuneId("{");
	s_fineTuneId.append("fine_tune_id");
	s_fineTuneId.append("}");
	pos = url.find(s_fineTuneId);
	url.erase(pos, s_fineTuneId.length());
	url.insert(pos, stringify(&fineTuneId, "std::string"));

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveFineTuneProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveFineTuneProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::retrieveFineTuneAsync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData)
{
	return retrieveFineTuneHelper(accessToken,
	fineTuneId, 
	handler, userData, true);
}

bool OpenAIManager::retrieveFineTuneSync(char * accessToken,
	std::string fineTuneId, 
	void(* handler)(FineTune, Error, void* )
	, void* userData)
{
	return retrieveFineTuneHelper(accessToken,
	fineTuneId, 
	handler, userData, false);
}

static bool retrieveModelProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Model, Error, void* )
	= reinterpret_cast<void(*)(Model, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Model out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Model")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Model", "Model");
			json_node_free(pJson);

			if ("Model" == "std::string") {
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

static bool retrieveModelHelper(char * accessToken,
	std::string model, 
	void(* handler)(Model, Error, void* )
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

	string url("/models/{model}");
	int pos;

	string s_model("{");
	s_model.append("model");
	s_model.append("}");
	pos = url.find(s_model);
	url.erase(pos, s_model.length());
	url.insert(pos, stringify(&model, "std::string"));

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
		NetClient::easycurl(OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveModelProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (OpenAIManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveModelProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __OpenAIManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool OpenAIManager::retrieveModelAsync(char * accessToken,
	std::string model, 
	void(* handler)(Model, Error, void* )
	, void* userData)
{
	return retrieveModelHelper(accessToken,
	model, 
	handler, userData, true);
}

bool OpenAIManager::retrieveModelSync(char * accessToken,
	std::string model, 
	void(* handler)(Model, Error, void* )
	, void* userData)
{
	return retrieveModelHelper(accessToken,
	model, 
	handler, userData, false);
}

