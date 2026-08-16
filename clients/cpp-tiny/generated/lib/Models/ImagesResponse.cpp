

#include "ImagesResponse.h"

using namespace Tiny;

ImagesResponse::ImagesResponse()
{
	created = int(0);
	data = std::list<Image>();
}

ImagesResponse::ImagesResponse(std::string jsonString)
{
	this->fromJson(jsonString);
}

ImagesResponse::~ImagesResponse()
{

}

void
ImagesResponse::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *createdKey = "created";

    if(object.has_key(createdKey))
    {
        bourne::json value = object[createdKey];



        jsonToValue(&created, value, "int");


    }

    const char *dataKey = "data";

    if(object.has_key(dataKey))
    {
        bourne::json value = object[dataKey];


        std::list<Image> data_list;
        Image element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            data_list.push_back(element);
        }
        data = data_list;


    }


}

bourne::json
ImagesResponse::toJson()
{
    bourne::json object = bourne::json::object();





    object["created"] = getCreated();





    std::list<Image> data_list = getData();
    bourne::json data_arr = bourne::json::array();

    for(auto& var : data_list)
    {
        Image obj = var;
        data_arr.append(obj.toJson());
    }
    object["data"] = data_arr;




    return object;

}

int
ImagesResponse::getCreated()
{
	return created;
}

void
ImagesResponse::setCreated(int  created)
{
	this->created = created;
}

std::list<Image>
ImagesResponse::getData()
{
	return data;
}

void
ImagesResponse::setData(std::list <Image> data)
{
	this->data = data;
}



