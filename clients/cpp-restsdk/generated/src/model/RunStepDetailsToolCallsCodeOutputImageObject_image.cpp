/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.9.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "CppRestOpenAPIClient/model/RunStepDetailsToolCallsCodeOutputImageObject_image.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



RunStepDetailsToolCallsCodeOutputImageObject_image::RunStepDetailsToolCallsCodeOutputImageObject_image()
{
    m_File_id = utility::conversions::to_string_t("");
    m_File_idIsSet = false;
}

RunStepDetailsToolCallsCodeOutputImageObject_image::~RunStepDetailsToolCallsCodeOutputImageObject_image()
{
}

void RunStepDetailsToolCallsCodeOutputImageObject_image::validate()
{
    // TODO: implement validation
}

web::json::value RunStepDetailsToolCallsCodeOutputImageObject_image::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_File_idIsSet)
    {
        val[utility::conversions::to_string_t(U("file_id"))] = ModelBase::toJson(m_File_id);
    }

    return val;
}

bool RunStepDetailsToolCallsCodeOutputImageObject_image::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("file_id"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("file_id")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setFileId;
            ok &= ModelBase::fromJson(fieldValue, refVal_setFileId);
            setFileId(refVal_setFileId);
        }
    }
    return ok;
}

void RunStepDetailsToolCallsCodeOutputImageObject_image::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_File_idIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("file_id")), m_File_id));
    }
}

bool RunStepDetailsToolCallsCodeOutputImageObject_image::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("file_id"))))
    {
        utility::string_t refVal_setFileId;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("file_id"))), refVal_setFileId );
        setFileId(refVal_setFileId);
    }
    return ok;
}

utility::string_t RunStepDetailsToolCallsCodeOutputImageObject_image::getFileId() const
{
    return m_File_id;
}

void RunStepDetailsToolCallsCodeOutputImageObject_image::setFileId(const utility::string_t& value)
{
    m_File_id = value;
    m_File_idIsSet = true;
}

bool RunStepDetailsToolCallsCodeOutputImageObject_image::fileIdIsSet() const
{
    return m_File_idIsSet;
}

void RunStepDetailsToolCallsCodeOutputImageObject_image::unsetFile_id()
{
    m_File_idIsSet = false;
}
}
}
}
}


