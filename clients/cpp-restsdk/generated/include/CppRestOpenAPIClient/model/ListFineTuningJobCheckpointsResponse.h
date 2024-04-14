/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.4.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ListFineTuningJobCheckpointsResponse.h
 *
 * 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_ListFineTuningJobCheckpointsResponse_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_ListFineTuningJobCheckpointsResponse_H_


#include "CppRestOpenAPIClient/ModelBase.h"

#include "CppRestOpenAPIClient/model/FineTuningJobCheckpoint.h"
#include <cpprest/details/basic_types.h>
#include <vector>

namespace org {
namespace openapitools {
namespace client {
namespace model {

class FineTuningJobCheckpoint;

/// <summary>
/// 
/// </summary>
class  ListFineTuningJobCheckpointsResponse
    : public ModelBase
{
public:
    ListFineTuningJobCheckpointsResponse();
    virtual ~ListFineTuningJobCheckpointsResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ListFineTuningJobCheckpointsResponse members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<FineTuningJobCheckpoint>>& getData();
    bool dataIsSet() const;
    void unsetData();

    void setData(const std::vector<std::shared_ptr<FineTuningJobCheckpoint>>& value);

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
    utility::string_t getFirstId() const;
    bool firstIdIsSet() const;
    void unsetFirst_id();

    void setFirstId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getLastId() const;
    bool lastIdIsSet() const;
    void unsetLast_id();

    void setLastId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    bool isHasMore() const;
    bool hasMoreIsSet() const;
    void unsetHas_more();

    void setHasMore(bool value);


protected:
    std::vector<std::shared_ptr<FineTuningJobCheckpoint>> m_Data;
    bool m_DataIsSet;
    utility::string_t m_object;
    bool m_objectIsSet;
    utility::string_t m_First_id;
    bool m_First_idIsSet;
    utility::string_t m_Last_id;
    bool m_Last_idIsSet;
    bool m_Has_more;
    bool m_Has_moreIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_ListFineTuningJobCheckpointsResponse_H_ */
