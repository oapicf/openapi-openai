#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "UsersManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


UsersManager::UsersManager()
{

}

UsersManager::~UsersManager()
{

}

static gboolean __UsersManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __UsersManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__UsersManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool deleteUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UserDeleteResponse, Error, void* )
	= reinterpret_cast<void(*)(UserDeleteResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UserDeleteResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UserDeleteResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UserDeleteResponse", "UserDeleteResponse");
			json_node_free(pJson);

			if ("UserDeleteResponse" == "std::string") {
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

static bool deleteUserHelper(char * accessToken,
	std::string userId, 
	void(* handler)(UserDeleteResponse, Error, void* )
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

	string url("/organization/users/{user_id}");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "std::string"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::deleteUserAsync(char * accessToken,
	std::string userId, 
	void(* handler)(UserDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteUserHelper(accessToken,
	userId, 
	handler, userData, true);
}

bool UsersManager::deleteUserSync(char * accessToken,
	std::string userId, 
	void(* handler)(UserDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteUserHelper(accessToken,
	userId, 
	handler, userData, false);
}

static bool listUsersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UserListResponse, Error, void* )
	= reinterpret_cast<void(*)(UserListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UserListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UserListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UserListResponse", "UserListResponse");
			json_node_free(pJson);

			if ("UserListResponse" == "std::string") {
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

static bool listUsersHelper(char * accessToken,
	int limit, std::string after, 
	void(* handler)(UserListResponse, Error, void* )
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


	itemAtq = stringify(&after, "std::string");
	queryParams.insert(pair<string, string>("after", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("after");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/users");
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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listUsersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listUsersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::listUsersAsync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(UserListResponse, Error, void* )
	, void* userData)
{
	return listUsersHelper(accessToken,
	limit, after, 
	handler, userData, true);
}

bool UsersManager::listUsersSync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(UserListResponse, Error, void* )
	, void* userData)
{
	return listUsersHelper(accessToken,
	limit, after, 
	handler, userData, false);
}

static bool modifyUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(User, Error, void* )
	= reinterpret_cast<void(*)(User, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	User out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("User")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "User", "User");
			json_node_free(pJson);

			if ("User" == "std::string") {
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

static bool modifyUserHelper(char * accessToken,
	std::string userId, std::shared_ptr<UserRoleUpdateRequest> userRoleUpdateRequest, 
	void(* handler)(User, Error, void* )
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

	if (isprimitive("UserRoleUpdateRequest")) {
		node = converttoJson(&userRoleUpdateRequest, "UserRoleUpdateRequest", "");
	}
	
	char *jsonStr =  userRoleUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/users/{user_id}");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "std::string"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::modifyUserAsync(char * accessToken,
	std::string userId, std::shared_ptr<UserRoleUpdateRequest> userRoleUpdateRequest, 
	void(* handler)(User, Error, void* )
	, void* userData)
{
	return modifyUserHelper(accessToken,
	userId, userRoleUpdateRequest, 
	handler, userData, true);
}

bool UsersManager::modifyUserSync(char * accessToken,
	std::string userId, std::shared_ptr<UserRoleUpdateRequest> userRoleUpdateRequest, 
	void(* handler)(User, Error, void* )
	, void* userData)
{
	return modifyUserHelper(accessToken,
	userId, userRoleUpdateRequest, 
	handler, userData, false);
}

static bool retrieveUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(User, Error, void* )
	= reinterpret_cast<void(*)(User, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	User out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("User")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "User", "User");
			json_node_free(pJson);

			if ("User" == "std::string") {
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

static bool retrieveUserHelper(char * accessToken,
	std::string userId, 
	void(* handler)(User, Error, void* )
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

	string url("/organization/users/{user_id}");
	int pos;

	string s_userId("{");
	s_userId.append("user_id");
	s_userId.append("}");
	pos = url.find(s_userId);
	url.erase(pos, s_userId.length());
	url.insert(pos, stringify(&userId, "std::string"));

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
		NetClient::easycurl(UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsersManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsersManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsersManager::retrieveUserAsync(char * accessToken,
	std::string userId, 
	void(* handler)(User, Error, void* )
	, void* userData)
{
	return retrieveUserHelper(accessToken,
	userId, 
	handler, userData, true);
}

bool UsersManager::retrieveUserSync(char * accessToken,
	std::string userId, 
	void(* handler)(User, Error, void* )
	, void* userData)
{
	return retrieveUserHelper(accessToken,
	userId, 
	handler, userData, false);
}

