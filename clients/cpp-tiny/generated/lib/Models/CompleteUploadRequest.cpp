

#include "CompleteUploadRequest.h"

using namespace Tiny;

CompleteUploadRequest::CompleteUploadRequest()
{
	part_ids = std::list<std::string>();
	md5 = std::string();
}

CompleteUploadRequest::CompleteUploadRequest(std::string jsonString)
{
	this->fromJson(jsonString);
}

CompleteUploadRequest::~CompleteUploadRequest()
{

}

void
CompleteUploadRequest::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *part_idsKey = "part_ids";

    if(object.has_key(part_idsKey))
    {
        bourne::json value = object[part_idsKey];


        std::list<std::string> part_ids_list;
        std::string element;
        for(auto& var : value.array_range())
        {

            jsonToValue(&element, var, "std::string");


            part_ids_list.push_back(element);
        }
        part_ids = part_ids_list;


    }

    const char *md5Key = "md5";

    if(object.has_key(md5Key))
    {
        bourne::json value = object[md5Key];



        jsonToValue(&md5, value, "std::string");


    }


}

bourne::json
CompleteUploadRequest::toJson()
{
    bourne::json object = bourne::json::object();




    std::list<std::string> part_ids_list = getPartIds();
    bourne::json part_ids_arr = bourne::json::array();

    for(auto& var : part_ids_list)
    {
        part_ids_arr.append(var);
    }
    object["part_ids"] = part_ids_arr;









    object["md5"] = getMd5();



    return object;

}

std::list<std::string>
CompleteUploadRequest::getPartIds()
{
	return part_ids;
}

void
CompleteUploadRequest::setPartIds(std::list <std::string> part_ids)
{
	this->part_ids = part_ids;
}

std::string
CompleteUploadRequest::getMd5()
{
	return md5;
}

void
CompleteUploadRequest::setMd5(std::string  md5)
{
	this->md5 = md5;
}



