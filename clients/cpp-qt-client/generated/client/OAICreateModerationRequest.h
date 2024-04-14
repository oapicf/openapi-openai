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
 * OAICreateModerationRequest.h
 *
 * 
 */

#ifndef OAICreateModerationRequest_H
#define OAICreateModerationRequest_H

#include <QJsonObject>

#include "OAICreateModerationRequest_input.h"
#include "OAICreateModerationRequest_model.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICreateModerationRequest : public OAIObject {
public:
    OAICreateModerationRequest();
    OAICreateModerationRequest(QString json);
    ~OAICreateModerationRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICreateModerationRequest_input getInput() const;
    void setInput(const OAICreateModerationRequest_input &input);
    bool is_input_Set() const;
    bool is_input_Valid() const;

    OAICreateModerationRequest_model getModel() const;
    void setModel(const OAICreateModerationRequest_model &model);
    bool is_model_Set() const;
    bool is_model_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICreateModerationRequest_input m_input;
    bool m_input_isSet;
    bool m_input_isValid;

    OAICreateModerationRequest_model m_model;
    bool m_model_isSet;
    bool m_model_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICreateModerationRequest)

#endif // OAICreateModerationRequest_H
