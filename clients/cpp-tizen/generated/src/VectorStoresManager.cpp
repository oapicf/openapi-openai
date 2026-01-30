#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "VectorStoresManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


VectorStoresManager::VectorStoresManager()
{

}

VectorStoresManager::~VectorStoresManager()
{

}

static gboolean __VectorStoresManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __VectorStoresManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__VectorStoresManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool cancelVectorStoreFileBatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreFileBatchObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreFileBatchObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreFileBatchObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreFileBatchObject", "VectorStoreFileBatchObject");
			json_node_free(pJson);

			if ("VectorStoreFileBatchObject" == "std::string") {
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

static bool cancelVectorStoreFileBatchHelper(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
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

	string url("/vector_stores/{vector_store_id}/file_batches/{batch_id}/cancel");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));
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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelVectorStoreFileBatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelVectorStoreFileBatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::cancelVectorStoreFileBatchAsync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData)
{
	return cancelVectorStoreFileBatchHelper(accessToken,
	vectorStoreId, batchId, 
	handler, userData, true);
}

bool VectorStoresManager::cancelVectorStoreFileBatchSync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData)
{
	return cancelVectorStoreFileBatchHelper(accessToken,
	vectorStoreId, batchId, 
	handler, userData, false);
}

static bool createVectorStoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreObject", "VectorStoreObject");
			json_node_free(pJson);

			if ("VectorStoreObject" == "std::string") {
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

static bool createVectorStoreHelper(char * accessToken,
	std::shared_ptr<CreateVectorStoreRequest> createVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
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

	if (isprimitive("CreateVectorStoreRequest")) {
		node = converttoJson(&createVectorStoreRequest, "CreateVectorStoreRequest", "");
	}
	
	char *jsonStr =  createVectorStoreRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/vector_stores");
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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createVectorStoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createVectorStoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::createVectorStoreAsync(char * accessToken,
	std::shared_ptr<CreateVectorStoreRequest> createVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData)
{
	return createVectorStoreHelper(accessToken,
	createVectorStoreRequest, 
	handler, userData, true);
}

bool VectorStoresManager::createVectorStoreSync(char * accessToken,
	std::shared_ptr<CreateVectorStoreRequest> createVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData)
{
	return createVectorStoreHelper(accessToken,
	createVectorStoreRequest, 
	handler, userData, false);
}

static bool createVectorStoreFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreFileObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreFileObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreFileObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreFileObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreFileObject", "VectorStoreFileObject");
			json_node_free(pJson);

			if ("VectorStoreFileObject" == "std::string") {
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

static bool createVectorStoreFileHelper(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileRequest> createVectorStoreFileRequest, 
	void(* handler)(VectorStoreFileObject, Error, void* )
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

	if (isprimitive("CreateVectorStoreFileRequest")) {
		node = converttoJson(&createVectorStoreFileRequest, "CreateVectorStoreFileRequest", "");
	}
	
	char *jsonStr =  createVectorStoreFileRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/vector_stores/{vector_store_id}/files");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));

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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createVectorStoreFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createVectorStoreFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::createVectorStoreFileAsync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileRequest> createVectorStoreFileRequest, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData)
{
	return createVectorStoreFileHelper(accessToken,
	vectorStoreId, createVectorStoreFileRequest, 
	handler, userData, true);
}

bool VectorStoresManager::createVectorStoreFileSync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileRequest> createVectorStoreFileRequest, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData)
{
	return createVectorStoreFileHelper(accessToken,
	vectorStoreId, createVectorStoreFileRequest, 
	handler, userData, false);
}

static bool createVectorStoreFileBatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreFileBatchObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreFileBatchObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreFileBatchObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreFileBatchObject", "VectorStoreFileBatchObject");
			json_node_free(pJson);

			if ("VectorStoreFileBatchObject" == "std::string") {
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

static bool createVectorStoreFileBatchHelper(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileBatchRequest> createVectorStoreFileBatchRequest, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
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

	if (isprimitive("CreateVectorStoreFileBatchRequest")) {
		node = converttoJson(&createVectorStoreFileBatchRequest, "CreateVectorStoreFileBatchRequest", "");
	}
	
	char *jsonStr =  createVectorStoreFileBatchRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/vector_stores/{vector_store_id}/file_batches");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));

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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createVectorStoreFileBatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createVectorStoreFileBatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::createVectorStoreFileBatchAsync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileBatchRequest> createVectorStoreFileBatchRequest, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData)
{
	return createVectorStoreFileBatchHelper(accessToken,
	vectorStoreId, createVectorStoreFileBatchRequest, 
	handler, userData, true);
}

bool VectorStoresManager::createVectorStoreFileBatchSync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<CreateVectorStoreFileBatchRequest> createVectorStoreFileBatchRequest, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData)
{
	return createVectorStoreFileBatchHelper(accessToken,
	vectorStoreId, createVectorStoreFileBatchRequest, 
	handler, userData, false);
}

static bool deleteVectorStoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteVectorStoreResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteVectorStoreResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteVectorStoreResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteVectorStoreResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteVectorStoreResponse", "DeleteVectorStoreResponse");
			json_node_free(pJson);

			if ("DeleteVectorStoreResponse" == "std::string") {
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

static bool deleteVectorStoreHelper(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(DeleteVectorStoreResponse, Error, void* )
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

	string url("/vector_stores/{vector_store_id}");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));

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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteVectorStoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteVectorStoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::deleteVectorStoreAsync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(DeleteVectorStoreResponse, Error, void* )
	, void* userData)
{
	return deleteVectorStoreHelper(accessToken,
	vectorStoreId, 
	handler, userData, true);
}

bool VectorStoresManager::deleteVectorStoreSync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(DeleteVectorStoreResponse, Error, void* )
	, void* userData)
{
	return deleteVectorStoreHelper(accessToken,
	vectorStoreId, 
	handler, userData, false);
}

