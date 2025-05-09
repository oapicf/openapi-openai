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



#include "CppRestOpenAPIClient/model/MessageDeltaContentImageFileObject.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



MessageDeltaContentImageFileObject::MessageDeltaContentImageFileObject()
{
    m_Index = 0;
    m_IndexIsSet = false;
    m_Type = utility::conversions::to_string_t("");
    m_TypeIsSet = false;
    m_Image_fileIsSet = false;
}

MessageDeltaContentImageFileObject::~MessageDeltaContentImageFileObject()
{
}

void MessageDeltaContentImageFileObject::validate()
{
    // TODO: implement validation
}

web::json::value MessageDeltaContentImageFileObject::toJson() const
{

    web::json::value val = web::json::value::object();
    
    if(m_IndexIsSet)
    {
        val[utility::conversions::to_string_t(U("index"))] = ModelBase::toJson(m_Index);
    }
    if(m_TypeIsSet)
    {
        val[utility::conversions::to_string_t(U("type"))] = ModelBase::toJson(m_Type);
    }
    if(m_Image_fileIsSet)
    {
        val[utility::conversions::to_string_t(U("image_file"))] = ModelBase::toJson(m_Image_file);
    }

    return val;
}

bool MessageDeltaContentImageFileObject::fromJson(const web::json::value& val)
{
    bool ok = true;
    
    if(val.has_field(utility::conversions::to_string_t(U("index"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("index")));
        if(!fieldValue.is_null())
        {
            int32_t refVal_setIndex;
            ok &= ModelBase::fromJson(fieldValue, refVal_setIndex);
            setIndex(refVal_setIndex);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("type"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("type")));
        if(!fieldValue.is_null())
        {
            utility::string_t refVal_setType;
            ok &= ModelBase::fromJson(fieldValue, refVal_setType);
            setType(refVal_setType);
        }
    }
    if(val.has_field(utility::conversions::to_string_t(U("image_file"))))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t(U("image_file")));
        if(!fieldValue.is_null())
        {
            std::shared_ptr<MessageDeltaContentImageFileObject_image_file> refVal_setImageFile;
            ok &= ModelBase::fromJson(fieldValue, refVal_setImageFile);
            setImageFile(refVal_setImageFile);
        }
    }
    return ok;
}

void MessageDeltaContentImageFileObject::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }
    if(m_IndexIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("index")), m_Index));
    }
    if(m_TypeIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("type")), m_Type));
    }
    if(m_Image_fileIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t(U("image_file")), m_Image_file));
    }
}

bool MessageDeltaContentImageFileObject::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    bool ok = true;
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t(U(".")))
    {
        namePrefix += utility::conversions::to_string_t(U("."));
    }

    if(multipart->hasContent(utility::conversions::to_string_t(U("index"))))
    {
        int32_t refVal_setIndex;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("index"))), refVal_setIndex );
        setIndex(refVal_setIndex);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("type"))))
    {
        utility::string_t refVal_setType;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("type"))), refVal_setType );
        setType(refVal_setType);
    }
    if(multipart->hasContent(utility::conversions::to_string_t(U("image_file"))))
    {
        std::shared_ptr<MessageDeltaContentImageFileObject_image_file> refVal_setImageFile;
        ok &= ModelBase::fromHttpContent(multipart->getContent(utility::conversions::to_string_t(U("image_file"))), refVal_setImageFile );
        setImageFile(refVal_setImageFile);
    }
    return ok;
}

int32_t MessageDeltaContentImageFileObject::getIndex() const
{
    return m_Index;
}

void MessageDeltaContentImageFileObject::setIndex(int32_t value)
{
    m_Index = value;
    m_IndexIsSet = true;
}

bool MessageDeltaContentImageFileObject::indexIsSet() const
{
    return m_IndexIsSet;
}

void MessageDeltaContentImageFileObject::unsetIndex()
{
    m_IndexIsSet = false;
}
utility::string_t MessageDeltaContentImageFileObject::getType() const
{
    return m_Type;
}

void MessageDeltaContentImageFileObject::setType(const utility::string_t& value)
{
    m_Type = value;
    m_TypeIsSet = true;
}

bool MessageDeltaContentImageFileObject::typeIsSet() const
{
    return m_TypeIsSet;
}

void MessageDeltaContentImageFileObject::unsetType()
{
    m_TypeIsSet = false;
}
std::shared_ptr<MessageDeltaContentImageFileObject_image_file> MessageDeltaContentImageFileObject::getImageFile() const
{
    return m_Image_file;
}

void MessageDeltaContentImageFileObject::setImageFile(const std::shared_ptr<MessageDeltaContentImageFileObject_image_file>& value)
{
    m_Image_file = value;
    m_Image_fileIsSet = true;
}

bool MessageDeltaContentImageFileObject::imageFileIsSet() const
{
    return m_Image_fileIsSet;
}

void MessageDeltaContentImageFileObject::unsetImage_file()
{
    m_Image_fileIsSet = false;
}
}
}
}
}


