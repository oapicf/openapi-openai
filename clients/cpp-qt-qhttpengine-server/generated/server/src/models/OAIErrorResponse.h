/**
 * OpenAI API
 * APIs for sampling from and fine-tuning language models
 *
 * The version of the OpenAPI document: 2.0.0
 * Contact: blah+oapicf@cliffano.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIErrorResponse.h
 *
 * 
 */

#ifndef OAIErrorResponse_H
#define OAIErrorResponse_H

#include <QJsonObject>

#include "OAIError.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIErrorResponse : public OAIObject {
public:
    OAIErrorResponse();
    OAIErrorResponse(QString json);
    ~OAIErrorResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIError getError() const;
    void setError(const OAIError &error);
    bool is_error_Set() const;
    bool is_error_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIError error;
    bool m_error_isSet;
    bool m_error_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIErrorResponse)

#endif // OAIErrorResponse_H
