

#include "CostsResult.h"

using namespace Tiny;

CostsResult::CostsResult()
{
	object = std::string();
	amount = CostsResult_amount();
	line_item = std::string();
	project_id = std::string();
}

CostsResult::CostsResult(std::string jsonString)
{
	this->fromJson(jsonString);
}

CostsResult::~CostsResult()
{

}

void
CostsResult::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *objectKey = "object";

    if(object.has_key(objectKey))
    {
        bourne::json value = object[objectKey];



        jsonToValue(&object, value, "std::string");


    }

    const char *amountKey = "amount";

    if(object.has_key(amountKey))
    {
        bourne::json value = object[amountKey];




        CostsResult_amount* obj = &amount;
		obj->fromJson(value.dump());

    }

    const char *line_itemKey = "line_item";

    if(object.has_key(line_itemKey))
    {
        bourne::json value = object[line_itemKey];



        jsonToValue(&line_item, value, "std::string");


    }

    const char *project_idKey = "project_id";

    if(object.has_key(project_idKey))
    {
        bourne::json value = object[project_idKey];



        jsonToValue(&project_id, value, "std::string");


    }


}

bourne::json
CostsResult::toJson()
{
    bourne::json object = bourne::json::object();





    object["object"] = getObject();







	object["amount"] = getAmount().toJson();





    object["line_item"] = getLineItem();






    object["project_id"] = getProjectId();



    return object;

}

std::string
CostsResult::getObject()
{
	return object;
}

void
CostsResult::setObject(std::string  object)
{
	this->object = object;
}

CostsResult_amount
CostsResult::getAmount()
{
	return amount;
}

void
CostsResult::setAmount(CostsResult_amount  amount)
{
	this->amount = amount;
}

std::string
CostsResult::getLineItem()
{
	return line_item;
}

void
CostsResult::setLineItem(std::string  line_item)
{
	this->line_item = line_item;
}

std::string
CostsResult::getProjectId()
{
	return project_id;
}

void
CostsResult::setProjectId(std::string  project_id)
{
	this->project_id = project_id;
}



