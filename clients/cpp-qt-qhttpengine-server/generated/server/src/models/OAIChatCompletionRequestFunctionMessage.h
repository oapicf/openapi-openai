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
 * OAIChatCompletionRequestFunctionMessage.h
 *
 * 
 */

#ifndef OAIChatCompletionRequestFunctionMessage_H
#define OAIChatCompletionRequestFunctionMessage_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIChatCompletionRequestFunctionMessage : public OAIObject {
public:
    OAIChatCompletionRequestFunctionMessage();
    OAIChatCompletionRequestFunctionMessage(QString json);
    ~OAIChatCompletionRequestFunctionMessage() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getRole() const;
    void setRole(const QString &role);
    bool is_role_Set() const;
    bool is_role_Valid() const;

    QString getContent() const;
    void setContent(const QString &content);
    bool is_content_Set() const;
    bool is_content_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString role;
    bool m_role_isSet;
    bool m_role_isValid;

    QString content;
    bool m_content_isSet;
    bool m_content_isValid;

    QString name;
    bool m_name_isSet;
    bool m_name_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIChatCompletionRequestFunctionMessage)

#endif // OAIChatCompletionRequestFunctionMessage_H
