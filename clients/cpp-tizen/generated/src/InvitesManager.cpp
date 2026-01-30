#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "InvitesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


InvitesManager::InvitesManager()
{

}

InvitesManager::~InvitesManager()
{

}

static gboolean __InvitesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __InvitesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__InvitesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool deleteInviteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(InviteDeleteResponse, Error, void* )
	= reinterpret_cast<void(*)(InviteDeleteResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	InviteDeleteResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("InviteDeleteResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "InviteDeleteResponse", "InviteDeleteResponse");
			json_node_free(pJson);

			if ("InviteDeleteResponse" == "std::string") {
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

static bool deleteInviteHelper(char * accessToken,
	std::string inviteId, 
	void(* handler)(InviteDeleteResponse, Error, void* )
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

	string url("/organization/invites/{invite_id}");
	int pos;

	string s_inviteId("{");
	s_inviteId.append("invite_id");
	s_inviteId.append("}");
	pos = url.find(s_inviteId);
	url.erase(pos, s_inviteId.length());
	url.insert(pos, stringify(&inviteId, "std::string"));

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
		NetClient::easycurl(InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteInviteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteInviteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __InvitesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool InvitesManager::deleteInviteAsync(char * accessToken,
	std::string inviteId, 
	void(* handler)(InviteDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteInviteHelper(accessToken,
	inviteId, 
	handler, userData, true);
}

bool InvitesManager::deleteInviteSync(char * accessToken,
	std::string inviteId, 
	void(* handler)(InviteDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteInviteHelper(accessToken,
	inviteId, 
	handler, userData, false);
}

static bool inviteUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Invite, Error, void* )
	= reinterpret_cast<void(*)(Invite, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Invite out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Invite")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Invite", "Invite");
			json_node_free(pJson);

			if ("Invite" == "std::string") {
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

static bool inviteUserHelper(char * accessToken,
	std::shared_ptr<InviteRequest> inviteRequest, 
	void(* handler)(Invite, Error, void* )
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

	if (isprimitive("InviteRequest")) {
		node = converttoJson(&inviteRequest, "InviteRequest", "");
	}
	
	char *jsonStr =  inviteRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/invites");
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
		NetClient::easycurl(InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = inviteUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), inviteUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __InvitesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool InvitesManager::inviteUserAsync(char * accessToken,
	std::shared_ptr<InviteRequest> inviteRequest, 
	void(* handler)(Invite, Error, void* )
	, void* userData)
{
	return inviteUserHelper(accessToken,
	inviteRequest, 
	handler, userData, true);
}

bool InvitesManager::inviteUserSync(char * accessToken,
	std::shared_ptr<InviteRequest> inviteRequest, 
	void(* handler)(Invite, Error, void* )
	, void* userData)
{
	return inviteUserHelper(accessToken,
	inviteRequest, 
	handler, userData, false);
}

static bool listInvitesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(InviteListResponse, Error, void* )
	= reinterpret_cast<void(*)(InviteListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	InviteListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("InviteListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "InviteListResponse", "InviteListResponse");
			json_node_free(pJson);

			if ("InviteListResponse" == "std::string") {
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

static bool listInvitesHelper(char * accessToken,
	int limit, std::string after, 
	void(* handler)(InviteListResponse, Error, void* )
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

	string url("/organization/invites");
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
		NetClient::easycurl(InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listInvitesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listInvitesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __InvitesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool InvitesManager::listInvitesAsync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(InviteListResponse, Error, void* )
	, void* userData)
{
	return listInvitesHelper(accessToken,
	limit, after, 
	handler, userData, true);
}

bool InvitesManager::listInvitesSync(char * accessToken,
	int limit, std::string after, 
	void(* handler)(InviteListResponse, Error, void* )
	, void* userData)
{
	return listInvitesHelper(accessToken,
	limit, after, 
	handler, userData, false);
}

static bool retrieveInviteProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Invite, Error, void* )
	= reinterpret_cast<void(*)(Invite, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Invite out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Invite")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Invite", "Invite");
			json_node_free(pJson);

			if ("Invite" == "std::string") {
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

static bool retrieveInviteHelper(char * accessToken,
	std::string inviteId, 
	void(* handler)(Invite, Error, void* )
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

	string url("/organization/invites/{invite_id}");
	int pos;

	string s_inviteId("{");
	s_inviteId.append("invite_id");
	s_inviteId.append("}");
	pos = url.find(s_inviteId);
	url.erase(pos, s_inviteId.length());
	url.insert(pos, stringify(&inviteId, "std::string"));

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
		NetClient::easycurl(InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveInviteProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (InvitesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveInviteProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __InvitesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool InvitesManager::retrieveInviteAsync(char * accessToken,
	std::string inviteId, 
	void(* handler)(Invite, Error, void* )
	, void* userData)
{
	return retrieveInviteHelper(accessToken,
	inviteId, 
	handler, userData, true);
}

bool InvitesManager::retrieveInviteSync(char * accessToken,
	std::string inviteId, 
	void(* handler)(Invite, Error, void* )
	, void* userData)
{
	return retrieveInviteHelper(accessToken,
	inviteId, 
	handler, userData, false);
}

