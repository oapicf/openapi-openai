

#include "RealtimeResponse.h"

using namespace Tiny;

RealtimeResponse::RealtimeResponse()
{
	id = std::string();
	object = std::string();
	status = std::string();
	status_details = RealtimeResponse_status_details();
	output = std::list<RealtimeConversationItem>();
	metadata = null;
	usage = RealtimeResponse_usage();
}

RealtimeResponse::RealtimeResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

RealtimeResponse::~RealtimeResponse()
{

}

void
RealtimeResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *statusKey = "status";

    if(object.has_key(statusKey))
    {
        bourne::json value = object[statusKey];



        jsonToValue(&status, value, "std::string");


    }

    const char *status_detailsKey = "status_details";

    if(object.has_key(status_detailsKey))
    {
        bourne::json value = object[status_detailsKey];




        RealtimeResponse_status_details* obj = &status_details;
		obj->fromJson(value.dump());

    }

    const char *outputKey = "output";

    if(object.has_key(outputKey))
    {
        bourne::json value = object[outputKey];


        std::list<RealtimeConversationItem> output_list;
        RealtimeConversationItem element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            output_list.push_back(element);
        }
        output = output_list;


    }

    const char *metadataKey = "metadata";

    if(object.has_key(metadataKey))
    {
        bourne::json value = object[metadataKey];




        Object* obj = &metadata;
		obj->fromJson(value.dump());

    }

    const char *usageKey = "usage";

    if(object.has_key(usageKey))
    {
        bourne::json value = object[usageKey];




        RealtimeResponse_usage* obj = &usage;
		obj->fromJson(value.dump());

    }


}

bourne::json
RealtimeResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();






    object["object"] = getObject();






    object["status"] = getStatus();







	object["status_details"] = getStatusDetails().toJson();




    std::list<RealtimeConversationItem> output_list = getOutput();
    bourne::json output_arr = bourne::json::array();

    for(auto& var : output_list)
    {
        RealtimeConversationItem obj = var;
        output_arr.append(obj.toJson());
    }
    object["output"] = output_arr;








	object["metadata"] = getMetadata().toJson();






	object["usage"] = getUsage().toJson();


    return object;

}

std::string
RealtimeResponse::getId()
{
	return id;
}

void
RealtimeResponse::setId(std::string  id)
{
	this->id = id;
}

std::string
RealtimeResponse::getObject()
{
	return object;
}

void
RealtimeResponse::setObject(std::string  object)
{
	this->object = object;
}

std::string
RealtimeResponse::getStatus()
{
	return status;
}

void
RealtimeResponse::setStatus(std::string  status)
{
	this->status = status;
}

RealtimeResponse_status_details
RealtimeResponse::getStatusDetails()
{
	return status_details;
}

void
RealtimeResponse::setStatusDetails(RealtimeResponse_status_details  status_details)
{
	this->status_details = status_details;
}

std::list<RealtimeConversationItem>
RealtimeResponse::getOutput()
{
	return output;
}

void
RealtimeResponse::setOutput(std::list <RealtimeConversationItem> output)
{
	this->output = output;
}

Object
RealtimeResponse::getMetadata()
{
	return metadata;
}

void
RealtimeResponse::setMetadata(Object  metadata)
{
	this->metadata = metadata;
}

RealtimeResponse_usage
RealtimeResponse::getUsage()
{
	return usage;
}

void
RealtimeResponse::setUsage(RealtimeResponse_usage  usage)
{
	this->usage = usage;
}



