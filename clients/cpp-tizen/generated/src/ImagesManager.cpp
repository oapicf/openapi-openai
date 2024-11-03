#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "ImagesManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


ImagesManager::ImagesManager()
{

}

ImagesManager::~ImagesManager()
{

}

static gboolean __ImagesManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __ImagesManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__ImagesManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
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
		NetClient::easycurl(ImagesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ImagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createImageProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ImagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ImagesManager::createImageAsync(char * accessToken,
	std::shared_ptr<CreateImageRequest> createImageRequest, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageHelper(accessToken,
	createImageRequest, 
	handler, userData, true);
}

bool ImagesManager::createImageSync(char * accessToken,
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
	std::string image, std::string prompt, std::string mask, CreateImageEditRequest_model model, int n, std::string size, std::string responseFormat, std::string user, 
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
		NetClient::easycurl(ImagesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ImagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createImageEditProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ImagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ImagesManager::createImageEditAsync(char * accessToken,
	std::string image, std::string prompt, std::string mask, CreateImageEditRequest_model model, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageEditHelper(accessToken,
	image, prompt, mask, model, n, size, responseFormat, user, 
	handler, userData, true);
}

bool ImagesManager::createImageEditSync(char * accessToken,
	std::string image, std::string prompt, std::string mask, CreateImageEditRequest_model model, int n, std::string size, std::string responseFormat, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageEditHelper(accessToken,
	image, prompt, mask, model, n, size, responseFormat, user, 
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
	std::string image, CreateImageEditRequest_model model, int n, std::string responseFormat, std::string size, std::string user, 
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
		NetClient::easycurl(ImagesManager::getBasePath(), url, myhttpmethod, queryParams,
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

		requestInfo = new(nothrow) RequestInfo (ImagesManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createImageVariationProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __ImagesManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool ImagesManager::createImageVariationAsync(char * accessToken,
	std::string image, CreateImageEditRequest_model model, int n, std::string responseFormat, std::string size, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageVariationHelper(accessToken,
	image, model, n, responseFormat, size, user, 
	handler, userData, true);
}

bool ImagesManager::createImageVariationSync(char * accessToken,
	std::string image, CreateImageEditRequest_model model, int n, std::string responseFormat, std::string size, std::string user, 
	void(* handler)(ImagesResponse, Error, void* )
	, void* userData)
{
	return createImageVariationHelper(accessToken,
	image, model, n, responseFormat, size, user, 
	handler, userData, false);
}

