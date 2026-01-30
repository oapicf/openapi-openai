#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "DefaultManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


DefaultManager::DefaultManager()
{

}

DefaultManager::~DefaultManager()
{

}

static gboolean __DefaultManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __DefaultManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__DefaultManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool adminApiKeysCreateProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdminApiKey, Error, void* )
	= reinterpret_cast<void(*)(AdminApiKey, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdminApiKey out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdminApiKey")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdminApiKey", "AdminApiKey");
			json_node_free(pJson);

			if ("AdminApiKey" == "std::string") {
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

static bool adminApiKeysCreateHelper(char * accessToken,
	std::shared_ptr<Admin_api_keys_create_request> adminApiKeysCreateRequest, 
	void(* handler)(AdminApiKey, Error, void* )
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

	if (isprimitive("Admin_api_keys_create_request")) {
		node = converttoJson(&adminApiKeysCreateRequest, "Admin_api_keys_create_request", "");
	}
	
	char *jsonStr =  adminApiKeysCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/admin_api_keys");
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
		NetClient::easycurl(DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adminApiKeysCreateProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adminApiKeysCreateProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DefaultManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DefaultManager::adminApiKeysCreateAsync(char * accessToken,
	std::shared_ptr<Admin_api_keys_create_request> adminApiKeysCreateRequest, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData)
{
	return adminApiKeysCreateHelper(accessToken,
	adminApiKeysCreateRequest, 
	handler, userData, true);
}

bool DefaultManager::adminApiKeysCreateSync(char * accessToken,
	std::shared_ptr<Admin_api_keys_create_request> adminApiKeysCreateRequest, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData)
{
	return adminApiKeysCreateHelper(accessToken,
	adminApiKeysCreateRequest, 
	handler, userData, false);
}

static bool adminApiKeysDeleteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Admin_api_keys_delete_200_response, Error, void* )
	= reinterpret_cast<void(*)(Admin_api_keys_delete_200_response, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Admin_api_keys_delete_200_response out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Admin_api_keys_delete_200_response")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Admin_api_keys_delete_200_response", "Admin_api_keys_delete_200_response");
			json_node_free(pJson);

			if ("Admin_api_keys_delete_200_response" == "std::string") {
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

static bool adminApiKeysDeleteHelper(char * accessToken,
	std::string keyId, 
	void(* handler)(Admin_api_keys_delete_200_response, Error, void* )
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

	string url("/organization/admin_api_keys/{key_id}");
	int pos;

	string s_keyId("{");
	s_keyId.append("key_id");
	s_keyId.append("}");
	pos = url.find(s_keyId);
	url.erase(pos, s_keyId.length());
	url.insert(pos, stringify(&keyId, "std::string"));

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
		NetClient::easycurl(DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adminApiKeysDeleteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adminApiKeysDeleteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DefaultManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DefaultManager::adminApiKeysDeleteAsync(char * accessToken,
	std::string keyId, 
	void(* handler)(Admin_api_keys_delete_200_response, Error, void* )
	, void* userData)
{
	return adminApiKeysDeleteHelper(accessToken,
	keyId, 
	handler, userData, true);
}

bool DefaultManager::adminApiKeysDeleteSync(char * accessToken,
	std::string keyId, 
	void(* handler)(Admin_api_keys_delete_200_response, Error, void* )
	, void* userData)
{
	return adminApiKeysDeleteHelper(accessToken,
	keyId, 
	handler, userData, false);
}

static bool adminApiKeysGetProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(AdminApiKey, Error, void* )
	= reinterpret_cast<void(*)(AdminApiKey, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	AdminApiKey out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("AdminApiKey")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "AdminApiKey", "AdminApiKey");
			json_node_free(pJson);

			if ("AdminApiKey" == "std::string") {
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

static bool adminApiKeysGetHelper(char * accessToken,
	std::string keyId, 
	void(* handler)(AdminApiKey, Error, void* )
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

	string url("/organization/admin_api_keys/{key_id}");
	int pos;

	string s_keyId("{");
	s_keyId.append("key_id");
	s_keyId.append("}");
	pos = url.find(s_keyId);
	url.erase(pos, s_keyId.length());
	url.insert(pos, stringify(&keyId, "std::string"));

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
		NetClient::easycurl(DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adminApiKeysGetProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adminApiKeysGetProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DefaultManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DefaultManager::adminApiKeysGetAsync(char * accessToken,
	std::string keyId, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData)
{
	return adminApiKeysGetHelper(accessToken,
	keyId, 
	handler, userData, true);
}

bool DefaultManager::adminApiKeysGetSync(char * accessToken,
	std::string keyId, 
	void(* handler)(AdminApiKey, Error, void* )
	, void* userData)
{
	return adminApiKeysGetHelper(accessToken,
	keyId, 
	handler, userData, false);
}

static bool adminApiKeysListProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ApiKeyList, Error, void* )
	= reinterpret_cast<void(*)(ApiKeyList, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ApiKeyList out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ApiKeyList")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ApiKeyList", "ApiKeyList");
			json_node_free(pJson);

			if ("ApiKeyList" == "std::string") {
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

static bool adminApiKeysListHelper(char * accessToken,
	std::string after, std::string order, int limit, 
	void(* handler)(ApiKeyList, Error, void* )
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


	itemAtq = stringify(&order, "std::string");
	queryParams.insert(pair<string, string>("order", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("order");
	}


	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/admin_api_keys");
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
		NetClient::easycurl(DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = adminApiKeysListProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (DefaultManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), adminApiKeysListProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __DefaultManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool DefaultManager::adminApiKeysListAsync(char * accessToken,
	std::string after, std::string order, int limit, 
	void(* handler)(ApiKeyList, Error, void* )
	, void* userData)
{
	return adminApiKeysListHelper(accessToken,
	after, order, limit, 
	handler, userData, true);
}

bool DefaultManager::adminApiKeysListSync(char * accessToken,
	std::string after, std::string order, int limit, 
	void(* handler)(ApiKeyList, Error, void* )
	, void* userData)
{
	return adminApiKeysListHelper(accessToken,
	after, order, limit, 
	handler, userData, false);
}

