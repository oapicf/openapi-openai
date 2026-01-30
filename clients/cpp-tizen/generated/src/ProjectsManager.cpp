#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ProjectsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ProjectsManager::ProjectsManager()
{

}

ProjectsManager::~ProjectsManager()
{

}

static gboolean __ProjectsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ProjectsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ProjectsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool archiveProjectProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Project, Error, void* )
	= reinterpret_cast<void(*)(Project, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Project out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Project")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Project", "Project");
			json_node_free(pJson);

			if ("Project" == "std::string") {
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

static bool archiveProjectHelper(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
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

	string url("/organization/projects/{project_id}/archive");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = archiveProjectProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), archiveProjectProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::archiveProjectAsync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return archiveProjectHelper(accessToken,
	projectId, 
	handler, userData, true);
}

bool ProjectsManager::archiveProjectSync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return archiveProjectHelper(accessToken,
	projectId, 
	handler, userData, false);
}

static bool createProjectProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Project, Error, void* )
	= reinterpret_cast<void(*)(Project, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Project out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Project")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Project", "Project");
			json_node_free(pJson);

			if ("Project" == "std::string") {
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

static bool createProjectHelper(char * accessToken,
	std::shared_ptr<ProjectCreateRequest> projectCreateRequest, 
	void(* handler)(Project, Error, void* )
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

	if (isprimitive("ProjectCreateRequest")) {
		node = converttoJson(&projectCreateRequest, "ProjectCreateRequest", "");
	}
	
	char *jsonStr =  projectCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/projects");
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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createProjectProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createProjectProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::createProjectAsync(char * accessToken,
	std::shared_ptr<ProjectCreateRequest> projectCreateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return createProjectHelper(accessToken,
	projectCreateRequest, 
	handler, userData, true);
}

bool ProjectsManager::createProjectSync(char * accessToken,
	std::shared_ptr<ProjectCreateRequest> projectCreateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return createProjectHelper(accessToken,
	projectCreateRequest, 
	handler, userData, false);
}

static bool createProjectServiceAccountProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectServiceAccountCreateResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectServiceAccountCreateResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectServiceAccountCreateResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectServiceAccountCreateResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectServiceAccountCreateResponse", "ProjectServiceAccountCreateResponse");
			json_node_free(pJson);

			if ("ProjectServiceAccountCreateResponse" == "std::string") {
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

static bool createProjectServiceAccountHelper(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectServiceAccountCreateRequest> projectServiceAccountCreateRequest, 
	void(* handler)(ProjectServiceAccountCreateResponse, Error, void* )
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

	if (isprimitive("ProjectServiceAccountCreateRequest")) {
		node = converttoJson(&projectServiceAccountCreateRequest, "ProjectServiceAccountCreateRequest", "");
	}
	
	char *jsonStr =  projectServiceAccountCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/projects/{project_id}/service_accounts");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createProjectServiceAccountProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createProjectServiceAccountProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::createProjectServiceAccountAsync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectServiceAccountCreateRequest> projectServiceAccountCreateRequest, 
	void(* handler)(ProjectServiceAccountCreateResponse, Error, void* )
	, void* userData)
{
	return createProjectServiceAccountHelper(accessToken,
	projectId, projectServiceAccountCreateRequest, 
	handler, userData, true);
}

bool ProjectsManager::createProjectServiceAccountSync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectServiceAccountCreateRequest> projectServiceAccountCreateRequest, 
	void(* handler)(ProjectServiceAccountCreateResponse, Error, void* )
	, void* userData)
{
	return createProjectServiceAccountHelper(accessToken,
	projectId, projectServiceAccountCreateRequest, 
	handler, userData, false);
}

static bool createProjectUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectUser, Error, void* )
	= reinterpret_cast<void(*)(ProjectUser, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectUser out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectUser")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectUser", "ProjectUser");
			json_node_free(pJson);

			if ("ProjectUser" == "std::string") {
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

static bool createProjectUserHelper(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUserCreateRequest> projectUserCreateRequest, 
	void(* handler)(ProjectUser, Error, void* )
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

	if (isprimitive("ProjectUserCreateRequest")) {
		node = converttoJson(&projectUserCreateRequest, "ProjectUserCreateRequest", "");
	}
	
	char *jsonStr =  projectUserCreateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/projects/{project_id}/users");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createProjectUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createProjectUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::createProjectUserAsync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUserCreateRequest> projectUserCreateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData)
{
	return createProjectUserHelper(accessToken,
	projectId, projectUserCreateRequest, 
	handler, userData, true);
}

bool ProjectsManager::createProjectUserSync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUserCreateRequest> projectUserCreateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData)
{
	return createProjectUserHelper(accessToken,
	projectId, projectUserCreateRequest, 
	handler, userData, false);
}

static bool deleteProjectApiKeyProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectApiKeyDeleteResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectApiKeyDeleteResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectApiKeyDeleteResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectApiKeyDeleteResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectApiKeyDeleteResponse", "ProjectApiKeyDeleteResponse");
			json_node_free(pJson);

			if ("ProjectApiKeyDeleteResponse" == "std::string") {
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

static bool deleteProjectApiKeyHelper(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKeyDeleteResponse, Error, void* )
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

	string url("/organization/projects/{project_id}/api_keys/{key_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteProjectApiKeyProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteProjectApiKeyProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::deleteProjectApiKeyAsync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKeyDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteProjectApiKeyHelper(accessToken,
	projectId, keyId, 
	handler, userData, true);
}

bool ProjectsManager::deleteProjectApiKeySync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKeyDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteProjectApiKeyHelper(accessToken,
	projectId, keyId, 
	handler, userData, false);
}

static bool deleteProjectServiceAccountProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectServiceAccountDeleteResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectServiceAccountDeleteResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectServiceAccountDeleteResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectServiceAccountDeleteResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectServiceAccountDeleteResponse", "ProjectServiceAccountDeleteResponse");
			json_node_free(pJson);

			if ("ProjectServiceAccountDeleteResponse" == "std::string") {
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

static bool deleteProjectServiceAccountHelper(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccountDeleteResponse, Error, void* )
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

	string url("/organization/projects/{project_id}/service_accounts/{service_account_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
	string s_serviceAccountId("{");
	s_serviceAccountId.append("service_account_id");
	s_serviceAccountId.append("}");
	pos = url.find(s_serviceAccountId);
	url.erase(pos, s_serviceAccountId.length());
	url.insert(pos, stringify(&serviceAccountId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteProjectServiceAccountProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteProjectServiceAccountProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::deleteProjectServiceAccountAsync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccountDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteProjectServiceAccountHelper(accessToken,
	projectId, serviceAccountId, 
	handler, userData, true);
}

bool ProjectsManager::deleteProjectServiceAccountSync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccountDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteProjectServiceAccountHelper(accessToken,
	projectId, serviceAccountId, 
	handler, userData, false);
}

static bool deleteProjectUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectUserDeleteResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectUserDeleteResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectUserDeleteResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectUserDeleteResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectUserDeleteResponse", "ProjectUserDeleteResponse");
			json_node_free(pJson);

			if ("ProjectUserDeleteResponse" == "std::string") {
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

static bool deleteProjectUserHelper(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUserDeleteResponse, Error, void* )
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

	string url("/organization/projects/{project_id}/users/{user_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = deleteProjectUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteProjectUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::deleteProjectUserAsync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUserDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteProjectUserHelper(accessToken,
	projectId, userId, 
	handler, userData, true);
}

bool ProjectsManager::deleteProjectUserSync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUserDeleteResponse, Error, void* )
	, void* userData)
{
	return deleteProjectUserHelper(accessToken,
	projectId, userId, 
	handler, userData, false);
}

static bool listProjectApiKeysProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectApiKeyListResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectApiKeyListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectApiKeyListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectApiKeyListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectApiKeyListResponse", "ProjectApiKeyListResponse");
			json_node_free(pJson);

			if ("ProjectApiKeyListResponse" == "std::string") {
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

static bool listProjectApiKeysHelper(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectApiKeyListResponse, Error, void* )
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

	string url("/organization/projects/{project_id}/api_keys");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listProjectApiKeysProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listProjectApiKeysProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::listProjectApiKeysAsync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectApiKeyListResponse, Error, void* )
	, void* userData)
{
	return listProjectApiKeysHelper(accessToken,
	projectId, limit, after, 
	handler, userData, true);
}

