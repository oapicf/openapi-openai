#include <glib-object.h>
#include <json-glib/json-glib.h>

#include "FineTuningManager.h"
#include "NetClient.h"
#include "Helpers.h"
#include "Error.h"
#include "RequestInfo.h"

using namespace std;
using namespace Tizen::ArtikCloud;


FineTuningManager::FineTuningManager()
{

}

FineTuningManager::~FineTuningManager()
{

}

static gboolean __FineTuningManagerresponseHandler(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);
	g_thread_join(request->thread);

	// invoke the callback function
	bool retval = request->processor(*(request->p_chunk), *(request->code), request->errormsg, request->userData, request->handler);

	delete request;
	return FALSE;
}

static gpointer __FineTuningManagerthreadFunc(gpointer data)
{
	RequestInfo *request = static_cast<RequestInfo*>(data);

	// handle the request
	NetClient::easycurl(request->host, request->path, request->method, request->queryParams,
	request->mBody, request->headerList, request->p_chunk, request->code, request->errormsg);

	request->thread = g_thread_self();
	g_idle_add(__FineTuningManagerresponseHandler, static_cast<gpointer>(request));

	return NULL;
}


static bool cancelFineTuningJobProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FineTuningJob, Error, void* )
	= reinterpret_cast<void(*)(FineTuningJob, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FineTuningJob out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FineTuningJob")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FineTuningJob", "FineTuningJob");
			json_node_free(pJson);

			if ("FineTuningJob" == "std::string") {
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

static bool cancelFineTuningJobHelper(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
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

	string url("/fine_tuning/jobs/{fine_tuning_job_id}/cancel");
	int pos;

	string s_fineTuningJobId("{");
	s_fineTuningJobId.append("fine_tuning_job_id");
	s_fineTuningJobId.append("}");
	pos = url.find(s_fineTuningJobId);
	url.erase(pos, s_fineTuningJobId.length());
	url.insert(pos, stringify(&fineTuningJobId, "std::string"));

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
		NetClient::easycurl(FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = cancelFineTuningJobProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), cancelFineTuningJobProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FineTuningManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FineTuningManager::cancelFineTuningJobAsync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData)
{
	return cancelFineTuningJobHelper(accessToken,
	fineTuningJobId, 
	handler, userData, true);
}

bool FineTuningManager::cancelFineTuningJobSync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData)
{
	return cancelFineTuningJobHelper(accessToken,
	fineTuningJobId, 
	handler, userData, false);
}

static bool createFineTuningJobProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FineTuningJob, Error, void* )
	= reinterpret_cast<void(*)(FineTuningJob, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FineTuningJob out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FineTuningJob")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FineTuningJob", "FineTuningJob");
			json_node_free(pJson);

			if ("FineTuningJob" == "std::string") {
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

static bool createFineTuningJobHelper(char * accessToken,
	std::shared_ptr<CreateFineTuningJobRequest> createFineTuningJobRequest, 
	void(* handler)(FineTuningJob, Error, void* )
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

	if (isprimitive("CreateFineTuningJobRequest")) {
		node = converttoJson(&createFineTuningJobRequest, "CreateFineTuningJobRequest", "");
	}
	
	char *jsonStr =  createFineTuningJobRequest.toJson();
	node = json_from_string(jsonStr, NULL);
	g_free(static_cast<gpointer>(jsonStr));
	

	char *jsonStr1 =  json_to_string(node, false);
	mBody.append(jsonStr1);
	g_free(static_cast<gpointer>(jsonStr1));

	string url("/fine_tuning/jobs");
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
		NetClient::easycurl(FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = createFineTuningJobProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), createFineTuningJobProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FineTuningManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FineTuningManager::createFineTuningJobAsync(char * accessToken,
	std::shared_ptr<CreateFineTuningJobRequest> createFineTuningJobRequest, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData)
{
	return createFineTuningJobHelper(accessToken,
	createFineTuningJobRequest, 
	handler, userData, true);
}

bool FineTuningManager::createFineTuningJobSync(char * accessToken,
	std::shared_ptr<CreateFineTuningJobRequest> createFineTuningJobRequest, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData)
{
	return createFineTuningJobHelper(accessToken,
	createFineTuningJobRequest, 
	handler, userData, false);
}

static bool listFineTuningEventsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListFineTuningJobEventsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListFineTuningJobEventsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListFineTuningJobEventsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListFineTuningJobEventsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListFineTuningJobEventsResponse", "ListFineTuningJobEventsResponse");
			json_node_free(pJson);

			if ("ListFineTuningJobEventsResponse" == "std::string") {
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

static bool listFineTuningEventsHelper(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobEventsResponse, Error, void* )
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

	string url("/fine_tuning/jobs/{fine_tuning_job_id}/events");
	int pos;

	string s_fineTuningJobId("{");
	s_fineTuningJobId.append("fine_tuning_job_id");
	s_fineTuningJobId.append("}");
	pos = url.find(s_fineTuningJobId);
	url.erase(pos, s_fineTuningJobId.length());
	url.insert(pos, stringify(&fineTuningJobId, "std::string"));

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
		NetClient::easycurl(FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listFineTuningEventsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFineTuningEventsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FineTuningManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FineTuningManager::listFineTuningEventsAsync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobEventsResponse, Error, void* )
	, void* userData)
{
	return listFineTuningEventsHelper(accessToken,
	fineTuningJobId, after, limit, 
	handler, userData, true);
}

bool FineTuningManager::listFineTuningEventsSync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobEventsResponse, Error, void* )
	, void* userData)
{
	return listFineTuningEventsHelper(accessToken,
	fineTuningJobId, after, limit, 
	handler, userData, false);
}

static bool listFineTuningJobCheckpointsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListFineTuningJobCheckpointsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListFineTuningJobCheckpointsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListFineTuningJobCheckpointsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListFineTuningJobCheckpointsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListFineTuningJobCheckpointsResponse", "ListFineTuningJobCheckpointsResponse");
			json_node_free(pJson);

			if ("ListFineTuningJobCheckpointsResponse" == "std::string") {
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

static bool listFineTuningJobCheckpointsHelper(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobCheckpointsResponse, Error, void* )
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

	string url("/fine_tuning/jobs/{fine_tuning_job_id}/checkpoints");
	int pos;

	string s_fineTuningJobId("{");
	s_fineTuningJobId.append("fine_tuning_job_id");
	s_fineTuningJobId.append("}");
	pos = url.find(s_fineTuningJobId);
	url.erase(pos, s_fineTuningJobId.length());
	url.insert(pos, stringify(&fineTuningJobId, "std::string"));

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
		NetClient::easycurl(FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listFineTuningJobCheckpointsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listFineTuningJobCheckpointsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FineTuningManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FineTuningManager::listFineTuningJobCheckpointsAsync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobCheckpointsResponse, Error, void* )
	, void* userData)
{
	return listFineTuningJobCheckpointsHelper(accessToken,
	fineTuningJobId, after, limit, 
	handler, userData, true);
}

bool FineTuningManager::listFineTuningJobCheckpointsSync(char * accessToken,
	std::string fineTuningJobId, std::string after, int limit, 
	void(* handler)(ListFineTuningJobCheckpointsResponse, Error, void* )
	, void* userData)
{
	return listFineTuningJobCheckpointsHelper(accessToken,
	fineTuningJobId, after, limit, 
	handler, userData, false);
}

static bool listPaginatedFineTuningJobsProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(ListPaginatedFineTuningJobsResponse, Error, void* )
	= reinterpret_cast<void(*)(ListPaginatedFineTuningJobsResponse, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	ListPaginatedFineTuningJobsResponse out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("ListPaginatedFineTuningJobsResponse")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "ListPaginatedFineTuningJobsResponse", "ListPaginatedFineTuningJobsResponse");
			json_node_free(pJson);

			if ("ListPaginatedFineTuningJobsResponse" == "std::string") {
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

static bool listPaginatedFineTuningJobsHelper(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListPaginatedFineTuningJobsResponse, Error, void* )
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

	string url("/fine_tuning/jobs");
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
		NetClient::easycurl(FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = listPaginatedFineTuningJobsProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), listPaginatedFineTuningJobsProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FineTuningManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FineTuningManager::listPaginatedFineTuningJobsAsync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListPaginatedFineTuningJobsResponse, Error, void* )
	, void* userData)
{
	return listPaginatedFineTuningJobsHelper(accessToken,
	after, limit, 
	handler, userData, true);
}

bool FineTuningManager::listPaginatedFineTuningJobsSync(char * accessToken,
	std::string after, int limit, 
	void(* handler)(ListPaginatedFineTuningJobsResponse, Error, void* )
	, void* userData)
{
	return listPaginatedFineTuningJobsHelper(accessToken,
	after, limit, 
	handler, userData, false);
}

static bool retrieveFineTuningJobProcessor(MemoryStruct_s p_chunk, long code, char* errormsg, void* userData,
	void(* voidHandler)())
{
	void(* handler)(FineTuningJob, Error, void* )
	= reinterpret_cast<void(*)(FineTuningJob, Error, void* )> (voidHandler);
	
	JsonNode* pJson;
	char * data = p_chunk.memory;

	
	FineTuningJob out;

	if (code >= 200 && code < 300) {
		Error error(code, string("No Error"));




		if (isprimitive("FineTuningJob")) {
			pJson = json_from_string(data, NULL);
			jsonToValue(&out, pJson, "FineTuningJob", "FineTuningJob");
			json_node_free(pJson);

			if ("FineTuningJob" == "std::string") {
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

static bool retrieveFineTuningJobHelper(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
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

	string url("/fine_tuning/jobs/{fine_tuning_job_id}");
	int pos;

	string s_fineTuningJobId("{");
	s_fineTuningJobId.append("fine_tuning_job_id");
	s_fineTuningJobId.append("}");
	pos = url.find(s_fineTuningJobId);
	url.erase(pos, s_fineTuningJobId.length());
	url.insert(pos, stringify(&fineTuningJobId, "std::string"));

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
		NetClient::easycurl(FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg);
		bool retval = retrieveFineTuningJobProcessor(*p_chunk, code, errormsg, userData,reinterpret_cast<void(*)()>(handler));

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

		requestInfo = new(nothrow) RequestInfo (FineTuningManager::getBasePath(), url, myhttpmethod, queryParams,
			mBody, headerList, p_chunk, &code, errormsg, userData, reinterpret_cast<void(*)()>(handler), retrieveFineTuningJobProcessor);;
		if(requestInfo == NULL)
			return false;

		thread = g_thread_new(NULL, __FineTuningManagerthreadFunc, static_cast<gpointer>(requestInfo));
		return true;
	}
}




bool FineTuningManager::retrieveFineTuningJobAsync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData)
{
	return retrieveFineTuningJobHelper(accessToken,
	fineTuningJobId, 
	handler, userData, true);
}

bool FineTuningManager::retrieveFineTuningJobSync(char * accessToken,
	std::string fineTuningJobId, 
	void(* handler)(FineTuningJob, Error, void* )
	, void* userData)
{
	return retrieveFineTuningJobHelper(accessToken,
	fineTuningJobId, 
	handler, userData, false);
}

