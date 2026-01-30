#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "UploadsManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


UploadsManager::UploadsManager()
{

}

UploadsManager::~UploadsManager()
{

}

static gboolean __UploadsManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __UploadsManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__UploadsManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool addUploadPartProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UploadPart, Error, void* )
	= reinterpret_cast<void(*)(UploadPart, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UploadPart out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UploadPart")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UploadPart", "UploadPart");
			json_node_free(pJson);

			if ("UploadPart" == "std::string") {
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

static bool addUploadPartHelper(char * accessToken,
	std::string uploadId, std::string data, 
	void(* handler)(UploadPart, Error, void* )
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

	string url("/uploads/{upload_id}/parts");
	int pos;

	string s_uploadId("{");
	s_uploadId.append("upload_id");
	s_uploadId.append("}");
	pos = url.find(s_uploadId);
	url.erase(pos, s_uploadId.length());
	url.insert(pos, stringify(&uploadId, "std::string"));

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
		NetClient::easycurl(UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = addUploadPartProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), addUploadPartProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UploadsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UploadsManager::addUploadPartAsync(char * accessToken,
	std::string uploadId, std::string data, 
	void(* handler)(UploadPart, Error, void* )
	, void* userData)
{
	return addUploadPartHelper(accessToken,
	uploadId, data, 
	handler, userData, true);
}

bool UploadsManager::addUploadPartSync(char * accessToken,
	std::string uploadId, std::string data, 
	void(* handler)(UploadPart, Error, void* )
	, void* userData)
{
	return addUploadPartHelper(accessToken,
	uploadId, data, 
	handler, userData, false);
}

static bool cancelUploadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Upload, Error, void* )
	= reinterpret_cast<void(*)(Upload, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Upload out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Upload")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Upload", "Upload");
			json_node_free(pJson);

			if ("Upload" == "std::string") {
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

static bool cancelUploadHelper(char * accessToken,
	std::string uploadId, 
	void(* handler)(Upload, Error, void* )
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

	string url("/uploads/{upload_id}/cancel");
	int pos;

	string s_uploadId("{");
	s_uploadId.append("upload_id");
	s_uploadId.append("}");
	pos = url.find(s_uploadId);
	url.erase(pos, s_uploadId.length());
	url.insert(pos, stringify(&uploadId, "std::string"));

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
		NetClient::easycurl(UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelUploadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelUploadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UploadsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UploadsManager::cancelUploadAsync(char * accessToken,
	std::string uploadId, 
	void(* handler)(Upload, Error, void* )
	, void* userData)
{
	return cancelUploadHelper(accessToken,
	uploadId, 
	handler, userData, true);
}

bool UploadsManager::cancelUploadSync(char * accessToken,
	std::string uploadId, 
	void(* handler)(Upload, Error, void* )
	, void* userData)
{
	return cancelUploadHelper(accessToken,
	uploadId, 
	handler, userData, false);
}

static bool completeUploadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Upload, Error, void* )
	= reinterpret_cast<void(*)(Upload, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Upload out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Upload")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Upload", "Upload");
			json_node_free(pJson);

			if ("Upload" == "std::string") {
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

static bool completeUploadHelper(char * accessToken,
	std::string uploadId, std::shared_ptr<CompleteUploadRequest> completeUploadRequest, 
	void(* handler)(Upload, Error, void* )
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

	if (isprimitive("CompleteUploadRequest")) {
		node = converttoJson(&completeUploadRequest, "CompleteUploadRequest", "");
	}
	
	char *jsonStr =  completeUploadRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/uploads/{upload_id}/complete");
	int pos;

	string s_uploadId("{");
	s_uploadId.append("upload_id");
	s_uploadId.append("}");
	pos = url.find(s_uploadId);
	url.erase(pos, s_uploadId.length());
	url.insert(pos, stringify(&uploadId, "std::string"));

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
		NetClient::easycurl(UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = completeUploadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), completeUploadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UploadsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UploadsManager::completeUploadAsync(char * accessToken,
	std::string uploadId, std::shared_ptr<CompleteUploadRequest> completeUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData)
{
	return completeUploadHelper(accessToken,
	uploadId, completeUploadRequest, 
	handler, userData, true);
}

bool UploadsManager::completeUploadSync(char * accessToken,
	std::string uploadId, std::shared_ptr<CompleteUploadRequest> completeUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData)
{
	return completeUploadHelper(accessToken,
	uploadId, completeUploadRequest, 
	handler, userData, false);
}

static bool createUploadProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(Upload, Error, void* )
	= reinterpret_cast<void(*)(Upload, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	Upload out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("Upload")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "Upload", "Upload");
			json_node_free(pJson);

			if ("Upload" == "std::string") {
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

static bool createUploadHelper(char * accessToken,
	std::shared_ptr<CreateUploadRequest> createUploadRequest, 
	void(* handler)(Upload, Error, void* )
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

	if (isprimitive("CreateUploadRequest")) {
		node = converttoJson(&createUploadRequest, "CreateUploadRequest", "");
	}
	
	char *jsonStr =  createUploadRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/uploads");
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
		NetClient::easycurl(UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createUploadProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UploadsManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createUploadProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UploadsManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UploadsManager::createUploadAsync(char * accessToken,
	std::shared_ptr<CreateUploadRequest> createUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData)
{
	return createUploadHelper(accessToken,
	createUploadRequest, 
	handler, userData, true);
}

bool UploadsManager::createUploadSync(char * accessToken,
	std::shared_ptr<CreateUploadRequest> createUploadRequest, 
	void(* handler)(Upload, Error, void* )
	, void* userData)
{
	return createUploadHelper(accessToken,
	createUploadRequest, 
	handler, userData, false);
}

