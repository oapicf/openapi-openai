#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "FilesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


FilesManager::FilesManager()
{

}

FilesManager::~FilesManager()
{

}

static gboolean __FilesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __FilesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__FilesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
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
		NetClient::easycurl(FilesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FilesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FilesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FilesManager::createFileAsync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return createFileHelper(accessToken,
	file, purpose, 
	handler, userData, true);
}

bool FilesManager::createFileSync(char * accessToken,
	std::string file, std::string purpose, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return createFileHelper(accessToken,
	file, purpose, 
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
		NetClient::easycurl(FilesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FilesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), deleteFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FilesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FilesManager::deleteFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData)
{
	return deleteFileHelper(accessToken,
	fileId, 
	handler, userData, true);
}

bool FilesManager::deleteFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(DeleteFileResponse, Error, void* )
	, void* userData)
{
	return deleteFileHelper(accessToken,
	fileId, 
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
		NetClient::easycurl(FilesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FilesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), downloadFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FilesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FilesManager::downloadFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(std::string, Error, void* )
	, void* userData)
{
	return downloadFileHelper(accessToken,
	fileId, 
	handler, userData, true);
}

bool FilesManager::downloadFileSync(char * accessToken,
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
	std::string purpose, int limit, std::string order, std::string after, 
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
	

	itemAtq = stringify(&purpose, "std::string");
	queryParams.insert(pair<string, string>("purpose", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("purpose");
	}


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
		NetClient::easycurl(FilesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FilesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFilesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FilesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FilesManager::listFilesAsync(char * accessToken,
	std::string purpose, int limit, std::string order, std::string after, 
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData)
{
	return listFilesHelper(accessToken,
	purpose, limit, order, after, 
	handler, userData, true);
}

bool FilesManager::listFilesSync(char * accessToken,
	std::string purpose, int limit, std::string order, std::string after, 
	void(* handler)(ListFilesResponse, Error, void* )
	, void* userData)
{
	return listFilesHelper(accessToken,
	purpose, limit, order, after, 
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
		NetClient::easycurl(FilesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (FilesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveFileProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FilesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FilesManager::retrieveFileAsync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return retrieveFileHelper(accessToken,
	fileId, 
	handler, userData, true);
}

bool FilesManager::retrieveFileSync(char * accessToken,
	std::string fileId, 
	void(* handler)(OpenAIFile, Error, void* )
	, void* userData)
{
	return retrieveFileHelper(accessToken,
	fileId, 
	handler, userData, false);
}

