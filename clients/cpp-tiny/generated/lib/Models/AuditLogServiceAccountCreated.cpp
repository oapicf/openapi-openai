

#include "AuditLog_service_account_created.h"

using namespace Tiny;

AuditLog_service_account_created::AuditLog_service_account_created()
{
	id = std::string();
	data = AuditLog_service_account_created_data();
}

AuditLog_service_account_created::AuditLog_service_account_created(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_service_account_created::~AuditLog_service_account_created()
{

}

void
AuditLog_service_account_created::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *idKey = "id";

    if(object.has_key(idKey))
    {
        bourne::json value = object[idKey];



        jsonToValue(&id, value, "std::string");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];




        AuditLog_service_account_created_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_service_account_created::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["data"] = getData().toJson();


    return object;

}

std::string
AuditLog_service_account_created::getId()
{
	return id;
}

void
AuditLog_service_account_created::setId(std::string  id)
{
	this->id = id;
}

AuditLog_service_account_created_data
AuditLog_service_account_created::getData()
{
	return data;
}

void
AuditLog_service_account_created::setData(AuditLog_service_account_created_data  data)
{
	this->data = data;
}



