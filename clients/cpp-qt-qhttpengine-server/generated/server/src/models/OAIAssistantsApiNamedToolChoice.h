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
 * OAIAssistantsApiNamedToolChoice.h
 *
 * Specifies a tool the model should use. Use to force the model to call a specific tool.
 */

#ifndef OAIAssistantsApiNamedToolChoice_H
#define OAIAssistantsApiNamedToolChoice_H

#include <QJsonObject>

#include "OAIChatCompletionNamedToolChoice_function.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIAssistantsApiNamedToolChoice : public OAIObject {
public:
    OAIAssistantsApiNamedToolChoice();
    OAIAssistantsApiNamedToolChoice(QString json);
    ~OAIAssistantsApiNamedToolChoice() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAIChatCompletionNamedToolChoice_function getFunction() const;
    void setFunction(const OAIChatCompletionNamedToolChoice_function &function);
    bool is_function_Set() const;
    bool is_function_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIChatCompletionNamedToolChoice_function function;
    bool m_function_isSet;
    bool m_function_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIAssistantsApiNamedToolChoice)

#endif // OAIAssistantsApiNamedToolChoice_H