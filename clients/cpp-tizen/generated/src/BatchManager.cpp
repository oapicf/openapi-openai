#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "BatchManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


BatchManager::BatchManager()
{

}

BatchManager::~BatchManager()
{

}

static gboolean __BatchManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __BatchManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__BatchManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool cancelBatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Batch, Error, void* )
	= reinterpret_cast<void(*)(Batch, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Batch out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Batch")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Batch", "Batch");
			json_node_free(pJson);

			if ("Batch" == "std::string") {
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

static bool cancelBatchHelper(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
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

	string url("/batches/{batch_id}/cancel");
	int pos;

	string s_batchId("{");
	s_batchId.append("batch_id");
	s_batchId.append("}");
	pos = url.find(s_batchId);
	url.erase(pos, s_batchId.length());
	url.insert(pos, stringify(&batchId, "std::string"));

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
		NetClient::easycurl(BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelBatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelBatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BatchManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BatchManager::cancelBatchAsync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData)
{
	return cancelBatchHelper(accessToken,
	batchId, 
	handler, userData, true);
}

bool BatchManager::cancelBatchSync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData)
{
	return cancelBatchHelper(accessToken,
	batchId, 
	handler, userData, false);
}

static bool createBatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Batch, Error, void* )
	= reinterpret_cast<void(*)(Batch, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Batch out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Batch")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Batch", "Batch");
			json_node_free(pJson);

			if ("Batch" == "std::string") {
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

static bool createBatchHelper(char * accessToken,
	std::shared_ptr<CreateBatch_request> createBatchRequest, 
	void(* handler)(Batch, Error, void* )
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

	if (isprimitive("CreateBatch_request")) {
		node = converttoJson(&createBatchRequest, "CreateBatch_request", "");
	}
	
	char *jsonStr =  createBatchRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/batches");
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
		NetClient::easycurl(BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createBatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createBatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BatchManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BatchManager::createBatchAsync(char * accessToken,
	std::shared_ptr<CreateBatch_request> createBatchRequest, 
	void(* handler)(Batch, Error, void* )
	, void* userData)
{
	return createBatchHelper(accessToken,
	createBatchRequest, 
	handler, userData, true);
}

bool BatchManager::createBatchSync(char * accessToken,
	std::shared_ptr<CreateBatch_request> createBatchRequest, 
	void(* handler)(Batch, Error, void* )
	, void* userData)
{
	return createBatchHelper(accessToken,
	createBatchRequest, 
	handler, userData, false);
}

static bool listBatchesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListBatchesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListBatchesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListBatchesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListBatchesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListBatchesResponse", "ListBatchesResponse");
			json_node_free(pJson);

			if ("ListBatchesResponse" == "std::string") {
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

static bool listBatchesHelper(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListBatchesResponse, Error, void* )
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
	

	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}


	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/batches");
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
		NetClient::easycurl(BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listBatchesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listBatchesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BatchManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BatchManager::listBatchesAsync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListBatchesResponse, Error, void* )
	, void* userData)
{
	return listBatchesHelper(accessToken,
	after, limit, 
	handler, userData, true);
}

bool BatchManager::listBatchesSync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListBatchesResponse, Error, void* )
	, void* userData)
{
	return listBatchesHelper(accessToken,
	after, limit, 
	handler, userData, false);
}

static bool retrieveBatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Batch, Error, void* )
	= reinterpret_cast<void(*)(Batch, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Batch out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Batch")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Batch", "Batch");
			json_node_free(pJson);

			if ("Batch" == "std::string") {
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

static bool retrieveBatchHelper(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
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

	string url("/batches/{batch_id}");
	int pos;

	string s_batchId("{");
	s_batchId.append("batch_id");
	s_batchId.append("}");
	pos = url.find(s_batchId);
	url.erase(pos, s_batchId.length());
	url.insert(pos, stringify(&batchId, "std::string"));

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
		NetClient::easycurl(BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveBatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (BatchManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveBatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __BatchManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool BatchManager::retrieveBatchAsync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData)
{
	return retrieveBatchHelper(accessToken,
	batchId, 
	handler, userData, true);
}

bool BatchManager::retrieveBatchSync(char * accessToken,
	std::string batchId, 
	void(* handler)(Batch, Error, void* )
	, void* userData)
{
	return retrieveBatchHelper(accessToken,
	batchId, 
	handler, userData, false);
}

