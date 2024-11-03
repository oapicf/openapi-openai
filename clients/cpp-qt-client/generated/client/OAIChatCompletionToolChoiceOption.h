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
 * OAIChatCompletionToolChoiceOption.h
 *
 * Controls which (if any) function is called by the model. &#x60;none&#x60; means the model will not call a function and instead generates a message. &#x60;auto&#x60; means the model can pick between generating a message or calling a function. Specifying a particular function via &#x60;{\&quot;type\&quot;: \&quot;function\&quot;, \&quot;function\&quot;: {\&quot;name\&quot;: \&quot;my_function\&quot;}}&#x60; forces the model to call that function.  &#x60;none&#x60; is the default when no functions are present. &#x60;auto&#x60; is the default if functions are present. 
 */

#ifndef OAIChatCompletionToolChoiceOption_H
#define OAIChatCompletionToolChoiceOption_H

#include <QJsonObject>

#include "OAIChatCompletionNamedToolChoice.h"
#include "OAIChatCompletionNamedToolChoice_function.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIChatCompletionNamedToolChoice_function;

class OAIChatCompletionToolChoiceOption : public OAIObject {
public:
    OAIChatCompletionToolChoiceOption();
    OAIChatCompletionToolChoiceOption(QString json);
    ~OAIChatCompletionToolChoiceOption() override;

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

    QString m_type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIChatCompletionNamedToolChoice_function m_function;
    bool m_function_isSet;
    bool m_function_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIChatCompletionToolChoiceOption)

#endif // OAIChatCompletionToolChoiceOption_H
