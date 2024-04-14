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
 * OAIRunStepDeltaObject.h
 *
 * Represents a run step delta i.e. any changed fields on a run step during streaming. 
 */

#ifndef OAIRunStepDeltaObject_H
#define OAIRunStepDeltaObject_H

#include <QJsonObject>

#include "OAIRunStepDeltaObject_delta.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIRunStepDeltaObject : public OAIObject {
public:
    OAIRunStepDeltaObject();
    OAIRunStepDeltaObject(QString json);
    ~OAIRunStepDeltaObject() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getObject() const;
    void setObject(const QString &object);
    bool is_object_Set() const;
    bool is_object_Valid() const;

    OAIRunStepDeltaObject_delta getDelta() const;
    void setDelta(const OAIRunStepDeltaObject_delta &delta);
    bool is_delta_Set() const;
    bool is_delta_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString object;
    bool m_object_isSet;
    bool m_object_isValid;

    OAIRunStepDeltaObject_delta delta;
    bool m_delta_isSet;
    bool m_delta_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStepDeltaObject)

#endif // OAIRunStepDeltaObject_H
