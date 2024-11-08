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

/*
 * ListModelsResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ListModelsResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ListModelsResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/Model.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class Model;


/// <summary>
/// 
/// </summary>
class  ListModelsResponse
    : public ModelBase
{
public:
    ListModelsResponse();
    virtual ~ListModelsResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ListModelsResponse members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getObject() const;
    bool objectIsSet() const;
    void unsetobject();

    void setObject(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<Model>>& getData();
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::vector<std::shared_ptr<Model>>& value);


protected:
    utility::string_t m_object;
    bool m_objectIsSet;
    std::vector<std::shared_ptr<Model>> m_Data;
    bool m_DataIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ListModelsResponse_H_ */