bool ProjectsManager::listProjectApiKeysSync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectApiKeyListResponse, Error, void* )
	, void* userData)
{
	return listProjectApiKeysHelper(accessToken,
	projectId, limit, after, 
	handler, userData, false);
}

static bool listProjectRateLimitsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectRateLimitListResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectRateLimitListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectRateLimitListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectRateLimitListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectRateLimitListResponse", "ProjectRateLimitListResponse");
			json_node_free(pJson);

			if ("ProjectRateLimitListResponse" == "std::string") {
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

static bool listProjectRateLimitsHelper(char * accessToken,
	std::string projectId, int limit, std::string after, std::string before, 
	void(* handler)(ProjectRateLimitListResponse, Error, void* )
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


	itemAtq = stringify(&before, "std::string");
	queryParams.insert(pair<string, string>("before", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("before");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/projects/{project_id}/rate_limits");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listProjectRateLimitsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listProjectRateLimitsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::listProjectRateLimitsAsync(char * accessToken,
	std::string projectId, int limit, std::string after, std::string before, 
	void(* handler)(ProjectRateLimitListResponse, Error, void* )
	, void* userData)
{
	return listProjectRateLimitsHelper(accessToken,
	projectId, limit, after, before, 
	handler, userData, true);
}

bool ProjectsManager::listProjectRateLimitsSync(char * accessToken,
	std::string projectId, int limit, std::string after, std::string before, 
	void(* handler)(ProjectRateLimitListResponse, Error, void* )
	, void* userData)
{
	return listProjectRateLimitsHelper(accessToken,
	projectId, limit, after, before, 
	handler, userData, false);
}

static bool listProjectServiceAccountsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectServiceAccountListResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectServiceAccountListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectServiceAccountListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectServiceAccountListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectServiceAccountListResponse", "ProjectServiceAccountListResponse");
			json_node_free(pJson);

			if ("ProjectServiceAccountListResponse" == "std::string") {
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

static bool listProjectServiceAccountsHelper(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectServiceAccountListResponse, Error, void* )
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

	string url("/organization/projects/{project_id}/service_accounts");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listProjectServiceAccountsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listProjectServiceAccountsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::listProjectServiceAccountsAsync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectServiceAccountListResponse, Error, void* )
	, void* userData)
{
	return listProjectServiceAccountsHelper(accessToken,
	projectId, limit, after, 
	handler, userData, true);
}

bool ProjectsManager::listProjectServiceAccountsSync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectServiceAccountListResponse, Error, void* )
	, void* userData)
{
	return listProjectServiceAccountsHelper(accessToken,
	projectId, limit, after, 
	handler, userData, false);
}

