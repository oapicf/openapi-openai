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
 * OAIRunStepDetailsToolCallsFunctionObject.h
 *
 * 
 */

#ifndef OAIRunStepDetailsToolCallsFunctionObject_H
#define OAIRunStepDetailsToolCallsFunctionObject_H

#include <QJsonObject>

#include "OAIRunStepDetailsToolCallsFunctionObject_function.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRunStepDetailsToolCallsFunctionObject : public OAIObject {
public:
    OAIRunStepDetailsToolCallsFunctionObject();
    OAIRunStepDetailsToolCallsFunctionObject(QString json);
    ~OAIRunStepDetailsToolCallsFunctionObject() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getType() const;
    void setType(const QString &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    OAIRunStepDetailsToolCallsFunctionObject_function getFunction() const;
    void setFunction(const OAIRunStepDetailsToolCallsFunctionObject_function &function);
    bool is_function_Set() const;
    bool is_function_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString type;
    bool m_type_isSet;
    bool m_type_isValid;

    OAIRunStepDetailsToolCallsFunctionObject_function function;
    bool m_function_isSet;
    bool m_function_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStepDetailsToolCallsFunctionObject)

#endif // OAIRunStepDetailsToolCallsFunctionObject_H
