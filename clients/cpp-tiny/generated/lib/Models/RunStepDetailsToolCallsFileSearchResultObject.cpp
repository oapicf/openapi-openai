

#include "RunStepDetailsToolCallsFileSearchResultObject.h"

using namespace Tiny;

RunStepDetailsToolCallsFileSearchResultObject::RunStepDetailsToolCallsFileSearchResultObject()
{
	file_id = std::string();
	file_name = std::string();
	score = float(0);
	content = std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner>();
}

RunStepDetailsToolCallsFileSearchResultObject::RunStepDetailsToolCallsFileSearchResultObject(std::string jsonString)
{
	this->fromJson(jsonString);
}

RunStepDetailsToolCallsFileSearchResultObject::~RunStepDetailsToolCallsFileSearchResultObject()
{

}

void
RunStepDetailsToolCallsFileSearchResultObject::fromJson(std::string jsonObj)
{
    bourne::json object = bourne::json::parse(jsonObj);

    const char *file_idKey = "file_id";

    if(object.has_key(file_idKey))
    {
        bourne::json value = object[file_idKey];



        jsonToValue(&file_id, value, "std::string");


    }

    const char *file_nameKey = "file_name";

    if(object.has_key(file_nameKey))
    {
        bourne::json value = object[file_nameKey];



        jsonToValue(&file_name, value, "std::string");


    }

    const char *scoreKey = "score";

    if(object.has_key(scoreKey))
    {
        bourne::json value = object[scoreKey];



        jsonToValue(&score, value, "long");


    }

    const char *contentKey = "content";

    if(object.has_key(contentKey))
    {
        bourne::json value = object[contentKey];


        std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> content_list;
        RunStepDetailsToolCallsFileSearchResultObject_content_inner element;
        for(auto& var : value.array_range())
        {


            element.fromJson(var.dump());

            content_list.push_back(element);
        }
        content = content_list;


    }


}

bourne::json
RunStepDetailsToolCallsFileSearchResultObject::toJson()
{
    bourne::json object = bourne::json::object();





    object["file_id"] = getFileId();






    object["file_name"] = getFileName();






    object["score"] = getScore();





    std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner> content_list = getContent();
    bourne::json content_arr = bourne::json::array();

    for(auto& var : content_list)
    {
        RunStepDetailsToolCallsFileSearchResultObject_content_inner obj = var;
        content_arr.append(obj.toJson());
    }
    object["content"] = content_arr;




    return object;

}

std::string
RunStepDetailsToolCallsFileSearchResultObject::getFileId()
{
	return file_id;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setFileId(std::string  file_id)
{
	this->file_id = file_id;
}

std::string
RunStepDetailsToolCallsFileSearchResultObject::getFileName()
{
	return file_name;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setFileName(std::string  file_name)
{
	this->file_name = file_name;
}

long
RunStepDetailsToolCallsFileSearchResultObject::getScore()
{
	return score;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setScore(long  score)
{
	this->score = score;
}

std::list<RunStepDetailsToolCallsFileSearchResultObject_content_inner>
RunStepDetailsToolCallsFileSearchResultObject::getContent()
{
	return content;
}

void
RunStepDetailsToolCallsFileSearchResultObject::setContent(std::list <RunStepDetailsToolCallsFileSearchResultObject_content_inner> content)
{
	this->content = content;
}



