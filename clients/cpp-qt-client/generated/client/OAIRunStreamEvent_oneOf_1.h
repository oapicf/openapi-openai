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
 * OAIRunStreamEvent_oneOf_1.h
 *
 * Occurs when a [run](/docs/api-reference/runs/object) moves to a &#x60;queued&#x60; status.
 */

#ifndef OAIRunStreamEvent_oneOf_1_H
#define OAIRunStreamEvent_oneOf_1_H

#include <QJsonObject>

#include "OAIRunObject.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIRunObject;

class OAIRunStreamEvent_oneOf_1 : public OAIObject {
public:
    OAIRunStreamEvent_oneOf_1();
    OAIRunStreamEvent_oneOf_1(QString json);
    ~OAIRunStreamEvent_oneOf_1() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getEvent() const;
    void setEvent(const QString &event);
    bool is_event_Set() const;
    bool is_event_Valid() const;

    OAIRunObject getData() const;
    void setData(const OAIRunObject &data);
    bool is_data_Set() const;
    bool is_data_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_event;
    bool m_event_isSet;
    bool m_event_isValid;

    OAIRunObject m_data;
    bool m_data_isSet;
    bool m_data_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIRunStreamEvent_oneOf_1)

#endif // OAIRunStreamEvent_oneOf_1_H