static bool listProjectUsersProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectUserListResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectUserListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectUserListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectUserListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectUserListResponse", "ProjectUserListResponse");
			json_node_free(pJson);

			if ("ProjectUserListResponse" == "std::string") {
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

static bool listProjectUsersHelper(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectUserListResponse, Error, void* )
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

	string url("/organization/projects/{project_id}/users");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listProjectUsersProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listProjectUsersProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::listProjectUsersAsync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectUserListResponse, Error, void* )
	, void* userData)
{
	return listProjectUsersHelper(accessToken,
	projectId, limit, after, 
	handler, userData, true);
}

bool ProjectsManager::listProjectUsersSync(char * accessToken,
	std::string projectId, int limit, std::string after, 
	void(* handler)(ProjectUserListResponse, Error, void* )
	, void* userData)
{
	return listProjectUsersHelper(accessToken,
	projectId, limit, after, 
	handler, userData, false);
}

static bool listProjectsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectListResponse, Error, void* )
	= reinterpret_cast<void(*)(ProjectListResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectListResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectListResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectListResponse", "ProjectListResponse");
			json_node_free(pJson);

			if ("ProjectListResponse" == "std::string") {
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

static bool listProjectsHelper(char * accessToken,
	int limit, std::string after, bool includeArchived, 
	void(* handler)(ProjectListResponse, Error, void* )
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


	itemAtq = stringify(&includeArchived, "bool");
	queryParams.insert(pair<string, string>("include_archived", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("include_archived");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/projects");
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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listProjectsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listProjectsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::listProjectsAsync(char * accessToken,
	int limit, std::string after, bool includeArchived, 
	void(* handler)(ProjectListResponse, Error, void* )
	, void* userData)
{
	return listProjectsHelper(accessToken,
	limit, after, includeArchived, 
	handler, userData, true);
}

bool ProjectsManager::listProjectsSync(char * accessToken,
	int limit, std::string after, bool includeArchived, 
	void(* handler)(ProjectListResponse, Error, void* )
	, void* userData)
{
	return listProjectsHelper(accessToken,
	limit, after, includeArchived, 
	handler, userData, false);
}

static bool modifyProjectProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Project, Error, void* )
	= reinterpret_cast<void(*)(Project, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Project out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Project")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Project", "Project");
			json_node_free(pJson);

			if ("Project" == "std::string") {
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

static bool modifyProjectHelper(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUpdateRequest> projectUpdateRequest, 
	void(* handler)(Project, Error, void* )
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

	if (isprimitive("ProjectUpdateRequest")) {
		node = converttoJson(&projectUpdateRequest, "ProjectUpdateRequest", "");
	}
	
	char *jsonStr =  projectUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/projects/{project_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyProjectProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyProjectProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::modifyProjectAsync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUpdateRequest> projectUpdateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return modifyProjectHelper(accessToken,
	projectId, projectUpdateRequest, 
	handler, userData, true);
}

bool ProjectsManager::modifyProjectSync(char * accessToken,
	std::string projectId, std::shared_ptr<ProjectUpdateRequest> projectUpdateRequest, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return modifyProjectHelper(accessToken,
	projectId, projectUpdateRequest, 
	handler, userData, false);
}

static bool modifyProjectUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectUser, Error, void* )
	= reinterpret_cast<void(*)(ProjectUser, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectUser out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectUser")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectUser", "ProjectUser");
			json_node_free(pJson);

			if ("ProjectUser" == "std::string") {
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

static bool modifyProjectUserHelper(char * accessToken,
	std::string projectId, std::string userId, std::shared_ptr<ProjectUserUpdateRequest> projectUserUpdateRequest, 
	void(* handler)(ProjectUser, Error, void* )
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

	if (isprimitive("ProjectUserUpdateRequest")) {
		node = converttoJson(&projectUserUpdateRequest, "ProjectUserUpdateRequest", "");
	}
	
	char *jsonStr =  projectUserUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/projects/{project_id}/users/{user_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = modifyProjectUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), modifyProjectUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::modifyProjectUserAsync(char * accessToken,
	std::string projectId, std::string userId, std::shared_ptr<ProjectUserUpdateRequest> projectUserUpdateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData)
{
	return modifyProjectUserHelper(accessToken,
	projectId, userId, projectUserUpdateRequest, 
	handler, userData, true);
}

bool ProjectsManager::modifyProjectUserSync(char * accessToken,
	std::string projectId, std::string userId, std::shared_ptr<ProjectUserUpdateRequest> projectUserUpdateRequest, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData)
{
	return modifyProjectUserHelper(accessToken,
	projectId, userId, projectUserUpdateRequest, 
	handler, userData, false);
}

static bool retrieveProjectProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Project, Error, void* )
	= reinterpret_cast<void(*)(Project, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Project out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Project")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Project", "Project");
			json_node_free(pJson);

			if ("Project" == "std::string") {
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

static bool retrieveProjectHelper(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
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

	string url("/organization/projects/{project_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveProjectProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveProjectProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::retrieveProjectAsync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return retrieveProjectHelper(accessToken,
	projectId, 
	handler, userData, true);
}

bool ProjectsManager::retrieveProjectSync(char * accessToken,
	std::string projectId, 
	void(* handler)(Project, Error, void* )
	, void* userData)
{
	return retrieveProjectHelper(accessToken,
	projectId, 
	handler, userData, false);
}

static bool retrieveProjectApiKeyProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectApiKey, Error, void* )
	= reinterpret_cast<void(*)(ProjectApiKey, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectApiKey out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectApiKey")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectApiKey", "ProjectApiKey");
			json_node_free(pJson);

			if ("ProjectApiKey" == "std::string") {
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

static bool retrieveProjectApiKeyHelper(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKey, Error, void* )
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

	string url("/organization/projects/{project_id}/api_keys/{key_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveProjectApiKeyProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveProjectApiKeyProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::retrieveProjectApiKeyAsync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKey, Error, void* )
	, void* userData)
{
	return retrieveProjectApiKeyHelper(accessToken,
	projectId, keyId, 
	handler, userData, true);
}

bool ProjectsManager::retrieveProjectApiKeySync(char * accessToken,
	std::string projectId, std::string keyId, 
	void(* handler)(ProjectApiKey, Error, void* )
	, void* userData)
{
	return retrieveProjectApiKeyHelper(accessToken,
	projectId, keyId, 
	handler, userData, false);
}

static bool retrieveProjectServiceAccountProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectServiceAccount, Error, void* )
	= reinterpret_cast<void(*)(ProjectServiceAccount, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectServiceAccount out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectServiceAccount")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectServiceAccount", "ProjectServiceAccount");
			json_node_free(pJson);

			if ("ProjectServiceAccount" == "std::string") {
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

static bool retrieveProjectServiceAccountHelper(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccount, Error, void* )
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

	string url("/organization/projects/{project_id}/service_accounts/{service_account_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
	string s_serviceAccountId("{");
	s_serviceAccountId.append("service_account_id");
	s_serviceAccountId.append("}");
	pos = url.find(s_serviceAccountId);
	url.erase(pos, s_serviceAccountId.length());
	url.insert(pos, stringify(&serviceAccountId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveProjectServiceAccountProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveProjectServiceAccountProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::retrieveProjectServiceAccountAsync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccount, Error, void* )
	, void* userData)
{
	return retrieveProjectServiceAccountHelper(accessToken,
	projectId, serviceAccountId, 
	handler, userData, true);
}

bool ProjectsManager::retrieveProjectServiceAccountSync(char * accessToken,
	std::string projectId, std::string serviceAccountId, 
	void(* handler)(ProjectServiceAccount, Error, void* )
	, void* userData)
{
	return retrieveProjectServiceAccountHelper(accessToken,
	projectId, serviceAccountId, 
	handler, userData, false);
}

static bool retrieveProjectUserProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectUser, Error, void* )
	= reinterpret_cast<void(*)(ProjectUser, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectUser out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectUser")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectUser", "ProjectUser");
			json_node_free(pJson);

			if ("ProjectUser" == "std::string") {
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

static bool retrieveProjectUserHelper(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUser, Error, void* )
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

	string url("/organization/projects/{project_id}/users/{user_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveProjectUserProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveProjectUserProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::retrieveProjectUserAsync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData)
{
	return retrieveProjectUserHelper(accessToken,
	projectId, userId, 
	handler, userData, true);
}

bool ProjectsManager::retrieveProjectUserSync(char * accessToken,
	std::string projectId, std::string userId, 
	void(* handler)(ProjectUser, Error, void* )
	, void* userData)
{
	return retrieveProjectUserHelper(accessToken,
	projectId, userId, 
	handler, userData, false);
}

static bool updateProjectRateLimitsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ProjectRateLimit, Error, void* )
	= reinterpret_cast<void(*)(ProjectRateLimit, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ProjectRateLimit out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ProjectRateLimit")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ProjectRateLimit", "ProjectRateLimit");
			json_node_free(pJson);

			if ("ProjectRateLimit" == "std::string") {
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

static bool updateProjectRateLimitsHelper(char * accessToken,
	std::string projectId, std::string rateLimitId, std::shared_ptr<ProjectRateLimitUpdateRequest> projectRateLimitUpdateRequest, 
	void(* handler)(ProjectRateLimit, Error, void* )
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

	if (isprimitive("ProjectRateLimitUpdateRequest")) {
		node = converttoJson(&projectRateLimitUpdateRequest, "ProjectRateLimitUpdateRequest", "");
	}
	
	char *jsonStr =  projectRateLimitUpdateRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/organization/projects/{project_id}/rate_limits/{rate_limit_id}");
	int pos;

	string s_projectId("{");
	s_projectId.append("project_id");
	s_projectId.append("}");
	pos = url.find(s_projectId);
	url.erase(pos, s_projectId.length());
	url.insert(pos, stringify(&projectId, "std::string"));
	string s_rateLimitId("{");
	s_rateLimitId.append("rate_limit_id");
	s_rateLimitId.append("}");
	pos = url.find(s_rateLimitId);
	url.erase(pos, s_rateLimitId.length());
	url.insert(pos, stringify(&rateLimitId, "std::string"));

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
		NetClient::easycurl(ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = updateProjectRateLimitsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (ProjectsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), updateProjectRateLimitsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ProjectsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ProjectsManager::updateProjectRateLimitsAsync(char * accessToken,
	std::string projectId, std::string rateLimitId, std::shared_ptr<ProjectRateLimitUpdateRequest> projectRateLimitUpdateRequest, 
	void(* handler)(ProjectRateLimit, Error, void* )
	, void* userData)
{
	return updateProjectRateLimitsHelper(accessToken,
	projectId, rateLimitId, projectRateLimitUpdateRequest, 
	handler, userData, true);
}

bool ProjectsManager::updateProjectRateLimitsSync(char * accessToken,
	std::string projectId, std::string rateLimitId, std::shared_ptr<ProjectRateLimitUpdateRequest> projectRateLimitUpdateRequest, 
	void(* handler)(ProjectRateLimit, Error, void* )
	, void* userData)
{
	return updateProjectRateLimitsHelper(accessToken,
	projectId, rateLimitId, projectRateLimitUpdateRequest, 
	handler, userData, false);
}