static bool deleteVectorStoreFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(DeleteVectorStoreFileResponse, Error, void* )
	= reinterpret_cast<void(*)(DeleteVectorStoreFileResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	DeleteVectorStoreFileResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("DeleteVectorStoreFileResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "DeleteVectorStoreFileResponse", "DeleteVectorStoreFileResponse");
			json_node_free(pJson);

			if ("DeleteVectorStoreFileResponse" == "std::string") {
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

static bool deleteVectorStoreFileHelper(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(DeleteVectorStoreFileResponse, Error, void* )
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

	string url("/vector_stores/{vector_store_id}/files/{file_id}");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));
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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteVectorStoreFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteVectorStoreFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::deleteVectorStoreFileAsync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(DeleteVectorStoreFileResponse, Error, void* )
	, void* userData)
{
	return deleteVectorStoreFileHelper(accessToken,
	vectorStoreId, fileId, 
	handler, userData, true);
}

bool VectorStoresManager::deleteVectorStoreFileSync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(DeleteVectorStoreFileResponse, Error, void* )
	, void* userData)
{
	return deleteVectorStoreFileHelper(accessToken,
	vectorStoreId, fileId, 
	handler, userData, false);
}

static bool getVectorStoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreObject", "VectorStoreObject");
			json_node_free(pJson);

			if ("VectorStoreObject" == "std::string") {
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

static bool getVectorStoreHelper(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(VectorStoreObject, Error, void* )
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

	string url("/vector_stores/{vector_store_id}");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));

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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVectorStoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVectorStoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::getVectorStoreAsync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData)
{
	return getVectorStoreHelper(accessToken,
	vectorStoreId, 
	handler, userData, true);
}

bool VectorStoresManager::getVectorStoreSync(char * accessToken,
	std::string vectorStoreId, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData)
{
	return getVectorStoreHelper(accessToken,
	vectorStoreId, 
	handler, userData, false);
}

static bool getVectorStoreFileProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreFileObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreFileObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreFileObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreFileObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreFileObject", "VectorStoreFileObject");
			json_node_free(pJson);

			if ("VectorStoreFileObject" == "std::string") {
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

static bool getVectorStoreFileHelper(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(VectorStoreFileObject, Error, void* )
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

	string url("/vector_stores/{vector_store_id}/files/{file_id}");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));
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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVectorStoreFileProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVectorStoreFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::getVectorStoreFileAsync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData)
{
	return getVectorStoreFileHelper(accessToken,
	vectorStoreId, fileId, 
	handler, userData, true);
}

bool VectorStoresManager::getVectorStoreFileSync(char * accessToken,
	std::string vectorStoreId, std::string fileId, 
	void(* handler)(VectorStoreFileObject, Error, void* )
	, void* userData)
{
	return getVectorStoreFileHelper(accessToken,
	vectorStoreId, fileId, 
	handler, userData, false);
}

static bool getVectorStoreFileBatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreFileBatchObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreFileBatchObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreFileBatchObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreFileBatchObject", "VectorStoreFileBatchObject");
			json_node_free(pJson);

			if ("VectorStoreFileBatchObject" == "std::string") {
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

static bool getVectorStoreFileBatchHelper(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
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

	string url("/vector_stores/{vector_store_id}/file_batches/{batch_id}");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));
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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = getVectorStoreFileBatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), getVectorStoreFileBatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::getVectorStoreFileBatchAsync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData)
{
	return getVectorStoreFileBatchHelper(accessToken,
	vectorStoreId, batchId, 
	handler, userData, true);
}

bool VectorStoresManager::getVectorStoreFileBatchSync(char * accessToken,
	std::string vectorStoreId, std::string batchId, 
	void(* handler)(VectorStoreFileBatchObject, Error, void* )
	, void* userData)
{
	return getVectorStoreFileBatchHelper(accessToken,
	vectorStoreId, batchId, 
	handler, userData, false);
}

static bool listFilesInVectorStoreBatchProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListVectorStoreFilesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListVectorStoreFilesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListVectorStoreFilesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListVectorStoreFilesResponse", "ListVectorStoreFilesResponse");
			json_node_free(pJson);

			if ("ListVectorStoreFilesResponse" == "std::string") {
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

static bool listFilesInVectorStoreBatchHelper(char * accessToken,
	std::string vectorStoreId, std::string batchId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
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


	itemAtq = stringify(&filter, "std::string");
	queryParams.insert(pair<string, string>("filter", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("filter");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/vector_stores/{vector_store_id}/file_batches/{batch_id}/files");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));
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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listFilesInVectorStoreBatchProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFilesInVectorStoreBatchProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::listFilesInVectorStoreBatchAsync(char * accessToken,
	std::string vectorStoreId, std::string batchId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData)
{
	return listFilesInVectorStoreBatchHelper(accessToken,
	vectorStoreId, batchId, limit, order, after, before, filter, 
	handler, userData, true);
}

bool VectorStoresManager::listFilesInVectorStoreBatchSync(char * accessToken,
	std::string vectorStoreId, std::string batchId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData)
{
	return listFilesInVectorStoreBatchHelper(accessToken,
	vectorStoreId, batchId, limit, order, after, before, filter, 
	handler, userData, false);
}

static bool listVectorStoreFilesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	= reinterpret_cast<void(*)(ListVectorStoreFilesResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListVectorStoreFilesResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListVectorStoreFilesResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListVectorStoreFilesResponse", "ListVectorStoreFilesResponse");
			json_node_free(pJson);

			if ("ListVectorStoreFilesResponse" == "std::string") {
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

static bool listVectorStoreFilesHelper(char * accessToken,
	std::string vectorStoreId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
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


	itemAtq = stringify(&filter, "std::string");
	queryParams.insert(pair<string, string>("filter", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("filter");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/vector_stores/{vector_store_id}/files");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));

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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listVectorStoreFilesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listVectorStoreFilesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::listVectorStoreFilesAsync(char * accessToken,
	std::string vectorStoreId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData)
{
	return listVectorStoreFilesHelper(accessToken,
	vectorStoreId, limit, order, after, before, filter, 
	handler, userData, true);
}

bool VectorStoresManager::listVectorStoreFilesSync(char * accessToken,
	std::string vectorStoreId, int limit, std::string order, std::string after, std::string before, std::string filter, 
	void(* handler)(ListVectorStoreFilesResponse, Error, void* )
	, void* userData)
{
	return listVectorStoreFilesHelper(accessToken,
	vectorStoreId, limit, order, after, before, filter, 
	handler, userData, false);
}

static bool listVectorStoresProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListVectorStoresResponse, Error, void* )
	= reinterpret_cast<void(*)(ListVectorStoresResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListVectorStoresResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListVectorStoresResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListVectorStoresResponse", "ListVectorStoresResponse");
			json_node_free(pJson);

			if ("ListVectorStoresResponse" == "std::string") {
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

static bool listVectorStoresHelper(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListVectorStoresResponse, Error, void* )
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

	string url("/vector_stores");
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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listVectorStoresProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listVectorStoresProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::listVectorStoresAsync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListVectorStoresResponse, Error, void* )
	, void* userData)
{
	return listVectorStoresHelper(accessToken,
	limit, order, after, before, 
	handler, userData, true);
}

bool VectorStoresManager::listVectorStoresSync(char * accessToken,
	int limit, std::string order, std::string after, std::string before, 
	void(* handler)(ListVectorStoresResponse, Error, void* )
	, void* userData)
{
	return listVectorStoresHelper(accessToken,
	limit, order, after, before, 
	handler, userData, false);
}

static bool modifyVectorStoreProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(VectorStoreObject, Error, void* )
	= reinterpret_cast<void(*)(VectorStoreObject, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	VectorStoreObject out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("VectorStoreObject")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "VectorStoreObject", "VectorStoreObject");
			json_node_free(pJson);

			if ("VectorStoreObject" == "std::string") {
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

static bool modifyVectorStoreHelper(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<UpdateVectorStoreRequest> updateVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
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

	if (isprimitive("UpdateVectorStoreRequest")) {
		node = converttoJson(&updateVectorStoreRequest, "UpdateVectorStoreRequest", "");
	}
	
	char *jsonStr =  updateVectorStoreRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/vector_stores/{vector_store_id}");
	int pos;

	string s_vectorStoreId("{");
	s_vectorStoreId.append("vector_store_id");
	s_vectorStoreId.append("}");
	pos = url.find(s_vectorStoreId);
	url.erase(pos, s_vectorStoreId.length());
	url.insert(pos, stringify(&vectorStoreId, "std::string"));

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
		NetClient::easycurl(VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyVectorStoreProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (VectorStoresManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyVectorStoreProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __VectorStoresManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool VectorStoresManager::modifyVectorStoreAsync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<UpdateVectorStoreRequest> updateVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData)
{
	return modifyVectorStoreHelper(accessToken,
	vectorStoreId, updateVectorStoreRequest, 
	handler, userData, true);
}

bool VectorStoresManager::modifyVectorStoreSync(char * accessToken,
	std::string vectorStoreId, std::shared_ptr<UpdateVectorStoreRequest> updateVectorStoreRequest, 
	void(* handler)(VectorStoreObject, Error, void* )
	, void* userData)
{
	return modifyVectorStoreHelper(accessToken,
	vectorStoreId, updateVectorStoreRequest, 
	handler, userData, false);
}

