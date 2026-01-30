#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "UsageManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


UsageManager::UsageManager()
{

}

UsageManager::~UsageManager()
{

}

static gboolean __UsageManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __UsageManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__UsageManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool usageAudioSpeechesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageAudioSpeechesHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = userIds.begin(); queryIter != userIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("userIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = apiKeyIds.begin(); queryIter != apiKeyIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("apiKeyIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = models.begin(); queryIter != models.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("models", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/audio_speeches");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageAudioSpeechesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageAudioSpeechesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageAudioSpeechesAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageAudioSpeechesHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageAudioSpeechesSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageAudioSpeechesHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageAudioTranscriptionsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageAudioTranscriptionsHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = userIds.begin(); queryIter != userIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("userIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = apiKeyIds.begin(); queryIter != apiKeyIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("apiKeyIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = models.begin(); queryIter != models.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("models", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/audio_transcriptions");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageAudioTranscriptionsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageAudioTranscriptionsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageAudioTranscriptionsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageAudioTranscriptionsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageAudioTranscriptionsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageAudioTranscriptionsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageCodeInterpreterSessionsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageCodeInterpreterSessionsHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/code_interpreter_sessions");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageCodeInterpreterSessionsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageCodeInterpreterSessionsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageCodeInterpreterSessionsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageCodeInterpreterSessionsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageCodeInterpreterSessionsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageCodeInterpreterSessionsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageCompletionsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageCompletionsHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, bool batch, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = userIds.begin(); queryIter != userIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("userIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = apiKeyIds.begin(); queryIter != apiKeyIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("apiKeyIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = models.begin(); queryIter != models.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("models", itemAt));
	}
	

	itemAtq = stringify(&batch, "bool");
	queryParams.insert(pair<string, string>("batch", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("batch");
	}

	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/completions");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageCompletionsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageCompletionsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageCompletionsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, bool batch, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageCompletionsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageCompletionsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, bool batch, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageCompletionsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, batch, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageCostsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageCostsHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/costs");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageCostsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageCostsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageCostsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageCostsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageCostsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageCostsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageEmbeddingsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageEmbeddingsHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = userIds.begin(); queryIter != userIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("userIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = apiKeyIds.begin(); queryIter != apiKeyIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("apiKeyIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = models.begin(); queryIter != models.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("models", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/embeddings");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageEmbeddingsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageEmbeddingsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageEmbeddingsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageEmbeddingsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageEmbeddingsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageEmbeddingsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageImagesProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageImagesHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> sources, std::list<std::string> sizes, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = sources.begin(); queryIter != sources.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("sources", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = sizes.begin(); queryIter != sizes.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("sizes", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = userIds.begin(); queryIter != userIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("userIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = apiKeyIds.begin(); queryIter != apiKeyIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("apiKeyIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = models.begin(); queryIter != models.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("models", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/images");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageImagesProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageImagesProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageImagesAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> sources, std::list<std::string> sizes, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageImagesHelper(accessToken,
	startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageImagesSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> sources, std::list<std::string> sizes, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageImagesHelper(accessToken,
	startTime, endTime, bucketWidth, sources, sizes, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageModerationsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageModerationsHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = userIds.begin(); queryIter != userIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("userIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = apiKeyIds.begin(); queryIter != apiKeyIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("apiKeyIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = models.begin(); queryIter != models.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("models", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/moderations");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageModerationsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageModerationsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageModerationsAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageModerationsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageModerationsSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> userIds, std::list<std::string> apiKeyIds, std::list<std::string> models, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageModerationsHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, userIds, apiKeyIds, models, groupBy, limit, page, 
	handler, userData, false);
}

static bool usageVectorStoresProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(UsageResponse, Error, void* )
	= reinterpret_cast<void(*)(UsageResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	UsageResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("UsageResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "UsageResponse", "UsageResponse");
			json_node_free(pJson);

			if ("UsageResponse" == "std::string") {
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

static bool usageVectorStoresHelper(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
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
	

	itemAtq = stringify(&startTime, "int");
	queryParams.insert(pair<string, string>("start_time", itemAtq));


	itemAtq = stringify(&endTime, "int");
	queryParams.insert(pair<string, string>("end_time", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("end_time");
	}


	itemAtq = stringify(&bucketWidth, "std::string");
	queryParams.insert(pair<string, string>("bucket_width", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("bucket_width");
	}

	for (std::list
	<std::string>::iterator queryIter = projectIds.begin(); queryIter != projectIds.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("projectIds", itemAt));
	}
	
	for (std::list
	<std::string>::iterator queryIter = groupBy.begin(); queryIter != groupBy.end(); ++queryIter) {
		string itemAt = stringify(&(*queryIter), "std::string");
		if( itemAt.empty()){
			continue;
		}
		queryParams.insert(pair<string, string>("groupBy", itemAt));
	}
	

	itemAtq = stringify(&limit, "int");
	queryParams.insert(pair<string, string>("limit", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("limit");
	}


	itemAtq = stringify(&page, "std::string");
	queryParams.insert(pair<string, string>("page", itemAtq));
	if( itemAtq.empty()==true){
		queryParams.erase("page");
	}

	string mBody = "";
	JsonNode* node;
	JsonArray* json_array;

	string url("/organization/usage/vector_stores");
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
		NetClient::easycurl(UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = usageVectorStoresProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (UsageManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), usageVectorStoresProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __UsageManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool UsageManager::usageVectorStoresAsync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageVectorStoresHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, 
	handler, userData, true);
}

bool UsageManager::usageVectorStoresSync(char * accessToken,
	int startTime, int endTime, std::string bucketWidth, std::list<std::string> projectIds, std::list<std::string> groupBy, int limit, std::string page, 
	void(* handler)(UsageResponse, Error, void* )
	, void* userData)
{
	return usageVectorStoresHelper(accessToken,
	startTime, endTime, bucketWidth, projectIds, groupBy, limit, page, 
	handler, userData, false);
}

