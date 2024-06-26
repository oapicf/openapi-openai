/**
 * OpenAI API
 * The OpenAI REST API. Please see https://platform.openai.com/docs/api-reference for more details.
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIModifyThreadRequest.h
 *
 * 
 */

#ifndef OAIModifyThreadRequest_H
#define OAIModifyThreadRequest_H

#include <QJsonObject>

#include "OAIObject.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIModifyThreadRequest : public OAIObject {
public:
    OAIModifyThreadRequest();
    OAIModifyThreadRequest(QString json);
    ~OAIModifyThreadRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIObject getMetadata() const;
    void setMetadata(const OAIObject &metadata);
    bool is_metadata_Set() const;
    bool is_metadata_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIObject m_metadata;
    bool m_metadata_isSet;
    bool m_metadata_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIModifyThreadRequest)

#endif // OAIModifyThreadRequest_H
