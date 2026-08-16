

#include "AuditLog_project_created.h"

using namespace Tiny;

AuditLog_project_created::AuditLog_project_created()
{
	id = std::string();
	data = AuditLog_project_created_data();
}

AuditLog_project_created::AuditLog_project_created(std::string jsonString)
{
	this->fromJson(jsonString);
}

AuditLog_project_created::~AuditLog_project_created()
{

}

void
AuditLog_project_created::fromJson(std::string jsonObj)
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




        AuditLog_project_created_data* obj = &data;
		obj->fromJson(value.dump());

    }


}

bourne::json
AuditLog_project_created::toJson()
{
    bourne::json object = bourne::json::object();





    object["id"] = getId();







	object["data"] = getData().toJson();


    return object;

}

std::string
AuditLog_project_created::getId()
{
	return id;
}

void
AuditLog_project_created::setId(std::string  id)
{
	this->id = id;
}

AuditLog_project_created_data
AuditLog_project_created::getData()
{
	return data;
}

void
AuditLog_project_created::setData(AuditLog_project_created_data  data)
{
	this->data = data;
}



